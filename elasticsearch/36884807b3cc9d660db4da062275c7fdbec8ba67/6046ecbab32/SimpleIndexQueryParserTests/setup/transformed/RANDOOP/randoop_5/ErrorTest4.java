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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 2, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        org.apache.lucene.util.BytesRef[] bytesRefArray1 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray2 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray3 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray1, bytesRefArray2 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray3);
        java.util.Set<java.lang.Cloneable> cloneableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) bytesRefArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling10, throttling11, throttling13, throttling16, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) bytesRefArray3, (java.lang.Object[]) throttlingArray21);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 1.0f);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) strArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        java.lang.Class<?> wildcardClass45 = executorServiceArray31.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.maxfailures", indexReader48, (-1), postingsEnum50, postingsEnum51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.maxfailures", indexReader54, (int) (short) 1, postingsEnum56, postingsEnum57);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = null;
        simpleIndexQueryParserTests46.queryParser = indexQueryParserService59;
        org.apache.lucene.util.BytesRef bytesRef62 = simpleIndexQueryParserTests46.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader64 = null;
        java.lang.String[] strArray66 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields68, (java.lang.Object) locale70);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.badapples");
        simpleIndexQueryParserTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader64, fields68, fields76, false);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("tests.weekly", indexReader80, terms81, terms82, true);
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass86 = ruleChain85.getClass();
        java.lang.Class[] classArray88 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray89 = (java.lang.Class<?>[]) classArray88;
        wildcardClassArray89[0] = wildcardClass45;
        wildcardClassArray89[1] = wildcardClass86;
        java.util.Set<java.lang.Class<?>> wildcardClassSet94 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray89);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray89);
        java.util.List<java.lang.Class<?>> wildcardClassList96 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, wildcardClassArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) wildcardClassArray89);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 0.0d, 1.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray29, (double) 1.0f);
        double[] doubleArray40 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray46 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray40, doubleArray46, (double) 100);
        double[] doubleArray55 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray61 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray55, doubleArray61, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray61, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray29, doubleArray61, (double) '#');
        double[] doubleArray73 = new double[] { 1.0f, 10L, 1, 0, (-1.0d) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray29, doubleArray73, (double) 1L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 10);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) -1, (double) 10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) '#', (double) (byte) 10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 1.0f, (double) 1L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 10L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        double[] doubleArray9 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray15 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray9, doubleArray15, (double) 100);
        double[] doubleArray24 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray30 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray24, doubleArray30, (double) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray9, doubleArray24, (double) (-1));
        double[] doubleArray42 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray48 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray42, doubleArray48, (double) 100);
        double[] doubleArray57 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray63 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray57, doubleArray63, (double) 100);
        double[] doubleArray72 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray78 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray72, doubleArray78, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray78, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray42, doubleArray63, (double) (short) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray9, doubleArray63, (double) (short) 100);
        double[] doubleArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray63, doubleArray87, (double) (short) 100);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray17);
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "");
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) strArray17);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        java.util.concurrent.ExecutorService[][] executorServiceArray39 = new java.util.concurrent.ExecutorService[][] { executorServiceArray28, executorServiceArray30, executorServiceArray32, executorServiceArray34, executorServiceArray36, executorServiceArray38 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray39);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray39, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
        short[] shortArray15 = new short[] { (byte) 1 };
        short[] shortArray17 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray11, shortArray15);
        short[] shortArray29 = new short[] { (byte) 1 };
        short[] shortArray31 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        short[] shortArray34 = new short[] { (byte) 1 };
        short[] shortArray36 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray36);
        short[] shortArray40 = new short[] { (byte) 1 };
        short[] shortArray42 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        short[] shortArray45 = new short[] { (byte) 1 };
        short[] shortArray47 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray36, shortArray40);
        short[] shortArray52 = new short[] { (byte) 1 };
        short[] shortArray54 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        short[] shortArray64 = new short[] { (byte) 1 };
        short[] shortArray66 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray66);
        short[] shortArray69 = new short[] { (byte) 1 };
        short[] shortArray71 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        short[] shortArray74 = new short[] { (byte) 1 };
        short[] shortArray76 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray64, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray76);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray40, shortArray57);
        short[] shortArray83 = new short[] { (byte) 1 };
        short[] shortArray85 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) executorServiceArray33);
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.nightly");
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.badapples", fields39, fields42);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray50, intArray53);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray46, intArray50);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray63, intArray66);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray59, intArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray46, intArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "enwiki.random.lines.txt");
        org.apache.lucene.index.NumericDocValues numericDocValues75 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues75, numericDocValues76);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 2, (double) (short) 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) ' ');
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray14);
        short[] shortArray27 = new short[] { (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        short[] shortArray32 = new short[] { (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray37 = new short[] { (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray27, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) shortArray10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService18);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 100, 0);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) strArray31);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray9, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray9, byteArray17);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray36, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray39);
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray39, byteArray43);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray51, byteArray54);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray59, byteArray62);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray51, byteArray59);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray68, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray51);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray78, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray39, byteArray81);
        byte[] byteArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray39, byteArray86);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertEquals("tests.nightly", objArray2, (java.lang.Object[]) strArray8);
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "random");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "hi!");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.badapples");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "hi!");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 100);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader22, (int) ' ', postingsEnum24, postingsEnum25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests29.queryParser();
        simpleIndexQueryParserTests29.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain39;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests23.queryParser = indexQueryParserService36;
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests23.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader41 = null;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields45, (java.lang.Object) locale47);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.badapples");
        simpleIndexQueryParserTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields45, fields53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("tests.weekly", indexReader57, terms58, terms59, true);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain62;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain62;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService65 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.TestRule testRule67 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader21, (int) ' ', postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) '4', numericDocValues29, numericDocValues30);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '#', (double) 'a', 10.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableSet3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests5.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (int) (short) 1, postingsEnum27, postingsEnum28);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests17.queryParser = indexQueryParserService30;
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests17.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests17.queryParser = indexQueryParserService34;
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain37;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) serializableSet3, (java.lang.Object) ruleChain37);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.lang.Class<?> wildcardClass42 = executorServiceArray28.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader51, (int) (short) 1, postingsEnum53, postingsEnum54);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = null;
        simpleIndexQueryParserTests43.queryParser = indexQueryParserService56;
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests43.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader61 = null;
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields65, (java.lang.Object) locale67);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.badapples");
        simpleIndexQueryParserTests43.assertFieldsEquals("europarl.lines.txt.gz", indexReader61, fields65, fields73, false);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("tests.weekly", indexReader77, terms78, terms79, true);
        org.junit.rules.RuleChain ruleChain82 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass83 = ruleChain82.getClass();
        java.lang.Class[] classArray85 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass42;
        wildcardClassArray86[1] = wildcardClass83;
        java.util.Set<java.lang.Class<?>> wildcardClassSet91 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray86);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray86);
        java.util.List<java.lang.Class<?>> wildcardClassList93 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, wildcardClassArray86);
        java.util.Set<java.lang.Class<?>> wildcardClassSet94 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray86);
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList95 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.reflect.GenericDeclaration[]) wildcardClassArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule20, (java.lang.Object) genericDeclarationList95);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields23, (java.lang.Object) locale25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields23, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader35, terms36, terms37, true);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 0, (int) (byte) 10);
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        org.junit.rules.TestRule testRule35 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet1 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray26);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray0, (java.lang.Object[]) executorServiceArray26);
        org.apache.lucene.util.BytesRef[] bytesRefArray32 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray33 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray34 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray32, bytesRefArray33 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray0, (java.lang.Object[]) bytesRefArray34);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray14);
        short[] shortArray28 = new short[] { (byte) 1 };
        short[] shortArray30 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray28, shortArray40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        simpleIndexQueryParserTests44.assertTermsEquals("tests.slow", indexReader46, terms47, terms48, true);
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests44.indexedValueForSearch(0L);
        short[] shortArray54 = new short[] { (byte) 1 };
        short[] shortArray56 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) shortArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray40, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray56);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) (short) 0);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray62, floatArray67, 1.0f);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray73, 0.0f);
        float[] floatArray79 = new float[] {};
        float[] floatArray80 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray80, (float) (short) 0);
        float[] floatArray83 = new float[] {};
        float[] floatArray84 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray84, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray79, floatArray84, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray84, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray14, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10L, (double) 1L);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader22, (int) ' ', postingsEnum24, postingsEnum25, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) indexQueryParserService15);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 1, (double) (short) 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        char[] charArray2 = new char[] { 'a', '#' };
        char[] charArray5 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray9 = new char[] { 'a', '#' };
        char[] charArray12 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests15.queryParser = indexQueryParserService28;
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests15.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests15.queryParser = indexQueryParserService32;
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests15.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests15.longToPrefixCoded((long) 'a', (int) ' ');
        simpleIndexQueryParserTests15.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule44 = simpleIndexQueryParserTests15.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray5, (java.lang.Object) testRule44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule44);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (-1), postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, true);
        java.lang.String str16 = simpleIndexQueryParserTests3.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests17.queryParser();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain27;
        org.junit.Assert.assertNotSame("tests.nightly", obj2, (java.lang.Object) simpleIndexQueryParserTests3);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) strArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray80);
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) executorServiceArray80);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "tests.nightly", (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService22;
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests1.indexedValueForSearch((-1L));
        java.lang.String str26 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader29, terms30, terms31, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.junit.rules.TestRule testRule36 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures20);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray24 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures22 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet25 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet26 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        java.util.List<org.junit.rules.TestRule> testRuleList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray24);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet28 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray24);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) strArray39);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields45);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 0);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray78);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray83);
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray78);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) -1);
        java.lang.Object obj24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) bytesRef23, obj24);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService12;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests16.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests16.setqueryParser(indexQueryParserService34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests16.queryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 2, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 10, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader12, 0, postingsEnum14, postingsEnum15, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader21, terms22, terms23, false);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService18;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27);
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests22);
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("", indexReader35, terms36, terms37, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (-1), (long) (byte) 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray14);
        short[] shortArray28 = new short[] { (byte) 1 };
        short[] shortArray30 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray35);
        short[] shortArray39 = new short[] { (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray35, shortArray39);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (byte) 1 };
        short[] shortArray58 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray56);
        short[] shortArray63 = new short[] { (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray39, shortArray56);
        short[] shortArray82 = new short[] { (byte) 1 };
        short[] shortArray84 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray10);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService17);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 100, 0);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals("tests.nightly", objArray32, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray45);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader29, fields30, fields53, false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        long[] longArray2 = new long[] { 'a' };
        long[] longArray4 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { 'a' };
        long[] longArray9 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        long[] longArray13 = new long[] { 'a' };
        long[] longArray15 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray13, longArray15);
        long[] longArray18 = new long[] { 'a' };
        long[] longArray20 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        long[] longArray24 = new long[] { 'a' };
        long[] longArray26 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray24, longArray26);
        long[] longArray29 = new long[] { 'a' };
        long[] longArray31 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray18, longArray26);
        long[] longArray37 = new long[] { 'a' };
        long[] longArray39 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        long[] longArray42 = new long[] { 'a' };
        long[] longArray44 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray42, longArray44);
        org.junit.Assert.assertArrayEquals(longArray39, longArray42);
        long[] longArray48 = new long[] { 'a' };
        long[] longArray50 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        long[] longArray53 = new long[] { 'a' };
        long[] longArray55 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray53, longArray55);
        org.junit.Assert.assertArrayEquals(longArray50, longArray53);
        org.junit.Assert.assertArrayEquals("hi!", longArray42, longArray53);
        org.junit.Assert.assertArrayEquals(longArray26, longArray42);
        org.junit.Assert.assertArrayEquals(longArray4, longArray26);
        long[] longArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray4, longArray61);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.String str21 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService22;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests24.queryParser;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests24.indexedValueForSearch((long) '#');
        simpleIndexQueryParserTests24.ensureCleanedUp();
        java.lang.Class<?> wildcardClass36 = simpleIndexQueryParserTests24.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) indexQueryParserService22, (java.lang.Object) wildcardClass36);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 2);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader24, (int) (byte) 10, postingsEnum26, postingsEnum27, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) postingsEnum27);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray1);
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests16.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests16.getqueryParser();
        java.lang.String str26 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) indexQueryParserService15, (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests16.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests16.longToPrefixCoded(100L, 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, (-1), postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) (short) 1, postingsEnum43, postingsEnum44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests33.queryParser = indexQueryParserService46;
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests33.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = null;
        simpleIndexQueryParserTests33.queryParser = indexQueryParserService50;
        simpleIndexQueryParserTests33.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests33.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = null;
        simpleIndexQueryParserTests33.setqueryParser(indexQueryParserService56);
        simpleIndexQueryParserTests33.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests33.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) 100L, (java.lang.Object) simpleIndexQueryParserTests33);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100L, 10L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 2, (double) (byte) -1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.badapples");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.nightly");
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray75);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray75);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray6, floatArray11, 1.0f);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray17, 0.0f);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray23, floatArray28, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray28, (float) (byte) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray36, floatArray41, 1.0f);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray47, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray36, (float) 100);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) (short) 0);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray55, floatArray60, 1.0f);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) (short) 0);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray66, floatArray71, 1.0f);
        float[] floatArray76 = new float[] {};
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray77, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray77, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray66, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray66, (float) 2);
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray66, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray66);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0.0f);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService9);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests12.ruleChain;
        simpleIndexQueryParserTests12.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("hi!", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests12.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader19, 1, postingsEnum21, postingsEnum22);
        java.lang.String str24 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests25.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests25.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests25.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain36);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader13, (int) '4', postingsEnum15, postingsEnum16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests18.ruleChain;
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests18.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) indexReader13, (java.lang.Object) testRule27);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService15;
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests2.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService19;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests21.ruleChain;
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader31, 10, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("random", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) postingsEnum37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        java.lang.String str25 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str28 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("", indexReader40, terms41, terms42, true);
        org.junit.rules.RuleChain ruleChain45 = null;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("tests.monster", indexReader48, (int) (short) 1, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests29.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("europarl.lines.txt.gz", indexReader56, terms57, terms58, true);
        simpleIndexQueryParserTests29.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) str28, (java.lang.Object) simpleIndexQueryParserTests29);
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests29.assertDocValuesEquals("hi!", (int) (byte) 100, numericDocValues65, numericDocValues66);
    }
}

