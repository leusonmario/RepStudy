import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3504");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        java.lang.String str12 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.setUp();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests15);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain26;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain26;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.String str6 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests7.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) str6, (java.lang.Object) testRule10);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3507");
        java.lang.Object obj1 = null;
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
        java.lang.String str22 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", obj1, (java.lang.Object) str22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3508");
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
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testMLTMinimumShouldMatch();
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3510");
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
        double[] doubleArray14 = new double[] { (byte) 10 };
        double[] doubleArray16 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray16, (double) ' ');
        double[] doubleArray21 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) ' ');
        double[] doubleArray28 = new double[] { (byte) 10 };
        double[] doubleArray30 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray30, (double) ' ');
        double[] doubleArray34 = new double[] { (byte) 10 };
        double[] doubleArray36 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray36, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray30, doubleArray36, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray36, (double) 10);
        double[] doubleArray44 = new double[] { (byte) 10 };
        double[] doubleArray46 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) ' ');
        double[] doubleArray51 = new double[] { (byte) 10 };
        double[] doubleArray53 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray53, (double) ' ');
        double[] doubleArray57 = new double[] { (byte) 10 };
        double[] doubleArray59 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray59, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray53, doubleArray59, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray59, (double) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray36, doubleArray46, (double) 100L);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray16, doubleArray46, (double) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testTermsQueryBuilder();
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) ' ');
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3513");
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
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests6.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests6.assertDocValuesEquals("tests.failfast", (int) (short) 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 3, (double) (-1.0f));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3515");
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
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testMoreLikeThisBuilder();
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3518");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule23;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule23;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertDocsSkippingEquals("<unknown>", indexReader28, (int) (short) -1, postingsEnum30, postingsEnum31, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule23, (java.lang.Object) postingsEnum30);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3520");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testOrFilteredQueryBuilder();
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3521");
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
        double[] doubleArray20 = new double[] { (byte) 10 };
        double[] doubleArray22 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray22, (double) ' ');
        double[] doubleArray26 = new double[] { (byte) 10 };
        double[] doubleArray28 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray28, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray15, (java.lang.Object) doubleArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray35, throttlingArray36, throttlingArray37, throttlingArray38 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray40, throttlingArray41, throttlingArray42, throttlingArray43 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray45, throttlingArray46, throttlingArray47, throttlingArray48 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray39, throttlingArray44, throttlingArray49 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, throttlingArray50);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) throttlingArray50);
    }
}

