import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3001");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        dummyQuery1.isFilter = false;
        org.apache.lucene.search.Query query5 = dummyQuery1.clone();
        boolean boolean6 = dummyQuery1.isFilter;
        java.lang.String str8 = dummyQuery1.toString("random");
        java.lang.String str10 = dummyQuery1.toString("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) dummyQuery1);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3002");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3003");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService12);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("DummyQuery", postingsEnum17, postingsEnum18, false);
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3004");
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
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1.0d, (double) 0L, (double) 0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3006");
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
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.search.Query query49 = dummyQuery1.rewrite(indexReader48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests50);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.maxfailures");
        simpleIndexQueryParserTests50.assertFieldStatisticsEquals("random", fields58, fields66);
        simpleIndexQueryParserTests50.setUp();
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain69;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) indexReader48, (java.lang.Object) ruleChain69);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3007");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '#', (long) 1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        dummyQuery1.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.search.Query query10 = dummyQuery1.rewrite(indexReader9);
        query10.setBoost((float) (byte) 100);
        float float13 = query10.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) query10);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3010");
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
        java.util.Locale[] localeArray51 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray47, (java.lang.Object[]) localeArray51);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3011");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray26);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray26);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures37);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures39);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures41);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures43);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray45 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures33, testRuleIgnoreAfterMaxFailures35, testRuleIgnoreAfterMaxFailures37, testRuleIgnoreAfterMaxFailures40, testRuleIgnoreAfterMaxFailures42, testRuleIgnoreAfterMaxFailures43 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures46);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures50);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures52 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures52);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures55 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures54);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures56 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures57 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures56);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray58 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures46, testRuleIgnoreAfterMaxFailures48, testRuleIgnoreAfterMaxFailures50, testRuleIgnoreAfterMaxFailures53, testRuleIgnoreAfterMaxFailures55, testRuleIgnoreAfterMaxFailures56 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures59 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures60 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures59);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures61 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures62 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures61);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures63 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures64 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures63);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures65);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures68 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures67);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures69 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures70 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures69);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray71 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures59, testRuleIgnoreAfterMaxFailures61, testRuleIgnoreAfterMaxFailures63, testRuleIgnoreAfterMaxFailures66, testRuleIgnoreAfterMaxFailures68, testRuleIgnoreAfterMaxFailures69 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures72 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures73 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures72);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures74 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures75 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures74);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures76 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures77 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures76);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures78 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures79 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures78);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures80 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures81 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures80);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures82 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures83 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures82);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray84 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures72, testRuleIgnoreAfterMaxFailures74, testRuleIgnoreAfterMaxFailures76, testRuleIgnoreAfterMaxFailures79, testRuleIgnoreAfterMaxFailures81, testRuleIgnoreAfterMaxFailures82 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray85 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray45, testRuleIgnoreAfterMaxFailuresArray58, testRuleIgnoreAfterMaxFailuresArray71, testRuleIgnoreAfterMaxFailuresArray84 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray85);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3012");
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
        simpleIndexQueryParserTests3.testEmptyBooleanQuery();
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3013");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("", indexReader41, 1, postingsEnum43, postingsEnum44);
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests38.queryParser = indexQueryParserService48;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService48);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3014");
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
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader39, 3, postingsEnum41, postingsEnum42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean45 = dummyQuery44.isFilter;
        org.apache.lucene.search.Query query46 = dummyQuery44.clone();
        dummyQuery44.isFilter = false;
        boolean boolean49 = dummyQuery44.getisFilter();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.search.Query query51 = dummyQuery44.rewrite(indexReader50);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean53 = dummyQuery52.getisFilter();
        java.lang.String str54 = dummyQuery52.toString();
        org.apache.lucene.search.Query query55 = dummyQuery52.clone();
        dummyQuery52.setBoost((float) (-1L));
        float float58 = dummyQuery52.getBoost();
        boolean boolean59 = dummyQuery52.getisFilter();
        dummyQuery52.isFilter = true;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.search.Query query63 = dummyQuery52.rewrite(indexReader62);
        boolean boolean64 = dummyQuery52.isFilter;
        boolean boolean65 = query51.equals((java.lang.Object) dummyQuery52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) 3, (java.lang.Object) boolean65);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '4', (double) (short) 100, 10.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3016");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray2, longArray11);
        long[] longArray19 = new long[] { 0, 4, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray19);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3017");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader24, 100, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean34 = dummyQuery33.getisFilter();
        java.lang.String str35 = dummyQuery33.toString();
        boolean boolean37 = dummyQuery33.equals((java.lang.Object) 0.0f);
        boolean boolean38 = dummyQuery33.getisFilter();
        java.lang.String str39 = dummyQuery33.toString();
        boolean boolean40 = dummyQuery33.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) dummyQuery33);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3018");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3019");
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
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3020");
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
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3022");
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
        org.apache.lucene.util.BytesRef bytesRef75 = simpleIndexQueryParserTests72.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests76.failureAndSuccessEvents;
        simpleIndexQueryParserTests72.failureAndSuccessEvents = ruleChain77;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = simpleIndexQueryParserTests72.getqueryParser();
        org.junit.rules.RuleChain ruleChain80 = simpleIndexQueryParserTests72.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain80;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain80;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum84, postingsEnum85);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray13, longArray15);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray13, longArray22);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray35, longArray37);
        org.junit.Assert.assertArrayEquals(longArray28, longArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray22, longArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 10.0f);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3025");
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
        java.lang.String str13 = dummyQuery1.toString("europarl.lines.txt.gz");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests14.indexedValueForSearch(10L);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests14.queryParser = indexQueryParserService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("<unknown>", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("", indexReader27, 10, postingsEnum29, postingsEnum30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) str13, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3026");
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
        java.lang.Class<?> wildcardClass24 = simpleIndexQueryParserTests1.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests25.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests25.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) bytesRef31);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3027");
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
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray21);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray40, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray40, shortArray44);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray50, shortArray51);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray50, shortArray54);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray40, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray40);
        short[] shortArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray21, shortArray61);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10, (double) 10L);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3029");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests2.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14);
        java.lang.String str16 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) true, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3032");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests18);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.maxfailures");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("random", fields26, fields34);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray63, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray55);
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader17, fields26, fields79, false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3033");
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
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3034");
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
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3035");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3036");
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
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "hi!");
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray57);
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "europarl.lines.txt.gz");
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "europarl.lines.txt.gz");
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray72, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray64, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray49);
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray1, (java.lang.Object[]) strArray49);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3037");
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
        java.lang.String str43 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean46 = dummyQuery45.getisFilter();
        java.lang.String str47 = dummyQuery45.toString();
        org.apache.lucene.search.Query query48 = dummyQuery45.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests49);
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests49.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests49.getqueryParser();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        boolean boolean58 = dummyQuery45.equals((java.lang.Object) simpleIndexQueryParserTests49);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests49.assertDocsEnumEquals("tests.badapples", postingsEnum60, postingsEnum61, false);
        simpleIndexQueryParserTests49.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef67 = simpleIndexQueryParserTests49.indexedValueForSearch((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 1);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3038");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray6, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray25, shortArray29);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray35, shortArray39);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray25, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests46);
        simpleIndexQueryParserTests46.resetCheckIndexStatus();
        simpleIndexQueryParserTests46.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray17, (java.lang.Object) simpleIndexQueryParserTests46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests46.testConstantScoreParsesFilter();
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3041");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 5);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3043");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService8);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, (int) ' ');
        java.lang.String str16 = simpleIndexQueryParserTests1.getTestName();
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
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("hi!", indexReader41, terms42, terms43, true);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests48);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.maxfailures");
        simpleIndexQueryParserTests48.assertFieldStatisticsEquals("random", fields56, fields64);
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests48.assertDocsEnumEquals("hi!", postingsEnum67, postingsEnum68, true);
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.maxfailures");
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests48.assertFieldStatisticsEquals("", fields79, fields87);
        org.junit.rules.RuleChain ruleChain89 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain89;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain89;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef94 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        java.lang.String str4 = dummyQuery2.toString();
        org.apache.lucene.search.Query query5 = dummyQuery2.clone();
        dummyQuery2.setBoost((float) (-1L));
        dummyQuery2.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str12 = dummyQuery10.toString();
        boolean boolean14 = dummyQuery10.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query15 = dummyQuery10.clone();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) dummyQuery2, (java.lang.Object) dummyQuery10);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.search.Query query18 = dummyQuery2.rewrite(indexReader17);
        boolean boolean19 = dummyQuery2.getisFilter();
        java.lang.String str21 = dummyQuery2.toString("");
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.search.Query query23 = dummyQuery2.rewrite(indexReader22);
        boolean boolean24 = dummyQuery2.isFilter;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.search.Query query26 = dummyQuery2.rewrite(indexReader25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests27);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.maxfailures");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("random", fields35, fields43);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, true);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.maxfailures");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("", fields58, fields66);
        simpleIndexQueryParserTests27.setUp();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("tests.slow", indexReader70, (int) (short) 0, postingsEnum72, postingsEnum73, false);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("tests.failfast", indexReader77, (int) '#', postingsEnum79, postingsEnum80, false);
        org.apache.lucene.util.BytesRef bytesRef84 = simpleIndexQueryParserTests27.indexedValueForSearch(0L);
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService86 = simpleIndexQueryParserTests27.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) dummyQuery2, (java.lang.Object) indexQueryParserService86);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3046");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10.0d, (double) ' ', 0.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3049");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) shortArray20);
        short[] shortArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray24);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3050");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0, (double) 0L);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3052");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("DummyQuery", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests2.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests2.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests13.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests13.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests13.getqueryParser();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain21;
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0d, (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService25;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService27;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean31 = dummyQuery30.getisFilter();
        java.lang.String str32 = dummyQuery30.toString();
        boolean boolean34 = dummyQuery30.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query35 = dummyQuery30.clone();
        org.apache.lucene.search.Query query36 = query35.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests37.assertDocsEnumEquals("DummyQuery", postingsEnum39, postingsEnum40, false);
        simpleIndexQueryParserTests37.setUp();
        simpleIndexQueryParserTests37.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests37.ensureCheckIndexPassed();
        java.lang.String str46 = simpleIndexQueryParserTests37.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests37.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests48);
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests48.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef54 = simpleIndexQueryParserTests48.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests48.getqueryParser();
        org.junit.rules.RuleChain ruleChain56 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain56;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query35, (java.lang.Object) simpleIndexQueryParserTests37);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests37.assertDocsSkippingEquals("", indexReader60, (int) (short) 0, postingsEnum62, postingsEnum63, true);
        simpleIndexQueryParserTests37.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests37);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3053");
        long[] longArray5 = new long[] { 1, 'a', 3, (byte) 100, 100L };
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray10, longArray12);
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3054");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray23);
        org.junit.Assert.assertArrayEquals("random", intArray16, intArray20);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("hi!", intArray29, intArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray16, intArray29);
        org.junit.Assert.assertArrayEquals(intArray3, intArray16);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray41, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray41, intArray47);
        org.junit.Assert.assertArrayEquals("", intArray3, intArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean53 = dummyQuery52.getisFilter();
        dummyQuery52.isFilter = true;
        java.lang.String str57 = dummyQuery52.toString("tests.maxfailures");
        java.lang.String str59 = dummyQuery52.toString("hi!");
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.search.Query query61 = dummyQuery52.rewrite(indexReader60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) intArray3, (java.lang.Object) indexReader60);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3055");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3056");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", objArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3057");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        java.lang.String str4 = dummyQuery2.toString();
        boolean boolean6 = dummyQuery2.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query7 = dummyQuery2.clone();
        org.apache.lucene.search.Query query8 = query7.clone();
        float float9 = query7.getBoost();
        float[] floatArray15 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray21 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray21, (float) 100L);
        boolean boolean24 = query7.equals((java.lang.Object) floatArray15);
        float[] floatArray31 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray37 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray37, (float) 100L);
        float[] floatArray45 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray51 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray51, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray31, floatArray45, (float) 0L);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray15, floatArray45, (float) (short) 1);
        float[] floatArray63 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray69 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray69, (float) 100L);
        float[] floatArray77 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray83 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray83, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray83, (float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean89 = dummyQuery88.isFilter;
        org.apache.lucene.search.Query query90 = dummyQuery88.clone();
        boolean boolean91 = dummyQuery88.isFilter;
        org.apache.lucene.search.Query query92 = dummyQuery88.clone();
        org.apache.lucene.index.IndexReader indexReader93 = null;
        org.apache.lucene.search.Query query94 = query92.rewrite(indexReader93);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray83, (java.lang.Object) indexReader93);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray45, floatArray83, (float) (short) 1);
    }
}

