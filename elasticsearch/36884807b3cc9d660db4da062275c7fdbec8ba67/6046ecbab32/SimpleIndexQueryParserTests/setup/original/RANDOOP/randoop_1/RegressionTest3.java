import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("node_s_0", (java.lang.Object[]) executorServiceArray7, printStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertNotNull(executorServiceArray4);
        org.junit.Assert.assertNotNull(executorServiceArray6);
        org.junit.Assert.assertNotNull(executorServiceArray7);
        org.junit.Assert.assertNotNull(executorServiceArraySet8);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
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
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
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
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "enwiki.random.lines.txt");
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus24 = simpleIndexQueryParserTests0.ensureGreen(strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("tests.maxfailures", indexReader23, indexReader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray3, obj7);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.failfast", (java.lang.Object[]) executorServiceArray3, printStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("europarl.lines.txt.gz", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("enwiki.random.lines.txt", indexReader11, indexReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("", terms19, terms20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
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
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
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
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.maxfailures");
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        java.lang.String str22 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldStatisticsEquals("<unknown>", fields19, fields20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        org.apache.lucene.util.LuceneTestCase.assumeFalse("enwiki.random.lines.txt", false);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        org.junit.Assert.assertNotNull((java.lang.Object) false);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        simpleIndexQueryParserTests10.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum18, postingsEnum19, true);
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment23 = simpleIndexQueryParserTests0.newNodeEnvironment(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader7, (int) '#', postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        org.apache.lucene.store.Directory directory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.lucene.util.LuceneTestCase.slowFileExists(directory0, "tests.badapples");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testInQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("", "tests.badapples", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.weekly", indexReader35, indexReader36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        simpleIndexQueryParserTests10.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.maxfailures", "tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader7, (int) '#', postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests2.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path1 = org.apache.lucene.util.LuceneTestCase.createTempDir("<unknown>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assureMalformedThrowsException();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/faulty-function-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
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
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeFalse("tests.badapples", true);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.badapples");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.io.PrintStream printStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("", (java.lang.Object[]) executorServiceArray6, printStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(executorServiceArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", indexReader26, indexReader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment13 = simpleIndexQueryParserTests2.newNodeEnvironment(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) (short) 10);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
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
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.elasticsearch.test.ElasticsearchTestCase.randomInt((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (byte) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader7, fields8, fields9, true);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader21, (int) ' ', postingsEnum23, postingsEnum24, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.io.PrintStream printStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray1, printStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 10, (double) 4, (double) 'a');
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "europarl.lines.txt.gz");
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        java.lang.Exception exception1 = null;
        org.apache.lucene.util.LuceneTestCase.assumeNoException("tests.nightly", exception1);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        java.util.List<java.lang.CharSequence> charSequenceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(charSequenceList0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "enwiki.random.lines.txt", "random");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader7, (int) '#', postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader7, fields8, fields9, true);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader7, fields8, fields9, true);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests2.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween(3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        java.lang.String str22 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader30, terms31, terms32, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass10 = simpleIndexQueryParserTests0.getClass();
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.TermsEnum termsEnum16 = null;
        org.apache.lucene.index.TermsEnum termsEnum17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.assertTermStatsEquals("enwiki.random.lines.txt", termsEnum16, termsEnum17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testInQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
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
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.slow", fields19, fields20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "node_s_0", "tests.weekly", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/matchAll.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
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
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
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
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("", indexReader23, indexReader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.IndexReader indexReader89 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("", indexReader88, indexReader89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path30 = simpleIndexQueryParserTests0.getDataPath("tests.weekly");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.weekly");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = org.apache.lucene.util.LuceneTestCase.createTempFile("europarl.lines.txt.gz", "random");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("tests.weekly", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader7, (int) '#', postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests7.assertFieldsEquals("tests.failfast", indexReader10, fields11, fields12, false);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.setUp();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests34.assertFieldsEquals("tests.failfast", indexReader37, fields38, fields39, false);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, (int) (byte) 1, postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.setUp();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray52 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests7, simpleIndexQueryParserTests24, simpleIndexQueryParserTests29, simpleIndexQueryParserTests34 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet53 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase elasticsearchTestCase54 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom((org.elasticsearch.test.ElasticsearchTestCase[]) elasticsearchSingleNodeTestArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
        org.junit.Assert.assertNotNull(ruleChain33);
        org.junit.Assert.assertNotNull(ruleChain42);
        org.junit.Assert.assertNotNull(elasticsearchSingleNodeTestArray52);
        org.junit.Assert.assertNotNull(elasticsearchSingleNodeTestSet53);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader14, terms15, terms16, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader7, fields8, fields9, true);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = simpleIndexQueryParserTests2.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment11 = simpleIndexQueryParserTests0.newNodeEnvironment(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.failfast", indexReader11, indexReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22, true);
        org.junit.Assert.assertNotNull((java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.apache.lucene.util.BytesRef bytesRef1 = null;
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("random", bytesRef1, store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
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
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader30, terms31, terms32, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeFalse("tests.slow", true);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.slow");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        simpleIndexQueryParserTests10.setUp();
        org.elasticsearch.common.settings.Settings settings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment28 = simpleIndexQueryParserTests10.newNodeEnvironment(settings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 0, (long) (byte) 0);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("tests.awaitsfix", indexReader19, indexReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        java.lang.Object[] objArray1 = null;
        java.io.PrintStream printStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.failfast", objArray1, printStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10L);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.slow", indexReader20, indexReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("", indexReader18, indexReader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain84;
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        java.lang.String str22 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("tests.maxfailures", indexReader15, indexReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
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
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testInQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.assertReaderStatisticsEquals("", indexReader27, indexReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("<unknown>", "node_s_0", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain14);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
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
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithoutFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-without-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader21, (int) ' ', postingsEnum23, postingsEnum24, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests2.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
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
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet1 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonNamedFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.setUp();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain24;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain24);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray17 = new double[] { 0.0d };
        double[] doubleArray19 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray25, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray11, doubleArray25, 0.0d);
        double[] doubleArray33 = new double[] { 0.0d };
        double[] doubleArray35 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray35, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray33, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        simpleIndexQueryParserTests40.assertFieldsEquals("tests.failfast", indexReader43, fields44, fields45, false);
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests40.failureAndSuccessEvents;
        java.lang.String str49 = simpleIndexQueryParserTests40.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests40.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum51, postingsEnum52, true);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests40.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain55);
        java.lang.Class<?> wildcardClass57 = ruleChain55.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<unknown>" + "'", str49, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertNotNull(ruleChain32);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "<unknown>", "random", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "hi!", "<unknown>", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader14, terms15, terms16, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader24, (int) ' ', postingsEnum26, postingsEnum27);
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("random", terms30, terms31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "", "tests.badapples", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
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
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.nightly", "tests.failfast", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum10, postingsEnum11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertReaderStatisticsEquals("hi!", indexReader13, indexReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("random", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus14 = simpleIndexQueryParserTests0.ensureGreen(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strComparableSet13);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader21, fields22, fields23, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("hi!", indexReader30, indexReader31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
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
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLength((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertNotNull(ruleChain32);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
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
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween(4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 35, 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) '4', (java.lang.Object) simpleIndexQueryParserTests18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests18.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assureMalformedThrowsException();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/faulty-function-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("tests.badapples", indexReader41, indexReader42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        simpleIndexQueryParserTests10.setUp();
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.assertFieldStatisticsEquals("tests.monster", fields28, fields29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader21, fields22, fields23, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
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
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.setUp();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain24;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain24);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader30, terms31, terms32, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.TermsEnum termsEnum19 = null;
        org.apache.lucene.index.TermsEnum termsEnum20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("", indexReader18, termsEnum19, termsEnum20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertNotNull(ruleChain32);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) '4', (java.lang.Object) simpleIndexQueryParserTests18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests18.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.failfast", "node_s_0", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        org.junit.Assert.assertNotNull("", (java.lang.Object) (short) 10);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
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
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        simpleIndexQueryParserTests10.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testNotFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        double[] doubleArray52 = new double[] { 0.0d };
        double[] doubleArray54 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray54, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray40, doubleArray54, 0.0d);
        double[] doubleArray62 = new double[] { 0.0d };
        double[] doubleArray64 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray64, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray62, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        simpleIndexQueryParserTests69.assertFieldsEquals("tests.failfast", indexReader72, fields73, fields74, false);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        java.lang.String str78 = simpleIndexQueryParserTests69.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests69.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum80, postingsEnum81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain84);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain84;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<unknown>" + "'", str78, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain84);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
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
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader7, fields8, fields9, true);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 1, postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain36;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        simpleIndexQueryParserTests38.setUp();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertNotNull(ruleChain42);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "<unknown>", "tests.monster", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader26, terms27, terms28, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("europarl.lines.txt.gz", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) ' ', postingsEnum10, postingsEnum11, false);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
        org.junit.Assert.assertNotNull(testRule14);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy1 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.apache.lucene.util.BytesRef bytesRef1 = null;
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("enwiki.random.lines.txt", bytesRef1, store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        java.lang.String str22 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) '4', (java.lang.Object) simpleIndexQueryParserTests18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests18.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween(2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.monster", "tests.badapples");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertNotNull(ruleChain32);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("node_s_0", "tests.slow", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween(4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("europarl.lines.txt.gz", indexReader30, indexReader31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, (long) 'a', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests10.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertNotNull(ruleChain32);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.TermsEnum termsEnum11 = null;
        org.apache.lucene.index.TermsEnum termsEnum12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("node_s_0", termsEnum11, termsEnum12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum18, postingsEnum19, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
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
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.apache.lucene.store.Directory directory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.lucene.util.LuceneTestCase.slowFileExists(directory0, "tests.failfast");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.junit.Assert.assertEquals((double) 10, (double) 10L, (double) 100);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.failfast", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader11, fields12, fields13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        java.util.Random random0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.apache.lucene.document.FieldType fieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field5 = org.apache.lucene.util.LuceneTestCase.newField(random0, "tests.monster", (java.lang.Object) executorServiceArray2, fieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("hi!", indexReader20, indexReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader23, (int) '#', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum41, postingsEnum42, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = simpleIndexQueryParserTests0.getDataPath("tests.monster");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.monster");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader9, fields10, fields11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
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
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("tests.nightly", terms8, terms9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("tests.nightly", indexReader18, indexReader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader18, 10, postingsEnum20, postingsEnum21);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader13, terms14, terms15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '4');
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList2 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(100, genericDeclarationArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader6, (int) (short) -1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }
}
