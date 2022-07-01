import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) 'a', postingsEnum25, postingsEnum26);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.setUp();
        simpleIndexQueryParserTests20.setUp();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.monster", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests20);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests20.testQueryStringFields3Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray9);
        java.io.PrintStream printStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.badapples", (java.lang.Object[]) throttlingArray4, printStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + throttling2 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling2.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling3 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling3.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray4);
        org.junit.Assert.assertNotNull(throttlingEnumList5);
        org.junit.Assert.assertTrue("'" + throttling7 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling7.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling8 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling8.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray9);
        org.junit.Assert.assertNotNull(throttlingEnumList10);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("node_s_0", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("random", postingsEnum31, postingsEnum32, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader13, 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader20, fields21, fields22, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("<unknown>", indexReader19, indexReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
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
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
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
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("<unknown>", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests1.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
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
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
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
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader12, (int) ' ', postingsEnum14, postingsEnum15, false);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(5);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
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
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader15, 5, postingsEnum17, postingsEnum18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader3, 10, postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) 'a', postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.common.unit.TimeValue timeValue18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus27 = simpleIndexQueryParserTests1.ensureGreen(timeValue18, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
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
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
        org.junit.Assert.assertNotNull(testRule24);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        float[][] floatArray7 = new float[][] { floatArray1, floatArray2, floatArray3, floatArray4, floatArray5, floatArray6 };
        float[][][] floatArray8 = new float[][][] { floatArray7 };
        java.util.List<float[][]> floatArrayList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, floatArray8);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArrayList9);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests6);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.failfast", indexReader27, 2, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        java.lang.String str35 = simpleIndexQueryParserTests32.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum30, (java.lang.Object) simpleIndexQueryParserTests32);
        simpleIndexQueryParserTests32.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests32.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
        org.junit.Assert.assertNotNull(ruleChain24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<unknown>" + "'", str35, "<unknown>");
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
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
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.unit.TimeValue timeValue17 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.List<java.lang.String> strList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, strArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus28 = simpleIndexQueryParserTests0.ensureGreen(timeValue17, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.setUp();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests25);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain29;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests13);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38, false);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain41;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain29);
        org.junit.Assert.assertNotNull(ruleChain41);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        java.lang.String str23 = simpleIndexQueryParserTests18.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.setUp();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        java.lang.String str28 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.setUp();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests25, (java.lang.Object) simpleIndexQueryParserTests30);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain34;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.TestRule testRule37 = simpleIndexQueryParserTests1.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<unknown>" + "'", str28, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain34);
        org.junit.Assert.assertNotNull(testRule37);
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests13.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) throttlingArray4, (java.lang.Object) simpleIndexQueryParserTests13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests13.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + throttling2 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling2.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling3 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling3.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray4);
        org.junit.Assert.assertNotNull(throttlingEnumList5);
        org.junit.Assert.assertTrue("'" + throttling7 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling7.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling8 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling8.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray9);
        org.junit.Assert.assertNotNull(throttlingEnumList10);
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray20, shortArray24);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray34, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray34, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray34);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray56, shortArray60);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray64, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray64);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray72);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray64);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[]");
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[]");
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests4.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("", postingsEnum22, postingsEnum23, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
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
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.slow", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus26 = simpleIndexQueryParserTests1.ensureGreen(strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strComparableSet25);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
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
        simpleIndexQueryParserTests11.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader23, terms24, terms25, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
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
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray34);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) throttlingArray34);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        java.util.List[] listArray40 = new java.util.List[1];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[] throttlingEnumListArray41 = (java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[]) listArray40;
        throttlingEnumListArray41[0] = throttlingEnumList38;
        java.util.List<java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>> throttlingEnumListList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, throttlingEnumListArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) throttlingEnumListList44);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling28 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling28.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray29);
        org.junit.Assert.assertNotNull(throttlingEnumList30);
        org.junit.Assert.assertTrue("'" + throttling32 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling32.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling33 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling33.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray34);
        org.junit.Assert.assertNotNull(throttlingEnumList35);
        org.junit.Assert.assertNotNull(throttlingEnumList38);
        org.junit.Assert.assertNotNull(listArray40);
        org.junit.Assert.assertNotNull(throttlingEnumListArray41);
        org.junit.Assert.assertNotNull(throttlingEnumListList44);
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("enwiki.random.lines.txt", indexReader25, terms26, terms27, false);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests32);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("tests.weekly", indexReader37, terms38, terms39, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests9, (java.lang.Object) indexReader37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.setUp();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests44);
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule49 = simpleIndexQueryParserTests44.ruleChain;
        simpleIndexQueryParserTests44.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.setUp();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests52);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests52.assertTermsEquals("random", indexReader57, terms58, terms59, false);
        simpleIndexQueryParserTests52.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests52.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests44, (java.lang.Object) simpleIndexQueryParserTests52);
        org.junit.rules.TestRule testRule66 = simpleIndexQueryParserTests44.ruleChain;
        org.junit.rules.TestRule testRule67 = simpleIndexQueryParserTests44.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) indexReader37, (java.lang.Object) simpleIndexQueryParserTests44);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("random", indexReader70, 2, postingsEnum72, postingsEnum73);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests44.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertNotNull(ruleChain48);
        org.junit.Assert.assertNotNull(testRule49);
        org.junit.Assert.assertNotNull(testRule66);
        org.junit.Assert.assertNotNull(testRule67);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
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
        java.lang.String str24 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests16.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<unknown>" + "'", str24, "<unknown>");
        org.junit.Assert.assertNotNull(testRule26);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.resetCheckIndexStatus();
        simpleIndexQueryParserTests33.resetCheckIndexStatus();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        simpleIndexQueryParserTests33.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("node_s_0", indexReader41, (int) (short) 0, postingsEnum43, postingsEnum44);
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests33.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests47.assertDocsSkippingEquals("", indexReader49, 10, postingsEnum51, postingsEnum52, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests33, (java.lang.Object) true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.setUp();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests60.setUp();
        simpleIndexQueryParserTests60.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests60);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain64;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain64;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule46);
        org.junit.Assert.assertNotNull(ruleChain64);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals(intArray13, intArray15);
        org.junit.Assert.assertArrayEquals(intArray2, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray21, intArray28);
        org.junit.Assert.assertArrayEquals(intArray2, intArray28);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray28);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray36, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray47, intArray49);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray47, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals(intArray47, intArray58);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals(intArray66, intArray68);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals(intArray66, intArray73);
        org.junit.Assert.assertArrayEquals(intArray47, intArray73);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray36, intArray73);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray81, intArray82);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray84, intArray85);
        org.junit.Assert.assertArrayEquals(intArray82, intArray84);
        org.junit.Assert.assertArrayEquals(intArray78, intArray84);
        org.junit.Assert.assertArrayEquals(intArray36, intArray84);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        int[] intArray93 = new int[] {};
        int[] intArray94 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray93, intArray94);
        org.junit.Assert.assertArrayEquals(intArray91, intArray93);
        org.junit.Assert.assertArrayEquals("hi!", intArray84, intArray91);
        org.junit.Assert.assertArrayEquals("random", intArray28, intArray91);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[]");
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader16, (int) (byte) 100, postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.setUp();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        java.lang.String str27 = simpleIndexQueryParserTests24.getTestName();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.setUp();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests24, (java.lang.Object) simpleIndexQueryParserTests29);
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        java.lang.String str34 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.setUp();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests37);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests37.assertDocsEnumEquals("random", postingsEnum42, postingsEnum43, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<unknown>" + "'", str27, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<unknown>" + "'", str34, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain48);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain20;
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain20);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.setUp();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.setUp();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests25);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule30 = simpleIndexQueryParserTests25.ruleChain;
        simpleIndexQueryParserTests25.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.setUp();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests33);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        simpleIndexQueryParserTests33.assertTermsEquals("random", indexReader38, terms39, terms40, false);
        simpleIndexQueryParserTests33.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests33.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests25, (java.lang.Object) simpleIndexQueryParserTests33);
        org.junit.rules.TestRule testRule47 = simpleIndexQueryParserTests33.ruleChain;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        simpleIndexQueryParserTests33.assertTermsEquals("enwiki.random.lines.txt", indexReader49, terms50, terms51, false);
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests15.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests15);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests15.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain29);
        org.junit.Assert.assertNotNull(testRule30);
        org.junit.Assert.assertNotNull(testRule47);
        org.junit.Assert.assertNotNull(ruleChain54);
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("node_s_0", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests5.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsSkippingEquals("", indexReader21, 10, postingsEnum23, postingsEnum24, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests5, (java.lang.Object) true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.setUp();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 10);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment47 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(ruleChain36);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        java.lang.String str19 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests16, (java.lang.Object) simpleIndexQueryParserTests21);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        java.lang.String str26 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        simpleIndexQueryParserTests21.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests21);
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<unknown>" + "'", str26, "<unknown>");
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests22.assertDocsSkippingEquals("<unknown>", indexReader34, (int) (short) 0, postingsEnum36, postingsEnum37, false);
        org.junit.rules.TestRule testRule40 = simpleIndexQueryParserTests22.ruleChain;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests22);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertNotNull(testRule40);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
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
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests6.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("tests.monster", indexReader13, fields14, fields15, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(testRule11);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }
}
