import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMatchAllBuilder();
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 0.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray29);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.ensureCheckIndexPassed();
        simpleIndexQueryParserTests46.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("tests.monster", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.failfast", indexReader57, 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray9, (java.lang.Object) simpleIndexQueryParserTests46);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests46);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests65.assertDocsEnumEquals("node_s_0", postingsEnum69, postingsEnum70, true);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        simpleIndexQueryParserTests65.assertTermsEquals("tests.failfast", indexReader74, terms75, terms76, false);
        simpleIndexQueryParserTests65.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        simpleIndexQueryParserTests65.assertPositionsSkippingEquals("tests.slow", indexReader81, (int) (byte) 10, postingsEnum83, postingsEnum84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests46, (java.lang.Object) simpleIndexQueryParserTests65);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.junit.rules.TestRule> testRuleSet6 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray43);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) executorServiceArray26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests59.ensureCheckIndexPassed();
        simpleIndexQueryParserTests59.restoreIndexWriterMaxDocs();
        java.lang.String str62 = simpleIndexQueryParserTests59.getTestName();
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray26, (java.lang.Object) str62);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures65);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray67 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures65 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray67);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray77);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        java.util.concurrent.ExecutorService executorService89 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] { executorService89 };
        boolean boolean91 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray87, (java.lang.Object[]) executorServiceArray90);
        boolean boolean93 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray67, (java.lang.Object[]) executorServiceArray83);
        java.lang.Object obj97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray83, obj97);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 100);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (int) (byte) 10, postingsEnum26, postingsEnum27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum26);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) (short) 10);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { '4', (byte) 0, '4', (-1L), (byte) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader11, fields12, fields13, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        simpleIndexQueryParserTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("hi!", indexReader22, (int) (short) 10, postingsEnum24, postingsEnum25, true);
        java.lang.String str28 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule30 = simpleIndexQueryParserTests18.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 10, (double) (short) -1);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray13, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals("random", byteArray8, byteArray21);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray34, byteArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray39);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.setUp();
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray32);
        java.lang.Object obj36 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) executorServiceArray32, obj36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 6);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100.0f, (double) '4');
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        int[] intArray0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.monster", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("tests.slow", postingsEnum22, postingsEnum23, false);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray29, intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray37, intArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray29, intArray37);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray47, intArray49);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray55, intArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray47, intArray55);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray65, intArray67);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray73, intArray75);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray65, intArray73);
        org.junit.Assert.assertArrayEquals(intArray47, intArray65);
        org.junit.Assert.assertArrayEquals(intArray37, intArray65);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) "tests.slow", (java.lang.Object) intArray65);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        org.junit.Assert.assertArrayEquals("", intArray65, intArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray65);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray56);
        java.lang.Object[] objArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, objArray68);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 0, 1.0d, (double) 0L);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) '4', (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) -1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 6, (double) 1.0f);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (-1.0d));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        char[] charArray4 = new char[] { ' ', ' ', '#', '4' };
        char[] charArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.failfast", indexReader13, 10, postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests19.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, true);
        org.junit.rules.TestRule testRule30 = simpleIndexQueryParserTests19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) testRule30);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.slow", postingsEnum21, postingsEnum22, false);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray28, intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray36, intArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray28, intArray36);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray46, intArray48);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray46, intArray54);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray64, intArray66);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray72, intArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray64, intArray72);
        org.junit.Assert.assertArrayEquals(intArray46, intArray64);
        org.junit.Assert.assertArrayEquals(intArray36, intArray64);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) "tests.slow", (java.lang.Object) intArray64);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("", intArray64, intArray83);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests86 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain87 = simpleIndexQueryParserTests86.failureAndSuccessEvents;
        java.lang.String str88 = simpleIndexQueryParserTests86.getTestName();
        org.junit.rules.TestRule testRule89 = simpleIndexQueryParserTests86.ruleChain;
        simpleIndexQueryParserTests86.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray64, (java.lang.Object) simpleIndexQueryParserTests86);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) ' ', postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
        long[] longArray5 = new long[] { (short) 10, 0, ' ', 1L, (byte) 0 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("tests.slow", postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.failfast", indexReader33, (int) (byte) 100, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests6.assertDocValuesEquals("tests.badapples", (-1), numericDocValues41, numericDocValues42);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.monster", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("hi!", indexReader31, fields32, fields33, false);
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) executorServiceArray4, (java.lang.Object) simpleIndexQueryParserTests20);
        char[] charArray40 = new char[] {};
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray45, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals("random", charArray62, charArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray55, charArray66);
        org.junit.Assert.assertArrayEquals("hi!", charArray45, charArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray40, charArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray40);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) "node_s_0");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray10);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.monster", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.failfast", indexReader26, 10, postingsEnum28, postingsEnum29);
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests15.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) "<unknown>", (java.lang.Object) testRule34);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
        long[] longArray4 = new long[] { 'a', 'a', 5, (byte) 10 };
        long[] longArray9 = new long[] { (-1), '#', 4, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '#');
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        char[] charArray1 = null;
        char[] charArray4 = new char[] {};
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray9, charArray14);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("random", charArray26, charArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray19, charArray30);
        org.junit.Assert.assertArrayEquals("hi!", charArray9, charArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray4);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("random", charArray47, charArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray56);
        org.junit.Assert.assertArrayEquals(charArray4, charArray56);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals(charArray64, charArray66);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        org.junit.Assert.assertArrayEquals("random", charArray71, charArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray64, charArray75);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray75, charArray80);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray87, charArray88);
        org.junit.Assert.assertArrayEquals("random", charArray84, charArray88);
        org.junit.Assert.assertArrayEquals("", charArray75, charArray88);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray56, charArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray56);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
        java.lang.String[] strArray2 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray4 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray6 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray8 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray2, strArray4, strArray6, strArray8 };
        java.lang.String[] strArray11 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray13 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray15 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray17 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray11, strArray13, strArray15, strArray17 };
        java.lang.String[] strArray20 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray22 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray24 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray26 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray20, strArray22, strArray24, strArray26 };
        java.lang.String[] strArray29 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray31 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray33 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray35 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray29, strArray31, strArray33, strArray35 };
        java.lang.String[] strArray38 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray40 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray42 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray44 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray45 = new java.lang.String[][] { strArray38, strArray40, strArray42, strArray44 };
        java.lang.String[][][] strArray46 = new java.lang.String[][][] { strArray9, strArray18, strArray27, strArray36, strArray45 };
        java.util.Set<java.lang.String[][]> strArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        java.util.Set<java.lang.Cloneable> cloneableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) strArray46);
        java.lang.Object obj49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) cloneableSet48, obj49);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 1.0d, (double) (short) -1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2556");
        short[] shortArray2 = new short[] { (short) -1 };
        short[] shortArray4 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray8 = new short[] { (short) -1 };
        short[] shortArray10 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray14 = new short[] { (short) -1 };
        short[] shortArray16 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (short) -1 };
        short[] shortArray21 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray14, shortArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray10, shortArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray2, shortArray10);
        short[] shortArray28 = new short[] { (short) -1 };
        short[] shortArray30 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        short[] shortArray34 = new short[] { (short) -1 };
        short[] shortArray36 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        short[] shortArray39 = new short[] { (short) -1 };
        short[] shortArray41 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray34, shortArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray30, shortArray39);
        short[] shortArray46 = new short[] { (short) -1 };
        short[] shortArray48 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray2);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2558");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) executorServiceArray44, (java.lang.Object) 10.0d);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.lang.Class<?> wildcardClass53 = executorServiceArray44.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray34, (java.lang.Object) executorServiceArray44);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2559");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2560");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList2 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, throttlingArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray27);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray76);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2561");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (short) -1);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("tests.weekly", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests23.ruleChain;
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray30 = new org.elasticsearch.test.ElasticsearchTestCase[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests13, simpleIndexQueryParserTests21, simpleIndexQueryParserTests23 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray46);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests63.ensureCheckIndexPassed();
        simpleIndexQueryParserTests63.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests63.assertDocsEnumEquals("tests.badapples", postingsEnum67, postingsEnum68, false);
        simpleIndexQueryParserTests63.setIndexWriterMaxDocs((int) (byte) -1);
        org.junit.rules.RuleChain ruleChain73 = simpleIndexQueryParserTests63.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests63.failureAndSuccessEvents;
        java.lang.String str75 = simpleIndexQueryParserTests63.getTestName();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) executorServiceArray39, (java.lang.Object) str75);
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchTestCaseArray30, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2563");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 10);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2564");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray15, intArray17);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray23);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        org.junit.Assert.assertArrayEquals(intArray34, intArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray34);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray63, intArray65);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray71, intArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray63, intArray71);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray34, intArray63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests88.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests88.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) intArray34, (java.lang.Object) simpleIndexQueryParserTests88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testMoreLikeThisIds();
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2565");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        java.lang.Object obj52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) executorServiceArray20, obj52);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader4, 0, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2567");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { 100, (short) 10, 6, (short) 0, 1L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2568");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.junit.rules.TestRule> testRuleSet6 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray43);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) executorServiceArray26);
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, testRuleIgnoreAfterMaxFailuresArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray4);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2569");
        long[] longArray6 = new long[] { (short) -1, (byte) 1, '4', 0L, ' ' };
        long[] longArray11 = new long[] { (short) 10, (short) 0, 3, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray11);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2570");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) ruleChain15);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2571");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray31);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray31);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray41, intArray43);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray50, intArray58);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray68, intArray70);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray76, intArray78);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray68, intArray76);
        org.junit.Assert.assertArrayEquals(intArray50, intArray68);
        org.junit.Assert.assertArrayEquals(intArray41, intArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray41);
        int[] intArray91 = new int[] { (short) 1, '#', (short) 100, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray91);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2572");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2573");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 'a');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray6, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray20, (double) 0);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray26, doubleArray31, (double) 0);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 'a');
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray37, doubleArray42, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray37, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray15, doubleArray31, (double) 1);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray52, (double) (-1.0f));
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) 'a');
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray58, doubleArray63, (double) 0);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray69, (double) '4');
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray69, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray15, 0.0d);
        double[] doubleArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray78, (double) 1.0f);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7, false);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str6 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.monster", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.failfast", indexReader20, 10, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("tests.monster", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        simpleIndexQueryParserTests34.assertTermsEquals("tests.monster", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.failfast", indexReader45, 10, postingsEnum47, postingsEnum48);
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain53;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1L, 0L);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2580");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5, throttling6 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray3, throttlingArray7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray8 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray35);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray9, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 4, (long) 3);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2582");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray36);
        java.lang.Object[] objArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, objArray41);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2583");
        long[] longArray7 = new long[] { (byte) 0, 10L, (short) 10, (byte) 0, (byte) 0, 10 };
        long[] longArray9 = new long[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray7, longArray9);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.failfast", indexReader13, 10, postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) 0, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, 1.0d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2586");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests54.ensureCheckIndexPassed();
        simpleIndexQueryParserTests54.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests54.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule58 = simpleIndexQueryParserTests54.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests59.ensureCheckIndexPassed();
        simpleIndexQueryParserTests59.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain63 = simpleIndexQueryParserTests62.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        simpleIndexQueryParserTests64.assertTermsEquals("tests.monster", indexReader69, terms70, terms71, false);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests64.assertPositionsSkippingEquals("tests.failfast", indexReader75, 10, postingsEnum77, postingsEnum78);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray80 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests53, simpleIndexQueryParserTests54, simpleIndexQueryParserTests59, simpleIndexQueryParserTests62, simpleIndexQueryParserTests64 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet81 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) luceneTestCaseArray80);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        char[] charArray6 = new char[] {};
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray11, charArray16);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("random", charArray28, charArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray21, charArray32);
        org.junit.Assert.assertArrayEquals("hi!", charArray11, charArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray21);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("random", charArray47, charArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray51);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray21, charArray51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests56.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray21, (java.lang.Object) ruleChain59);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        java.lang.String[] strArray63 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus64 = simpleIndexQueryParserTests0.ensureGreen(strArray63);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2588");
        long[] longArray6 = new long[] { (byte) 100, 100L, (-1), 4, 100, (short) 0 };
        long[] longArray13 = new long[] { (byte) 0, (short) 100, 1L, (short) -1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2590");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2592");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.monster", indexReader22, terms23, terms24, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.awaitsfix", indexReader36, terms37, terms38, true);
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) (byte) -1);
        java.lang.Class<?> wildcardClass43 = simpleIndexQueryParserTests17.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule16, (java.lang.Object) wildcardClass43);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 0L);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2595");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader15, (int) (byte) 1, postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2597");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2599");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray2, intArray4);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray12, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray12, intArray20);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray30, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray38, intArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray30, intArray38);
        org.junit.Assert.assertArrayEquals("random", intArray12, intArray38);
        org.junit.Assert.assertArrayEquals(intArray2, intArray12);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray2, intArray47);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.ensureCheckIndexPassed();
        simpleIndexQueryParserTests51.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests51.ensureCleanedUp();
        java.lang.String str55 = simpleIndexQueryParserTests51.getTestName();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests51.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader57, (int) 'a', postingsEnum59, postingsEnum60, false);
        simpleIndexQueryParserTests51.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests51.assertPositionsSkippingEquals("<unknown>", indexReader65, (int) (byte) 0, postingsEnum67, postingsEnum68);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests51.assertPositionsSkippingEquals("tests.failfast", indexReader71, (int) (byte) 100, postingsEnum73, postingsEnum74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray47, (java.lang.Object) indexReader71);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2600");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray60);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.lang.String[] strArray84 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray86 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray88 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray89 = new java.lang.String[][] { strArray84, strArray86, strArray88 };
        java.util.Set<java.lang.String[]> strArraySet90 = org.apache.lucene.util.LuceneTestCase.asSet(strArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) strArray89);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2601");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2602");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        java.lang.String str10 = simpleIndexQueryParserTests6.getTestName();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2603");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.junit.rules.TestRule> testRuleSet6 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray43);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) executorServiceArray26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests59.ensureCheckIndexPassed();
        simpleIndexQueryParserTests59.restoreIndexWriterMaxDocs();
        java.lang.String str62 = simpleIndexQueryParserTests59.getTestName();
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray26, (java.lang.Object) str62);
        java.lang.Class<?> wildcardClass64 = executorServiceArray26.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass64);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2604");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray24);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) executorServiceArray8);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryQueryBuilder();
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) -1);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2607");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2608");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.setUp();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 6, (long) 3);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) 100);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2613");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray15, intArray17);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray23);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        org.junit.Assert.assertArrayEquals(intArray34, intArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray34);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray63, intArray65);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray71, intArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray63, intArray71);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray34, intArray63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests88.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests88.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) intArray34, (java.lang.Object) simpleIndexQueryParserTests88);
        simpleIndexQueryParserTests88.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2614");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2615");
        long[] longArray2 = new long[] { 10L };
        long[] longArray5 = new long[] { (-1L), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray2, longArray5);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2616");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader16, fields17, fields18, true);
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) '4', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '#', (double) 0.0f);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.failfast", indexReader6, 2, postingsEnum8, postingsEnum9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) 10.0f, (java.lang.Object) postingsEnum9);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader9, fields10, fields11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader15, fields16, fields17, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("<unknown>", postingsEnum24, postingsEnum25, true);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests20.ruleChain;
        simpleIndexQueryParserTests20.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader15, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) -1, (double) (byte) 0);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) '4');
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2624");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.Object obj6 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj6, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.weekly");
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 5);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2627");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray18, byteArray21);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray26, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray34);
        org.junit.Assert.assertArrayEquals("random", byteArray21, byteArray34);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray45, byteArray48);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray53, byteArray56);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray61);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray61);
        org.junit.Assert.assertArrayEquals("random", byteArray48, byteArray61);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray71, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray21, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray11, byteArray21);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray82, byteArray85);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray90);
        byte[] byteArray92 = new byte[] {};
        byte[] byteArray93 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray92, byteArray93);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray90, byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray85, byteArray90);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray11, byteArray90);
        byte[] byteArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray90, byteArray98);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2628");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests18);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum26, postingsEnum27, true);
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, obj30);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2629");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2630");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray23);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests48.ensureCheckIndexPassed();
        simpleIndexQueryParserTests48.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        simpleIndexQueryParserTests48.assertTermsEquals("tests.monster", indexReader53, terms54, terms55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("hi!", indexReader59, fields60, fields61, false);
        simpleIndexQueryParserTests48.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        simpleIndexQueryParserTests48.assertTermsEquals("tests.badapples", indexReader66, terms67, terms68, false);
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests48.assertDocsEnumEquals("tests.monster", postingsEnum72, postingsEnum73, true);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("tests.slow", indexReader77, fields78, fields79, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests82 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests82.ensureCheckIndexPassed();
        simpleIndexQueryParserTests82.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests82.ensureCleanedUp();
        java.lang.String str86 = simpleIndexQueryParserTests82.getTestName();
        simpleIndexQueryParserTests82.overrideTestDefaultQueryCache();
        java.lang.String str88 = simpleIndexQueryParserTests82.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests89 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests89.ensureCheckIndexPassed();
        simpleIndexQueryParserTests89.setUp();
        org.junit.rules.RuleChain ruleChain92 = simpleIndexQueryParserTests89.failureAndSuccessEvents;
        simpleIndexQueryParserTests82.failureAndSuccessEvents = ruleChain92;
        simpleIndexQueryParserTests48.failureAndSuccessEvents = ruleChain92;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray23, (java.lang.Object) simpleIndexQueryParserTests48);
        org.apache.lucene.index.PostingsEnum postingsEnum97 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests48.assertDocsAndPositionsEnumEquals("", postingsEnum97, postingsEnum98);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2632");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBuilder();
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2633");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields2Builder();
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2635");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) '4', (double) 6);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 6, (long) 1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2638");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 'a');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray3, doubleArray8, (double) 0);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) 'a');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray14, doubleArray19, (double) 0);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray25, doubleArray30, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray25, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray3, doubleArray19, (double) 1);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray40, (double) (-1.0f));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests45.ensureCheckIndexPassed();
        simpleIndexQueryParserTests45.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("tests.monster", indexReader50, terms51, terms52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.failfast", indexReader56, 10, postingsEnum58, postingsEnum59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests45.assertDocsSkippingEquals("", indexReader62, (int) (short) 1, postingsEnum64, postingsEnum65, true);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("europarl.lines.txt.gz", indexReader69, terms70, terms71, true);
        simpleIndexQueryParserTests45.ensureCleanedUp();
        java.lang.String str75 = simpleIndexQueryParserTests45.getTestName();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("tests.weekly", indexReader77, terms78, terms79, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray3, (java.lang.Object) simpleIndexQueryParserTests45);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2639");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2640");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray43);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet46 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) throttlingArray43);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2642");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader7, (int) (byte) 1, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2643");
        short[] shortArray6 = new short[] { (short) -1 };
        short[] shortArray8 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray14 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray8, shortArray17);
        short[] shortArray25 = new short[] { (short) -1 };
        short[] shortArray27 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        short[] shortArray30 = new short[] { (short) -1 };
        short[] shortArray32 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray32);
        short[] shortArray37 = new short[] { (short) -1 };
        short[] shortArray39 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (short) -1 };
        short[] shortArray44 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray37, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray25, shortArray37);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray25);
        short[] shortArray50 = new short[] { (short) -1 };
        short[] shortArray52 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        short[] shortArray55 = new short[] { (short) -1 };
        short[] shortArray57 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray50);
        short[] shortArray62 = new short[] { (short) -1 };
        short[] shortArray64 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        short[] shortArray67 = new short[] { (short) -1 };
        short[] shortArray69 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray50, shortArray62);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) shortArray50);
        short[] shortArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray74);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader6, (int) 'a', postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (byte) 10, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2645");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        java.lang.String str10 = simpleIndexQueryParserTests6.getTestName();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2647");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (byte) 1);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2650");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[] intArray9 = new int[] { 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        int[][][] intArray11 = new int[][][] { intArray10 };
        int[][][][] intArray12 = new int[][][][] { intArray11 };
        java.util.Set<int[][][]> intArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) intArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray18 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray20 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray22 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray23 = new java.lang.String[][] { strArray16, strArray18, strArray20, strArray22 };
        java.lang.String[] strArray25 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray27 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray29 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray31 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray25, strArray27, strArray29, strArray31 };
        java.lang.String[] strArray34 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray36 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray38 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray40 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray34, strArray36, strArray38, strArray40 };
        java.lang.String[] strArray43 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray45 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray47 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray49 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray43, strArray45, strArray47, strArray49 };
        java.lang.String[] strArray52 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray54 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray56 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray58 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray59 = new java.lang.String[][] { strArray52, strArray54, strArray56, strArray58 };
        java.lang.String[][][] strArray60 = new java.lang.String[][][] { strArray23, strArray32, strArray41, strArray50, strArray59 };
        java.util.Set<java.lang.String[][]> strArraySet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.util.Set<java.lang.Cloneable> cloneableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) strArray60);
        java.util.Set<java.lang.String[][]> strArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray12, (java.lang.Object[]) strArray60);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader19, terms20, terms21, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2653");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 'a', (double) ' ', 0.0d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2655");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("hi!", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21, true);
        java.lang.String str24 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("tests.monster", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.failfast", indexReader38, 10, postingsEnum40, postingsEnum41);
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests27.ruleChain;
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain46;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader9, (java.lang.Object) ruleChain46);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2658");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2659");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("random", charArray8, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("hi!", charArray16, charArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray8, charArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray4, charArray8);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("hi!", charArray33, charArray37);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("random", charArray42, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("hi!", charArray50, charArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray42, charArray54);
        org.junit.Assert.assertArrayEquals(charArray37, charArray54);
        org.junit.Assert.assertArrayEquals(charArray28, charArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray28);
        char[] charArray62 = new char[] {};
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals(charArray67, charArray72);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals(charArray77, charArray79);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray87, charArray88);
        org.junit.Assert.assertArrayEquals("random", charArray84, charArray88);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray77, charArray88);
        org.junit.Assert.assertArrayEquals("hi!", charArray67, charArray77);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray62, charArray77);
        org.junit.Assert.assertArrayEquals(charArray4, charArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray77);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2660");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) ' ', (double) 10);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0d), (double) (-1L));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2663");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray15);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) 'a');
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray29, doubleArray34, (double) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray5, (java.lang.Object) 0);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray64);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy68 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass69 = queryCachingPolicy68.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray64, (java.lang.Object) queryCachingPolicy68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) executorServiceArray64);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2664");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) executorServiceArray5);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader6, (int) 'a', postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 6, 100.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2669");
        long[] longArray3 = new long[] { (byte) -1, 1, 10L };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2670");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2671");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { (short) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray4);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 10);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2673");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray3, intArray5);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray12, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray12, intArray20);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray30, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray38, intArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray30, intArray38);
        org.junit.Assert.assertArrayEquals(intArray12, intArray30);
        org.junit.Assert.assertArrayEquals(intArray3, intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) intArray3);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2675");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray3);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray3);
        double[] doubleArray10 = new double[] { (-1) };
        double[] doubleArray12 = new double[] { (-1) };
        double[] doubleArray14 = new double[] { (-1) };
        double[] doubleArray16 = new double[] { (-1) };
        double[] doubleArray18 = new double[] { (-1) };
        double[][] doubleArray19 = new double[][] { doubleArray10, doubleArray12, doubleArray14, doubleArray16, doubleArray18 };
        double[] doubleArray21 = new double[] { (-1) };
        double[] doubleArray23 = new double[] { (-1) };
        double[] doubleArray25 = new double[] { (-1) };
        double[] doubleArray27 = new double[] { (-1) };
        double[] doubleArray29 = new double[] { (-1) };
        double[][] doubleArray30 = new double[][] { doubleArray21, doubleArray23, doubleArray25, doubleArray27, doubleArray29 };
        double[] doubleArray32 = new double[] { (-1) };
        double[] doubleArray34 = new double[] { (-1) };
        double[] doubleArray36 = new double[] { (-1) };
        double[] doubleArray38 = new double[] { (-1) };
        double[] doubleArray40 = new double[] { (-1) };
        double[][] doubleArray41 = new double[][] { doubleArray32, doubleArray34, doubleArray36, doubleArray38, doubleArray40 };
        double[][][] doubleArray42 = new double[][][] { doubleArray19, doubleArray30, doubleArray41 };
        java.util.List<double[][]> doubleArrayList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, doubleArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) doubleArray42);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2676");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray15, intArray17);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray23);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        org.junit.Assert.assertArrayEquals(intArray34, intArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray34);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray63, intArray65);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray71, intArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray63, intArray71);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray34, intArray63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests88.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests88.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) intArray34, (java.lang.Object) simpleIndexQueryParserTests88);
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2677");
        java.lang.String[] strArray1 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray3 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray5 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray7 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7 };
        java.lang.String[] strArray10 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray12 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray14 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray16 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray10, strArray12, strArray14, strArray16 };
        java.lang.String[] strArray19 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray21 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray23 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray25 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray26 = new java.lang.String[][] { strArray19, strArray21, strArray23, strArray25 };
        java.lang.String[] strArray28 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray30 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray32 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray34 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray28, strArray30, strArray32, strArray34 };
        java.lang.String[] strArray37 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray39 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray41 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray43 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray44 = new java.lang.String[][] { strArray37, strArray39, strArray41, strArray43 };
        java.lang.String[][][] strArray45 = new java.lang.String[][][] { strArray8, strArray17, strArray26, strArray35, strArray44 };
        java.util.Set<java.lang.String[][]> strArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.util.Set<java.lang.Cloneable> cloneableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) strArray45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests48.ensureCheckIndexPassed();
        simpleIndexQueryParserTests48.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests48.assertDocsEnumEquals("tests.weekly", postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests48.assertDocsSkippingEquals("tests.awaitsfix", indexReader57, (int) (short) 0, postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("", indexReader64, 0, postingsEnum66, postingsEnum67);
        simpleIndexQueryParserTests48.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray45, (java.lang.Object) simpleIndexQueryParserTests48);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2678");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain10;
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests1.ruleChain;
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray26);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray65);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray85, (java.lang.Object[]) executorServiceArray89);
        boolean boolean92 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray42);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2680");
        int[] intArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.monster", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) ' ', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("tests.weekly", indexReader23, (int) (byte) 100, postingsEnum25, postingsEnum26, false);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray60, intArray62);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray68, intArray70);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray60, intArray68);
        org.junit.Assert.assertArrayEquals("random", intArray42, intArray68);
        org.junit.Assert.assertArrayEquals(intArray32, intArray42);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        org.junit.Assert.assertArrayEquals(intArray32, intArray77);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) ruleChain29, (java.lang.Object) intArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray32);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 0, (double) '4', (double) (short) -1);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader33, (int) ' ', postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (short) 100);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("tests.monster", indexReader24, terms25, terms26, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("tests.slow", postingsEnum38, postingsEnum39, false);
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 2);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 3);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2689");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { 0, 100L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 5);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2691");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) 'a');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray4, doubleArray9, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray20, (double) 0);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray26, doubleArray31, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray26, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray4, doubleArray20, (double) 1);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 'a');
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray41, doubleArray46, (double) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray20, doubleArray41, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray20, (double) '4');
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2693");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        java.lang.Class<?> wildcardClass16 = simpleIndexQueryParserTests0.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain18, (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass21 = ruleChain18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[] { wildcardClass16, wildcardClass21 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet23 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray22);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) genericDeclarationArray22, obj24);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray42);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests47.assertDocsEnumEquals("<unknown>", postingsEnum51, postingsEnum52, true);
        simpleIndexQueryParserTests47.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule56 = simpleIndexQueryParserTests47.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray42, (java.lang.Object) testRule56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray22, (java.lang.Object[]) executorServiceArray73);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2696");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        java.lang.String str5 = simpleIndexQueryParserTests3.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) "node_s_0", (java.lang.Object) testRule22);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2697");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray5);
        java.util.Set<org.junit.rules.TestRule> testRuleSet7 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray5);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray44);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray5, (java.lang.Object[]) executorServiceArray27);
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, testRuleIgnoreAfterMaxFailuresArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) testRuleIgnoreAfterMaxFailuresList60);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2698");
        short[] shortArray6 = new short[] { (short) 1, (short) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray17);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray27 = new short[] { (short) -1 };
        short[] shortArray29 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray22, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray10, shortArray22);
        short[] shortArray34 = new short[] { (short) -1 };
        short[] shortArray36 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray10, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2699");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '4', (double) (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2701");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray15, intArray17);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray15, intArray23);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        org.junit.Assert.assertArrayEquals(intArray34, intArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray34);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray63, intArray65);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray71, intArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray63, intArray71);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray34, intArray63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests88.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests88.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) intArray34, (java.lang.Object) simpleIndexQueryParserTests88);
        simpleIndexQueryParserTests88.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testTermQueryBuilder();
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) '4', (double) (-1.0f));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2704");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray14);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2706");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray2, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray10, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray19, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray19);
        byte[] byteArray30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray30);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2707");
        long[] longArray1 = new long[] { 4 };
        long[] longArray5 = new long[] { '4', 3, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2708");
        short[] shortArray2 = new short[] { (short) -1 };
        short[] shortArray4 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (short) -1 };
        short[] shortArray9 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray21 = new short[] { (short) -1 };
        short[] shortArray23 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (short) -1 };
        short[] shortArray28 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray21, shortArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray17, shortArray26);
        short[] shortArray34 = new short[] { (short) -1 };
        short[] shortArray36 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        short[] shortArray39 = new short[] { (short) -1 };
        short[] shortArray41 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray41);
        short[] shortArray46 = new short[] { (short) -1 };
        short[] shortArray48 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        short[] shortArray51 = new short[] { (short) -1 };
        short[] shortArray53 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray46, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray34, shortArray46);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray34);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        short[] shortArray66 = new short[] { (short) -1 };
        short[] shortArray68 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray68);
        short[] shortArray71 = new short[] { (short) -1 };
        short[] shortArray73 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray73);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray66, shortArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray62, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray62);
        short[] shortArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray79);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0L, 1L);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2712");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (-1L), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2713");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray13);
        java.lang.String[] strArray27 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray29 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray31 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray27, strArray29, strArray31 };
        java.util.Set<java.lang.String[]> strArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray32);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2714");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader14, terms15, terms16, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) terms16);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 100, (double) 4, (double) (byte) 10);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 100.0d, (double) (byte) 1);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2717");
        long[] longArray6 = new long[] { (byte) 1, '4', (byte) 10, (short) 0, (-1), 3 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 6, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2720");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) 'a');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 'a');
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray12, (double) 0);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray18, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray18, (double) 0.0f);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray26, doubleArray31, (double) 0);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray37, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray37, (double) 10);
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) 'a');
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) 'a');
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray49, doubleArray54, (double) 0);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray60, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray60, (double) 0.0f);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) 'a');
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray73, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray68, doubleArray73, (double) 0);
        double[] doubleArray78 = new double[] {};
        double[] doubleArray79 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray79, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray79, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray79, (double) 10);
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray2, doubleArray79, (double) 1L);
        double[] doubleArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray2, doubleArray88, 100.0d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2721");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2722");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9, false);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray78);
        java.lang.Object obj82 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) executorServiceArray78, obj82);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", objArray1, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2723");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.ensureCheckIndexPassed();
        simpleIndexQueryParserTests37.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests37.assertTermsEquals("tests.monster", indexReader42, terms43, terms44, false);
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests37.resetCheckIndexStatus();
        simpleIndexQueryParserTests37.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests50.ensureCheckIndexPassed();
        simpleIndexQueryParserTests50.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests50.assertDocsEnumEquals("tests.weekly", postingsEnum54, postingsEnum55, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests60.ensureCheckIndexPassed();
        simpleIndexQueryParserTests60.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule63 = simpleIndexQueryParserTests60.ruleChain;
        simpleIndexQueryParserTests60.ensureCheckIndexPassed();
        simpleIndexQueryParserTests60.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray67 = new org.elasticsearch.test.ElasticsearchTestCase[] { simpleIndexQueryParserTests37, simpleIndexQueryParserTests50, simpleIndexQueryParserTests58, simpleIndexQueryParserTests60 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray67);
        java.util.List<org.junit.Assert> assertList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.junit.Assert[]) elasticsearchTestCaseArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) elasticsearchTestCaseArray67);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader11, fields12, fields13, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader29, fields30, fields31, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2727");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        java.lang.String str10 = simpleIndexQueryParserTests4.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCheckIndexPassed();
        simpleIndexQueryParserTests11.setUp();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain14;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (-1.0d), (double) (-1L));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2729");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2731");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("<unknown>", postingsEnum10, postingsEnum11, true);
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests6.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.monster", indexReader22, terms23, terms24, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain28;
        org.junit.Assert.assertNotSame("", (java.lang.Object) testRuleIgnoreAfterMaxFailuresList5, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) 'a');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray35, doubleArray40, (double) 0);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray46, (double) '4');
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray52, doubleArray57, (double) 0);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) 'a');
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray68, (double) 'a');
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray67, doubleArray72, (double) 0);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray78, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray78, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray78, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray62, 10.0d);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray35, doubleArray62, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) doubleArray62);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2732");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures4 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray6);
        java.util.Set<org.junit.rules.TestRule> testRuleSet8 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray6, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests61.ensureCheckIndexPassed();
        simpleIndexQueryParserTests61.restoreIndexWriterMaxDocs();
        java.lang.String str64 = simpleIndexQueryParserTests61.getTestName();
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray28, (java.lang.Object) str64);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures68 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures67);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray69 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures67 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader8, (int) (byte) 1, postingsEnum10, postingsEnum11, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) indexReader8, (java.lang.Object) 1.0d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader11, fields12, fields13, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (short) 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1L), (double) 'a');
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryStringFields1Builder();
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2737");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 1);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray5, floatArray8, (float) '#');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray15, (float) (byte) 10);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 1);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray23, floatArray26, (float) '#');
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray33, (float) (byte) 10);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 1);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray40, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray43, (float) 0);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 1);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray53, floatArray56, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray26, floatArray56, (-1.0f));
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 1);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray66, floatArray69, (float) '#');
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray76, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray69, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray15, floatArray56, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray1, floatArray56, (float) 5);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2738");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray66);
        java.lang.Object[] objArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, objArray91);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, 10.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) ' ');
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 10);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2742");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray6, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray14);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray6, intArray25);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray33, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray33, intArray41);
        org.junit.Assert.assertArrayEquals(intArray25, intArray41);
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("node_s_0", intArray25, intArray49);
        int[] intArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray49, intArray51);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader10, terms11, terms12, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms12);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2745");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = simpleIndexQueryParserTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass16);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2747");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale2, locale4, locale6, locale8 };
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale11, locale13, locale15, locale17 };
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale20, locale22, locale24, locale26 };
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale29, locale31, locale33, locale35 };
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale38, locale40, locale42, locale44 };
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale47, locale49, locale51, locale53 };
        java.util.Locale[][] localeArray55 = new java.util.Locale[][] { localeArray9, localeArray18, localeArray27, localeArray36, localeArray45, localeArray54 };
        java.util.List<java.util.Locale[]> localeArrayList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, localeArray55);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        simpleIndexQueryParserTests57.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests57.resetCheckIndexStatus();
        simpleIndexQueryParserTests57.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests57.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests57.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) localeArrayList56, (java.lang.Object) simpleIndexQueryParserTests57);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.nightly", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.badapples", indexReader26, terms27, terms28, false);
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("tests.maxfailures", postingsEnum33, postingsEnum34, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain5, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2755");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 'a');
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 2, (long) 'a');
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) 1.0f);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2758");
        long[] longArray3 = new long[] { (short) -1, 6, 0 };
        long[] longArray5 = new long[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2759");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 1);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 1);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray9, floatArray12, (float) '#');
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray19, (float) (byte) 10);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 1);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray29, (float) '#');
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray36, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray36, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray12, (float) 0);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 1);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray51, (float) '#');
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) (short) 1);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray59, floatArray62, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests68.ensureCheckIndexPassed();
        simpleIndexQueryParserTests68.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests68.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests68.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray62, (java.lang.Object) simpleIndexQueryParserTests68);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray48, floatArray62, (float) ' ');
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray48, (float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) shortArray1, (java.lang.Object) floatArray48);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0, (double) 10L);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2761");
        long[] longArray1 = null;
        long[] longArray7 = new long[] { (short) 10, 6, (byte) 10, '#', 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray7);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2763");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray35);
        java.lang.Object[] objArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray17, objArray52);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2764");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray25, charArray36);
        org.junit.Assert.assertArrayEquals("hi!", charArray15, charArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray10, charArray25);
        org.junit.Assert.assertArrayEquals(charArray2, charArray25);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain60;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests53);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) simpleIndexQueryParserTests53);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests53.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 'a', (double) 100);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2766");
        char[] charArray5 = new char[] { 'a', '#', '4', ' ', '#' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 1L, 0L);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) 1);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2769");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) 'a');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray2, doubleArray7, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray20, (double) 0);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray26, doubleArray31, (double) 0);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 'a');
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray37, doubleArray42, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray37, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray15, doubleArray31, (double) 1);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray52, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray52, (double) (short) 10);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) 'a');
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray60, doubleArray65, (double) 0);
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) 'a');
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray71, doubleArray76, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray71, (double) (-1L));
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray7, doubleArray65, (double) ' ');
        double[] doubleArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray85, 100.0d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.awaitsfix", "enwiki.random.lines.txt", "random", "tests.maxfailures", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus14 = simpleIndexQueryParserTests0.ensureGreen(strArray12);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) ' ', postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        java.lang.String str26 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str27 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.monster", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain14;
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2774");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 2);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2776");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.awaitsfix", "enwiki.random.lines.txt", "random", "tests.maxfailures", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.util.List<java.lang.String> strList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, strArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus19 = simpleIndexQueryParserTests0.ensureGreen(strArray15);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100L, (double) (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1L, (double) 5);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 'a');
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2782");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs((int) 'a');
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 'a');
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", obj30);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 6, (double) (-1.0f));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRule5);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 100, (double) (short) 0, (double) 4);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2787");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.setup();
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2789");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("hi!", indexReader6, (int) (short) 10, postingsEnum8, postingsEnum9, true);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.monster", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.failfast", indexReader26, 10, postingsEnum28, postingsEnum29);
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests15.ruleChain;
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2791");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray31);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray31);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2792");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray41);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2793");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2794");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("tests.monster", indexReader28, terms29, terms30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("hi!", indexReader34, fields35, fields36, false);
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests18.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2795");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { 100, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray1, longArray5);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2797");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy1);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy5);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy8);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy12);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy10, queryCachingPolicy11, queryCachingPolicy12 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy15);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy19);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy15, queryCachingPolicy17, queryCachingPolicy18, queryCachingPolicy19 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy22);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy24 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy26 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy26);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray28 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy22, queryCachingPolicy24, queryCachingPolicy25, queryCachingPolicy26 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy29);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy32 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy33 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy33);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray35 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy29, queryCachingPolicy31, queryCachingPolicy32, queryCachingPolicy33 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray36 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray7, queryCachingPolicyArray14, queryCachingPolicyArray21, queryCachingPolicyArray28, queryCachingPolicyArray35 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) queryCachingPolicyArraySet37);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2798");
        long[] longArray7 = new long[] { (short) 1, 2, 0L, 'a', (byte) -1, (short) 10 };
        long[] longArray12 = new long[] { 4, 0, 4, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray7, longArray12);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2801");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        java.lang.Object obj7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain5, obj7);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        java.lang.String str10 = simpleIndexQueryParserTests6.getTestName();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2805");
        long[] longArray1 = new long[] { 100L };
        long[] longArray8 = new long[] { (short) 0, (short) 0, 10L, ' ', 6, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2806");
        long[] longArray1 = new long[] { 5 };
        long[] longArray3 = new long[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2807");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str6 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 10, postingsEnum10, postingsEnum11, false);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests15.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests15.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, true);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain14, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 5, (double) 'a', (double) 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2810");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1, (double) (byte) 0);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2812");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray13);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray23, byteArray26);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray31, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray39, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray39);
        org.junit.Assert.assertArrayEquals("random", byteArray26, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray13, byteArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray13);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 0L);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2814");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 100, (long) (short) 1);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2816");
        char[] charArray3 = new char[] {};
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray8, charArray13);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("random", charArray25, charArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray18, charArray29);
        org.junit.Assert.assertArrayEquals("hi!", charArray8, charArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray18);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray37, charArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray18, charArray48);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray56, charArray61);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray48, charArray56);
        char[] charArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray56, charArray65);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2817");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader32, (int) ' ', postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader38, fields39, fields40, true);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum44, postingsEnum45, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2819");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.weekly", indexReader17, (int) ' ', postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) (-1.0f), (java.lang.Object) postingsEnum20);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100.0f, (double) (short) 0, 1.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2821");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 10.0f);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2823");
        short[] shortArray3 = new short[] { (short) -1 };
        short[] shortArray5 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) -1 };
        short[] shortArray11 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray20 = new short[] { (short) -1 };
        short[] shortArray22 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray15, shortArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray11, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray3, shortArray11);
        short[] shortArray31 = new short[] { (short) -1 };
        short[] shortArray33 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (short) -1 };
        short[] shortArray38 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray31, shortArray36);
        short[] shortArray42 = new short[] { (short) -1 };
        short[] shortArray44 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        short[] shortArray48 = new short[] { (short) -1 };
        short[] shortArray50 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        short[] shortArray54 = new short[] { (short) -1 };
        short[] shortArray56 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        short[] shortArray65 = new short[] { (short) -1 };
        short[] shortArray67 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray67);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray60, shortArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray56, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray48, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray48);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray31, shortArray48);
        short[] shortArray75 = new short[] { (short) -1 };
        short[] shortArray77 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray77);
        short[] shortArray80 = new short[] { (short) -1 };
        short[] shortArray82 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray82);
        org.junit.Assert.assertArrayEquals("random", shortArray48, shortArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray3, shortArray48);
        short[] shortArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray87);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 10);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2825");
        long[] longArray5 = new long[] { (short) 100, (-1), (byte) 10, (short) -1, 'a' };
        long[] longArray7 = new long[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2826");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 0L };
        long[] longArray9 = new long[] { (byte) 100, ' ', ' ', 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray4, longArray9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain8);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanOrQueryBuilder();
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2828");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMatchAllBuilder();
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2832");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str7 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2835");
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray38);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray13, (java.lang.Object) (-1.0f));
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.lang.String[] strArray60 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray63 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray66 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray69 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray72 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray75 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[][] strArray76 = new java.lang.String[][] { strArray60, strArray63, strArray66, strArray69, strArray72, strArray75 };
        java.util.List<java.lang.String[]> strArrayList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(6, strArray76);
        java.util.List<java.lang.String[]> strArrayList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, strArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray76);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2836");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) terms11);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2837");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.setUp();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2838");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray6, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray14);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray23, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray23);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray36, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray43);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray49, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray49);
        byte[] byteArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray61);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2839");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 10);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0, (double) ' ', (double) 5);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 0, (long) ' ');
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 1L, (double) 0L);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2846");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2847");
        long[] longArray1 = new long[] { (byte) 1 };
        long[] longArray8 = new long[] { (short) -1, 10L, 2, 10L, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str7 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2850");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2851");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray25, charArray36);
        org.junit.Assert.assertArrayEquals("hi!", charArray15, charArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray10, charArray25);
        org.junit.Assert.assertArrayEquals(charArray2, charArray25);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain60;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests53);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) simpleIndexQueryParserTests53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests53.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader11, fields12, fields13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.monster", indexReader17, fields18, fields19, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) '4', (long) 100);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2856");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2857");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests13.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields21, fields22, true);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain11, (java.lang.Object) simpleIndexQueryParserTests13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests28.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34, false);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) 'a');
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 'a');
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray43, doubleArray48, (double) 0);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray54, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray54, (double) 0.0f);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests28, (java.lang.Object) doubleArray54);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests28.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader63, 0, postingsEnum65, postingsEnum66, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) 0);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2858");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2860");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray13, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals("random", byteArray8, byteArray21);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray34);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2861");
        long[] longArray4 = new long[] { 1, 0, 3, (short) -1 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2862");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String[] strArray6 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray18 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "<unknown>", "" };
        java.lang.String[][] strArray22 = new java.lang.String[][] { strArray6, strArray9, strArray12, strArray15, strArray18, strArray21 };
        java.util.List<java.lang.String[]> strArrayList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(6, strArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) strArrayList23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2863");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 'a');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray3, doubleArray8, (double) 0);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) 'a');
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray16, doubleArray21, (double) 0);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) 'a');
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray27, doubleArray32, (double) 0);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) 'a');
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray38, doubleArray43, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray38, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray16, doubleArray32, (double) 1);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray16, doubleArray53, (double) (-1.0f));
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray53, (double) (short) 10);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) 'a');
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) 'a');
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray65, doubleArray70, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray65, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray61, (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray61, 1.0d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 'a', (double) (short) 1);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2867");
        long[] longArray5 = new long[] { '4', 'a', (short) 1, 1 };
        long[] longArray12 = new long[] { (short) 100, (byte) 1, 100L, 0, 0, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray12);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2868");
        long[] longArray4 = new long[] { 'a', (byte) -1, (short) 0 };
        long[] longArray9 = new long[] { ' ', ' ', 1L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray4, longArray9);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 4);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2870");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '4', (double) (short) 100);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader32, (int) ' ', postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader38, fields39, fields40, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.Object obj44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj44);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2874");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2876");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray68);
        boolean boolean93 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) executorServiceArray68);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2877");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray6, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray14);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray24, intArray26);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray24, intArray32);
        org.junit.Assert.assertArrayEquals(intArray6, intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) locale2, (java.lang.Object) intArray6);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2878");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2879");
        float[] floatArray4 = new float[] { (byte) 0 };
        float[] floatArray6 = new float[] { (byte) 0 };
        float[] floatArray8 = new float[] { (byte) 0 };
        float[] floatArray10 = new float[] { (byte) 0 };
        float[] floatArray12 = new float[] { (byte) 0 };
        float[] floatArray14 = new float[] { (byte) 0 };
        float[][] floatArray15 = new float[][] { floatArray4, floatArray6, floatArray8, floatArray10, floatArray12, floatArray14 };
        java.util.List<float[]> floatArrayList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, floatArray15);
        java.util.List<float[]> floatArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, floatArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) floatArray15);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2880");
        double[] doubleArray4 = new double[] { (-1) };
        double[] doubleArray6 = new double[] { (-1) };
        double[] doubleArray8 = new double[] { (-1) };
        double[] doubleArray10 = new double[] { (-1) };
        double[] doubleArray12 = new double[] { (-1) };
        double[][] doubleArray13 = new double[][] { doubleArray4, doubleArray6, doubleArray8, doubleArray10, doubleArray12 };
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray17 = new double[] { (-1) };
        double[] doubleArray19 = new double[] { (-1) };
        double[] doubleArray21 = new double[] { (-1) };
        double[] doubleArray23 = new double[] { (-1) };
        double[][] doubleArray24 = new double[][] { doubleArray15, doubleArray17, doubleArray19, doubleArray21, doubleArray23 };
        double[] doubleArray26 = new double[] { (-1) };
        double[] doubleArray28 = new double[] { (-1) };
        double[] doubleArray30 = new double[] { (-1) };
        double[] doubleArray32 = new double[] { (-1) };
        double[] doubleArray34 = new double[] { (-1) };
        double[][] doubleArray35 = new double[][] { doubleArray26, doubleArray28, doubleArray30, doubleArray32, doubleArray34 };
        double[][][] doubleArray36 = new double[][][] { doubleArray13, doubleArray24, doubleArray35 };
        java.util.List<double[][]> doubleArrayList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, doubleArray36);
        java.util.List<double[][]> doubleArrayList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, doubleArray36);
        int[] intArray39 = new int[] {};
        int[][] intArray40 = new int[][] { intArray39 };
        int[] intArray41 = new int[] {};
        int[][] intArray42 = new int[][] { intArray41 };
        int[] intArray43 = new int[] {};
        int[][] intArray44 = new int[][] { intArray43 };
        int[] intArray45 = new int[] {};
        int[][] intArray46 = new int[][] { intArray45 };
        int[] intArray47 = new int[] {};
        int[][] intArray48 = new int[][] { intArray47 };
        int[][][] intArray49 = new int[][][] { intArray40, intArray42, intArray44, intArray46, intArray48 };
        java.util.Set<int[][]> intArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(intArray49);
        java.util.Set<int[][]> intArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) doubleArray36, (java.lang.Object[]) intArray49);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.Object obj6 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj6, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.weekly");
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanOrQueryBuilder();
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.slow", postingsEnum21, postingsEnum22, false);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray28, intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray36, intArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray28, intArray36);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray46, intArray48);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray46, intArray54);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray64, intArray66);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray72, intArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray64, intArray72);
        org.junit.Assert.assertArrayEquals(intArray46, intArray64);
        org.junit.Assert.assertArrayEquals(intArray36, intArray64);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) "tests.slow", (java.lang.Object) intArray64);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests82 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain83 = simpleIndexQueryParserTests82.failureAndSuccessEvents;
        simpleIndexQueryParserTests82.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests82.resetCheckIndexStatus();
        simpleIndexQueryParserTests82.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests82.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        simpleIndexQueryParserTests82.assertDocsEnumEquals("tests.maxfailures", postingsEnum90, postingsEnum91, true);
        java.lang.String str94 = simpleIndexQueryParserTests82.getTestName();
        org.junit.rules.TestRule testRule95 = simpleIndexQueryParserTests82.ruleChain;
        simpleIndexQueryParserTests82.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule97 = simpleIndexQueryParserTests82.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) intArray64, (java.lang.Object) testRule97);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2884");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray31);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray31);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray42, intArray50);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray60, intArray62);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray68, intArray70);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray60, intArray68);
        org.junit.Assert.assertArrayEquals(intArray42, intArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray31, intArray42);
        int[] intArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray31, intArray77);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 0.0d, (double) (-1));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2886");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.ensureCheckIndexPassed();
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.failfast", indexReader36, 10, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests25.assertDocsEnumEquals("tests.nightly", postingsEnum42, postingsEnum43, false);
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain46;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) executorServiceArray4, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2887");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 'a');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray6, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray20, (double) 0);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray26, doubleArray31, (double) 0);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 'a');
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray37, doubleArray42, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray37, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray15, doubleArray31, (double) 1);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray52, (double) (-1.0f));
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) 'a');
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray58, doubleArray63, (double) 0);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray69, (double) '4');
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray69, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray15, 0.0d);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests78 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests78.ensureCheckIndexPassed();
        simpleIndexQueryParserTests78.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests78.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        simpleIndexQueryParserTests78.assertTermsEquals("tests.monster", indexReader83, terms84, terms85, false);
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.Fields fields90 = null;
        org.apache.lucene.index.Fields fields91 = null;
        simpleIndexQueryParserTests78.assertFieldsEquals("hi!", indexReader89, fields90, fields91, false);
        simpleIndexQueryParserTests78.ensureCheckIndexPassed();
        simpleIndexQueryParserTests78.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain96 = null;
        simpleIndexQueryParserTests78.failureAndSuccessEvents = ruleChain96;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray15, (java.lang.Object) ruleChain96);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2888");
        int[][] intArray0 = new int[][] {};
        int[][][] intArray1 = new int[][][] { intArray0 };
        int[][] intArray2 = new int[][] {};
        int[][][] intArray3 = new int[][][] { intArray2 };
        int[][] intArray4 = new int[][] {};
        int[][][] intArray5 = new int[][][] { intArray4 };
        int[][] intArray6 = new int[][] {};
        int[][][] intArray7 = new int[][][] { intArray6 };
        int[][][][] intArray8 = new int[][][][] { intArray1, intArray3, intArray5, intArray7 };
        java.util.Set<int[][][]> intArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        java.util.Set<int[][][]> intArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        short[][] shortArray11 = new short[][] {};
        java.util.Set<short[]> shortArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray8, (java.lang.Object[]) shortArray11);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (short) 1);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2890");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 1);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray2, floatArray5, (float) (-1L));
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 1);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray18, (float) '#');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray25, (float) (byte) 10);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) (short) 1);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray32, floatArray35, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray35, (float) 0);
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) (short) 1);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray45, floatArray48, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray18, floatArray48, (-1.0f));
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) (short) 1);
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray58, floatArray61, (float) '#');
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray68, (float) (byte) 10);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) (short) 1);
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray79, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray75, floatArray78, (float) '#');
        float[] floatArray84 = new float[] {};
        float[] floatArray85 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray85, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray85, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray85, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray48, floatArray61, (-1.0f));
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray61, 0.0f);
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray96, 1.0f);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2891");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.failfast", indexReader13, 10, postingsEnum15, postingsEnum16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests19.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests19.assertDocsSkippingEquals("tests.maxfailures", indexReader25, (int) (byte) 10, postingsEnum27, postingsEnum28, false);
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) (byte) 10);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray33 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray33);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet35 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) (byte) 10, (java.lang.Object) elasticsearchTestCaseArray33);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2892");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures5 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray7);
        java.lang.Class<?> wildcardClass9 = testRuleIgnoreAfterMaxFailuresList8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass9;
        java.util.List<java.lang.Class<?>> wildcardClassList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, wildcardClassArray12);
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.reflect.AnnotatedElement[]) wildcardClassArray12);
        java.util.Set<java.lang.reflect.Type> typeSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray12);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("random", charArray19, charArray23);
        char[] charArray27 = new char[] {};
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray32, charArray37);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals("random", charArray49, charArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray42, charArray53);
        org.junit.Assert.assertArrayEquals("hi!", charArray32, charArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray27, charArray42);
        org.junit.Assert.assertArrayEquals(charArray19, charArray42);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) wildcardClassArray12, (java.lang.Object) charArray19);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray76);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray87);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) wildcardClassArray12, (java.lang.Object[]) executorServiceArray76);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (byte) -1);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2894");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) '#');
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2896");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale2, locale4, locale6, locale8 };
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale11, locale13, locale15, locale17 };
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale20, locale22, locale24, locale26 };
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale29, locale31, locale33, locale35 };
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale38, locale40, locale42, locale44 };
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale47, locale49, locale51, locale53 };
        java.util.Locale[][] localeArray55 = new java.util.Locale[][] { localeArray9, localeArray18, localeArray27, localeArray36, localeArray45, localeArray54 };
        java.util.List<java.util.Locale[]> localeArrayList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, localeArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray55, (java.lang.Object[]) executorServiceArray72);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2897");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray9);
        java.lang.Class<?> wildcardClass11 = testRuleIgnoreAfterMaxFailuresList10.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, wildcardClassArray14);
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.reflect.AnnotatedElement[]) wildcardClassArray14);
        java.util.Set<java.lang.Class<?>> wildcardClassSet19 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray14);
        java.util.Set<java.lang.Class<?>> wildcardClassSet20 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) wildcardClassArray14);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2898");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (byte) 100, postingsEnum21, postingsEnum22, false);
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("tests.monster", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.failfast", indexReader38, 10, postingsEnum40, postingsEnum41);
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureCheckIndexPassed();
        simpleIndexQueryParserTests44.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule47 = simpleIndexQueryParserTests44.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) simpleIndexQueryParserTests44);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests44.assertDocsSkippingEquals("tests.maxfailures", indexReader50, (int) (byte) 10, postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests44.assertDocsSkippingEquals("tests.badapples", indexReader57, 5, postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2900");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader35, terms36, terms37, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureCheckIndexPassed();
        simpleIndexQueryParserTests41.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("tests.monster", indexReader46, terms47, terms48, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests41.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests41.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests41.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests41.assertDocsEnumEquals("tests.slow", postingsEnum60, postingsEnum61, false);
        simpleIndexQueryParserTests41.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("tests.awaitsfix", indexReader66, terms67, terms68, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) true);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2901");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) 'a');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) 'a');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray13, (double) 0);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray19, doubleArray24, (double) 0);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray30, doubleArray35, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray30, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray8, doubleArray24, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray8, (double) 100L);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) 'a');
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray47, doubleArray52, (double) 0);
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray58, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray2, doubleArray58, (double) (short) -1);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray65, (double) 10L);
        java.lang.Object obj71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) 10L, obj71);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryStringFields2Builder();
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2903");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2906");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray24);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray32, intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray32, intArray40);
        org.junit.Assert.assertArrayEquals(intArray24, intArray40);
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("node_s_0", intArray24, intArray48);
        int[] intArray52 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray24, intArray52);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2907");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum4, postingsEnum5, true);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2908");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 1, (long) (short) -1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2910");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 1);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2911");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 0L);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields2Builder();
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.monster", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain14;
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain17);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2915");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray25, charArray36);
        org.junit.Assert.assertArrayEquals("hi!", charArray15, charArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray10, charArray25);
        org.junit.Assert.assertArrayEquals(charArray2, charArray25);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain60;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests53);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) simpleIndexQueryParserTests53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests53.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader4, 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 5, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) ' ');
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) ' ', 0.0d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain8);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2923");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray2);
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) 5, 0.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2926");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) locale1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("tests.awaitsfix", indexReader15, fields16, fields17, true);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.monster", postingsEnum22, postingsEnum23, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) true);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1L, (long) (-1));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) '4', 1.0d, (double) 2);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (-1.0d));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (byte) -1);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2934");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray60);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling77 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling76, throttling77 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray78);
        java.util.Set<java.io.Serializable> serializableSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray78);
        java.lang.Object obj81 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray78, obj81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) throttlingArray78);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2935");
        java.lang.Object obj0 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) 'a');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray4, doubleArray9, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray20, (double) 0);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray26, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray26, (double) 1L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) 'a');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) 'a');
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray40, doubleArray45, (double) 0);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray51, doubleArray56, (double) 0);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) 'a');
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray62, doubleArray67, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray62, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray40, doubleArray56, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray40, (double) 100L);
        double[] doubleArray79 = new double[] {};
        double[] doubleArray80 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray80, (double) 'a');
        double[] doubleArray83 = new double[] {};
        double[] doubleArray84 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray84, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray79, doubleArray84, (double) 0);
        double[] doubleArray89 = new double[] {};
        double[] doubleArray90 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray89, doubleArray90, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray90, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray34, doubleArray90, (double) (short) -1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray26, doubleArray34, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) 10.0f);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 100, (double) 6);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2937");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.badapples", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocValuesEquals("", 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 100);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2939");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, 0L);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0, (double) (byte) 100);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100, (double) (short) 100);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2944");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("hi!", charArray12, charArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray16);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray16, charArray23);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("random", charArray37, charArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray30, charArray41);
        org.junit.Assert.assertArrayEquals(charArray23, charArray41);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("random", charArray47, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray56, charArray58);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals("random", charArray63, charArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray56, charArray67);
        org.junit.Assert.assertArrayEquals(charArray51, charArray67);
        org.junit.Assert.assertArrayEquals(charArray23, charArray67);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests73.ensureCheckIndexPassed();
        simpleIndexQueryParserTests73.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests73.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests73.setUp();
        simpleIndexQueryParserTests73.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) charArray67, (java.lang.Object) simpleIndexQueryParserTests73);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2945");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "enwiki.random.lines.txt", "random", "tests.maxfailures", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2946");
        char[] charArray2 = new char[] { ' ', ' ' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("hi!", charArray4, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 1, (long) (short) 100);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.failfast", indexReader13, 10, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.weekly", indexReader32, terms33, terms34, true);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.nightly", indexReader40, (int) '4', postingsEnum42, postingsEnum43, true);
        short[] shortArray47 = new short[] { (short) -1 };
        short[] shortArray49 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) '4', (java.lang.Object) shortArray49);
        short[] shortArray53 = new short[] { (short) -1 };
        short[] shortArray55 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        short[] shortArray58 = new short[] { (short) -1 };
        short[] shortArray60 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray53);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) shortArray49, (java.lang.Object) (-1));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 'a');
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2950");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 100, (double) '4');
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) 1);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2953");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray4);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) throttlingArray4);
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests9.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.failfast", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("tests.badapples", indexReader19, (int) (byte) 100, postingsEnum21, postingsEnum22, false);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) ' ');
        java.lang.String str28 = simpleIndexQueryParserTests9.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) serializableSet8, (java.lang.Object) str28);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryQueryBuilder();
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2955");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("tests.monster", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("hi!", indexReader19, fields20, fields21, false);
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) ruleChain7, (java.lang.Object) simpleIndexQueryParserTests8);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2956");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.setup();
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 1, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2959");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 100L, (double) 10.0f);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.failfast", indexReader17, 10, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 10);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader30, (int) '#', postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2965");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        org.junit.Assert.assertNotNull((java.lang.Object) locale7);
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale1, locale3, locale5, locale7 };
        java.util.Set<java.util.Locale> localeSet10 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray9, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0.0f, (double) 0.0f);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2969");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray29);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.ensureCheckIndexPassed();
        simpleIndexQueryParserTests46.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("tests.monster", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.failfast", indexReader57, 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray9, (java.lang.Object) simpleIndexQueryParserTests46);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests46);
        simpleIndexQueryParserTests46.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("", indexReader68, terms69, terms70, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2971");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7, false);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray71);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray76);
        java.lang.Object obj80 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) executorServiceArray76, obj80);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray76);
        float[] floatArray85 = new float[] { (byte) 0 };
        float[] floatArray87 = new float[] { (byte) 0 };
        float[] floatArray89 = new float[] { (byte) 0 };
        float[] floatArray91 = new float[] { (byte) 0 };
        float[] floatArray93 = new float[] { (byte) 0 };
        float[] floatArray95 = new float[] { (byte) 0 };
        float[][] floatArray96 = new float[][] { floatArray85, floatArray87, floatArray89, floatArray91, floatArray93, floatArray95 };
        java.util.List<float[]> floatArrayList97 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, floatArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) floatArray96);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2972");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.ensureCheckIndexPassed();
        simpleIndexQueryParserTests30.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("tests.monster", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        simpleIndexQueryParserTests30.assertFieldsEquals("hi!", indexReader41, fields42, fields43, false);
        simpleIndexQueryParserTests30.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("tests.maxfailures", indexReader49, terms50, terms51, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) indexReader25, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) 100, (double) (short) 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (byte) 100);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2977");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("tests.monster", indexReader9, terms10, terms11, false);
        java.lang.String str14 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.setUp();
        java.lang.String str16 = simpleIndexQueryParserTests4.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingEnumSet3, (java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) '4', postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests4.assertDocValuesEquals("hi!", (int) 'a', numericDocValues27, numericDocValues28);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2978");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2979");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray25, charArray36);
        org.junit.Assert.assertArrayEquals("hi!", charArray15, charArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray10, charArray25);
        org.junit.Assert.assertArrayEquals(charArray2, charArray25);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain60;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) simpleIndexQueryParserTests53);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) simpleIndexQueryParserTests53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests53.testSpanNearQueryBuilder();
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) ' ', (long) (short) 10);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2981");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2982");
        double[] doubleArray2 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) 'a');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) 'a');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray10, doubleArray15, (double) 0);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) 'a');
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray26, (double) 0);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) 'a');
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray32, doubleArray37, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray32, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray10, doubleArray26, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, (double) 100L);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) 'a');
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray49, doubleArray54, (double) 0);
        org.junit.Assert.assertArrayEquals("", doubleArray10, doubleArray49, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray2, doubleArray49, 100.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2983");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2984");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain2, obj5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) ruleChain2);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2985");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2986");
        char[] charArray4 = new char[] { '4', '4', '#', ' ' };
        char[] charArray9 = new char[] { '4', '4', '#', ' ' };
        char[] charArray14 = new char[] { '4', '4', '#', ' ' };
        char[][] charArray15 = new char[][] { charArray4, charArray9, charArray14 };
        java.util.Set<char[]> charArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(charArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray20, byteArray23);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray28);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray37, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray37);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray50, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray57);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray63, byteArray66);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArraySet16, (java.lang.Object) byteArray28);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2987");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy1);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy5);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy8);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy12);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy10, queryCachingPolicy11, queryCachingPolicy12 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy15);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy19);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy15, queryCachingPolicy17, queryCachingPolicy18, queryCachingPolicy19 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy22);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy24 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy26 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy26);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray28 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy22, queryCachingPolicy24, queryCachingPolicy25, queryCachingPolicy26 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy29);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy32 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy33 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy33);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray35 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy29, queryCachingPolicy31, queryCachingPolicy32, queryCachingPolicy33 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray36 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray7, queryCachingPolicyArray14, queryCachingPolicyArray21, queryCachingPolicyArray28, queryCachingPolicyArray35 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray36);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) queryCachingPolicyArray36, (java.lang.Object[]) executorServiceArray53);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2989");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 1);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray7, (float) '#');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 1);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray18, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray18, (java.lang.Object) simpleIndexQueryParserTests24);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray4, floatArray18, (float) ' ');
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray35, floatArray38, (float) '#');
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 1);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray46, floatArray49, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.ensureCheckIndexPassed();
        simpleIndexQueryParserTests55.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests55.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests55.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray49, (java.lang.Object) simpleIndexQueryParserTests55);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray35, floatArray49, (float) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray4, floatArray35, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray4);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2990");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests72.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        simpleIndexQueryParserTests72.assertDocsEnumEquals("<unknown>", postingsEnum76, postingsEnum77, true);
        simpleIndexQueryParserTests72.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule81 = simpleIndexQueryParserTests72.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray67, (java.lang.Object) testRule81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray48);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.weekly", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests17.ruleChain;
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.setUp();
        org.junit.rules.RuleChain ruleChain27 = null;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests17);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 100, (-1L));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule10);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2997");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray2 = (java.util.List<org.junit.rules.RuleChain>[]) listArray1;
        java.util.List[][] listArray4 = new java.util.List[1][];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[][] ruleChainListArray5 = (java.util.List<org.junit.rules.RuleChain>[][]) listArray4;
        ruleChainListArray5[0] = ruleChainListArray2;
        java.util.Set<java.util.List<org.junit.rules.RuleChain>[]> ruleChainListArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainListArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChainListArray5);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 1.0d, (double) '4', 0.0d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2999");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '#', numericDocValues16, numericDocValues17);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test3000");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests20.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests20, (java.lang.Object) ruleChain27);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain27;
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj30);
    }
}

