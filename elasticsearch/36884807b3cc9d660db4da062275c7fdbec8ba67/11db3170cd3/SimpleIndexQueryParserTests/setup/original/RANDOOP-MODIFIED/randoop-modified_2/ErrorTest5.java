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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4, simpleIndexQueryParserTestsArray5 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray6);
        java.util.Set<org.junit.Assert[]> assertArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) simpleIndexQueryParserTestsArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests10, simpleIndexQueryParserTests13, simpleIndexQueryParserTests19 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet24 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray23);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet25 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray23);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet26 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray23);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) simpleIndexQueryParserTestsArray6, (java.lang.Object[]) simpleIndexQueryParserTestsArray23);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray22);
        java.util.List<java.lang.String> strList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray22);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader8, fields9, fields10, true);
        char[] charArray15 = new char[] { '4' };
        char[] charArray17 = new char[] { '4' };
        char[] charArray19 = new char[] { '4' };
        char[] charArray21 = new char[] { '4' };
        char[][] charArray22 = new char[][] { charArray15, charArray17, charArray19, charArray21 };
        java.util.Set<char[]> charArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(charArray22);
        java.util.List<char[]> charArrayList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields10, (java.lang.Object) charArray22);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray5, byteArray7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str24 = simpleIndexQueryParserTests23.getTestName();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests23.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests23);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (-1), postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests36.assertTermsEquals("tests.maxfailures", indexReader40, terms41, terms42, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str46 = simpleIndexQueryParserTests45.getTestName();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests45.ensureCleanedUp();
        java.lang.String str49 = simpleIndexQueryParserTests45.getTestName();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        simpleIndexQueryParserTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader51, fields52, fields53, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests56.assertDocsEnumEquals("", postingsEnum60, postingsEnum61, true);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        simpleIndexQueryParserTests45.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests36.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain65;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain65;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str72 = simpleIndexQueryParserTests71.getTestName();
        simpleIndexQueryParserTests71.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests71.assertPositionsSkippingEquals("tests.maxfailures", indexReader75, (int) (short) 100, postingsEnum77, postingsEnum78);
        simpleIndexQueryParserTests71.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule81 = simpleIndexQueryParserTests71.ruleChain;
        simpleIndexQueryParserTests71.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        simpleIndexQueryParserTests71.assertDocsSkippingEquals("", indexReader84, 5, postingsEnum86, postingsEnum87, true);
        simpleIndexQueryParserTests71.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests71);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        java.lang.String str15 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain21;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 6, (long) (short) -1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader9, fields10, fields11, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests15);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str32 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNotQueryBuilder();
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 10L, (long) 4);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader29, fields30, fields31, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray7, charArray14);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray20, charArray22);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray29, charArray31);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray29, charArray35);
        org.junit.Assert.assertArrayEquals(charArray22, charArray35);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray35, charArray40);
        org.junit.Assert.assertArrayEquals(charArray14, charArray35);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("random", charArray46, charArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray14, charArray57);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray57, charArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray57);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        char[] charArray2 = new char[] { '4' };
        char[] charArray4 = new char[] { '4' };
        char[] charArray6 = new char[] { '4' };
        char[] charArray8 = new char[] { '4' };
        char[][] charArray9 = new char[][] { charArray2, charArray4, charArray6, charArray8 };
        java.util.Set<char[]> charArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(charArray9);
        java.util.List<char[]> charArrayList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charArray9);
        double[] doubleArray15 = new double[] { 'a', 10.0d };
        double[] doubleArray18 = new double[] { 'a', 10.0d };
        double[] doubleArray21 = new double[] { 'a', 10.0d };
        double[] doubleArray24 = new double[] { 'a', 10.0d };
        double[] doubleArray27 = new double[] { 'a', 10.0d };
        double[][] doubleArray28 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        java.util.List<double[]> doubleArrayList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray28);
        java.util.Set<double[]> doubleArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray9, (java.lang.Object[]) doubleArray28);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (short) 100);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray11, floatArray17, 10.0f);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray17, (float) (short) 10);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (short) 100);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray36, floatArray42, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray36, (float) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray36, (float) '#');
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        java.lang.String str16 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests12.setUp();
        java.lang.String str20 = simpleIndexQueryParserTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.badapples", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.failfast", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader33, terms34, terms35, true);
        org.junit.rules.TestRule testRule38 = simpleIndexQueryParserTests12.ruleChain;
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray40);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        java.lang.Object obj52 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList51, obj52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        java.lang.Object obj64 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList63, obj64);
        java.lang.Iterable[] iterableArray67 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray68 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray67;
        cloneableIterableArray68[0] = cloneableList51;
        cloneableIterableArray68[1] = cloneableList58;
        cloneableIterableArray68[2] = cloneableList63;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray68);
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) executorServiceArray40, (java.lang.Object) cloneableIterableSet76);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray7, (java.lang.Object[]) cloneableArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray7);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) cloneableArray7);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList32, obj33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.maxfailures", indexReader37, fields38, fields39, false);
        org.junit.Assert.assertNotSame("tests.slow", obj33, (java.lang.Object) simpleIndexQueryParserTests35);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) simpleIndexQueryParserTests35);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        java.lang.Class<?> wildcardClass46 = simpleIndexQueryParserTests0.getClass();
        java.lang.Object obj47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass46, obj47);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.nightly", indexReader9, 100, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(6);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray10, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray10);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray30);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray36, (java.lang.Object[]) cloneableArray41);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray41);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        java.lang.Object obj52 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList51, obj52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        java.lang.Object obj64 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList63, obj64);
        java.lang.Iterable[] iterableArray67 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray68 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray67;
        cloneableIterableArray68[0] = cloneableList51;
        cloneableIterableArray68[1] = cloneableList58;
        cloneableIterableArray68[2] = cloneableList63;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray68);
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableIterableArray68);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader13, terms14, terms15, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) -1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus22 = simpleIndexQueryParserTests0.ensureGreen(strArray20);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray20, charArray22);
        org.junit.Assert.assertArrayEquals("random", charArray11, charArray22);
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) (byte) 10, (java.lang.Object) charArray3);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) -1, (long) (byte) 10);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader14, 5, postingsEnum16, postingsEnum17, true);
        float[] floatArray22 = new float[] {};
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) 100L);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray29, (float) (short) 100);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray29, floatArray35, 10.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray22, floatArray35, (float) 100);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 100L);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray47, (float) (short) -1);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) 100L);
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray58, (float) (short) 100);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray58, floatArray64, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray58, (-1.0f));
        org.junit.Assert.assertNotNull((java.lang.Object) floatArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray22, floatArray58, (float) ' ');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str76 = simpleIndexQueryParserTests75.getTestName();
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests75.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests75);
        org.junit.rules.RuleChain ruleChain80 = simpleIndexQueryParserTests75.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain80;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain80;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.badapples", (java.lang.Object) ruleChain80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) 5, (java.lang.Object) ruleChain80);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 10, (double) 1);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 100.0f, (double) 1L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (short) -1, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str21 = simpleIndexQueryParserTests20.getTestName();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests20);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain25;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain25;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader35, terms36, terms37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader41, (int) (byte) 0, postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 10, numericDocValues49, numericDocValues50);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray17, intArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray12, intArray19);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray35, intArray37);
        org.junit.Assert.assertArrayEquals("random", intArray30, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray30, intArray41);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray46, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray46, intArray51);
        org.junit.Assert.assertArrayEquals(intArray30, intArray51);
        org.junit.Assert.assertArrayEquals(intArray19, intArray30);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray30, intArray57);
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray57);
        org.junit.Assert.assertArrayEquals(intArray2, intArray57);
        int[] intArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray62);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.lang.Object obj8 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList7, obj8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.maxfailures", indexReader12, fields13, fields14, false);
        org.junit.Assert.assertNotSame("tests.slow", obj8, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests19.assertFieldsEquals("tests.maxfailures", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str27 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        java.lang.String str30 = simpleIndexQueryParserTests26.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        simpleIndexQueryParserTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields33, fields34, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests37.assertDocsEnumEquals("", postingsEnum41, postingsEnum42, true);
        simpleIndexQueryParserTests37.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain46;
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain46, obj48);
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests10, (java.lang.Object) ruleChain46);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str57 = simpleIndexQueryParserTests56.getTestName();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain60 = null;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests56.assertDocsSkippingEquals("tests.nightly", indexReader63, 100, postingsEnum65, postingsEnum66, false);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests56);
        simpleIndexQueryParserTests56.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain76 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain46, (java.lang.Object) simpleIndexQueryParserTests56);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) (short) 10, 1.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray4, byteArray8);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray8);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader25, fields26, fields27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader31, terms32, terms33, false);
        java.lang.String str36 = simpleIndexQueryParserTests1.getTestName();
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray40, longArray43);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray48, longArray51);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray40, longArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) longArray40);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("random", charArray21, charArray32);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray21, charArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray21);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray61, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray52, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray63);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        org.junit.Assert.assertArrayEquals(charArray44, charArray73);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray77);
        org.junit.Assert.assertArrayEquals(charArray5, charArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str89 = simpleIndexQueryParserTests88.getTestName();
        simpleIndexQueryParserTests88.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests88.ensureCleanedUp();
        java.lang.String str92 = simpleIndexQueryParserTests88.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests88);
        org.junit.rules.TestRule testRule94 = simpleIndexQueryParserTests88.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) charArray13, (java.lang.Object) simpleIndexQueryParserTests88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testBooleanParsesFilter();
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (-1L), (double) 0L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 0L);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 100L, 0.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2555");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray26);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray51);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str58 = simpleIndexQueryParserTests57.getTestName();
        simpleIndexQueryParserTests57.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests57.ensureCleanedUp();
        java.lang.String str61 = simpleIndexQueryParserTests57.getTestName();
        simpleIndexQueryParserTests57.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests57);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("random", indexReader66, 3, postingsEnum68, postingsEnum69);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray78);
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum68, (java.lang.Object) executorServiceArray78);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        boolean boolean91 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray88);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray51, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2556");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray16, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray16, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray26, intArray28);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray21);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray34, intArray41);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray49);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals(intArray47, intArray52);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray57, intArray59);
        org.junit.Assert.assertArrayEquals("random", intArray52, intArray57);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray52, intArray63);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray68, intArray70);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals(intArray68, intArray73);
        org.junit.Assert.assertArrayEquals(intArray52, intArray73);
        org.junit.Assert.assertArrayEquals(intArray41, intArray52);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray52, intArray79);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray5, intArray79);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests83 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str84 = simpleIndexQueryParserTests83.getTestName();
        simpleIndexQueryParserTests83.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests83.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain87 = null;
        simpleIndexQueryParserTests83.failureAndSuccessEvents = ruleChain87;
        simpleIndexQueryParserTests83.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain90 = simpleIndexQueryParserTests83.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Fields fields93 = null;
        org.apache.lucene.index.Fields fields94 = null;
        simpleIndexQueryParserTests83.assertFieldsEquals("tests.maxfailures", indexReader92, fields93, fields94, false);
        simpleIndexQueryParserTests83.setIndexWriterMaxDocs(5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) "<unknown>", (java.lang.Object) simpleIndexQueryParserTests83);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2557");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2558");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2559");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader10);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2560");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray5, throttlingArray9, throttlingArray13 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray18, throttlingArray22, throttlingArray26 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray31, throttlingArray35, throttlingArray39 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling50 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray44, throttlingArray48, throttlingArray52 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray14, throttlingArray27, throttlingArray40, throttlingArray53 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, throttlingArray54);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, throttlingArray54);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray60 = new java.lang.Cloneable[] { locale59 };
        java.util.List<java.lang.Cloneable> cloneableList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray60);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray71);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray66, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray60, (java.lang.Object[]) cloneableArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray54, (java.lang.Object[]) cloneableArray66);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2562");
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
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures19 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet21 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray20);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet22 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray20);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray25 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures24 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet26 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray25);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet27 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray20, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreParsesFilter();
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2565");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("<unknown>", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader16, 1, postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2566");
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
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray13);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray19, charArray21);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray28, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray28, charArray34);
        org.junit.Assert.assertArrayEquals(charArray21, charArray34);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray34, charArray39);
        org.junit.Assert.assertArrayEquals(charArray13, charArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) charArray34);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2567");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        double[] doubleArray8 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        double[] doubleArray13 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        double[] doubleArray18 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray23 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray28 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[][][] doubleArray30 = new double[][][] { doubleArray4, doubleArray9, doubleArray14, doubleArray19, doubleArray24, doubleArray29 };
        java.util.Set<double[][]> doubleArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray30, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100L, 1L);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2569");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader11, fields12, fields13, false);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList22, obj23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("tests.maxfailures", indexReader27, fields28, fields29, false);
        org.junit.Assert.assertNotSame("tests.slow", obj23, (java.lang.Object) simpleIndexQueryParserTests25);
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str40 = simpleIndexQueryParserTests39.getTestName();
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests39);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        simpleIndexQueryParserTests39.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str53 = simpleIndexQueryParserTests52.getTestName();
        simpleIndexQueryParserTests52.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests52.assertTermsEquals("tests.maxfailures", indexReader56, terms57, terms58, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str62 = simpleIndexQueryParserTests61.getTestName();
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        java.lang.String str65 = simpleIndexQueryParserTests61.getTestName();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        simpleIndexQueryParserTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests72.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        simpleIndexQueryParserTests72.assertDocsEnumEquals("", postingsEnum76, postingsEnum77, true);
        simpleIndexQueryParserTests72.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain81 = simpleIndexQueryParserTests72.failureAndSuccessEvents;
        simpleIndexQueryParserTests61.failureAndSuccessEvents = ruleChain81;
        simpleIndexQueryParserTests52.failureAndSuccessEvents = ruleChain81;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain81;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain81;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain81;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) ruleChain81, (java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) false, (java.lang.Object) ruleChain81);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, obj18);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (byte) 1);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 1);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2578");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray9, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray9);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2581");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.maxfailures", indexReader20, terms21, terms22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.failfast", indexReader26, terms27, terms28, false);
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum13, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2582");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray14);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2584");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray3 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2585");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray4, longArray7);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray13, longArray16);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray21, longArray24);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray13, longArray24);
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray13);
        long[] longArray29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray29);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 'a', (double) 0L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(0);
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests12.ruleChain;
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str26 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain29 = null;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests25.assertDocsSkippingEquals("tests.nightly", indexReader32, 100, postingsEnum34, postingsEnum35, false);
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests25);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("<unknown>", indexReader42, terms43, terms44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("enwiki.random.lines.txt", indexReader48, terms49, terms50, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChain21, (java.lang.Object) simpleIndexQueryParserTests25);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2588");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 100L);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2590");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2591");
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
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2592");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray13, 10.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray24, (float) (short) 100);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray24, floatArray34, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, (float) '#');
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray44, (float) 1L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str51 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        java.lang.String str54 = simpleIndexQueryParserTests50.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests50);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        simpleIndexQueryParserTests50.assertFieldsEquals("<unknown>", indexReader57, fields58, fields59, true);
        simpleIndexQueryParserTests50.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests50);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.TestRule testRule17 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2595");
        java.lang.CharSequence[][][] charSequenceArray1 = new java.lang.CharSequence[][][] {};
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray1);
        java.util.List<java.lang.CharSequence[][]> charSequenceArrayList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, charSequenceArray1);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray11 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray10;
        cloneableIterableArray11[0] = cloneableList8;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray1, (java.lang.Object[]) cloneableIterableArray11);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2596");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray7, byteArray8);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2597");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        double[] doubleArray8 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        double[] doubleArray13 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        double[] doubleArray18 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray23 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray28 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[][][] doubleArray30 = new double[][][] { doubleArray4, doubleArray9, doubleArray14, doubleArray19, doubleArray24, doubleArray29 };
        java.util.Set<double[][]> doubleArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray30);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) doubleArray30);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertNotNull("", (java.lang.Object) cloneableArray44);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray62);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { locale68 };
        java.util.List<java.lang.Cloneable> cloneableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray69);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray74 = new java.lang.Cloneable[] { locale73 };
        java.util.List<java.lang.Cloneable> cloneableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray69, (java.lang.Object[]) cloneableArray74);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray80 = new java.lang.Cloneable[] { locale79 };
        java.util.List<java.lang.Cloneable> cloneableList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray80);
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray85 = new java.lang.Cloneable[] { locale84 };
        java.util.List<java.lang.Cloneable> cloneableList86 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray80, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray69, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray62);
        java.lang.Object obj91 = null;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) cloneableArray62, obj91);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) cloneableArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray30, (java.lang.Object[]) cloneableArray44);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2598");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray16, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray16, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray26, intArray28);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray26);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals(intArray21, intArray32);
        org.junit.Assert.assertArrayEquals(intArray10, intArray32);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray10, intArray36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = null;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain44;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests40.assertDocsSkippingEquals("tests.nightly", indexReader47, 100, postingsEnum49, postingsEnum50, false);
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests40.assertDocsSkippingEquals("tests.slow", indexReader56, (int) (byte) 10, postingsEnum58, postingsEnum59, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests40);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "tests.weekly", (java.lang.Object) simpleIndexQueryParserTests40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        simpleIndexQueryParserTests64.assertFieldsEquals("tests.maxfailures", indexReader66, fields67, fields68, false);
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests64.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("random", postingsEnum75, postingsEnum76, false);
        simpleIndexQueryParserTests64.setUp();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        simpleIndexQueryParserTests64.assertDocsSkippingEquals("tests.monster", indexReader81, (int) (byte) 1, postingsEnum83, postingsEnum84, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.slow", (java.lang.Object) indexReader81);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2599");
        double[][][][] doubleArray1 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        java.lang.String str26 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests22.setUp();
        java.lang.String str30 = simpleIndexQueryParserTests22.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.badapples", indexReader32, (-1), postingsEnum34, postingsEnum35);
        java.lang.String str37 = simpleIndexQueryParserTests22.getTestName();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain38;
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray55 = new java.lang.Cloneable[] { locale54 };
        java.util.List<java.lang.Cloneable> cloneableList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray50, (java.lang.Object[]) cloneableArray55);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray67 = new java.lang.Cloneable[] { locale66 };
        java.util.List<java.lang.Cloneable> cloneableList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray67);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { locale72 };
        java.util.List<java.lang.Cloneable> cloneableList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray73);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray78 = new java.lang.Cloneable[] { locale77 };
        java.util.List<java.lang.Cloneable> cloneableList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray73, (java.lang.Object[]) cloneableArray78);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray55, (java.lang.Object[]) cloneableArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray55);
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray87 = new java.lang.Cloneable[] { locale86 };
        java.util.List<java.lang.Cloneable> cloneableList88 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray87);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) cloneableArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) doubleArray1, (java.lang.Object[]) cloneableArray45);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2600");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) 'a');
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2602");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2603");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 'a', (double) (byte) 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (short) 100, (long) 4);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2607");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus14 = simpleIndexQueryParserTests0.ensureGreen(strArray12);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2608");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.maxfailures", indexReader20, terms21, terms22, true);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.maxfailures", indexReader28, terms29, terms30, false);
        java.lang.Class<?> wildcardClass33 = simpleIndexQueryParserTests16.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str35 = simpleIndexQueryParserTests34.getTestName();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = null;
        simpleIndexQueryParserTests34.failureAndSuccessEvents = ruleChain38;
        java.lang.String str40 = simpleIndexQueryParserTests34.getTestName();
        java.lang.Class<?> wildcardClass41 = simpleIndexQueryParserTests34.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str43 = simpleIndexQueryParserTests42.getTestName();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.ensureCleanedUp();
        java.lang.String str46 = simpleIndexQueryParserTests42.getTestName();
        simpleIndexQueryParserTests42.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests42.setUp();
        java.lang.String str50 = simpleIndexQueryParserTests42.getTestName();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.badapples", indexReader52, (-1), postingsEnum54, postingsEnum55);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests42.assertDocsEnumEquals("tests.failfast", postingsEnum58, postingsEnum59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        simpleIndexQueryParserTests42.assertTermsEquals("europarl.lines.txt.gz", indexReader63, terms64, terms65, true);
        java.lang.Class<?> wildcardClass68 = simpleIndexQueryParserTests42.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str70 = simpleIndexQueryParserTests69.getTestName();
        simpleIndexQueryParserTests69.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests69.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain73 = null;
        simpleIndexQueryParserTests69.failureAndSuccessEvents = ruleChain73;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        simpleIndexQueryParserTests69.assertDocsSkippingEquals("tests.nightly", indexReader76, 100, postingsEnum78, postingsEnum79, false);
        simpleIndexQueryParserTests69.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass83 = simpleIndexQueryParserTests69.getClass();
        java.lang.Class[] classArray85 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass33;
        wildcardClassArray86[1] = wildcardClass41;
        wildcardClassArray86[2] = wildcardClass68;
        wildcardClassArray86[3] = wildcardClass83;
        java.util.Set<java.lang.Class<?>> wildcardClassSet95 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray86);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray86);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet97 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray86);
        java.util.Set<java.lang.Class<?>> wildcardClassSet98 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) wildcardClassArray86);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2609");
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
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader16, terms17, terms18, true);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray23, intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2611");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        java.lang.String str12 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests8.setUp();
        java.lang.String str16 = simpleIndexQueryParserTests8.getTestName();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("tests.badapples", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("tests.failfast", postingsEnum24, postingsEnum25, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.failfast");
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests2.ruleChain;
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.lang.Object obj37 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList36, obj37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        simpleIndexQueryParserTests39.assertFieldsEquals("tests.maxfailures", indexReader41, fields42, fields43, false);
        org.junit.Assert.assertNotSame("tests.slow", obj37, (java.lang.Object) simpleIndexQueryParserTests39);
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("tests.maxfailures", indexReader50, fields51, fields52, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str56 = simpleIndexQueryParserTests55.getTestName();
        simpleIndexQueryParserTests55.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        java.lang.String str59 = simpleIndexQueryParserTests55.getTestName();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        simpleIndexQueryParserTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader61, fields62, fields63, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests66.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests66.assertDocsEnumEquals("", postingsEnum70, postingsEnum71, true);
        simpleIndexQueryParserTests66.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain75 = simpleIndexQueryParserTests66.failureAndSuccessEvents;
        simpleIndexQueryParserTests55.failureAndSuccessEvents = ruleChain75;
        java.lang.Object obj77 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain75, obj77);
        simpleIndexQueryParserTests48.failureAndSuccessEvents = ruleChain75;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests39, (java.lang.Object) ruleChain75);
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain75;
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str87 = simpleIndexQueryParserTests2.getTestName();
        org.junit.rules.TestRule testRule88 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 10.0d, (java.lang.Object) testRule88);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2612");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray11);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray6, (java.lang.Object) 0.0f);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray19);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) cloneableArray19, (java.lang.Object[]) executorServiceArray29);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 1L);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2614");
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
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader15, terms16, terms17, false);
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 100, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2615");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10L, (-1.0d));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 100, 0L);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 0, (double) 5);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling14 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray16, throttlingArray20, throttlingArray24 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray29, throttlingArray33, throttlingArray37 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray42, throttlingArray46, throttlingArray50 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling61 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray55, throttlingArray59, throttlingArray63 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray25, throttlingArray38, throttlingArray51, throttlingArray64 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, throttlingArray65);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, throttlingArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2622");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2623");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2624");
        short[] shortArray1 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray4);
        short[] shortArray10 = new short[] { (byte) 0, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2627");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray10, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray10);
        java.lang.Class<?> wildcardClass21 = cloneableArray10.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str26 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain29 = null;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests22, simpleIndexQueryParserTests25, simpleIndexQueryParserTests31 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet36 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray35);
        java.lang.Class<?> wildcardClass37 = simpleIndexQueryParserTestsArray35.getClass();
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) cloneableArray52);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray47, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray47);
        java.lang.Class<?> wildcardClass58 = cloneableArray47.getClass();
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.lang.Class<?> wildcardClass61 = locale60.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests62.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests62.assertDocsEnumEquals("", postingsEnum66, postingsEnum67, true);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        simpleIndexQueryParserTests62.assertDocsEnumEquals("", postingsEnum71, postingsEnum72, false);
        simpleIndexQueryParserTests62.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests62);
        java.lang.Class<?> wildcardClass77 = simpleIndexQueryParserTests62.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass21;
        wildcardClassArray80[1] = wildcardClass37;
        wildcardClassArray80[2] = wildcardClass58;
        wildcardClassArray80[3] = wildcardClass61;
        wildcardClassArray80[4] = wildcardClass77;
        java.util.Set<java.lang.Class<?>> wildcardClassSet91 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray80);
        java.util.Set<java.io.Serializable> serializableSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) wildcardClassArray80);
        org.junit.rules.RuleChain[] ruleChainArray93 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet94 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) wildcardClassArray80, (java.lang.Object[]) ruleChainArray93);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2628");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray26);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) cloneableArray52);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray47, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray47);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray59, simpleIndexQueryParserTestsArray60, simpleIndexQueryParserTestsArray61, simpleIndexQueryParserTestsArray62 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) simpleIndexQueryParserTestsArray63);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2629");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2630");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("tests.nightly", indexReader10, 100, postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        java.lang.String str23 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests19.setUp();
        java.lang.String str27 = simpleIndexQueryParserTests19.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.badapples", indexReader29, (-1), postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("tests.failfast", postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("europarl.lines.txt.gz", indexReader40, terms41, terms42, true);
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2632");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean5, (java.lang.Object) cloneableArray14);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2633");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray6;
        cloneableIterableArray7[0] = cloneableList4;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray7);
        java.lang.Object[] objArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableIterableArray7, objArray11);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) 'a', postingsEnum14, postingsEnum15, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str6 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = null;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests5, simpleIndexQueryParserTests11 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet16 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet18 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray15);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray31);
        org.junit.Assert.assertNotNull("", (java.lang.Object) cloneableArray31);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray49 = new java.lang.Cloneable[] { locale48 };
        java.util.List<java.lang.Cloneable> cloneableList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray49);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray56, (java.lang.Object[]) cloneableArray61);
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray67 = new java.lang.Cloneable[] { locale66 };
        java.util.List<java.lang.Cloneable> cloneableList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray67);
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray72 = new java.lang.Cloneable[] { locale71 };
        java.util.List<java.lang.Cloneable> cloneableList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray67, (java.lang.Object[]) cloneableArray72);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray56, (java.lang.Object[]) cloneableArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray49, (java.lang.Object[]) cloneableArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray49);
        java.lang.Object obj78 = null;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) cloneableArray49, obj78);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray49);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) cloneableArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) cloneableArray31);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("hi!", indexReader19, 10, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum26, postingsEnum27, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("", postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("", postingsEnum39, postingsEnum40, false);
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests30.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests30);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("node_s_0", indexReader8, terms9, terms10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str15 = simpleIndexQueryParserTests2.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2638");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 100, 0L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2642");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList12, obj13);
        java.lang.Iterable[] iterableArray16 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray17 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray16;
        cloneableIterableArray17[0] = cloneableList5;
        cloneableIterableArray17[1] = cloneableList12;
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList26, obj27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList33, obj34);
        java.lang.Iterable[] iterableArray37 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray38 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray37;
        cloneableIterableArray38[0] = cloneableList26;
        cloneableIterableArray38[1] = cloneableList33;
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList47, obj48);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray53 = new java.lang.Cloneable[] { locale52 };
        java.util.List<java.lang.Cloneable> cloneableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray53);
        java.lang.Object obj55 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList54, obj55);
        java.lang.Iterable[] iterableArray58 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray59 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray58;
        cloneableIterableArray59[0] = cloneableList47;
        cloneableIterableArray59[1] = cloneableList54;
        java.lang.Iterable[][] iterableArray65 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray66 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray65;
        cloneableIterableArray66[0] = cloneableIterableArray17;
        cloneableIterableArray66[1] = cloneableIterableArray38;
        cloneableIterableArray66[2] = cloneableIterableArray59;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray66);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray78 = new java.lang.Cloneable[] { locale77 };
        java.util.List<java.lang.Cloneable> cloneableList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray78);
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray83 = new java.lang.Cloneable[] { locale82 };
        java.util.List<java.lang.Cloneable> cloneableList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray78, (java.lang.Object[]) cloneableArray83);
        org.junit.Assert.assertNotNull("", (java.lang.Object) cloneableArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableIterableArray66, (java.lang.Object[]) cloneableArray83);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFilteredQueryBuilder();
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2645");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray13, charArray19);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray23, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        org.junit.Assert.assertArrayEquals(charArray27, charArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray19, charArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray19);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray42, charArray44);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray51, charArray53);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray51, charArray57);
        org.junit.Assert.assertArrayEquals(charArray44, charArray57);
        org.junit.Assert.assertArrayEquals(charArray19, charArray57);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str64 = simpleIndexQueryParserTests63.getTestName();
        simpleIndexQueryParserTests63.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        simpleIndexQueryParserTests63.assertFieldsEquals("tests.awaitsfix", indexReader67, fields68, fields69, false);
        simpleIndexQueryParserTests63.setUp();
        simpleIndexQueryParserTests63.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray19, (java.lang.Object) simpleIndexQueryParserTests63);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2646");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) 1, (-1.0d));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 1);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2649");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader12, terms13, terms14, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str15 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.maxfailures", indexReader18, terms19, terms20, true);
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("enwiki.random.lines.txt", indexReader31, terms32, terms33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("europarl.lines.txt.gz", indexReader37, terms38, terms39, false);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2652");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList17, obj18);
        java.lang.Iterable[] iterableArray21 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray22 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray21;
        cloneableIterableArray22[0] = cloneableList5;
        cloneableIterableArray22[1] = cloneableList12;
        cloneableIterableArray22[2] = cloneableList17;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray22);
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray22);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableIterableArray22, (java.lang.Object[]) executorServiceArray33);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(6);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2654");
        double[] doubleArray4 = new double[] { 0, (byte) 1, 1.0f };
        double[] doubleArray8 = new double[] { 0, (byte) 1, 1.0f };
        double[] doubleArray12 = new double[] { 0, (byte) 1, 1.0f };
        double[][] doubleArray13 = new double[][] { doubleArray4, doubleArray8, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) doubleArray13);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "random", "europarl.lines.txt.gz", "tests.slow", "tests.nightly", "tests.badapples" };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] { charSequenceArray21 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray13, (java.lang.Object[]) charSequenceArray22);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2655");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("random", indexReader10, 3, postingsEnum12, postingsEnum13);
        java.lang.String str15 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) '4', postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain22;
        java.lang.String str24 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2658");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (short) 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2661");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray11);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) 100);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2664");
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
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str21 = simpleIndexQueryParserTests20.getTestName();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain24 = null;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain24;
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests36);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2665");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("random", indexReader11, 3, postingsEnum13, postingsEnum14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum13, (java.lang.Object) executorServiceArray23);
        java.util.Locale[] localeArray32 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) localeArray32);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) locale16);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2669");
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
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.maxfailures", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str26 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        java.lang.String str29 = simpleIndexQueryParserTests25.getTestName();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests36.assertDocsEnumEquals("", postingsEnum40, postingsEnum41, true);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain45;
        java.lang.Object obj47 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain45, obj47);
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain45;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests9, (java.lang.Object) ruleChain45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str53 = simpleIndexQueryParserTests52.getTestName();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests52.ensureCleanedUp();
        java.lang.String str56 = simpleIndexQueryParserTests52.getTestName();
        simpleIndexQueryParserTests52.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("<unknown>", indexReader60, (int) '4', postingsEnum62, postingsEnum63);
        simpleIndexQueryParserTests52.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.badapples", indexReader67, 1, postingsEnum69, postingsEnum70);
        simpleIndexQueryParserTests52.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain45, (java.lang.Object) simpleIndexQueryParserTests52);
        java.lang.String str75 = simpleIndexQueryParserTests52.getTestName();
        simpleIndexQueryParserTests52.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests52.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain78 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests52.assertDocValuesEquals("tests.awaitsfix", (int) (short) 0, numericDocValues82, numericDocValues83);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) 100);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2671");
        short[] shortArray1 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray4);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray13);
        java.util.List<java.lang.String> strList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray13);
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray1, (java.lang.Object) strSet16);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2673");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2674");
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
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str26 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests25);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("random", indexReader40, fields41, fields42, true);
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests25.ruleChain;
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) ruleChain21, (java.lang.Object) simpleIndexQueryParserTests25);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 100, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2676");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.monster", 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.maxfailures", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("hi!", indexReader25, terms26, terms27, false);
        java.lang.String str30 = simpleIndexQueryParserTests15.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) str30);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2678");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader5, terms6, terms7, false);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray14, intArray19);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray24, intArray26);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray19, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray35, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals(intArray35, intArray40);
        org.junit.Assert.assertArrayEquals(intArray19, intArray40);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray46, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray46, intArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray19, intArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) indexReader5, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2679");
        java.lang.Object[] objArray1 = null;
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray17, (java.lang.Object[]) cloneableArray22);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray17, (java.lang.Object[]) cloneableArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray33);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray53 = new java.lang.Cloneable[] { locale52 };
        java.util.List<java.lang.Cloneable> cloneableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray53);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray53, (java.lang.Object[]) cloneableArray58);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray64 = new java.lang.Cloneable[] { locale63 };
        java.util.List<java.lang.Cloneable> cloneableList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray64);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { locale68 };
        java.util.List<java.lang.Cloneable> cloneableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray64, (java.lang.Object[]) cloneableArray69);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray53, (java.lang.Object[]) cloneableArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) cloneableArray46);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2681");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList4, obj5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList11, obj12);
        java.lang.Iterable[] iterableArray15 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray16 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray15;
        cloneableIterableArray16[0] = cloneableList4;
        cloneableIterableArray16[1] = cloneableList11;
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.lang.Object obj26 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList25, obj26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList32, obj33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray37 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray36;
        cloneableIterableArray37[0] = cloneableList25;
        cloneableIterableArray37[1] = cloneableList32;
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        java.lang.Object obj47 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList46, obj47);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList53, obj54);
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray58 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray57;
        cloneableIterableArray58[0] = cloneableList46;
        cloneableIterableArray58[1] = cloneableList53;
        java.lang.Iterable[][] iterableArray64 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray65 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray64;
        cloneableIterableArray65[0] = cloneableIterableArray16;
        cloneableIterableArray65[1] = cloneableIterableArray37;
        cloneableIterableArray65[2] = cloneableIterableArray58;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray65);
        java.lang.Object[] objArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableIterableArray65, objArray73);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, true);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2683");
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
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray10, charArray12);
        org.junit.Assert.assertArrayEquals("random", charArray1, charArray12);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray19, charArray21);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray28, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray28, charArray34);
        org.junit.Assert.assertArrayEquals(charArray21, charArray34);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray34, charArray39);
        org.junit.Assert.assertArrayEquals(charArray12, charArray34);
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
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray51, charArray55);
        org.junit.Assert.assertArrayEquals(charArray48, charArray55);
        org.junit.Assert.assertArrayEquals(charArray34, charArray48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str61 = simpleIndexQueryParserTests60.getTestName();
        simpleIndexQueryParserTests60.resetCheckIndexStatus();
        simpleIndexQueryParserTests60.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests60.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray48, (java.lang.Object) ruleChain65);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2684");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2685");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray1, charSequenceArray2, charSequenceArray3, charSequenceArray4 };
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray5 };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10 };
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray11 };
        java.lang.CharSequence[][][][] charSequenceArray13 = new java.lang.CharSequence[][][][] { charSequenceArray6, charSequenceArray12 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charSequenceArray13);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        java.lang.String str12 = simpleIndexQueryParserTests8.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain28;
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain28, obj30);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.badapples", postingsEnum34, postingsEnum35, true);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests40.assertTermsEquals("tests.maxfailures", indexReader44, terms45, terms46, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str50 = simpleIndexQueryParserTests49.getTestName();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.ensureCleanedUp();
        java.lang.String str53 = simpleIndexQueryParserTests49.getTestName();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        simpleIndexQueryParserTests49.assertFieldsEquals("europarl.lines.txt.gz", indexReader55, fields56, fields57, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests60.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests60.assertDocsEnumEquals("", postingsEnum64, postingsEnum65, true);
        simpleIndexQueryParserTests60.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain69;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain69;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        simpleIndexQueryParserTests40.assertFieldsEquals("tests.weekly", indexReader73, fields74, fields75, false);
        simpleIndexQueryParserTests40.setUp();
        simpleIndexQueryParserTests40.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests40);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 5);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2688");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.awaitsfix", indexReader24, terms25, terms26, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str30 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain33 = null;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain33;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("tests.nightly", indexReader36, 100, postingsEnum38, postingsEnum39, false);
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("tests.slow", indexReader45, (int) (byte) 10, postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.badapples", indexReader52, terms53, terms54, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) true);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2690");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 100.0d, (double) 1);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2692");
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
        java.lang.Class<?> wildcardClass16 = simpleIndexQueryParserTestsArray14.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2693");
        double[][][][] doubleArray0 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray0);
        java.lang.Iterable[] iterableArray3 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray4 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray3;
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray6;
        java.lang.Iterable[][] iterableArray9 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray10 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray9;
        cloneableIterableArray10[0] = cloneableIterableArray4;
        cloneableIterableArray10[1] = iterableArray6;
        java.lang.Iterable[] iterableArray16 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray17 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray16;
        java.lang.Iterable[] iterableArray19 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray20 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray19;
        java.lang.Iterable[][] iterableArray22 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray23 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray22;
        cloneableIterableArray23[0] = cloneableIterableArray17;
        cloneableIterableArray23[1] = iterableArray19;
        java.lang.Iterable[] iterableArray29 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray30 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray29;
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray33 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray32;
        java.lang.Iterable[][] iterableArray35 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray36 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray35;
        cloneableIterableArray36[0] = cloneableIterableArray30;
        cloneableIterableArray36[1] = iterableArray32;
        java.lang.Iterable[] iterableArray42 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray43 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray42;
        java.lang.Iterable[] iterableArray45 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray46 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray45;
        java.lang.Iterable[][] iterableArray48 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray49 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray48;
        cloneableIterableArray49[0] = cloneableIterableArray43;
        cloneableIterableArray49[1] = iterableArray45;
        java.lang.Iterable[] iterableArray55 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray56 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray55;
        java.lang.Iterable[] iterableArray58 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray59 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray58;
        java.lang.Iterable[][] iterableArray61 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray62 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray61;
        cloneableIterableArray62[0] = cloneableIterableArray56;
        cloneableIterableArray62[1] = iterableArray58;
        java.lang.Iterable[] iterableArray68 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray69 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray68;
        java.lang.Iterable[] iterableArray71 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray72 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray71;
        java.lang.Iterable[][] iterableArray74 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray75 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray74;
        cloneableIterableArray75[0] = cloneableIterableArray69;
        cloneableIterableArray75[1] = iterableArray71;
        java.lang.Iterable[][][] iterableArray81 = new java.lang.Iterable[6][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][][] cloneableIterableArray82 = (java.lang.Iterable<java.lang.Cloneable>[][][]) iterableArray81;
        cloneableIterableArray82[0] = cloneableIterableArray10;
        cloneableIterableArray82[1] = cloneableIterableArray23;
        cloneableIterableArray82[2] = cloneableIterableArray36;
        cloneableIterableArray82[3] = cloneableIterableArray49;
        cloneableIterableArray82[4] = cloneableIterableArray62;
        cloneableIterableArray82[5] = cloneableIterableArray75;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[][]> cloneableIterableArraySet95 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray0, (java.lang.Object[]) cloneableIterableArray82);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2696");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2697");
        java.util.Locale[] localeArray2 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        java.util.List<java.util.Locale> localeList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, localeArray2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray7);
        java.util.Set<org.junit.rules.TestRule> testRuleSet9 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray7);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) localeArray2, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray7);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2698");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (-1L));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2699");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain10, (java.lang.Object) ruleChain14);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2700");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray12);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2701");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray4);
        org.junit.rules.RuleChain[] ruleChainArray7 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet8 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray7);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet9 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) ruleChainArray7);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2704");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2705");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        java.lang.String str15 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests11.setUp();
        java.lang.String str19 = simpleIndexQueryParserTests11.getTestName();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.badapples", indexReader21, (-1), postingsEnum23, postingsEnum24);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("tests.failfast", postingsEnum27, postingsEnum28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("europarl.lines.txt.gz", indexReader32, terms33, terms34, true);
        org.junit.rules.TestRule testRule37 = simpleIndexQueryParserTests11.ruleChain;
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests11, (java.lang.Object) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray39);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray46 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray48 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray50 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray52 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray47, throttlingArray49, throttlingArray51, throttlingArray53 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) throttlingArray54);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2706");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.awaitsfix", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader22, terms23, terms24, true);
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        char[][] charArray35 = new char[][] { charArray29, charArray30, charArray31, charArray32, charArray33, charArray34 };
        java.util.Set<char[]> charArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(charArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) charArray35);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = null;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain15;
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        java.lang.String str20 = simpleIndexQueryParserTests11.getTestName();
        java.lang.String str21 = simpleIndexQueryParserTests11.getTestName();
        java.lang.String str22 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule10, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2711");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests5.testBoolQueryBuilder();
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2712");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader11, (int) '4', postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2713");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2714");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) (short) 100);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray1, floatArray12, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (short) 100);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray23, floatArray29, 10.0f);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray34, (float) '#');
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 100L);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 100L);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray52, (float) (short) 100);
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray52, floatArray58, 10.0f);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray63, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray58, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray12, (java.lang.Object) (short) 10);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 10);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str13 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2718");
        double[] doubleArray5 = new double[] { 'a', 10.0d };
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray11 = new double[] { 'a', 10.0d };
        double[] doubleArray14 = new double[] { 'a', 10.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0d };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        java.util.List<double[]> doubleArrayList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray18);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray18);
        java.util.Set<double[]> doubleArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests22.assertDocsSkippingEquals("tests.slow", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.weekly", indexReader34, (int) (byte) 1, postingsEnum36, postingsEnum37);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray18, (java.lang.Object) postingsEnum36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str44 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain47 = null;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain47;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str50 = simpleIndexQueryParserTests49.getTestName();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests40, simpleIndexQueryParserTests43, simpleIndexQueryParserTests49 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet54 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray53);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet55 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) doubleArray18, (java.lang.Object[]) simpleIndexQueryParserTestsArray53);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2720");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests5.testTermsQueryFilter();
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2721");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4, simpleIndexQueryParserTestsArray5 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray6);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = null;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("tests.nightly", indexReader17, 100, postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.maxfailures", indexReader29, fields30, fields31, false);
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.maxfailures", indexReader36, fields37, fields38, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str43 = simpleIndexQueryParserTests42.getTestName();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests42);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.maxfailures", indexReader48, (-1), postingsEnum50, postingsEnum51);
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        simpleIndexQueryParserTests42.ensureCleanedUp();
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain56 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain56;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain56;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) simpleIndexQueryParserTestsArray6, (java.lang.Object) ruleChain56);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2723");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray9, (java.lang.Object) simpleIndexQueryParserTests11);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray35);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray46);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray54 = new java.lang.Cloneable[] { locale53 };
        java.util.List<java.lang.Cloneable> cloneableList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray54);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray54, (java.lang.Object[]) cloneableArray59);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray71);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray77 = new java.lang.Cloneable[] { locale76 };
        java.util.List<java.lang.Cloneable> cloneableList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray77);
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray82 = new java.lang.Cloneable[] { locale81 };
        java.util.List<java.lang.Cloneable> cloneableList83 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray77, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray59, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.List<java.lang.Object> objList90 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.Object[]) cloneableArray4);
        org.junit.rules.RuleChain[] ruleChainArray91 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet92 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray91);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet93 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) ruleChainArray91);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader13, (int) (byte) 10, postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str21 = simpleIndexQueryParserTests20.getTestName();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests20.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule22);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule22;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.monster", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2726");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader25, fields26, fields27, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain34;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str38 = simpleIndexQueryParserTests37.getTestName();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests37.ensureCleanedUp();
        java.lang.String str41 = simpleIndexQueryParserTests37.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests37);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests37.assertFieldsEquals("<unknown>", indexReader44, fields45, fields46, true);
        simpleIndexQueryParserTests37.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule50 = simpleIndexQueryParserTests37.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) testRule50);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) 10);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10L);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum21, postingsEnum22, false);
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests12.ruleChain;
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("random", indexReader28, terms29, terms30, false);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("", indexReader36, (int) (short) 1, postingsEnum38, postingsEnum39, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) postingsEnum38);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 0);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("node_s_0", indexReader7, terms8, terms9, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        java.lang.String str16 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) '4', postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.badapples", indexReader27, 1, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader7, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2735");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray9, (java.lang.Object) simpleIndexQueryParserTests11);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray35);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray46);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray54 = new java.lang.Cloneable[] { locale53 };
        java.util.List<java.lang.Cloneable> cloneableList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray54);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray54, (java.lang.Object[]) cloneableArray59);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray71);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray77 = new java.lang.Cloneable[] { locale76 };
        java.util.List<java.lang.Cloneable> cloneableList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray77);
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray82 = new java.lang.Cloneable[] { locale81 };
        java.util.List<java.lang.Cloneable> cloneableList83 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray77, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray59, (java.lang.Object[]) cloneableArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures90 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures91 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures90);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray92 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures91 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet93 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray92);
        java.util.Set<org.junit.rules.TestRule> testRuleSet94 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray92);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet95 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray92);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) cloneableArray9, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray92);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 10, (long) 1);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 1.0d, (double) 1L);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) 100);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2741");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2742");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) executorServiceArray4);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4, simpleIndexQueryParserTestsArray5 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray6);
        java.util.Set<org.junit.Assert[]> assertArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) simpleIndexQueryParserTestsArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("tests.nightly", indexReader16, 100, postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("enwiki.random.lines.txt", indexReader24, terms25, terms26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) assertArraySet8, (java.lang.Object) false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2744");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) -1, (long) ' ');
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2746");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray2, byteArray6);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2747");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
        short[] shortArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray14);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2748");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        java.lang.Class<?> wildcardClass18 = simpleIndexQueryParserTests1.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain23 = null;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain23;
        java.lang.String str25 = simpleIndexQueryParserTests19.getTestName();
        java.lang.Class<?> wildcardClass26 = simpleIndexQueryParserTests19.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str28 = simpleIndexQueryParserTests27.getTestName();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests27.ensureCleanedUp();
        java.lang.String str31 = simpleIndexQueryParserTests27.getTestName();
        simpleIndexQueryParserTests27.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests27.setUp();
        java.lang.String str35 = simpleIndexQueryParserTests27.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.badapples", indexReader37, (-1), postingsEnum39, postingsEnum40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("europarl.lines.txt.gz", indexReader48, terms49, terms50, true);
        java.lang.Class<?> wildcardClass53 = simpleIndexQueryParserTests27.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str55 = simpleIndexQueryParserTests54.getTestName();
        simpleIndexQueryParserTests54.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests54.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain58 = null;
        simpleIndexQueryParserTests54.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests54.assertDocsSkippingEquals("tests.nightly", indexReader61, 100, postingsEnum63, postingsEnum64, false);
        simpleIndexQueryParserTests54.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass68 = simpleIndexQueryParserTests54.getClass();
        java.lang.Class[] classArray70 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass18;
        wildcardClassArray71[1] = wildcardClass26;
        wildcardClassArray71[2] = wildcardClass53;
        wildcardClassArray71[3] = wildcardClass68;
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray71);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray71);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray71);
        java.util.Set<java.lang.Class<?>> wildcardClassSet83 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray71);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) wildcardClassArray71, (java.lang.Object[]) executorServiceArray85);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2753");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2754");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2757");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray4 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) ' ');
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2759");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        char[][] charArray6 = new char[][] { charArray0, charArray1, charArray2, charArray3, charArray4, charArray5 };
        java.util.Set<char[]> charArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9 };
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray12 };
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray16 = new java.util.concurrent.ExecutorService[][] { executorServiceArray14, executorServiceArray15 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray17 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray10, executorServiceArray13, executorServiceArray16 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray6, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 10, (long) (short) 100);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2761");
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
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) '4', (double) 0.0f);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2763");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray6);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2764");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2765");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList4, obj5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.lang.Iterable[] iterableArray13 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray14 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray13;
        cloneableIterableArray14[0] = cloneableList4;
        cloneableIterableArray14[1] = cloneableList11;
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList23, obj24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray33 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray32;
        cloneableIterableArray33[0] = cloneableList23;
        cloneableIterableArray33[1] = cloneableList30;
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.lang.Object obj43 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList42, obj43);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray48 = new java.lang.Cloneable[] { locale47 };
        java.util.List<java.lang.Cloneable> cloneableList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray48);
        java.lang.Iterable[] iterableArray51 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray52 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray51;
        cloneableIterableArray52[0] = cloneableList42;
        cloneableIterableArray52[1] = cloneableList49;
        java.lang.Iterable[][] iterableArray58 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray59 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray58;
        cloneableIterableArray59[0] = cloneableIterableArray14;
        cloneableIterableArray59[1] = cloneableIterableArray33;
        cloneableIterableArray59[2] = cloneableIterableArray52;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet66 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray59);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str69 = simpleIndexQueryParserTests68.getTestName();
        simpleIndexQueryParserTests68.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str72 = simpleIndexQueryParserTests71.getTestName();
        simpleIndexQueryParserTests71.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests71.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain75 = null;
        simpleIndexQueryParserTests71.failureAndSuccessEvents = ruleChain75;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str78 = simpleIndexQueryParserTests77.getTestName();
        simpleIndexQueryParserTests77.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests77.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests68, simpleIndexQueryParserTests71, simpleIndexQueryParserTests77 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet82 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray81);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet83 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray81);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet84 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray81);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList85 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray81);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableIterableArray59, (java.lang.Object[]) simpleIndexQueryParserTestsArray81);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2768");
        short[] shortArray1 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("random", shortArray8, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
        short[] shortArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray15);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2770");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray33, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray27);
        double[] doubleArray48 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        double[] doubleArray53 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray54 = new double[][] { doubleArray53 };
        double[] doubleArray58 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray59 = new double[][] { doubleArray58 };
        double[] doubleArray63 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray64 = new double[][] { doubleArray63 };
        double[] doubleArray68 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray69 = new double[][] { doubleArray68 };
        double[] doubleArray73 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray74 = new double[][] { doubleArray73 };
        double[][][] doubleArray75 = new double[][][] { doubleArray49, doubleArray54, doubleArray59, doubleArray64, doubleArray69, doubleArray74 };
        java.util.Set<double[][]> doubleArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray75);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) doubleArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) doubleArray75);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain11 = null;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        java.lang.String str16 = simpleIndexQueryParserTests7.getTestName();
        java.lang.String str17 = simpleIndexQueryParserTests7.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.slow", postingsEnum27, postingsEnum28, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2772");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("random", intArray8, intArray13);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray20, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray20, intArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray20);
        org.junit.Assert.assertArrayEquals(intArray8, intArray20);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray39, charArray43);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray48, charArray50);
        org.junit.Assert.assertArrayEquals("random", charArray39, charArray50);
        org.junit.Assert.assertArrayEquals("random", charArray31, charArray50);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray58, charArray60);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray67, charArray69);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray67, charArray73);
        org.junit.Assert.assertArrayEquals(charArray60, charArray73);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        org.junit.Assert.assertArrayEquals(charArray73, charArray78);
        org.junit.Assert.assertArrayEquals(charArray31, charArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray20, (java.lang.Object) charArray31);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2, obj16);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2774");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling5, throttling8, throttling11, throttling13, throttling14 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray17 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray19 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray21 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray23 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray18, throttlingArray20, throttlingArray22, throttlingArray24 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) throttlingEnumSet16, (java.lang.Object) throttlingArraySet26);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2775");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2777");
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
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("", indexReader23, fields24, fields25, true);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests9.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2778");
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
        java.lang.String str16 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str16);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) 0);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (byte) -1, 100L);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2781");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2782");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str15 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        double[] doubleArray25 = new double[] { (-1.0d), 0 };
        double[] doubleArray28 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray28, (double) 100.0f);
        double[] doubleArray33 = new double[] { (-1.0d), 0 };
        double[] doubleArray36 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0d), 0 };
        double[] doubleArray44 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray44, (double) (short) 100);
        double[] doubleArray51 = new double[] { (-1.0d), 0 };
        double[] doubleArray54 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100.0f);
        double[] doubleArray59 = new double[] { (-1.0d), 0 };
        double[] doubleArray62 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray62, (double) 1L);
        double[] doubleArray73 = new double[] { (-1.0d), 0 };
        double[] doubleArray76 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray76, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray28, doubleArray76, (double) 6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain19, (java.lang.Object) 6);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2783");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.maxfailures", "hi!", "tests.weekly", "tests.badapples", "", "tests.slow" };
        java.util.List<java.lang.CharSequence> charSequenceList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charSequenceArray8);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray19);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray30);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) cloneableArray30);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray9, charArray11);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray9, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        org.junit.Assert.assertArrayEquals(charArray23, charArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray15, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray30);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2786");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 1, 0.0d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2789");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3 };
        java.lang.CharSequence[][][] charSequenceArray5 = new java.lang.CharSequence[][][] { charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray7, charSequenceArray8, charSequenceArray9 };
        java.lang.CharSequence[][][] charSequenceArray11 = new java.lang.CharSequence[][][] { charSequenceArray10 };
        java.lang.CharSequence[][][][] charSequenceArray12 = new java.lang.CharSequence[][][][] { charSequenceArray5, charSequenceArray11 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("tests.maxfailures", indexReader16, fields17, fields18, false);
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("random", postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("", indexReader31, (int) '4', postingsEnum33, postingsEnum34, false);
        simpleIndexQueryParserTests14.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str39 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        java.lang.String str42 = simpleIndexQueryParserTests38.getTestName();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests49.assertDocsEnumEquals("", postingsEnum53, postingsEnum54, true);
        simpleIndexQueryParserTests49.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain58;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str65 = simpleIndexQueryParserTests64.getTestName();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain68 = null;
        simpleIndexQueryParserTests64.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain71 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        java.lang.String str73 = simpleIndexQueryParserTests64.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests64);
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("<unknown>", postingsEnum76, postingsEnum77, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests14, (java.lang.Object) "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArraySet13, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2791");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray10, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray10, intArray15);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals(intArray22, intArray27);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray32, intArray34);
        org.junit.Assert.assertArrayEquals("random", intArray27, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray27, intArray38);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray43, intArray45);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray43, intArray48);
        org.junit.Assert.assertArrayEquals(intArray27, intArray48);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray27, intArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray4, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '4', (double) (-1L), (double) 0);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2793");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", obj1);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2794");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet1 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray0);
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray0);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray7, (java.lang.Object[]) cloneableArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray7);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray36);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray42 = new java.lang.Cloneable[] { locale41 };
        java.util.List<java.lang.Cloneable> cloneableList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray42);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray42, (java.lang.Object[]) cloneableArray47);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray47);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray55 = new java.lang.Cloneable[] { locale54 };
        java.util.List<java.lang.Cloneable> cloneableList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray55);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray60 = new java.lang.Cloneable[] { locale59 };
        java.util.List<java.lang.Cloneable> cloneableList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray60);
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray65 = new java.lang.Cloneable[] { locale64 };
        java.util.List<java.lang.Cloneable> cloneableList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray60, (java.lang.Object[]) cloneableArray65);
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray72 = new java.lang.Cloneable[] { locale71 };
        java.util.List<java.lang.Cloneable> cloneableList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray72);
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray77 = new java.lang.Cloneable[] { locale76 };
        java.util.List<java.lang.Cloneable> cloneableList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray72, (java.lang.Object[]) cloneableArray77);
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray83 = new java.lang.Cloneable[] { locale82 };
        java.util.List<java.lang.Cloneable> cloneableList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray83);
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray88 = new java.lang.Cloneable[] { locale87 };
        java.util.List<java.lang.Cloneable> cloneableList89 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray83, (java.lang.Object[]) cloneableArray88);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray72, (java.lang.Object[]) cloneableArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray65, (java.lang.Object[]) cloneableArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray55, (java.lang.Object[]) cloneableArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) cloneableArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray7, (java.lang.Object[]) cloneableArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray0, (java.lang.Object[]) cloneableArray7);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2797");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("tests.nightly", indexReader11, 100, postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) 2);
        java.lang.String str25 = simpleIndexQueryParserTests4.getTestName();
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray40);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray35, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray35);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray55 = new java.lang.Cloneable[] { locale54 };
        java.util.List<java.lang.Cloneable> cloneableList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray50, (java.lang.Object[]) cloneableArray55);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray61, (java.lang.Object[]) cloneableArray66);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray50, (java.lang.Object[]) cloneableArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) str25, (java.lang.Object) cloneableArray29);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2798");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.util.List<java.util.Locale> localeList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, localeArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests4.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("tests.badapples", indexReader10, fields11, fields12, false);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 0, (java.lang.Object) ruleChain15);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.nightly", indexReader9, 100, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2801");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray32);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray50);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray62);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { locale72 };
        java.util.List<java.lang.Cloneable> cloneableList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray68, (java.lang.Object[]) cloneableArray73);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray50, (java.lang.Object[]) cloneableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray50);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) cloneableArray50, (java.lang.Object[]) executorServiceArray81);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2803");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 2, (long) 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0L, (long) (short) -1);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        java.lang.String str15 = simpleIndexQueryParserTests11.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.weekly", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests11.ruleChain;
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, false);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRule9, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("random", indexReader17, fields18, fields19, true);
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests2.ruleChain;
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests2.ruleChain;
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray39);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray51);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray39);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray76 = new java.lang.Cloneable[] { locale75 };
        java.util.List<java.lang.Cloneable> cloneableList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray71, (java.lang.Object[]) cloneableArray76);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule24, (java.lang.Object) cloneableArray39);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2810");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("<unknown>", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("tests.monster", indexReader17, (int) (byte) 1, postingsEnum19, postingsEnum20);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) 100L);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray30, (float) (short) 100);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 100L);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray40, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray30, floatArray40, (float) 'a');
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) 100L);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray53, (float) (short) 100);
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) 100L);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray63, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray53, floatArray63, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray40, floatArray53, (float) 3);
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) 100L);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray78, (float) (short) 100);
        float[] floatArray83 = new float[] {};
        float[] floatArray84 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray84, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray78, floatArray84, 10.0f);
        float[] floatArray89 = new float[] {};
        float[] floatArray90 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray89, floatArray90, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray89, 10.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray40, floatArray84, (float) 1L);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.monster", (java.lang.Object) floatArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2811");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2812");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader20, 3, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 4, (double) (byte) 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2814");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2815");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) (short) 100);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) 100L);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray28, (float) (short) 100);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray28, floatArray34, 10.0f);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 100L);
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray45, (float) (short) 100);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) 100L);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray55, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray45, floatArray55, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray45, (float) '#');
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray65, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray65, (float) ' ');
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray2, floatArray65, (float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, 0.0f);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2816");
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
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray35, charArray37);
        org.junit.Assert.assertArrayEquals("random", charArray26, charArray37);
        org.junit.Assert.assertArrayEquals("random", charArray18, charArray37);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray43, charArray47);
        org.junit.Assert.assertArrayEquals(charArray18, charArray47);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray51, charArray55);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray47, charArray51);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray61, charArray65);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray70, charArray72);
        org.junit.Assert.assertArrayEquals("random", charArray61, charArray72);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray61, charArray77);
        org.junit.Assert.assertArrayEquals(charArray51, charArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) charArray12, (java.lang.Object) charArray61);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2817");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 100L);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (short) 100);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray4, floatArray15, (float) 3);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) 100L);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray26, (float) (short) 100);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray32, 10.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray4, floatArray32, (float) (short) -1);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray44, (float) (short) -1);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) 100L);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray55, (float) (short) 100);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray55, floatArray61, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray55, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray4, floatArray44, (float) (short) 10);
        float[] floatArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray4, floatArray70, (float) ' ');
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader34, fields35, fields36, false);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule41 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("", indexReader45, fields46, fields47, true);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray53 = new java.lang.Cloneable[] { locale52 };
        java.util.List<java.lang.Cloneable> cloneableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray53);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray53, (java.lang.Object) simpleIndexQueryParserTests55);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        simpleIndexQueryParserTests55.assertTermsEquals("", indexReader60, terms61, terms62, true);
        simpleIndexQueryParserTests55.setUp();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests55);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2819");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader11, (int) '4', postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader19, 3, postingsEnum21, postingsEnum22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2821");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.badapples", indexReader7, fields8, fields9, false);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2823");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testEmptyBooleanQuery();
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 2, (long) 'a');
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.nightly", indexReader9, 100, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2828");
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
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader15, terms16, terms17, false);
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests13.assertDocsSkippingEquals("tests.nightly", indexReader20, 100, postingsEnum22, postingsEnum23, false);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.awaitsfix", indexReader28, terms29, terms30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, true);
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests13.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) testRule39);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 100.0f);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2833");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100, (double) (byte) -1);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2835");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray5);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 100.0d, (double) 10L);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2837");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.awaitsfix", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = null;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain15;
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        java.lang.String str20 = simpleIndexQueryParserTests11.getTestName();
        java.lang.String str21 = simpleIndexQueryParserTests11.getTestName();
        java.lang.String str22 = simpleIndexQueryParserTests11.getTestName();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        simpleIndexQueryParserTests11.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("tests.maxfailures", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2838");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray16);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray28);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray39);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray39);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) cloneableArray52);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray64 = new java.lang.Cloneable[] { locale63 };
        java.util.List<java.lang.Cloneable> cloneableList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray59, (java.lang.Object[]) cloneableArray64);
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray70 = new java.lang.Cloneable[] { locale69 };
        java.util.List<java.lang.Cloneable> cloneableList71 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray70);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray75 = new java.lang.Cloneable[] { locale74 };
        java.util.List<java.lang.Cloneable> cloneableList76 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray70, (java.lang.Object[]) cloneableArray75);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray59, (java.lang.Object[]) cloneableArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray52);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableArray52);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) cloneableArray52);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 3);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2841");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray20);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray32);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray38, (java.lang.Object[]) cloneableArray43);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray43);
        java.lang.Class<?> wildcardClass49 = cloneableArray9.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule54 = simpleIndexQueryParserTests50.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) wildcardClass49, (java.lang.Object) testRule54);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.maxfailures", indexReader6, terms7, terms8, true);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.nightly", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("enwiki.random.lines.txt", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, false);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.monster");
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.badapples", indexReader33, (int) '#', postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum40, postingsEnum41, true);
        java.lang.String str44 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2843");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2844");
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
        java.lang.Class<?> wildcardClass14 = simpleIndexQueryParserTests0.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = null;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests15.assertDocsSkippingEquals("tests.nightly", indexReader22, 100, postingsEnum24, postingsEnum25, false);
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass29 = simpleIndexQueryParserTests15.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = null;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests30.assertDocsSkippingEquals("tests.nightly", indexReader37, 100, postingsEnum39, postingsEnum40, false);
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass44 = simpleIndexQueryParserTests30.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str46 = simpleIndexQueryParserTests45.getTestName();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests45.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain49 = null;
        simpleIndexQueryParserTests45.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass52 = simpleIndexQueryParserTests45.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass54 = simpleIndexQueryParserTests53.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray55 = new java.lang.reflect.GenericDeclaration[] { wildcardClass14, wildcardClass29, wildcardClass44, wildcardClass52, wildcardClass54 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet56 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray55, (java.lang.Object[]) strArray62);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) (byte) 100, (double) 6);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2846");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests4.testMoreLikeThisBuilder();
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2847");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray30);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) cloneableArray30);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (-1), 0.0d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain9);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2850");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray9, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray29);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray40);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray54);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) 'a', postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader20, (int) ' ', postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("", postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        double[] doubleArray39 = new double[] { 0, (byte) 1, 1.0f };
        double[] doubleArray43 = new double[] { 0, (byte) 1, 1.0f };
        double[] doubleArray47 = new double[] { 0, (byte) 1, 1.0f };
        double[][] doubleArray48 = new double[][] { doubleArray39, doubleArray43, doubleArray47 };
        java.util.Set<double[]> doubleArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray48);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) doubleArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests27);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2853");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (-1L));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2854");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2856");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray11);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2857");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) (short) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) (short) 100);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray27, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray17, floatArray27, (float) 'a');
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray17, (float) 'a');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.maxfailures", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, true);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        simpleIndexQueryParserTests36.assertTermsEquals("<unknown>", indexReader53, terms54, terms55, false);
        simpleIndexQueryParserTests36.ensureCleanedUp();
        java.lang.String str59 = simpleIndexQueryParserTests36.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray1, (java.lang.Object) str59);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2858");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) serializableArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray6, simpleIndexQueryParserTestsArray7, simpleIndexQueryParserTestsArray8, simpleIndexQueryParserTestsArray9 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray10);
        java.util.Set<org.junit.Assert[]> assertArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) simpleIndexQueryParserTestsArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) simpleIndexQueryParserTestsArray10);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2859");
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
        java.lang.Class<?> wildcardClass15 = simpleIndexQueryParserTests1.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain20 = null;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests16.assertDocsSkippingEquals("tests.nightly", indexReader23, 100, postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass30 = simpleIndexQueryParserTests16.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain35 = null;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests31.assertDocsSkippingEquals("tests.nightly", indexReader38, 100, postingsEnum40, postingsEnum41, false);
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass45 = simpleIndexQueryParserTests31.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str47 = simpleIndexQueryParserTests46.getTestName();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests46.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain50 = null;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass53 = simpleIndexQueryParserTests46.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass55 = simpleIndexQueryParserTests54.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray56 = new java.lang.reflect.GenericDeclaration[] { wildcardClass15, wildcardClass30, wildcardClass45, wildcardClass53, wildcardClass55 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet57 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray61, (java.lang.Object[]) cloneableArray66);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { locale72 };
        java.util.List<java.lang.Cloneable> cloneableList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray73);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray78 = new java.lang.Cloneable[] { locale77 };
        java.util.List<java.lang.Cloneable> cloneableList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray73, (java.lang.Object[]) cloneableArray78);
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray84 = new java.lang.Cloneable[] { locale83 };
        java.util.List<java.lang.Cloneable> cloneableList85 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray84);
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray89 = new java.lang.Cloneable[] { locale88 };
        java.util.List<java.lang.Cloneable> cloneableList90 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray84, (java.lang.Object[]) cloneableArray89);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray73, (java.lang.Object[]) cloneableArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) genericDeclarationArray56, (java.lang.Object[]) cloneableArray89);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2860");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields3Builder();
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2863");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("tests.maxfailures", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.nightly", indexReader21, (int) (byte) 10, postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("", postingsEnum31, postingsEnum32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) postingsEnum32);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2864");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        char[][] charArray6 = new char[][] { charArray0, charArray1, charArray2, charArray3, charArray4, charArray5 };
        java.util.Set<char[]> charArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("tests.maxfailures", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.awaitsfix", indexReader24, fields25, fields26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArraySet7, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2865");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.lang.Object obj20 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList19, obj20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList31, obj32);
        java.lang.Iterable[] iterableArray35 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray36 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray35;
        cloneableIterableArray36[0] = cloneableList19;
        cloneableIterableArray36[1] = cloneableList26;
        cloneableIterableArray36[2] = cloneableList31;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray36);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) cloneableIterableArray36);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6, false);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) testRule9);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) 100L);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray25, (float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (short) -1);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, (double) 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2870");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray4, charArray6);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray22, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray22, charArray28);
        org.junit.Assert.assertArrayEquals(charArray15, charArray28);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray34, charArray38);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray43, charArray45);
        org.junit.Assert.assertArrayEquals("random", charArray34, charArray45);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray52, charArray54);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray61, charArray63);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray61, charArray67);
        org.junit.Assert.assertArrayEquals(charArray54, charArray67);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray67, charArray72);
        org.junit.Assert.assertArrayEquals(charArray45, charArray67);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray28, charArray45);
        org.junit.Assert.assertArrayEquals("hi!", charArray6, charArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) charArray6);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.maxfailures", indexReader11, fields12, fields13, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 10, (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocValuesEquals("<unknown>", 5, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2873");
        double[] doubleArray5 = new double[] { (byte) 1, (byte) 100, 10, ' ', (byte) 100 };
        double[] doubleArray8 = new double[] { (-1.0d), 0 };
        double[] doubleArray11 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray11, (double) 100.0f);
        double[] doubleArray16 = new double[] { (-1.0d), 0 };
        double[] doubleArray19 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray19, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray19, (double) (short) 100);
        double[] doubleArray26 = new double[] { (-1.0d), 0 };
        double[] doubleArray29 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray29, (double) 100.0f);
        double[] doubleArray34 = new double[] { (-1.0d), 0 };
        double[] doubleArray37 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray37, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray37, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray37, (double) (-1));
        double[] doubleArray46 = new double[] { (-1.0d), 0 };
        double[] doubleArray49 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 100.0f);
        double[] doubleArray54 = new double[] { (-1.0d), 0 };
        double[] doubleArray57 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray57, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray57, (double) (short) 100);
        double[] doubleArray64 = new double[] { (-1.0d), 0 };
        double[] doubleArray67 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray67, (double) 100.0f);
        double[] doubleArray72 = new double[] { (-1.0d), 0 };
        double[] doubleArray75 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray75, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray75, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray49, (double) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray37, 0.0d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2874");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2876");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, obj19);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests2);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList10, obj11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        org.junit.Assert.assertNotSame("tests.slow", obj11, (java.lang.Object) simpleIndexQueryParserTests13);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("hi!", indexReader27, terms28, terms29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) terms29);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2878");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale15);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryBuilder();
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2879");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray8, longArray13);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray23, longArray26);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray32, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray40, longArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray32, longArray43);
        org.junit.Assert.assertArrayEquals("hi!", longArray23, longArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray8, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray23);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 6);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests4.testMoreLikeThisIds();
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2885");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2886");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray14, intArray19);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray24, intArray26);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray19, intArray30);
        org.junit.Assert.assertArrayEquals(intArray8, intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray36, intArray38);
        org.junit.Assert.assertArrayEquals(intArray8, intArray36);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray44, intArray49);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("random", intArray49, intArray54);
        org.junit.Assert.assertArrayEquals(intArray8, intArray49);
        int[] intArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray49, intArray60);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader16, terms17, terms18, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str25 = simpleIndexQueryParserTests24.getTestName();
        simpleIndexQueryParserTests24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests24.assertTermsEquals("tests.maxfailures", indexReader28, terms29, terms30, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str34 = simpleIndexQueryParserTests33.getTestName();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        java.lang.String str37 = simpleIndexQueryParserTests33.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests44.assertDocsEnumEquals("", postingsEnum48, postingsEnum49, true);
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain53;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("tests.weekly", indexReader57, fields58, fields59, false);
        simpleIndexQueryParserTests24.setUp();
        org.junit.rules.RuleChain ruleChain63 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule64 = simpleIndexQueryParserTests24.ruleChain;
        simpleIndexQueryParserTests24.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str69 = simpleIndexQueryParserTests68.getTestName();
        simpleIndexQueryParserTests68.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests68.ensureCleanedUp();
        java.lang.String str72 = simpleIndexQueryParserTests68.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests68);
        org.junit.rules.TestRule testRule74 = simpleIndexQueryParserTests68.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule74;
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) testRule74);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests24, (java.lang.Object) testRule74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2888");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0d, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2890");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray2 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1 };
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4 };
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray6, executorServiceArray7 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray9 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray2, executorServiceArray5, executorServiceArray8 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray9);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "random", "europarl.lines.txt.gz", "tests.slow", "tests.nightly", "tests.badapples" };
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] { charSequenceArray16 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) charSequenceArray17);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2891");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray9, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray29);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2892");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService[][] executorServiceArray4 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray4);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArraySet6);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2893");
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
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocValuesEquals("tests.monster", 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2894");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray8);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray20);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray31);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray31);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray44);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray56);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray67 = new java.lang.Cloneable[] { locale66 };
        java.util.List<java.lang.Cloneable> cloneableList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray67);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray44);
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray76 = new java.lang.Cloneable[] { locale75 };
        java.util.List<java.lang.Cloneable> cloneableList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray76);
        org.junit.rules.RuleChain[] ruleChainArray79 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet80 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray79);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet81 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) ruleChainArray79);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10.0f, (double) 0L, (-1.0d));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("tests.maxfailures", indexReader8, terms9, terms10, true);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str15 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        java.lang.String str23 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests19.setUp();
        java.lang.String str27 = simpleIndexQueryParserTests19.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.badapples", indexReader29, (-1), postingsEnum31, postingsEnum32);
        java.lang.String str34 = simpleIndexQueryParserTests19.getTestName();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain35);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2897");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        java.lang.String str12 = simpleIndexQueryParserTests8.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain28;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain28);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) 'a', numericDocValues34, numericDocValues35);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields3Builder();
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2900");
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
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain22;
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2901");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        java.lang.String str13 = simpleIndexQueryParserTests9.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, true);
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader33, fields34, fields35, false);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule40 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2902");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) (short) -1);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray19, (float) (short) 100);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray14, floatArray25, (float) 3);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray3, floatArray14, (float) '#');
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) 100L);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray48, 10.0f);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray53, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray48, (float) (short) 10);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray67, (float) (short) 100);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray67, floatArray73, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray67, (float) 10);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray67, (float) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray67, 10.0f);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2903");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFilteredQueryBuilder();
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) str31);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2905");
        java.lang.Object[] objArray1 = null;
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.lang.Object obj9 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList8, obj9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList20, obj21);
        java.lang.Iterable[] iterableArray24 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray25 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray24;
        cloneableIterableArray25[0] = cloneableList8;
        cloneableIterableArray25[1] = cloneableList15;
        cloneableIterableArray25[2] = cloneableList20;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray25);
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, cloneableIterableArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) cloneableIterableArray25);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2907");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader7, fields8, fields9, true);
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, obj12);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2909");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray17, (float) 'a');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("", postingsEnum33, postingsEnum34, false);
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) "hi!", (java.lang.Object) simpleIndexQueryParserTests24);
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests24.ruleChain;
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests24.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues43, numericDocValues44);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2910");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (byte) 10);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2911");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0, (double) (short) -1);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 0, (long) 3);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10, (double) (short) 100);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2916");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader18, terms19, terms20, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.String str24 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum26, postingsEnum27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, 0.0d, (double) 0L);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), (double) 100L);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2919");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) testRule10);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain12);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        java.lang.String str21 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("random", indexReader26, 3, postingsEnum28, postingsEnum29);
        java.lang.String str31 = simpleIndexQueryParserTests17.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRule15, (java.lang.Object) str31);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2922");
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
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str20 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests21.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2923");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray7, intArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray15, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray20, intArray31);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray36, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray36, intArray41);
        org.junit.Assert.assertArrayEquals(intArray20, intArray41);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray49, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray49, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray59, intArray61);
        org.junit.Assert.assertArrayEquals("random", intArray54, intArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray9, intArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray9);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("hi!", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.failfast", indexReader34, (int) (short) 1, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str42 = simpleIndexQueryParserTests41.getTestName();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests41.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain45 = null;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests41.assertDocsSkippingEquals("tests.nightly", indexReader48, 100, postingsEnum50, postingsEnum51, false);
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests41);
        simpleIndexQueryParserTests41.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) indexReader34, (java.lang.Object) simpleIndexQueryParserTests41);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2925");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("tests.nightly", indexReader10, 100, postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader21, fields22, fields23, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) indexReader21);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2929");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.nightly", indexReader25, 100, postingsEnum27, postingsEnum28, false);
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) (-1.0d), (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("<unknown>", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("enwiki.random.lines.txt", indexReader41, terms42, terms43, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2930");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2931");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.maxfailures", indexReader6, terms7, terms8, true);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain11);
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
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray18, charArray25);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray31, charArray33);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray40, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray40, charArray46);
        org.junit.Assert.assertArrayEquals(charArray33, charArray46);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray46, charArray51);
        org.junit.Assert.assertArrayEquals(charArray25, charArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain11, (java.lang.Object) charArray46);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray59, charArray61);
        org.junit.Assert.assertArrayEquals(charArray46, charArray59);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray66, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray73, charArray77);
        org.junit.Assert.assertArrayEquals(charArray70, charArray77);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray59, charArray70);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray86, charArray87);
        org.junit.Assert.assertArrayEquals(charArray83, charArray87);
        char[] charArray90 = new char[] {};
        char[] charArray91 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray90, charArray91);
        char[] charArray93 = new char[] {};
        char[] charArray94 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray93, charArray94);
        org.junit.Assert.assertArrayEquals(charArray90, charArray94);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray87, charArray94);
        org.junit.Assert.assertArrayEquals(charArray70, charArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) charArray70);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0d, 1.0d, (double) 4);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 'a', (double) 10, (double) 1.0f);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2936");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) (short) 100);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray1, floatArray12, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (short) 100);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray33, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray23, floatArray33, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray33, (float) 0);
        float[] floatArray42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray42, (-1.0f));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 0L, (double) 100L);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2938");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray14);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray14);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain23 = null;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain23;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests19.assertDocsSkippingEquals("tests.nightly", indexReader26, 100, postingsEnum28, postingsEnum29, false);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass33 = simpleIndexQueryParserTests19.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str35 = simpleIndexQueryParserTests34.getTestName();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = null;
        simpleIndexQueryParserTests34.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests34.assertDocsSkippingEquals("tests.nightly", indexReader41, 100, postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests34.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass48 = simpleIndexQueryParserTests34.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str50 = simpleIndexQueryParserTests49.getTestName();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain53 = null;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests49.assertDocsSkippingEquals("tests.nightly", indexReader56, 100, postingsEnum58, postingsEnum59, false);
        simpleIndexQueryParserTests49.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass63 = simpleIndexQueryParserTests49.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str65 = simpleIndexQueryParserTests64.getTestName();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain68 = null;
        simpleIndexQueryParserTests64.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass71 = simpleIndexQueryParserTests64.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass73 = simpleIndexQueryParserTests72.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray74 = new java.lang.reflect.GenericDeclaration[] { wildcardClass33, wildcardClass48, wildcardClass63, wildcardClass71, wildcardClass73 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet75 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) genericDeclarationArray74);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) 6, (long) '#');
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader13, (int) (byte) 10, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        java.lang.String str25 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests21, (java.lang.Object) locale35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str38 = simpleIndexQueryParserTests37.getTestName();
        org.junit.rules.RuleChain ruleChain39 = null;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain39;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str42 = simpleIndexQueryParserTests41.getTestName();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests41.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain45 = null;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (short) -1, postingsEnum53, postingsEnum54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str58 = simpleIndexQueryParserTests57.getTestName();
        simpleIndexQueryParserTests57.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests57.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests57);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain62;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain62;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain62;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain62);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2941");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray10, byteArray13);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray13);
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray37);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2942");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader13, (int) (byte) 10, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList26, obj27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        simpleIndexQueryParserTests29.assertFieldsEquals("tests.maxfailures", indexReader31, fields32, fields33, false);
        org.junit.Assert.assertNotSame("tests.slow", obj27, (java.lang.Object) simpleIndexQueryParserTests29);
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests29);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) -1);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray24 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures23 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet25 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        java.util.Set<org.junit.rules.TestRule> testRuleSet26 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str29 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        java.lang.String str32 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests28.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests28, (java.lang.Object) locale42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        org.junit.rules.RuleChain ruleChain46 = null;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str49 = simpleIndexQueryParserTests48.getTestName();
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests48.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain52 = null;
        simpleIndexQueryParserTests48.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader58, (int) (short) -1, postingsEnum60, postingsEnum61);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str65 = simpleIndexQueryParserTests64.getTestName();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests64);
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        simpleIndexQueryParserTests48.failureAndSuccessEvents = ruleChain69;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain69;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain69;
        org.junit.rules.TestRule testRule73 = simpleIndexQueryParserTests28.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet26, (java.lang.Object) simpleIndexQueryParserTests28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) true, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale15);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2946");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("random", shortArray17, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray24);
        short[] shortArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray24, shortArray34);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2948");
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
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet15 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray13);
        java.util.Locale[] localeArray16 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray13, (java.lang.Object[]) localeArray16);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2949");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader5, fields6, fields7, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.awaitsfix", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24, false);
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2950");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2951");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray13 = new java.lang.Cloneable[] { locale12 };
        java.util.List<java.lang.Cloneable> cloneableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray13);
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList14, obj15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        org.junit.Assert.assertNotSame("tests.slow", obj15, (java.lang.Object) simpleIndexQueryParserTests17);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests31);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        simpleIndexQueryParserTests31.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests44.assertTermsEquals("tests.maxfailures", indexReader48, terms49, terms50, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str54 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        simpleIndexQueryParserTests53.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("", postingsEnum68, postingsEnum69, true);
        simpleIndexQueryParserTests64.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain73 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain73;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain73;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain73;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str81 = simpleIndexQueryParserTests80.getTestName();
        simpleIndexQueryParserTests80.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests80.ensureCleanedUp();
        java.lang.String str84 = simpleIndexQueryParserTests80.getTestName();
        simpleIndexQueryParserTests80.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests80.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests80.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain90 = simpleIndexQueryParserTests80.failureAndSuccessEvents;
        simpleIndexQueryParserTests80.ensureCheckIndexPassed();
        simpleIndexQueryParserTests80.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests80);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2953");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet4 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = null;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain19;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests12, simpleIndexQueryParserTests15, simpleIndexQueryParserTests21 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet26 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) simpleIndexQueryParserTestsArray25);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2955");
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
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str24 = simpleIndexQueryParserTests23.getTestName();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests23.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests23);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (-1), postingsEnum31, postingsEnum32);
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests36.assertTermsEquals("tests.maxfailures", indexReader40, terms41, terms42, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str46 = simpleIndexQueryParserTests45.getTestName();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests45.ensureCleanedUp();
        java.lang.String str49 = simpleIndexQueryParserTests45.getTestName();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        simpleIndexQueryParserTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader51, fields52, fields53, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests56.assertDocsEnumEquals("", postingsEnum60, postingsEnum61, true);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        simpleIndexQueryParserTests45.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests36.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain65;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.nightly", indexReader75, terms76, terms77, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) terms76, (java.lang.Object) (-1L));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (long) '#');
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 6);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2959");
        java.lang.CharSequence[][][] charSequenceArray1 = new java.lang.CharSequence[][][] {};
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray1);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray11, (java.lang.Object) simpleIndexQueryParserTests13);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray25);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray48 = new java.lang.Cloneable[] { locale47 };
        java.util.List<java.lang.Cloneable> cloneableList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray43, (java.lang.Object[]) cloneableArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray48);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray56, (java.lang.Object[]) cloneableArray61);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { locale72 };
        java.util.List<java.lang.Cloneable> cloneableList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray68, (java.lang.Object[]) cloneableArray73);
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray79 = new java.lang.Cloneable[] { locale78 };
        java.util.List<java.lang.Cloneable> cloneableList80 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray79);
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray84 = new java.lang.Cloneable[] { locale83 };
        java.util.List<java.lang.Cloneable> cloneableList85 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray79, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray68, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray61, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray11);
        java.util.Set<java.lang.Cloneable> cloneableSet92 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charSequenceArray1, (java.lang.Object[]) cloneableArray11);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) terms8);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2961");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 100L, (double) 100.0f);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2963");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2964");
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
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 10, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2965");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2966");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests11.ruleChain;
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain20;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str24 = simpleIndexQueryParserTests23.getTestName();
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("tests.maxfailures", indexReader27, terms28, terms29, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str33 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        java.lang.String str36 = simpleIndexQueryParserTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests32.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertDocsEnumEquals("", postingsEnum47, postingsEnum48, true);
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain52;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("tests.weekly", indexReader56, fields57, fields58, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str62 = simpleIndexQueryParserTests61.getTestName();
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests61.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str68 = simpleIndexQueryParserTests67.getTestName();
        simpleIndexQueryParserTests67.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests67.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests67);
        org.junit.rules.RuleChain ruleChain72 = simpleIndexQueryParserTests67.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain72;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests61, (java.lang.Object) ruleChain72);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain72;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain72;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests23);
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum79, postingsEnum80);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2968");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2969");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (byte) 10);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2970");
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
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = simpleIndexQueryParserTests0.ruleChain;
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList23, obj24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests26.assertFieldsEquals("tests.maxfailures", indexReader28, fields29, fields30, false);
        org.junit.Assert.assertNotSame("tests.slow", obj24, (java.lang.Object) simpleIndexQueryParserTests26);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.setUp();
        java.lang.String str36 = simpleIndexQueryParserTests26.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule17, (java.lang.Object) str36);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2971");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2972");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2975");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2977");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("tests.nightly", indexReader11, 100, postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) 2);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str27 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        java.lang.String str30 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests26.setUp();
        java.lang.String str34 = simpleIndexQueryParserTests26.getTestName();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.badapples", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("tests.failfast", postingsEnum42, postingsEnum43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("europarl.lines.txt.gz", indexReader47, terms48, terms49, true);
        simpleIndexQueryParserTests26.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str56 = simpleIndexQueryParserTests55.getTestName();
        simpleIndexQueryParserTests55.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests55);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain60;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain60;
        org.junit.rules.RuleChain ruleChain63 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain63;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str66 = simpleIndexQueryParserTests65.getTestName();
        simpleIndexQueryParserTests65.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests65.ensureCleanedUp();
        java.lang.String str69 = simpleIndexQueryParserTests65.getTestName();
        simpleIndexQueryParserTests65.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests65.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests65.setUp();
        simpleIndexQueryParserTests65.resetCheckIndexStatus();
        java.lang.String str76 = simpleIndexQueryParserTests65.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) str76);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2978");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        org.junit.rules.RuleChain ruleChain19 = null;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain19;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = null;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain25;
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (short) -1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str38 = simpleIndexQueryParserTests37.getTestName();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests37.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests37);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain42;
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues50, numericDocValues51);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2979");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2980");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 100L);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2982");
        double[][][][] doubleArray0 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray0);
        java.util.Set<java.io.Serializable[]> serializableArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) doubleArray0);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.lang.Object obj9 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList8, obj9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList15, obj16);
        java.lang.Iterable[] iterableArray19 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray20 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray19;
        cloneableIterableArray20[0] = cloneableList8;
        cloneableIterableArray20[1] = cloneableList15;
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList29, obj30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.lang.Object obj37 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList36, obj37);
        java.lang.Iterable[] iterableArray40 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray41 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray40;
        cloneableIterableArray41[0] = cloneableList29;
        cloneableIterableArray41[1] = cloneableList36;
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray49 = new java.lang.Cloneable[] { locale48 };
        java.util.List<java.lang.Cloneable> cloneableList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray49);
        java.lang.Object obj51 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList50, obj51);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        java.lang.Object obj58 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList57, obj58);
        java.lang.Iterable[] iterableArray61 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray62 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray61;
        cloneableIterableArray62[0] = cloneableList50;
        cloneableIterableArray62[1] = cloneableList57;
        java.lang.Iterable[][] iterableArray68 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray69 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray68;
        cloneableIterableArray69[0] = cloneableIterableArray20;
        cloneableIterableArray69[1] = cloneableIterableArray41;
        cloneableIterableArray69[2] = cloneableIterableArray62;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray69);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) cloneableIterableArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray0, (java.lang.Object[]) cloneableIterableArray69);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 0.0f);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (short) 0);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2986");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        double[] doubleArray10 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        double[] doubleArray15 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        double[] doubleArray20 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray20 };
        double[] doubleArray25 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        double[] doubleArray30 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray31 = new double[][] { doubleArray30 };
        double[] doubleArray35 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray36 = new double[][] { doubleArray35 };
        double[][][] doubleArray37 = new double[][][] { doubleArray11, doubleArray16, doubleArray21, doubleArray26, doubleArray31, doubleArray36 };
        java.util.Set<double[][]> doubleArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests40);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests40.assertPositionsSkippingEquals("tests.maxfailures", indexReader46, (-1), postingsEnum48, postingsEnum49);
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) doubleArray37, (java.lang.Object) simpleIndexQueryParserTests40);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) doubleArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray37);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2988");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        java.lang.String str16 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests12.setUp();
        java.lang.String str20 = simpleIndexQueryParserTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.badapples", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.failfast", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader33, terms34, terms35, true);
        org.junit.rules.TestRule testRule38 = simpleIndexQueryParserTests12.ruleChain;
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray40);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray46 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, luceneTestCaseArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) luceneTestCaseArray46);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 1);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2990");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray7, intArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray15, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray20, intArray31);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray36, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray36, intArray41);
        org.junit.Assert.assertArrayEquals(intArray20, intArray41);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        double[] doubleArray49 = new double[] { 'a', 10.0d };
        double[] doubleArray52 = new double[] { 'a', 10.0d };
        double[] doubleArray55 = new double[] { 'a', 10.0d };
        double[] doubleArray58 = new double[] { 'a', 10.0d };
        double[] doubleArray61 = new double[] { 'a', 10.0d };
        double[][] doubleArray62 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        java.util.List<double[]> doubleArrayList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray62);
        java.util.Set<double[]> doubleArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray62);
        java.util.Set<double[]> doubleArraySet65 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray9, (java.lang.Object) doubleArraySet65);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str68 = simpleIndexQueryParserTests67.getTestName();
        simpleIndexQueryParserTests67.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests67.ensureCleanedUp();
        java.lang.String str71 = simpleIndexQueryParserTests67.getTestName();
        simpleIndexQueryParserTests67.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests67.assertPositionsSkippingEquals("<unknown>", indexReader75, (int) '4', postingsEnum77, postingsEnum78);
        simpleIndexQueryParserTests67.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        simpleIndexQueryParserTests67.assertDocsEnumEquals("tests.maxfailures", postingsEnum82, postingsEnum83, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) intArray9, (java.lang.Object) simpleIndexQueryParserTests67);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) '#');
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1.0f), (double) (short) 100, (double) (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2997");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2998");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) boolean14);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2999");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("hi!", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("random", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests36);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (-1), postingsEnum44, postingsEnum45);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests36);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test3000");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests5.assertDocsSkippingEquals("tests.failfast", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests5.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20);
    }
}

