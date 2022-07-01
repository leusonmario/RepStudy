import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        long[] longArray2 = new long[] { 3, '#' };
        long[] longArray8 = new long[] { (-1L), 6, 0L, 100L, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray24);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) -1 };
        short[] shortArray7 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray5, shortArray17);
        short[] shortArray32 = new short[] { (short) -1 };
        short[] shortArray34 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray38 = new short[] { (short) -1 };
        short[] shortArray40 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (short) -1 };
        short[] shortArray45 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray38, shortArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray34, shortArray43);
        short[] shortArray51 = new short[] { (short) -1 };
        short[] shortArray53 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (short) -1 };
        short[] shortArray58 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray58);
        short[] shortArray63 = new short[] { (short) -1 };
        short[] shortArray65 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray68 = new short[] { (short) -1 };
        short[] shortArray70 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray63, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray51, shortArray63);
        org.junit.Assert.assertArrayEquals("", shortArray43, shortArray51);
        short[] shortArray76 = new short[] { (short) -1 };
        short[] shortArray78 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray78);
        short[] shortArray81 = new short[] { (short) -1 };
        short[] shortArray83 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray83);
        org.junit.Assert.assertArrayEquals("", shortArray43, shortArray76);
        org.junit.Assert.assertArrayEquals("hi!", shortArray5, shortArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray43);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader27, terms28, terms29, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureCheckIndexPassed();
        simpleIndexQueryParserTests32.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("tests.monster", indexReader37, terms38, terms39, false);
        java.lang.String str42 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.setUp();
        java.lang.String str44 = simpleIndexQueryParserTests32.getTestName();
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests32.ruleChain;
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule49 = simpleIndexQueryParserTests32.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) "", (java.lang.Object) testRule49);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        long[] longArray1 = new long[] { 2 };
        long[] longArray7 = new long[] { 100, 0, 1L, 6, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain18, (java.lang.Object) (-1L));
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain18, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 2);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 1, 0L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 10.0f, (double) 3, 1.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 5);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
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
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray51, intArray53);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray59, intArray61);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray51, intArray59);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray69, intArray71);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray77, intArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray69, intArray77);
        org.junit.Assert.assertArrayEquals(intArray51, intArray69);
        org.junit.Assert.assertArrayEquals(intArray41, intArray69);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) intArray69);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests2.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.failfast", indexReader23, 10, postingsEnum25, postingsEnum26);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray28 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests2, simpleIndexQueryParserTests7, simpleIndexQueryParserTests10, simpleIndexQueryParserTests12 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet29 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray28);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) luceneTestCaseArray28);
        java.util.Set<org.junit.Assert> assertSet31 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) luceneTestCaseArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) assertSet31);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1L, 100.0d, (double) (byte) 10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        long[] longArray3 = new long[] { 10, 1L, 1L };
        long[] longArray5 = new long[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { (byte) 100, (byte) 1, 2, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray5);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("<unknown>", postingsEnum26, postingsEnum27, true);
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule31 = simpleIndexQueryParserTests22.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray17, (java.lang.Object) testRule31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        simpleIndexQueryParserTests53.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader59, (int) 'a', postingsEnum61, postingsEnum62, false);
        org.junit.rules.RuleChain ruleChain65 = null;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain65;
        java.lang.String str67 = simpleIndexQueryParserTests53.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "<unknown>", (java.lang.Object) simpleIndexQueryParserTests53);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
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
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 1);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray22, floatArray25, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray25, (float) 0);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray35, floatArray38, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray8, floatArray38, (-1.0f));
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 1);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray51, (float) '#');
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray58, (float) (byte) 10);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) (short) 1);
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray69, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray65, floatArray68, (float) '#');
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray75, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray75, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray38, floatArray51, (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6, throttling7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray2, throttlingArray5, throttlingArray8, throttlingArray11, throttlingArray14, throttlingArray17 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) executorServiceArray26, (java.lang.Object) 1.0f);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
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
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray63);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) executorServiceArray81, (java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) executorServiceArray26);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("tests.badapples", postingsEnum7, postingsEnum8, false);
        simpleIndexQueryParserTests3.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "hi!", (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (short) 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        long[] longArray6 = new long[] { 1, 10, 10, 0L, (short) 0, 6 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6, throttling7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray2, throttlingArray5, throttlingArray8, throttlingArray11, throttlingArray14, throttlingArray17 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
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
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray64);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) executorServiceArray70);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 1);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray5, floatArray8, (float) '#');
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 1);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray18, floatArray21, (float) '#');
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray28, (float) (byte) 10);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray35, floatArray38, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray38, (float) 0);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 1);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray51, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray21, floatArray51, (-1.0f));
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) (short) 1);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray61, floatArray64, (float) (-1L));
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray51, floatArray64, 10.0f);
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) (short) 1);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray74, floatArray77, (float) '#');
        float[] floatArray83 = new float[] {};
        float[] floatArray84 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray84, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray84, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray84, (float) 0);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray51, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray5, (float) (byte) -1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        long[] longArray2 = new long[] { 6, (byte) -1 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling69, throttling70, throttling71 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray76 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73, throttling74, throttling75 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray77 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray72, throttlingArray76 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray77 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray78);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) throttlingArray78);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) ' ', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
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
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("random", charArray45, charArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray38, charArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray19, charArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray19);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 1);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray7, (float) '#');
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray14, (float) (byte) 10);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) (short) 1);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray24, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, (float) 0);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) (short) 1);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray34, floatArray37, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray7, floatArray37, (-1.0f));
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 1);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray47, floatArray50, (float) '#');
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray57, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray50, (float) (short) 100);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 1);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray66, floatArray69, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray69, (float) (-1));
        java.lang.Object obj77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (-1), obj77);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader4, (int) (byte) 0, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 6, (double) '4', (double) 0.0f);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        long[] longArray2 = new long[] { ' ' };
        long[] longArray4 = new long[] { 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray2, longArray4);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryQueryBuilder();
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
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
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) 'a');
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray46, doubleArray51, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray46, (double) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests58.ensureCheckIndexPassed();
        simpleIndexQueryParserTests58.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests58.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("tests.monster", indexReader63, terms64, terms65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        simpleIndexQueryParserTests58.assertFieldsEquals("hi!", indexReader69, fields70, fields71, false);
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain75 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain76 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray46, (java.lang.Object) simpleIndexQueryParserTests58);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader7, fields8, fields9, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("node_s_0", postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        java.lang.String str21 = simpleIndexQueryParserTests12.getTestName();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests12.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (short) 10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.ensureCheckIndexPassed();
        simpleIndexQueryParserTests47.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests47.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("tests.monster", indexReader52, terms53, terms54, false);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.failfast", indexReader58, 10, postingsEnum60, postingsEnum61);
        simpleIndexQueryParserTests47.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests47.assertDocsSkippingEquals("tests.monster", indexReader65, (int) (byte) 100, postingsEnum67, postingsEnum68, false);
        simpleIndexQueryParserTests47.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) intArray30, (java.lang.Object) simpleIndexQueryParserTests47);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) 'a');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) 'a');
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray5, doubleArray10, (double) 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray16, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray16, (double) 0.0f);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray25, doubleArray30, (double) 0);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray36, (double) '4');
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) 'a');
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray42, doubleArray47, (double) 0);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) 'a');
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray57, doubleArray62, (double) 0);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray68, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray68, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray68, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray52, 10.0d);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray25, doubleArray52, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray25, (-1.0d));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests81.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        simpleIndexQueryParserTests81.assertDocsEnumEquals("<unknown>", postingsEnum85, postingsEnum86, true);
        simpleIndexQueryParserTests81.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule90 = simpleIndexQueryParserTests81.ruleChain;
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum95 = null;
        simpleIndexQueryParserTests81.assertDocsSkippingEquals("tests.weekly", indexReader92, (int) 'a', postingsEnum94, postingsEnum95, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray16, (java.lang.Object) indexReader92);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
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
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) executorServiceArray31);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, 10.0d, (double) (short) 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0, (double) 'a');
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 1, (long) 10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] { (short) -1 };
        short[] shortArray7 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray5, shortArray17);
        short[] shortArray29 = new short[] { (short) -1 };
        short[] shortArray31 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray29);
        short[] shortArray36 = new short[] { (short) -1 };
        short[] shortArray38 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        short[] shortArray41 = new short[] { (short) -1 };
        short[] shortArray43 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray36);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
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
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("tests.failfast", indexReader24, terms25, terms26, true);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests18.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        long[] longArray2 = new long[] { 2 };
        long[] longArray7 = new long[] { 5, (short) 10, 1L, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray2, longArray7);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
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
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
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
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray21);
        short[][] shortArray24 = new short[][] {};
        java.util.Set<short[]> shortArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) shortArray24);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        java.lang.Object[] objArray1 = null;
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
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", objArray1, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray51);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray60, charArray65);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals("random", charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray70, charArray81);
        org.junit.Assert.assertArrayEquals("hi!", charArray60, charArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean55, (java.lang.Object) charArray60);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, 3, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        java.lang.String str22 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.setUp();
        java.lang.String str24 = simpleIndexQueryParserTests12.getTestName();
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests12.ruleChain;
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray34, byteArray43);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.ensureCheckIndexPassed();
        simpleIndexQueryParserTests47.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule50 = simpleIndexQueryParserTests47.ruleChain;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("hi!", indexReader52, terms53, terms54, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) byteArray43, (java.lang.Object) "hi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) 100);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        long[] longArray2 = new long[] { 0 };
        long[] longArray8 = new long[] { (-1), 10, (byte) 0, 3, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray2, longArray8);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) -1 };
        short[] shortArray7 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray11 = new short[] { (short) -1 };
        short[] shortArray13 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray13, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray5, shortArray13);
        short[] shortArray33 = new short[] { (short) -1 };
        short[] shortArray35 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        short[] shortArray39 = new short[] { (short) -1 };
        short[] shortArray41 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        short[] shortArray44 = new short[] { (short) -1 };
        short[] shortArray46 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray39, shortArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray35, shortArray44);
        short[] shortArray52 = new short[] { (short) -1 };
        short[] shortArray54 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (short) -1 };
        short[] shortArray59 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray59);
        short[] shortArray64 = new short[] { (short) -1 };
        short[] shortArray66 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray66);
        short[] shortArray69 = new short[] { (short) -1 };
        short[] shortArray71 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray64, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray52, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray44, shortArray52);
        short[] shortArray77 = new short[] { (short) -1 };
        short[] shortArray79 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray79);
        short[] shortArray82 = new short[] { (short) -1 };
        short[] shortArray84 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray84);
        org.junit.Assert.assertArrayEquals("", shortArray44, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray77);
        short[] shortArray90 = new short[] { (short) -1 };
        short[] shortArray92 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray90, shortArray92);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray1, shortArray13);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader18, fields19, fields20, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests23.ensureCleanedUp();
        java.lang.String str27 = simpleIndexQueryParserTests23.getTestName();
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) simpleIndexQueryParserTests23);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 100, (double) 0.0f);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        float[] floatArray1 = null;
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 1);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray9, (float) '#');
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray16, (float) (byte) 10);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 1);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray23, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray26, (float) 0);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 1);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray36, floatArray39, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray9, floatArray39, (-1.0f));
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 1);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray49, floatArray52, (float) (-1L));
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray39, floatArray52, 10.0f);
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 1);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray62, floatArray65, (float) '#');
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray72, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray72, (float) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray39, (float) (byte) 1);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) (byte) 10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, (int) (short) 10, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) 'a');
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) 'a');
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray26, (double) 0);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray32, (double) 0.0f);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) doubleArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) ruleChain5, (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        java.lang.Object obj7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 1, obj7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
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
        simpleIndexQueryParserTests53.testFuzzyQueryBuilder();
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1.0d, (double) 1);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader36, 0, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues43, numericDocValues44);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10.0f, (double) 4);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader4, (int) (byte) 0, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, true);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray28, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray30, charArray35);
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
        org.junit.Assert.assertArrayEquals("hi!", charArray30, charArray40);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray60, charArray65);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals("random", charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray70, charArray81);
        org.junit.Assert.assertArrayEquals("hi!", charArray60, charArray70);
        org.junit.Assert.assertArrayEquals(charArray40, charArray60);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray91, charArray92);
        org.junit.Assert.assertArrayEquals("random", charArray88, charArray92);
        org.junit.Assert.assertArrayEquals(charArray40, charArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields23, (java.lang.Object) charArray40);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 5);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader9, terms10, terms11, true);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0L, (long) (short) 10);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
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
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) 'a');
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray47, doubleArray52, (double) 0);
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
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray69, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray47, doubleArray69, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray69, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray61);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray36);
        java.util.Set<java.lang.Object> objSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray36);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
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
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray19);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
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
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray41, (double) (-1.0f));
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 'a');
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray48, doubleArray53, (double) 0);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) 'a');
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray59, doubleArray64, (double) 0);
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray70, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray48, doubleArray70, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray70, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) doubleArray70);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (double) '4');
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        long[] longArray3 = new long[] { '#', 1L, (byte) 0 };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 0, 1.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 100, 1.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 'a');
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", 2, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader8, fields9, fields10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str14 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests15.ruleChain;
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests15.assertFieldsEquals("tests.monster", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests28.assertDocsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33, false);
        simpleIndexQueryParserTests28.setUp();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        short[] shortArray5 = new short[] { (short) -1 };
        short[] shortArray7 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray10);
        short[] shortArray16 = new short[] { (short) -1 };
        short[] shortArray18 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
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
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray22, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray22);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray5, shortArray22);
        short[] shortArray49 = new short[] { (short) -1 };
        short[] shortArray51 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        short[] shortArray54 = new short[] { (short) -1 };
        short[] shortArray56 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray56);
        org.junit.Assert.assertArrayEquals("random", shortArray22, shortArray49);
        short[] shortArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray49, shortArray60);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, 1.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader7, (int) 'a', postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader14, terms15, terms16, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests9.ruleChain;
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.monster", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests22.setUp();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 0, numericDocValues40, numericDocValues41);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) 'a', (java.lang.Object) executorServiceArray41);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
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
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.slow", postingsEnum20, postingsEnum21, false);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) testRule24);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 2);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 'a', (double) 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
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
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray20, (double) (byte) 10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 5, (byte) 10, (-1), 5, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
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
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 2, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
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
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests14, (java.lang.Object) ruleChain21);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain21;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray12, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray20);
        org.junit.Assert.assertArrayEquals("random", byteArray7, byteArray20);
        byte[] byteArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray28);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        char[] charArray0 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals("random", charArray22, charArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray15, charArray26);
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray15);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("random", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals(charArray5, charArray32);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("hi!", charArray41, charArray45);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("random", charArray50, charArray54);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("hi!", charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray50, charArray62);
        org.junit.Assert.assertArrayEquals(charArray45, charArray62);
        org.junit.Assert.assertArrayEquals(charArray5, charArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray45);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        char[] charArray0 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray3, charArray10);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) charArray14, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray10, charArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray14);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
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
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray27);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) throttlingArray3, (java.lang.Object) executorServiceArray8);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray25);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("<unknown>", postingsEnum34, postingsEnum35, true);
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests30.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray25, (java.lang.Object) testRule39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray56);
        int[] intArray63 = new int[] { 1 };
        int[] intArray65 = new int[] { 1 };
        int[] intArray67 = new int[] { 1 };
        int[] intArray69 = new int[] { 1 };
        int[] intArray71 = new int[] { 1 };
        int[][] intArray72 = new int[][] { intArray63, intArray65, intArray67, intArray69, intArray71 };
        int[][][] intArray73 = new int[][][] { intArray72 };
        int[][][][] intArray74 = new int[][][][] { intArray73 };
        java.util.Set<int[][][]> intArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(intArray74);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) intArray74);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 3, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1.0d), (double) (byte) 1);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("hi!", charArray4, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("random", charArray17, charArray21);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("hi!", charArray25, charArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray17, charArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray13, charArray17);
        org.junit.Assert.assertArrayEquals(charArray8, charArray13);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("random", charArray36, charArray40);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("random", charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray45, charArray56);
        org.junit.Assert.assertArrayEquals(charArray40, charArray56);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray8, charArray56);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) charArray56, (java.lang.Object) "<unknown>");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule68 = simpleIndexQueryParserTests64.ruleChain;
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        java.lang.String str72 = simpleIndexQueryParserTests64.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "<unknown>", (java.lang.Object) simpleIndexQueryParserTests64);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("<unknown>", postingsEnum18, postingsEnum19, true);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests14.ruleChain;
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("", indexReader28, 0, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("tests.awaitsfix", indexReader34, (-1), postingsEnum36, postingsEnum37, false);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray3, (java.lang.Object) ruleChain40);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        java.lang.Object obj0 = null;
        double[] doubleArray6 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray12 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray18 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray24 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray30 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray36 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[][] doubleArray37 = new double[][] { doubleArray6, doubleArray12, doubleArray18, doubleArray24, doubleArray30, doubleArray36 };
        java.util.Set<double[]> doubleArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) doubleArray37);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (byte) 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        char[] charArray0 = null;
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("random", charArray13, charArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray17);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray17, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("random", charArray26, charArray30);
        org.junit.Assert.assertArrayEquals("", charArray17, charArray30);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray38, charArray43);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("random", charArray55, charArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray48, charArray59);
        org.junit.Assert.assertArrayEquals("hi!", charArray38, charArray48);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals("random", charArray65, charArray69);
        org.junit.Assert.assertArrayEquals(charArray38, charArray65);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray17, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray17);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (-1), 100L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) 'a', postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (-1), numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray12);
        byte[] byteArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray16);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 1);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray6, (float) '#');
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 1);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray17, (float) '#');
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray24, (float) (byte) 10);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 1);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray31, floatArray34, (float) '#');
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray41, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray41, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray17, (float) (-1));
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray52, floatArray55, (float) '#');
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray62, (float) (byte) 10);
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray69, (float) (short) 1);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray69, floatArray72, (float) '#');
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray79, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray79, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray79, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray79, (float) 1);
        float[] floatArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray79, floatArray88, (float) ' ');
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray8 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray10 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[] strArray12 = new java.lang.String[] { "enwiki.random.lines.txt" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray8, strArray10, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArraySet14);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        long[] longArray3 = new long[] { (short) 10, (-1) };
        long[] longArray5 = new long[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray5);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray24);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 10, (long) '4');
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { 2, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str18 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, 10.0d, (double) 1L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
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
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str7 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) 10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("tests.monster", indexReader9, terms10, terms11, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("tests.maxfailures", indexReader25, (int) '4', postingsEnum27, postingsEnum28, false);
        org.junit.rules.TestRule testRule31 = simpleIndexQueryParserTests4.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 3);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) '#', (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) -1, (long) (byte) 10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray71);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray71);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray82);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        java.util.concurrent.ExecutorService executorService91 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] { executorService91 };
        boolean boolean93 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray92);
        boolean boolean94 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray92);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray88, (java.lang.Object[]) executorServiceArray92);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) executorServiceArray88);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 'a');
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) 'a');
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray9, doubleArray14, (double) 0);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) 'a');
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray20, doubleArray25, (double) 0);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) 'a');
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray31, doubleArray36, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray31, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray9, doubleArray25, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray9, (double) 100L);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 'a');
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray48, doubleArray53, (double) 0);
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray59, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray3, doubleArray59, (double) (short) -1);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) 'a');
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) 'a');
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray71, doubleArray76, (double) 0);
        double[] doubleArray81 = new double[] {};
        double[] doubleArray82 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray82, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray82, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray82, (double) 0.0f);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray66);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray59, doubleArray66, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray59, (-1.0d));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.monster", indexReader11, terms12, terms13, false);
        java.lang.String str16 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
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
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 10, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) (short) -1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader9, fields10, fields11, true);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("hi!", charArray15, charArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) fields11, (java.lang.Object) "hi!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.awaitsfix", (int) (byte) -1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues38, numericDocValues39);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Set<org.junit.rules.TestRule> testRuleSet5 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray25);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 5, (long) (byte) 1);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        long[] longArray6 = new long[] { 0, 100L, (byte) 10, 4, (byte) 100, (byte) 0 };
        long[] longArray13 = new long[] { 2, 1L, (byte) 0, 1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        long[] longArray2 = new long[] { (-1L), (byte) 1 };
        long[] longArray7 = new long[] { (byte) -1, (short) 1, 2, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        long[] longArray4 = new long[] { 3, (-1), 4, (short) 1 };
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, 10L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) (byte) 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) 0, (long) '4');
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader11, (int) ' ', postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
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
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray42);
        java.lang.Class<?> wildcardClass46 = executorServiceArray35.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) ' ', (java.lang.Object) wildcardClass46);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum10, postingsEnum11, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
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
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        long[] longArray3 = new long[] { 0L, '#' };
        long[] longArray6 = new long[] { ' ', 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray6);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testRegexpQueryBuilder();
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (byte) -1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("random", (int) (short) 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 1, (long) '4');
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
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
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
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
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray8, (java.lang.Object) simpleIndexQueryParserTests45);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests45);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.ensureCheckIndexPassed();
        simpleIndexQueryParserTests65.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests65.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        simpleIndexQueryParserTests65.assertTermsEquals("enwiki.random.lines.txt", indexReader70, terms71, terms72, false);
        java.lang.Class<?> wildcardClass75 = simpleIndexQueryParserTests65.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests45, (java.lang.Object) wildcardClass75);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.Object obj6 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj6, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 100);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.badapples", indexReader8, 0, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader17, fields18, fields19, true);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) executorServiceArray28, (java.lang.Object) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) fields19, (java.lang.Object) 1.0f);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        long[] longArray6 = new long[] { (byte) -1, 2, 6, 0L, (short) -1, (short) 1 };
        long[] longArray8 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray24);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale41 };
        java.util.Set<java.util.Locale> localeSet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) localeArray42);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        double[] doubleArray5 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray11 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray17 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray23 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray29 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray35 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[][] doubleArray36 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29, doubleArray35 };
        java.util.Set<double[]> doubleArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray36);
        java.util.Set<double[]> doubleArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray52);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) 'a');
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray66, doubleArray71, (double) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray42, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray36, (java.lang.Object[]) executorServiceArray42);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests17.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.monster", indexReader27, terms28, terms29, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureCheckIndexPassed();
        simpleIndexQueryParserTests32.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("tests.monster", indexReader37, terms38, terms39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests32.assertPositionsSkippingEquals("tests.failfast", indexReader43, 10, postingsEnum45, postingsEnum46);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests32.assertDocsSkippingEquals("", indexReader49, (int) (short) 1, postingsEnum51, postingsEnum52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("europarl.lines.txt.gz", indexReader56, terms57, terms58, true);
        simpleIndexQueryParserTests32.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests32.assertPositionsSkippingEquals("tests.failfast", indexReader64, (int) ' ', postingsEnum66, postingsEnum67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        simpleIndexQueryParserTests32.assertFieldsEquals("tests.monster", indexReader70, fields71, fields72, true);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray75 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests17, simpleIndexQueryParserTests32 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet76 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) luceneTestCaseSet76);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
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
        simpleIndexQueryParserTests88.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader15, 1, postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader22, fields23, fields24, true);
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests0.ruleChain;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
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
        simpleIndexQueryParserTests1.testTermsQueryBuilder();
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) charArray2, (java.lang.Object) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "random");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
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
        simpleIndexQueryParserTests1.testQueryStringFields2Builder();
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) executorServiceArray6, (java.lang.Object) 1.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        java.lang.String str22 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.setUp();
        java.lang.String str24 = simpleIndexQueryParserTests12.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain26;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 1.0f, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) (byte) 100);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
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
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        simpleIndexQueryParserTests53.assertTermsEquals("tests.monster", indexReader58, terms59, terms60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        simpleIndexQueryParserTests53.assertFieldsEquals("hi!", indexReader64, fields65, fields66, false);
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        simpleIndexQueryParserTests53.assertTermsEquals("tests.badapples", indexReader71, terms72, terms73, false);
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests53.assertDocsEnumEquals("tests.monster", postingsEnum77, postingsEnum78, true);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        simpleIndexQueryParserTests53.assertFieldsEquals("tests.slow", indexReader82, fields83, fields84, false);
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) boolean52, (java.lang.Object) simpleIndexQueryParserTests53);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray3, intArray5);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray13, intArray21);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray31, intArray33);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray31, intArray39);
        org.junit.Assert.assertArrayEquals("random", intArray13, intArray39);
        org.junit.Assert.assertArrayEquals(intArray3, intArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests48.ensureCheckIndexPassed();
        simpleIndexQueryParserTests48.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests48.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        simpleIndexQueryParserTests48.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields55, fields56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("hi!", indexReader60, (int) (short) 10, postingsEnum62, postingsEnum63);
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests48.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) intArray13, (java.lang.Object) simpleIndexQueryParserTests48);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.awaitsfix" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[][][] strArray4 = new java.lang.String[][][] { strArray3 };
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        java.lang.String[][][] strArray8 = new java.lang.String[][][] { strArray7 };
        java.lang.String[][][][] strArray9 = new java.lang.String[][][][] { strArray4, strArray8 };
        java.util.List<java.lang.String[][][]> strArrayList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray9);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        short[] shortArray1 = new short[] { (short) -1 };
        short[] shortArray3 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray7 = new short[] { (short) -1 };
        short[] shortArray9 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray13 = new short[] { (short) -1 };
        short[] shortArray15 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray19 = new short[] { (short) -1 };
        short[] shortArray21 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (short) -1 };
        short[] shortArray26 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray19, shortArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray15, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray7);
        short[] shortArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray32);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
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
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) ruleChain12);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (short) 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        long[] longArray4 = new long[] { (byte) 10, 'a', (-1L), (short) 0 };
        long[] longArray6 = new long[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("hi!", charArray3, charArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.awaitsfix", indexReader29, terms30, terms31, true);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray3, (java.lang.Object) "tests.awaitsfix");
        char[] charArray36 = new char[] {};
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray41, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("random", charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray51, charArray62);
        org.junit.Assert.assertArrayEquals("hi!", charArray41, charArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray36, charArray51);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray36);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        org.junit.Assert.assertArrayEquals(charArray72, charArray74);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals("random", charArray79, charArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray72, charArray83);
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray87, charArray88);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray83, charArray88);
        org.junit.Assert.assertArrayEquals(charArray36, charArray88);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray36);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
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
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests37.assertDocsEnumEquals("node_s_0", postingsEnum41, postingsEnum42, true);
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests37.assertTermsEquals("tests.monster", indexReader47, terms48, terms49, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        java.lang.Object obj1 = null;
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
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", obj1, (java.lang.Object) testRule25);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray8, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray16, intArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray8, intArray16);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray26, intArray28);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray26, intArray34);
        org.junit.Assert.assertArrayEquals("random", intArray8, intArray34);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray45, intArray47);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray53, intArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray45, intArray53);
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
        org.junit.Assert.assertArrayEquals(intArray45, intArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray34, intArray45);
        org.junit.Assert.assertArrayEquals(intArray0, intArray34);
        java.lang.Object obj81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray34, obj81);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        java.lang.String str27 = simpleIndexQueryParserTests25.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.failfast", indexReader29, 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests25.assertDocsSkippingEquals("tests.badapples", indexReader35, (int) (byte) 100, postingsEnum37, postingsEnum38, false);
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray17, (java.lang.Object) simpleIndexQueryParserTests25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        simpleIndexQueryParserTests43.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests43.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("tests.monster", indexReader48, terms49, terms50, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain54;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests43.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader57, (int) (byte) 0, postingsEnum59, postingsEnum60, true);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.setUp();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray17, (java.lang.Object) simpleIndexQueryParserTests43);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.ensureCheckIndexPassed();
        simpleIndexQueryParserTests70.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests70.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        simpleIndexQueryParserTests70.assertTermsEquals("tests.monster", indexReader75, terms76, terms77, false);
        java.lang.String str80 = simpleIndexQueryParserTests70.getTestName();
        simpleIndexQueryParserTests70.setUp();
        java.lang.String str82 = simpleIndexQueryParserTests70.getTestName();
        simpleIndexQueryParserTests70.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule84 = simpleIndexQueryParserTests70.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests43, (java.lang.Object) testRule84);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (-1L), (long) 4);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray3);
        java.lang.Class<?> wildcardClass12 = executorServiceArray3.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.nightly", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.badapples", indexReader33, terms34, terms35, false);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass12, (java.lang.Object) simpleIndexQueryParserTests13);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests13.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 10L);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) -1, 1L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, true);
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray14);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray14, charArray19);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("random", charArray31, charArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray24, charArray35);
        org.junit.Assert.assertArrayEquals("hi!", charArray14, charArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray9, charArray24);
        org.junit.Assert.assertArrayEquals(charArray1, charArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray9);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 'a', 0.0d, (double) (byte) 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("hi!", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.badapples", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.monster", postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.slow", indexReader31, fields32, fields33, false);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests38.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests38.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests38);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { 100, (byte) 10, (byte) -1, (byte) 100, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) 100L);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        int[][][][][] intArray2 = new int[][][][][] {};
        java.util.List<int[][][][]> intArrayList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, intArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray55);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) intArray2, (java.lang.Object[]) executorServiceArray55);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
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
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("hi!", 1, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        long[] longArray7 = new long[] { 0L, 2, 100L, 100, (short) 0, 0 };
        long[] longArray9 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray7, longArray9);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray4);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) throttlingArray4);
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, false);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests10, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 5);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0, (double) 1.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.weekly", postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests23.assertDocsEnumEquals("tests.badapples", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("tests.badapples", indexReader32, fields33, fields34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("tests.awaitsfix", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("hi!", indexReader44, fields45, fields46, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) indexReader44);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 'a');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray3, doubleArray8, (double) 0);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 'a');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 'a');
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray18, doubleArray23, (double) 0);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray29, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray13, 10.0d);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) 'a');
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray44, (double) 0);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) 'a');
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray50, doubleArray55, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray50, (double) (-1L));
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray13, doubleArray50, 0.0d);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        simpleIndexQueryParserTests64.assertFieldsEquals("enwiki.random.lines.txt", indexReader70, fields71, fields72, false);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        simpleIndexQueryParserTests64.assertPositionsSkippingEquals("hi!", indexReader76, (int) (short) 10, postingsEnum78, postingsEnum79);
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule82 = simpleIndexQueryParserTests64.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests64);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader4, 0, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 5, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("tests.badapples", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("tests.awaitsfix", indexReader19, fields20, fields21, false);
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests4.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) locale2, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 100);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) -1);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
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
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests2.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests17.setUp();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) testRule16, (java.lang.Object) ruleChain22);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) (short) 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 4);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals("random", charArray1, charArray5);
        short[] shortArray13 = new short[] { (short) -1 };
        short[] shortArray15 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray19 = new short[] { (short) -1 };
        short[] shortArray21 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (short) -1 };
        short[] shortArray26 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray19, shortArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray15, shortArray24);
        short[] shortArray32 = new short[] { (short) -1 };
        short[] shortArray34 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray37 = new short[] { (short) -1 };
        short[] shortArray39 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        short[] shortArray44 = new short[] { (short) -1 };
        short[] shortArray46 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        short[] shortArray49 = new short[] { (short) -1 };
        short[] shortArray51 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray44, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray32, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray32);
        short[] shortArray57 = new short[] { (short) -1 };
        short[] shortArray59 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (short) -1 };
        short[] shortArray64 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray57);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray57);
        short[] shortArray70 = new short[] { (short) -1 };
        short[] shortArray72 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        short[] shortArray75 = new short[] { (short) -1 };
        short[] shortArray77 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray77);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray57, shortArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) shortArray70);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray19, byteArray22);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray27, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray35, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray35);
        org.junit.Assert.assertArrayEquals("random", byteArray22, byteArray35);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray46, byteArray49);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray54, byteArray57);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray62);
        org.junit.Assert.assertArrayEquals("random", byteArray49, byteArray62);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray72);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray72, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray75);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray22, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray12, byteArray22);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray83);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray86, byteArray87);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray90);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray87, byteArray90);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray90);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray82, byteArray90);
        org.junit.Assert.assertArrayEquals("hi!", byteArray12, byteArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray12);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray4, intArray6);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray12, intArray14);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray12);
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
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray41, intArray43);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray49, intArray51);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray41, intArray49);
        org.junit.Assert.assertArrayEquals(intArray23, intArray41);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray61, intArray63);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray69, intArray71);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray61, intArray69);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray78, intArray80);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray61, intArray80);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) intArray4, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("hi!", charArray10, charArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray2, charArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.nightly", (java.lang.Object) simpleIndexQueryParserTests18);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests18.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray3 = new java.util.Locale[] { locale2 };
        java.util.Set<java.util.Locale> localeSet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray65);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray74);
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray40);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) localeArray3, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray14);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) 'a');
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray28, doubleArray33, (double) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray4, (java.lang.Object) 0);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray63);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy67 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass68 = queryCachingPolicy67.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray63, (java.lang.Object) queryCachingPolicy67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) executorServiceArray4);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWildcardQueryBuilder();
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 1L);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
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
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.monster", indexReader39, fields40, fields41, true);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.weekly", postingsEnum45, postingsEnum46, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.ensureCheckIndexPassed();
        simpleIndexQueryParserTests51.setUp();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests51.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule56 = simpleIndexQueryParserTests51.ruleChain;
        simpleIndexQueryParserTests51.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str59 = simpleIndexQueryParserTests51.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests51);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        long[] longArray6 = new long[] { (-1), 4, (short) 1, (short) 100, (short) 1 };
        long[] longArray8 = new long[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray8);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 0, (long) (short) 1);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        long[] longArray2 = new long[] { (byte) 1, '#' };
        long[] longArray5 = new long[] { 1, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        long[] longArray3 = new long[] { 0, '4', (byte) 100 };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        long[] longArray3 = new long[] { 2, 6, 1 };
        long[] longArray9 = new long[] { 4, 5, (short) 100, 100L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) 'a');
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray5, doubleArray10, (double) 0);
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
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray27, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray5, doubleArray21, (double) 1);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray42, (double) (-1.0f));
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 'a');
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray48, doubleArray53, (double) 0);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) 'a');
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray59, doubleArray64, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray59, (double) (-1L));
        org.junit.Assert.assertArrayEquals("hi!", doubleArray42, doubleArray59, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray59, 10.0d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests60.ensureCheckIndexPassed();
        simpleIndexQueryParserTests60.restoreIndexWriterMaxDocs();
        java.lang.String str63 = simpleIndexQueryParserTests60.getTestName();
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray27, (java.lang.Object) str63);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures66);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray68 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures66 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray68);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray78);
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        java.util.concurrent.ExecutorService executorService90 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] { executorService90 };
        boolean boolean92 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray91);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray88, (java.lang.Object[]) executorServiceArray91);
        boolean boolean94 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray68, (java.lang.Object[]) executorServiceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) executorServiceArray84);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 1);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray7, (float) '#');
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray14, (float) (byte) 10);
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
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray66, floatArray69, (float) (-1L));
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray56, floatArray69, 10.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray14, floatArray56, (float) 0L);
        float[] floatArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray14, floatArray79, (float) (short) 100);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, 0.0d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (short) 100);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        long[] longArray6 = new long[] { 3, (byte) 10, (byte) -1, 6, (byte) 100 };
        long[] longArray10 = new long[] { '4', 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray10);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
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
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
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
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) executorServiceArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests76.ensureCheckIndexPassed();
        simpleIndexQueryParserTests76.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests76.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        simpleIndexQueryParserTests76.assertTermsEquals("tests.monster", indexReader81, terms82, terms83, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests86 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain87 = simpleIndexQueryParserTests86.failureAndSuccessEvents;
        simpleIndexQueryParserTests76.failureAndSuccessEvents = ruleChain87;
        simpleIndexQueryParserTests76.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests76.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Fields fields93 = null;
        org.apache.lucene.index.Fields fields94 = null;
        simpleIndexQueryParserTests76.assertFieldsEquals("tests.monster", indexReader92, fields93, fields94, true);
        org.junit.rules.TestRule testRule97 = simpleIndexQueryParserTests76.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray13, (java.lang.Object) simpleIndexQueryParserTests76);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1, (-1.0d));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4', (double) (-1.0f));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        long[] longArray7 = new long[] { 10L, (byte) -1, (short) 1, (short) 10, (short) -1, (byte) -1 };
        long[] longArray13 = new long[] { 4, 10L, 2, 10, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray7, longArray13);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) ' ', 0L);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 'a');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray3, doubleArray8, (double) 0);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 'a');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 'a');
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray18, doubleArray23, (double) 0);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray29, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray13, 10.0d);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) 'a');
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray44, (double) 0);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) 'a');
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray50, doubleArray55, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray50, (double) (-1L));
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray13, doubleArray50, 0.0d);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        java.lang.String str68 = simpleIndexQueryParserTests64.getTestName();
        simpleIndexQueryParserTests64.resetCheckIndexStatus();
        simpleIndexQueryParserTests64.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain71 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule72 = simpleIndexQueryParserTests64.ruleChain;
        simpleIndexQueryParserTests64.resetCheckIndexStatus();
        simpleIndexQueryParserTests64.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass75 = simpleIndexQueryParserTests64.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) doubleArray13, (java.lang.Object) simpleIndexQueryParserTests64);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray16, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray24);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray33, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray33);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray46, byteArray49);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray53);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray12, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray12);
        byte[] byteArray63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray63);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        short[] shortArray6 = new short[] { (byte) -1, (short) 100, (short) -1, (byte) 0, (short) 1 };
        short[] shortArray11 = new short[] { (short) -1 };
        short[] shortArray13 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray13, shortArray22);
        short[] shortArray30 = new short[] { (short) -1 };
        short[] shortArray32 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        short[] shortArray35 = new short[] { (short) -1 };
        short[] shortArray37 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray37);
        short[] shortArray42 = new short[] { (short) -1 };
        short[] shortArray44 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        short[] shortArray47 = new short[] { (short) -1 };
        short[] shortArray49 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray42, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray30, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray30);
        short[] shortArray55 = new short[] { (short) -1 };
        short[] shortArray57 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray62);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray55);
        short[] shortArray68 = new short[] { (short) -1 };
        short[] shortArray70 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (short) -1 };
        short[] shortArray75 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray68, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray73);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 0.0d);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 6);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
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
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        long[] longArray6 = new long[] { (byte) 100, 2, (byte) -1, 'a', (short) 10 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray7);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        long[] longArray6 = new long[] { (byte) -1, (short) -1, 2, 1L, (byte) -1 };
        long[] longArray13 = new long[] { (short) 1, (short) 100, 0L, (short) -1, '4', 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray13);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        long[] longArray1 = new long[] { (short) 1 };
        long[] longArray8 = new long[] { (short) 0, 1, (short) 1, 0L, 10L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        long[] longArray7 = new long[] { (short) 100, (-1L), 2, (short) 100, (-1L), (-1L) };
        long[] longArray12 = new long[] { (byte) 100, (byte) 100, '4', 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray7, longArray12);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) 0, (long) (byte) 100);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (-1L));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
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
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray9);
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
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray42);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray9, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
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
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 10L, 100L);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) ' ');
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        long[] longArray1 = new long[] { (short) 1 };
        long[] longArray8 = new long[] { (byte) 100, 5, (byte) 100, 6, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        long[] longArray2 = new long[] { (short) -1, 100 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        java.lang.String str26 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.failfast", indexReader28, 0, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests24.assertDocsSkippingEquals("tests.badapples", indexReader34, (int) (byte) 100, postingsEnum36, postingsEnum37, false);
        simpleIndexQueryParserTests24.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray16, (java.lang.Object) simpleIndexQueryParserTests24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureCheckIndexPassed();
        simpleIndexQueryParserTests42.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests42.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests42.assertTermsEquals("tests.monster", indexReader47, terms48, terms49, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests42.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader56, (int) (byte) 0, postingsEnum58, postingsEnum59, true);
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.setUp();
        simpleIndexQueryParserTests42.ensureCheckIndexPassed();
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray16, (java.lang.Object) simpleIndexQueryParserTests42);
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 10L);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
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
        simpleIndexQueryParserTests88.testTermsQueryFilter();
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
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
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '4', postingsEnum13, postingsEnum14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 4);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
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
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum19, postingsEnum20, false);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests24.assertTermsEquals("tests.monster", indexReader29, terms30, terms31, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader40, (int) (short) 10, postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum47, postingsEnum48);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests3.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.failfast", indexReader24, 10, postingsEnum26, postingsEnum27);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray29 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests3, simpleIndexQueryParserTests8, simpleIndexQueryParserTests11, simpleIndexQueryParserTests13 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet30 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray29);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) luceneTestCaseArray29);
        java.util.Set<org.junit.Assert> assertSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) luceneTestCaseArray29);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
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
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests63.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests63.assertDocsEnumEquals("<unknown>", postingsEnum67, postingsEnum68, true);
        simpleIndexQueryParserTests63.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule72 = simpleIndexQueryParserTests63.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray58, (java.lang.Object) testRule72);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray80);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray85, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray89);
        boolean boolean95 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) luceneTestCaseArray29, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        short[] shortArray7 = new short[] { (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 10, (byte) 10 };
        short[] shortArray14 = new short[] { (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 10, (byte) 10 };
        short[] shortArray21 = new short[] { (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 10, (byte) 10 };
        short[] shortArray28 = new short[] { (short) 0, (byte) 10, (short) -1, (byte) 1, (byte) 10, (byte) 10 };
        short[][] shortArray29 = new short[][] { shortArray7, shortArray14, shortArray21, shortArray28 };
        short[][][] shortArray30 = new short[][][] { shortArray29 };
        java.util.List<short[][]> shortArrayList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, shortArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray47);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray30, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        long[] longArray2 = new long[] { (byte) 1 };
        long[] longArray5 = new long[] { 10, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray2, longArray5);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray1 };
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray3 };
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray5 };
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray7 };
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray9 };
        int[][][] intArray11 = new int[][][] { intArray2, intArray4, intArray6, intArray8, intArray10 };
        java.util.Set<int[][]> intArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(intArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.monster", indexReader19, terms20, terms21, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain25;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("tests.monster", indexReader32, terms33, terms34, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.ensureCheckIndexPassed();
        simpleIndexQueryParserTests40.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        simpleIndexQueryParserTests40.assertTermsEquals("tests.monster", indexReader45, terms46, terms47, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain51;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests53.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        simpleIndexQueryParserTests53.assertTermsEquals("tests.monster", indexReader58, terms59, terms60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("tests.failfast", indexReader64, 10, postingsEnum66, postingsEnum67);
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.ensureCheckIndexPassed();
        simpleIndexQueryParserTests70.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests70.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        simpleIndexQueryParserTests70.assertTermsEquals("tests.monster", indexReader75, terms76, terms77, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain81 = simpleIndexQueryParserTests80.failureAndSuccessEvents;
        simpleIndexQueryParserTests70.failureAndSuccessEvents = ruleChain81;
        org.junit.rules.RuleChain[] ruleChainArray83 = new org.junit.rules.RuleChain[] { ruleChain25, ruleChain38, ruleChain51, ruleChain69, ruleChain81 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, ruleChainArray83);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) intArray11, (java.lang.Object[]) ruleChainArray83);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        java.lang.String str9 = simpleIndexQueryParserTests3.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.setUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.Object obj7 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj7, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String str12 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryStringFields3Builder();
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) executorServiceArray7);
        java.lang.Object[] objArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, objArray22);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray6, obj15);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("hi!", charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray14);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("random", charArray19, charArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray3, charArray23);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals("random", charArray39, charArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray32, charArray43);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray43, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("random", charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("", charArray43, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) charArray3, (java.lang.Object) "");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 1, (double) 100.0f, (double) 0L);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        long[] longArray3 = new long[] { 1, 5 };
        long[] longArray5 = new long[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray5);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) '#', (double) 1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 5);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 6, (double) 5);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '4', (double) 2);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray28);
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) executorServiceArray28, obj32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray47);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain3, (java.lang.Object) "random");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray2);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        long[] longArray6 = new long[] { 0, (short) 100, 2, (short) 0, (byte) 10 };
        long[] longArray13 = new long[] { '#', (-1L), (-1L), (-1), (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray13);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.monster", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("hi!", indexReader20, fields21, fields22, false);
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.badapples", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("tests.monster", postingsEnum33, postingsEnum34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.slow", indexReader38, fields39, fields40, false);
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, (double) ' ');
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", 2, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
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
        simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("enwiki.random.lines.txt", 6, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 100.0f);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, true);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) ' ', numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 0, (long) (short) 1);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 4, (double) 0L);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        double[] doubleArray5 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray11 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray17 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray23 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray29 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[] doubleArray35 = new double[] { (byte) 0, (-1), 10, 100, (byte) 1 };
        double[][] doubleArray36 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29, doubleArray35 };
        java.util.Set<double[]> doubleArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.resetCheckIndexStatus();
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.ensureCheckIndexPassed();
        simpleIndexQueryParserTests51.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests51.assertDocsEnumEquals("tests.weekly", postingsEnum55, postingsEnum56, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests61.ensureCheckIndexPassed();
        simpleIndexQueryParserTests61.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule64 = simpleIndexQueryParserTests61.ruleChain;
        simpleIndexQueryParserTests61.ensureCheckIndexPassed();
        simpleIndexQueryParserTests61.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray68 = new org.elasticsearch.test.ElasticsearchTestCase[] { simpleIndexQueryParserTests38, simpleIndexQueryParserTests51, simpleIndexQueryParserTests59, simpleIndexQueryParserTests61 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet69 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray36, (java.lang.Object[]) elasticsearchTestCaseArray68);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.weekly", postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) postingsEnum13);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
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
        simpleIndexQueryParserTests53.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
        long[] longArray4 = new long[] { 100L, 3, 4, 100L };
        long[] longArray9 = new long[] { 1L, 1, 2, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str13 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
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
        java.lang.Object[] objArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray55, objArray57);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
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
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
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
        simpleIndexQueryParserTests1.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        long[] longArray4 = new long[] { 6, 2, (-1) };
        long[] longArray8 = new long[] { 6, (short) 10, '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 1);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray7, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray7, (java.lang.Object) simpleIndexQueryParserTests13);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) (short) 1);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 1);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray25, floatArray28, (float) '#');
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray35, (float) (byte) 10);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 1);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray45, (float) '#');
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray52, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray52, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray28, (float) 0);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) (short) 1);
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray64, floatArray67, (float) '#');
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) (short) 1);
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray79, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray75, floatArray78, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests84 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests84.ensureCheckIndexPassed();
        simpleIndexQueryParserTests84.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests84.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests84.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray78, (java.lang.Object) simpleIndexQueryParserTests84);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray64, floatArray78, (float) ' ');
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray64, (float) (short) -1);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray64, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray1, floatArray7, (float) 100);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum5, postingsEnum6, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader12, terms13, terms14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) terms13);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
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
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) '4', 10.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        long[] longArray6 = new long[] { (short) -1, (short) -1, (short) 0, 5, ' ' };
        long[] longArray10 = new long[] { (byte) -1, (short) 0, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray10);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) -1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWildcardQueryBuilder();
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) wildcardClassArray14);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 'a');
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray2, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList2 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, throttlingArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) throttlingArray1);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.ensureCheckIndexPassed();
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("hi!", indexReader36, fields37, fields38, false);
        simpleIndexQueryParserTests25.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) executorServiceArray9, (java.lang.Object) simpleIndexQueryParserTests25);
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
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean91 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) -1, (double) 100, (double) (short) 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 10, (long) '#');
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryQueryBuilder();
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 10, (long) ' ');
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
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
        simpleIndexQueryParserTests88.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (-1.0f));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
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
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) 'a');
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray41, (double) (-1.0f));
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) 'a');
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 'a');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray51, doubleArray56, (double) 0);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray62, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray46, (double) 0);
        double[] doubleArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray41, doubleArray71, (double) (-1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) -1 };
        short[] shortArray6 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray6, shortArray15);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray1, shortArray6);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.Object obj15 = new java.lang.Object();
        org.junit.Assert.assertNotSame("", obj15, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests10, (java.lang.Object) "tests.weekly");
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("tests.weekly", postingsEnum22, postingsEnum23, false);
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str27 = simpleIndexQueryParserTests10.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        simpleIndexQueryParserTests28.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests28.assertTermsEquals("tests.monster", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.failfast", indexReader39, 10, postingsEnum41, postingsEnum42);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests28.ruleChain;
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain47);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        long[] longArray1 = new long[] { (-1) };
        long[] longArray5 = new long[] { 0L, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
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
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
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
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
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
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) executorServiceArray8, (java.lang.Object) simpleIndexQueryParserTests45);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests45);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests45.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum66, postingsEnum67);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader5, 0, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.badapples", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        java.lang.String str20 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests21.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("hi!", indexReader26, terms27, terms28, true);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests21.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader36, (int) (byte) 1, postingsEnum38, postingsEnum39, false);
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) str20, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 10, (double) (byte) 1, (double) 5);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 100L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        java.lang.String str28 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests24.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader30, (int) 'a', postingsEnum32, postingsEnum33, false);
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("<unknown>", indexReader38, (int) (byte) 0, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureCheckIndexPassed();
        simpleIndexQueryParserTests44.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule47 = simpleIndexQueryParserTests44.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.ensureCheckIndexPassed();
        simpleIndexQueryParserTests49.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests49.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests49.assertTermsEquals("tests.monster", indexReader54, terms55, terms56, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain60;
        simpleIndexQueryParserTests49.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain65;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) 1);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
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
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
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
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 1);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray22, floatArray25, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray25, (float) 0);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 1);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray35, floatArray38, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray8, floatArray38, (-1.0f));
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 1);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray48, floatArray51, (float) (-1L));
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray38, floatArray51, 10.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) (short) 1);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray61, floatArray64, (float) (-1L));
        org.junit.Assert.assertArrayEquals("random", floatArray38, floatArray64, (float) (byte) 10);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray74, charArray76);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        org.junit.Assert.assertArrayEquals("random", charArray81, charArray85);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray74, charArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray64, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray3 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        long[] longArray6 = new long[] { (-1L), (short) 100, (-1L), '4', (-1L), (byte) 100 };
        long[] longArray8 = new long[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        long[] longArray1 = new long[] { '4' };
        long[] longArray4 = new long[] { 1, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 'a', (double) (byte) 1);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 10, 1L);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests3.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests3.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) ' ', (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (short) 0, (-1L));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 10.0d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
        long[] longArray5 = new long[] { (short) 1, (short) -1, (byte) 10, (short) 100 };
        long[] longArray8 = new long[] { 3, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray8);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 3, (double) 1);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 5, 0.0d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str13 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "random");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray24);
        java.lang.Class<?> wildcardClass30 = executorServiceArray24.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass30);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 1);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray6, (float) '#');
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 1);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray17, (float) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        simpleIndexQueryParserTests23.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray17, (java.lang.Object) simpleIndexQueryParserTests23);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray3, floatArray17, (float) ' ');
        float[] floatArray31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray31, 0.0f);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 5, (double) 10, (double) 1);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader9, terms10, terms11, true);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
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
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 'a');
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray48, doubleArray53, (double) 0);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) 'a');
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray59, doubleArray64, (double) 0);
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) 'a');
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray70, doubleArray75, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray70, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray48, doubleArray64, (double) 1);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray64, (double) 1.0f);
        double[] doubleArray87 = new double[] {};
        double[] doubleArray88 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray87, doubleArray88, (double) 'a');
        double[] doubleArray91 = new double[] {};
        double[] doubleArray92 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray91, doubleArray92, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray87, doubleArray92, (double) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) doubleArray64, (java.lang.Object) doubleArray87);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader8, fields9, fields10, true);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 3, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("random", charArray5, charArray9);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("hi!", charArray13, charArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray17);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray17, charArray24);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray32);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 1);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray39, floatArray42, (float) '#');
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray49, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) charArray24, (java.lang.Object) floatArray42);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
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
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) 'a');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 'a');
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray30, doubleArray35, (double) 0);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray41, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray41, (double) 0.0f);
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
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray60, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray60, (double) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray2, doubleArray60, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests2.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.failfast", indexReader23, 10, postingsEnum25, postingsEnum26);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray28 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests2, simpleIndexQueryParserTests7, simpleIndexQueryParserTests10, simpleIndexQueryParserTests12 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet29 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("hi!", charArray31, charArray35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests38.setIndexWriterMaxDocs((int) (byte) 100);
        simpleIndexQueryParserTests38.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("tests.awaitsfix", indexReader57, terms58, terms59, true);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray31, (java.lang.Object) "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) luceneTestCaseArray28, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray3, intArray5);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray13, intArray15);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray13, intArray21);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray31, intArray33);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray31, intArray39);
        org.junit.Assert.assertArrayEquals("random", intArray13, intArray39);
        org.junit.Assert.assertArrayEquals(intArray3, intArray13);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray3, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
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
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray32);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray42, intArray44);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray51, intArray53);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray59, intArray61);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray51, intArray59);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray69, intArray71);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray77, intArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray69, intArray77);
        org.junit.Assert.assertArrayEquals(intArray51, intArray69);
        org.junit.Assert.assertArrayEquals(intArray42, intArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray6, intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 1L, (double) 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling14, throttling15, throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19, throttling20 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray17, throttlingArray21 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray22 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain12, (java.lang.Object) throttlingArray23);
        short[][] shortArray26 = new short[][] {};
        java.util.Set<short[]> shortArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) shortArray26);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) -1 };
        short[] shortArray6 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray6, shortArray15);
        short[] shortArray24 = new short[] { (short) -1 };
        short[] shortArray26 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        short[] shortArray30 = new short[] { (short) -1 };
        short[] shortArray32 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        short[] shortArray35 = new short[] { (short) -1 };
        short[] shortArray37 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray30, shortArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray26, shortArray35);
        short[] shortArray43 = new short[] { (short) -1 };
        short[] shortArray45 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (short) -1 };
        short[] shortArray50 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray50);
        short[] shortArray55 = new short[] { (short) -1 };
        short[] shortArray57 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray55, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray43, shortArray55);
        org.junit.Assert.assertArrayEquals("", shortArray35, shortArray43);
        short[] shortArray69 = new short[] { (short) -1 };
        short[] shortArray71 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        short[] shortArray74 = new short[] { (short) -1 };
        short[] shortArray76 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray76);
        short[] shortArray81 = new short[] { (short) -1 };
        short[] shortArray83 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray83);
        short[] shortArray86 = new short[] { (short) -1 };
        short[] shortArray88 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray81, shortArray86);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray69, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray1, shortArray69);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 1);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray6, (float) '#');
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray13, (float) (byte) 10);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) (short) 1);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray20, floatArray23, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray23, (float) 0);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 1);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("", floatArray33, floatArray36, (float) '#');
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray6, floatArray36, (-1.0f));
        float[] floatArray47 = new float[] { 3, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray47, (float) ' ');
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }
}

