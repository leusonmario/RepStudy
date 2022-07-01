import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        int[] intArray4 = new int[] { 1, (byte) 0, 'a', (short) 100 };
        int[] intArray10 = new int[] { (short) 100, '4', '#', (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) executorServiceArray8);
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) fields14);
        java.lang.Class<?> wildcardClass16 = fields14.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests17.queryParser = indexQueryParserService25;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests17.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("", postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = simpleIndexQueryParserTests35.queryParser;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        simpleIndexQueryParserTests35.assertTermsEquals("tests.nightly", indexReader45, terms46, terms47, false);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) strArray56);
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "node_s_0");
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.badapples");
        simpleIndexQueryParserTests35.assertFieldStatisticsEquals("tests.maxfailures", fields61, fields66);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = null;
        simpleIndexQueryParserTests69.setqueryParser(indexQueryParserService70);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests69, (java.lang.Object) fields79);
        org.junit.rules.TestRule testRule81 = simpleIndexQueryParserTests69.ruleChain;
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.badapples");
        java.lang.String[] strArray88 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "tests.monster");
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "tests.badapples");
        org.apache.lucene.index.Fields fields94 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "tests.nightly");
        simpleIndexQueryParserTests69.assertFieldStatisticsEquals("tests.nightly", fields87, fields94);
        simpleIndexQueryParserTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields66, fields94, true);
        java.lang.Class<?> wildcardClass98 = fields94.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields14, (java.lang.Object) wildcardClass98);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10.0d, (double) (-1L));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("hi!", indexReader14, (int) '4', postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling24, throttling25, throttling27, throttling30, throttling33 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet37 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray35);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) throttlingArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray35, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        int[] intArray2 = new int[] { 10 };
        int[] intArray5 = new int[] { 2, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests10.queryParser();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        java.lang.String str20 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests10.queryParser;
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) str9, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotNull("", (java.lang.Object) locale2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("tests.maxfailures", indexReader6, (-1), postingsEnum8, postingsEnum9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests4.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests4.queryParser();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests4.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (byte) 100, (double) '4');
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (byte) -1);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray23);
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "<unknown>");
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "<unknown>");
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "random", obj30);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray11, floatArray16, 1.0f);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray22, 0.0f);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) (short) 0);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray28, floatArray33, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray33, (float) (byte) 10);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray41, floatArray46, 1.0f);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray52, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray22, floatArray41, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray6, floatArray41, (float) 2);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray6, 0.0f);
        float[] floatArray63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray63, 0.0f);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        int[] intArray6 = new int[] { (short) 0, 0, (byte) 1, ' ', (byte) -1, (short) 1 };
        int[] intArray10 = new int[] { (short) 0, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        short[] shortArray32 = new short[] { (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray37 = new short[] { (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (byte) 1 };
        short[] shortArray44 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray44);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (byte) 1 };
        short[] shortArray58 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        short[] shortArray61 = new short[] { (byte) 1 };
        short[] shortArray63 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray51, shortArray63);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        short[] shortArray79 = new short[] { (byte) 1 };
        short[] shortArray81 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray68);
        short[] shortArray86 = new short[] { (byte) 1 };
        short[] shortArray88 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray88);
        short[] shortArray91 = new short[] { (byte) 1 };
        short[] shortArray93 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray91, shortArray93);
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray91);
        org.junit.Assert.assertArrayEquals("random", shortArray51, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain30, (java.lang.Object) shortArray44);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 0.0d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.nightly", indexReader12, terms13, terms14, false);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) strArray23);
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "node_s_0");
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.badapples");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("tests.maxfailures", fields28, fields33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) '4', (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 'a', 100.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        float[] floatArray2 = new float[] { (-1.0f), 1 };
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray9, 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray15);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray37);
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray37, byteArray41);
        byte[] byteArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray43);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 100, (long) '4');
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 10.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
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
        short[] shortArray52 = new short[] { (byte) 1 };
        short[] shortArray54 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray52);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) shortArray15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray21 = new double[] { 100.0f, (byte) -1, ' ', (short) -1, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray7, doubleArray21, (double) (short) 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        org.junit.rules.TestRule testRule62 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule62);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader28, terms29, terms30, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) terms29, (java.lang.Object) (short) 10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 100, (long) 'a');
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests17.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests17.queryParser();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain16, (java.lang.Object) simpleIndexQueryParserTests17);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, true);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        short[] shortArray29 = new short[] { (byte) 1 };
        short[] shortArray31 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray31);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray38, shortArray50);
        short[] shortArray55 = new short[] { (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        short[] shortArray60 = new short[] { (byte) 1 };
        short[] shortArray62 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray60);
        short[] shortArray66 = new short[] { (byte) 1 };
        short[] shortArray68 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray55);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        short[] shortArray78 = new short[] { (byte) 1 };
        short[] shortArray80 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray78);
        org.junit.Assert.assertArrayEquals("random", shortArray38, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray73);
        java.lang.Class<?> wildcardClass85 = shortArray31.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms14, (java.lang.Object) wildcardClass85);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
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
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray76);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray79);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray76);
        org.apache.lucene.util.BytesRef[] bytesRefArray88 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray89 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray90 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray88, bytesRefArray89 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet91 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray90);
        java.util.Set<java.lang.Cloneable> cloneableSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) bytesRefArray90);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 100.0f, (double) 100.0f);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, (double) 0L);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        int[] intArray2 = new int[] { 0 };
        int[] intArray8 = new int[] { (short) -1, (-1), (short) 0, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray8);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 1, (double) 0L);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 0.0d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (short) 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (byte) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 10, 10.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        int[] intArray5 = new int[] { (short) 100, (-1), 1, (short) -1, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService62);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 0, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        double[] doubleArray6 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray12, (double) 100);
        double[] doubleArray21 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray27 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray27, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray27, (double) 1.0f);
        double[] doubleArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray32, (double) 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests2.ruleChain;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.badapples");
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.badapples");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("tests.nightly", fields20, fields27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.slow", indexReader31, terms32, terms33, true);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("", postingsEnum37, postingsEnum38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) postingsEnum38);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests13.queryParser;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.nightly", indexReader23, terms24, terms25, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests13.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("<unknown>", indexReader30, terms31, terms32, false);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests13.indexedValueForSearch(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray2, floatArray7, 1.0f);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray13, 0.0f);
        float[] floatArray20 = new float[] { 1.0f, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray20, (float) (-1L));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 'a');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.junit.rules.RuleChain ruleChain26 = null;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("tests.monster", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32, true);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        simpleIndexQueryParserTests10.assertFieldStatisticsEquals("node_s_0", fields40, fields43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.badapples");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("node_s_0", fields40, fields51);
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) (byte) -1, numericDocValues55, numericDocValues56);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (long) (byte) 100);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray8, 1.0f);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray14, 0.0f);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) (short) 0);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray20, floatArray25, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray25, (float) (byte) 10);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray25, floatArray32, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray25, (float) '4');
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        int[] intArray5 = new int[] { (-1), ' ', 100, ' ', (short) -1 };
        int[] intArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray3 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 10, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, 0.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 'a');
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (byte) 1, (double) (-1L));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        int[] intArray2 = new int[] { 2 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray3);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader28, 1, postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
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
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) -1, 100.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService25);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) (short) 1, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (short) 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray6, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray14);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray38, byteArray41);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray46, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray38, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray33, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray46);
        byte[] byteArray55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray55);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        int[] intArray6 = new int[] { (short) 10, 'a', '4', 0, (short) 1 };
        int[] intArray10 = new int[] { 100, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray16);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray39, byteArray42);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray39, byteArray47);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray56, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray39);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray71, byteArray74);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray79);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray71, byteArray79);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray79);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray79);
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray79, byteArray93);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        float[] floatArray3 = new float[] { (byte) 1, '#' };
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray10, 1.0f);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray16, 0.0f);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray22, floatArray27, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray3, floatArray16, 1.0f);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray42);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass40 = ruleChain39.getClass();
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain39, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.apache.lucene.util.BytesRef[] bytesRefArray1 = new org.apache.lucene.util.BytesRef[] {};
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet2 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray1);
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet3 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("tests.maxfailures", indexReader6, (-1), postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests4.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests4.getqueryParser();
        java.lang.String str14 = simpleIndexQueryParserTests4.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) bytesRefArray1, (java.lang.Object) str14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) -1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests17.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests17.getqueryParser();
        java.lang.String str27 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.setUp();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (byte) 0, (long) (short) 1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "<unknown>");
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) strArray39);
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "node_s_0");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields33, fields44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray28, (double) 1.0f);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray60, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray28, doubleArray60, (double) '#');
        double[] doubleArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
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
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader19, (int) (short) 10, postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) -1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        double[] doubleArray38 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray44 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray38, doubleArray44, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray44, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray29, (double) (short) 100);
        double[] doubleArray57 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray63 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray57, doubleArray63, (double) 100);
        double[] doubleArray72 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray78 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray72, doubleArray78, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray78, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray78, (double) 2);
        double[] doubleArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray78, doubleArray85, (double) 10L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("node_s_0", true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", 0, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 2, (double) (short) -1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray6, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("", indexReader29, terms30, terms31, true);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService35);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray14, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("random", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.failfast", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields3, (java.lang.Object) locale5);
        java.lang.Class<?> wildcardClass7 = fields3.getClass();
        double[] doubleArray15 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray21 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray21, (double) 100);
        double[] doubleArray30 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray36 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray30, doubleArray36, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray36, (double) 1.0f);
        double[] doubleArray47 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray53 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray47, doubleArray53, (double) 100);
        double[] doubleArray62 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray68 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray62, doubleArray68, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray68, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray36, doubleArray68, (double) '#');
        double[] doubleArray81 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray87 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray81, doubleArray87, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray87, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields3, (java.lang.Object) (short) -1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 1, (long) (byte) 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 0, (double) 10L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 0, (long) (byte) 1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) ' ', (double) (short) 100);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) executorServiceArray3);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) serializableArray18);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 2, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("", indexReader36, terms37, terms38, true);
        org.junit.rules.RuleChain ruleChain41 = null;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain41;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests25.assertDocsSkippingEquals("tests.monster", indexReader44, (int) (short) 1, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests25.getqueryParser();
        org.junit.rules.TestRule testRule51 = simpleIndexQueryParserTests25.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) charArray22, (java.lang.Object) testRule51);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch(1L);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (-1), postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("tests.slow", postingsEnum23, postingsEnum24, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests14.setqueryParser(indexQueryParserService27);
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("tests.weekly", postingsEnum37, postingsEnum38, false);
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 10, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) '#');
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = null;
        simpleIndexQueryParserTests25.setqueryParser(indexQueryParserService26);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests25, (java.lang.Object) fields35);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests25.queryParser();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) executorServiceArray48);
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.badapples");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("tests.maxfailures", indexReader59, (-1), postingsEnum61, postingsEnum62);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("tests.maxfailures", indexReader65, (int) (short) 1, postingsEnum67, postingsEnum68);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = null;
        simpleIndexQueryParserTests57.queryParser = indexQueryParserService70;
        org.apache.lucene.util.BytesRef bytesRef73 = simpleIndexQueryParserTests57.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader75 = null;
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields79, (java.lang.Object) locale81);
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.badapples");
        simpleIndexQueryParserTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader75, fields79, fields87, false);
        simpleIndexQueryParserTests25.assertFieldsEquals("tests.monster", indexReader39, fields56, fields79, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields79, false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests1.queryParser;
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
        short[] shortArray52 = new short[] { (byte) 1 };
        short[] shortArray54 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray59);
        short[] shortArray63 = new short[] { (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray59, shortArray63);
        short[] shortArray76 = new short[] { (byte) 1 };
        short[] shortArray78 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray78);
        short[] shortArray81 = new short[] { (byte) 1 };
        short[] shortArray83 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray83);
        short[] shortArray86 = new short[] { (byte) 1 };
        short[] shortArray88 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray88);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray76, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray76);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) indexQueryParserService24, (java.lang.Object) shortArray39);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) ' ', (double) 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (byte) 1 };
        short[] shortArray7 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray10 = new short[] { (byte) 1 };
        short[] shortArray12 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray15 = new short[] { (byte) 1 };
        short[] shortArray17 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray17);
        short[] shortArray22 = new short[] { (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray27 = new short[] { (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray27);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray22);
        short[] shortArray40 = new short[] { (byte) 1 };
        short[] shortArray42 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        short[] shortArray45 = new short[] { (byte) 1 };
        short[] shortArray47 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray45);
        org.junit.Assert.assertArrayEquals("random", shortArray5, shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) (short) -1, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests1.indexedValueForSearch(1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) 1L);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) -1, (long) 10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader44, terms45, terms46, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) terms53);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray18 = new char[] { 'a', '#' };
        char[] charArray21 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray3, charArray21);
        char[] charArray26 = new char[] { 'a', '#' };
        char[] charArray29 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        char[] charArray33 = new char[] { 'a', '#' };
        char[] charArray36 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        org.junit.Assert.assertArrayEquals(charArray26, charArray36);
        org.junit.Assert.assertArrayEquals(charArray21, charArray26);
        char[] charArray42 = new char[] { 'a', '#' };
        char[] charArray45 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray49 = new char[] { 'a', '#' };
        char[] charArray52 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        org.junit.Assert.assertArrayEquals(charArray42, charArray52);
        char[] charArray57 = new char[] { 'a', '#' };
        char[] charArray60 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray57, charArray60);
        char[] charArray64 = new char[] { 'a', '#' };
        char[] charArray67 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray64, charArray67);
        org.junit.Assert.assertArrayEquals(charArray57, charArray67);
        org.junit.Assert.assertArrayEquals(charArray52, charArray57);
        org.junit.Assert.assertArrayEquals(charArray21, charArray57);
        char[] charArray72 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray57, charArray72);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 10, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) ' ');
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 10, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader2, terms3, terms4, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 100, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "hi!");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.badapples");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "hi!");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService34;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests21.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService38;
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.badapples");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("tests.monster", fields48, fields55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields20, fields48, false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) 1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10L, 10.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        int[] intArray5 = new int[] { (byte) 0, 100, 'a', (short) 100 };
        int[] intArray10 = new int[] { 'a', '4', 'a', (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray5, intArray10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0.0d, (double) '#', (double) 1.0f);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { 1, 2, (byte) 100, (byte) 100, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray1, intArray8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (-1.0d), (double) 10.0f);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) -1, (long) (byte) 100);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray15);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray48);
        short[] shortArray54 = new short[] { (byte) 1 };
        short[] shortArray56 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests61.assertPositionsSkippingEquals("tests.maxfailures", indexReader63, (-1), postingsEnum65, postingsEnum66);
        simpleIndexQueryParserTests61.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests61.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests61.assertDocsSkippingEquals("random", indexReader71, (int) (byte) 100, postingsEnum73, postingsEnum74, true);
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = null;
        simpleIndexQueryParserTests61.queryParser = indexQueryParserService79;
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        simpleIndexQueryParserTests61.assertDocsSkippingEquals("tests.failfast", indexReader82, (int) '#', postingsEnum84, postingsEnum85, true);
        org.apache.lucene.util.BytesRef bytesRef90 = simpleIndexQueryParserTests61.longToPrefixCoded(0L, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) shortArray20, (java.lang.Object) 0L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1, (double) 1L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        int[] intArray6 = new int[] { 100, (short) 0, '#', (byte) 0, (short) 1, '4' };
        int[] intArray13 = new int[] { (short) -1, (byte) 1, 2, 2, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray15);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray37);
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray37, byteArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray37);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray8, 1.0f);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray14, 0.0f);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) (short) 0);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray20, floatArray25, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) ' ');
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) (short) 0);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray33, floatArray38, 1.0f);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray44, 0.0f);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) (short) 0);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray50, floatArray55, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray55, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray55, (float) (short) 100);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 0);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray65, floatArray70, 1.0f);
        float[] floatArray76 = new float[] {};
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray77, (float) (short) 0);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray76, floatArray81, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray81, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray55, floatArray81, (float) 100);
        float[] floatArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray81, floatArray90, (float) 10L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests37.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, (-1), postingsEnum41, postingsEnum42);
        org.junit.rules.TestRule testRule44 = simpleIndexQueryParserTests37.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests37.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests37.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("tests.maxfailures", indexReader50, (-1), postingsEnum52, postingsEnum53);
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests48.resetCheckIndexStatus();
        simpleIndexQueryParserTests48.ensureCleanedUp();
        simpleIndexQueryParserTests48.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests37, (java.lang.Object) simpleIndexQueryParserTests48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests60.assertPositionsSkippingEquals("tests.maxfailures", indexReader62, (-1), postingsEnum64, postingsEnum65);
        simpleIndexQueryParserTests60.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests60.assertDocsEnumEquals("", postingsEnum69, postingsEnum70, true);
        simpleIndexQueryParserTests60.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService74 = simpleIndexQueryParserTests60.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests75.assertPositionsSkippingEquals("tests.maxfailures", indexReader77, (-1), postingsEnum79, postingsEnum80);
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests75.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService84 = simpleIndexQueryParserTests75.getqueryParser();
        java.lang.String str85 = simpleIndexQueryParserTests75.getTestName();
        simpleIndexQueryParserTests75.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) indexQueryParserService74, (java.lang.Object) simpleIndexQueryParserTests75);
        simpleIndexQueryParserTests75.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain89 = simpleIndexQueryParserTests75.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain89;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain89);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 2);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        int[] intArray2 = new int[] { 10 };
        int[] intArray9 = new int[] { 100, 1, (byte) -1, 10, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray2, intArray9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests11.ruleChain;
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("hi!", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests11.queryParser();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService10, (java.lang.Object) ruleChain28);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        int[] intArray6 = new int[] { (byte) 0, 1, 1, (short) 0, (short) 1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 1, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (short) 100);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray3);
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.lang.Class<?> wildcardClass28 = executorServiceArray14.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (int) (short) 1, postingsEnum39, postingsEnum40);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests29.queryParser = indexQueryParserService42;
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests29.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader47 = null;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields51, (java.lang.Object) locale53);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.badapples");
        simpleIndexQueryParserTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields51, fields59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.weekly", indexReader63, terms64, terms65, true);
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass69 = ruleChain68.getClass();
        java.lang.Class[] classArray71 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        wildcardClassArray72[0] = wildcardClass28;
        wildcardClassArray72[1] = wildcardClass69;
        java.util.Set<java.lang.Class<?>> wildcardClassSet77 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray3, (java.lang.Object[]) wildcardClassArray72);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) fields11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.awaitsfix", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService34;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests21.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService38;
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.badapples");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("tests.monster", fields48, fields55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "hi!");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.badapples");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("", fields55, fields70);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 100, (double) ' ');
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService16;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray6, strArray12, strArray18, strArray24, strArray30, strArray36 };
        java.util.Set<java.lang.String[]> strArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (-1), postingsEnum43, postingsEnum44);
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests39.ruleChain;
        simpleIndexQueryParserTests39.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        simpleIndexQueryParserTests39.setUp();
        org.junit.rules.TestRule testRule51 = simpleIndexQueryParserTests39.ruleChain;
        simpleIndexQueryParserTests39.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) strArray37, (java.lang.Object) simpleIndexQueryParserTests39);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray9);
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "");
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, (-1), postingsEnum37, postingsEnum38);
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests33.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests33.getqueryParser();
        java.lang.String str43 = simpleIndexQueryParserTests33.getTestName();
        simpleIndexQueryParserTests33.setUp();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests33.queryParser = indexQueryParserService46;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests33.longToPrefixCoded((long) 2, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) strArray1, (java.lang.Object) simpleIndexQueryParserTests33);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '#', 0.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray4);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("tests.maxfailures", indexReader43, (-1), postingsEnum45, postingsEnum46);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("tests.maxfailures", indexReader49, (int) (short) 1, postingsEnum51, postingsEnum52);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = null;
        simpleIndexQueryParserTests41.queryParser = indexQueryParserService54;
        org.apache.lucene.util.BytesRef bytesRef57 = simpleIndexQueryParserTests41.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader59 = null;
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields63, (java.lang.Object) locale65);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.badapples");
        simpleIndexQueryParserTests41.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields63, fields71, false);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("tests.weekly", indexReader75, terms76, terms77, true);
        org.junit.rules.RuleChain ruleChain80 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain80;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService82 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService82);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) (-1));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) ' ');
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray18 = new char[] { 'a', '#' };
        char[] charArray21 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        char[] charArray25 = new char[] { 'a', '#' };
        char[] charArray28 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        org.junit.Assert.assertArrayEquals(charArray18, charArray28);
        char[] charArray33 = new char[] { 'a', '#' };
        char[] charArray36 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        char[] charArray40 = new char[] { 'a', '#' };
        char[] charArray43 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray33, charArray43);
        org.junit.Assert.assertArrayEquals(charArray28, charArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray13, charArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService25;
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests12.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService29;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.Object obj35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj35);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "hi!");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.badapples");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "hi!");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.badapples");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "hi!");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("<unknown>", fields25, fields37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str41 = mockMoreLikeThisFetchService40.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str44 = mockMoreLikeThisFetchService43.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str47 = mockMoreLikeThisFetchService46.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str49 = mockMoreLikeThisFetchService48.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray51 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService42, mockMoreLikeThisFetchService43, mockMoreLikeThisFetchService45, mockMoreLikeThisFetchService46, mockMoreLikeThisFetchService48, mockMoreLikeThisFetchService50 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet52 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray51);
        org.junit.Assert.assertNotSame("", (java.lang.Object) mockMoreLikeThisFetchService40, (java.lang.Object) abstractComponentSet52);
        java.lang.String str54 = mockMoreLikeThisFetchService40.nodeName();
        java.lang.String str55 = mockMoreLikeThisFetchService40.nodeName();
        java.lang.String str56 = mockMoreLikeThisFetchService40.nodeName();
        java.lang.String str57 = mockMoreLikeThisFetchService40.nodeName();
        java.lang.String str58 = mockMoreLikeThisFetchService40.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields25, (java.lang.Object) mockMoreLikeThisFetchService40);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 2, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 0, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) (short) 100);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray15 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray9, doubleArray15, (double) 100);
        double[] doubleArray24 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray30 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray24, doubleArray30, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray30, (double) 1.0f);
        double[] doubleArray41 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray47 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray41, doubleArray47, (double) 100);
        double[] doubleArray56 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray62 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray56, doubleArray62, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray62, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray30, doubleArray62, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray1, doubleArray62, (double) 100.0f);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) -1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) ' ');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule29);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) -1, 100L);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
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
        simpleIndexQueryParserTests0.setUp();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "hi!");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.badapples");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray73);
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) strArray82);
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields42, fields88);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
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
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray15);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray48);
        short[] shortArray54 = new short[] { (byte) 1 };
        short[] shortArray56 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        simpleIndexQueryParserTests63.assertTermsEquals("tests.slow", indexReader65, terms66, terms67, true);
        org.apache.lucene.util.BytesRef bytesRef71 = simpleIndexQueryParserTests63.indexedValueForSearch(0L);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) shortArray20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader19, terms20, terms21, true);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray29);
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "<unknown>");
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) strArray40);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "node_s_0");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.monster", fields34, fields45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray3);
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("tests.slow", postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService26);
        simpleIndexQueryParserTests13.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests35.assertDocsEnumEquals("tests.slow", postingsEnum44, postingsEnum45, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests35.setqueryParser(indexQueryParserService48);
        simpleIndexQueryParserTests35.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader52, (int) (short) 1, postingsEnum54, postingsEnum55);
        java.lang.Object[] objArray57 = new java.lang.Object[] { "tests.awaitsfix", (short) 1, postingsEnum54 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, objArray57);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
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
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, 10, (short) 1, 0 };
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        java.lang.Object obj1 = null;
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray15 = new short[] { (byte) 1 };
        short[] shortArray17 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", obj1, (java.lang.Object) shortArray8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        long[] longArray4 = new long[] { (byte) 100, 0L, (byte) -1, (-1) };
        long[] longArray8 = new long[] { 'a' };
        long[] longArray10 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
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
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        org.junit.Assert.assertArrayEquals("hi!", longArray10, longArray15);
        long[] longArray38 = new long[] { 'a' };
        long[] longArray40 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray45 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        long[] longArray49 = new long[] { 'a' };
        long[] longArray51 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        long[] longArray54 = new long[] { 'a' };
        long[] longArray56 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray54, longArray56);
        org.junit.Assert.assertArrayEquals(longArray51, longArray54);
        org.junit.Assert.assertArrayEquals(longArray40, longArray51);
        long[] longArray62 = new long[] { 'a' };
        long[] longArray64 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray62, longArray64);
        long[] longArray67 = new long[] { 'a' };
        long[] longArray69 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray67, longArray69);
        long[] longArray72 = new long[] { 'a' };
        long[] longArray74 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray72, longArray74);
        org.junit.Assert.assertArrayEquals(longArray69, longArray72);
        long[] longArray78 = new long[] { 'a' };
        long[] longArray80 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray78, longArray80);
        long[] longArray83 = new long[] { 'a' };
        long[] longArray85 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray83, longArray85);
        org.junit.Assert.assertArrayEquals(longArray80, longArray83);
        org.junit.Assert.assertArrayEquals(longArray69, longArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray51, longArray80);
        org.junit.Assert.assertArrayEquals("node_s_0", longArray10, longArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests20.ruleChain;
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader30, 10, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("random", postingsEnum36, postingsEnum37, true);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum36);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.String str42 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "hi!");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.badapples");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "");
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "hi!");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.badapples");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.nightly", fields55, fields67);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (-1), postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests14.queryParser = indexQueryParserService27;
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests14.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields36, (java.lang.Object) locale38);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.badapples");
        simpleIndexQueryParserTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields36, fields44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.weekly", indexReader48, terms49, terms50, true);
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("random", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) indexReader57);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet1 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray0);
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (byte) 100, (short) 10 };
        short[] shortArray11 = new short[] { (short) -1, (short) 1, (byte) 100, (short) 10 };
        short[][] shortArray12 = new short[][] { shortArray6, shortArray11 };
        java.util.Set<short[]> shortArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray0, (java.lang.Object[]) shortArray12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        double[] doubleArray38 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray44 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray38, doubleArray44, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray44, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray29, (double) (short) 100);
        double[] doubleArray58 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray64 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray58, doubleArray64, (double) 100);
        double[] doubleArray73 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray79 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray73, doubleArray79, (double) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray58, doubleArray73, (double) (-1));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", doubleArray29, doubleArray73, (double) 'a');
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        int[] intArray2 = new int[] { '4' };
        int[] intArray7 = new int[] { (short) 0, (short) 0, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) -1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum27, postingsEnum28, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (-1), postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests31.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests31.assertDocsSkippingEquals("random", indexReader41, (int) (byte) 100, postingsEnum43, postingsEnum44, true);
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests31.queryParser = indexQueryParserService49;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests31.assertDocsSkippingEquals("tests.failfast", indexReader52, (int) '#', postingsEnum54, postingsEnum55, true);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests31.assertDocsEnumEquals("hi!", postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum27, (java.lang.Object) postingsEnum59);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray6, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray14);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray22);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray29, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray29, byteArray37);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray37, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray45);
        byte[] byteArray49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray22, byteArray49);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { 0, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray5);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        int[] intArray1 = new int[] { 2 };
        int[] intArray5 = new int[] { (short) 0, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) 100.0f);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1.0f), (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule[] testRuleArray11 = new org.junit.rules.TestRule[] { ruleChain10 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet12 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray11);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleArray11, (java.lang.Object[]) serializableArray14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (-1.0d));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        char[][] charArray0 = new char[][] {};
        java.util.Set<char[]> charArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(charArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray22);
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (byte) -1, '4', ' ', 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 100, (double) 10L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService16;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24, false);
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests10.longToPrefixCoded((long) 0, (int) (byte) 10);
        simpleIndexQueryParserTests10.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule9, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        double[] doubleArray6 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray12, (double) 100);
        double[] doubleArray21 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray27 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray27, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray27, (double) 1.0f);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray39, doubleArray54, (double) (-1));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray54, (double) (short) 10);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        int[] intArray6 = new int[] { 100, (short) 0, (short) 100, (short) -1, 2 };
        int[] intArray11 = new int[] { 1, 2, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray6, intArray11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 0, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray25);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) fields31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray34);
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields31, fields41, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader16);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) executorServiceArray19);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.nightly");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests26.queryParser;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("tests.nightly", indexReader36, terms37, terms38, false);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) strArray47);
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "node_s_0");
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.badapples");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("tests.maxfailures", fields52, fields57);
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader10, fields25, fields57, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) fields57);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 2);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray24);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        int[] intArray4 = new int[] { (byte) 1, 1, (byte) -1, 10 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, 10L);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { (short) -1, 1, 1, (-1), '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        int[] intArray1 = new int[] {};
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray2);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        int[] intArray4 = new int[] { '4', 100, 100 };
        int[] intArray7 = new int[] { (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray7);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
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
        java.lang.Class<?> wildcardClass21 = executorServiceArray7.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests22.queryParser = indexQueryParserService35;
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests22.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader40 = null;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields44, (java.lang.Object) locale46);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.badapples");
        simpleIndexQueryParserTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields44, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.weekly", indexReader56, terms57, terms58, true);
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass62 = ruleChain61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass21;
        wildcardClassArray65[1] = wildcardClass62;
        java.util.Set<java.lang.Class<?>> wildcardClassSet70 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray65);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray65);
        java.util.List<java.lang.reflect.Type> typeList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.reflect.Type[]) wildcardClassArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray75);
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) strArray78);
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) wildcardClassArray65, (java.lang.Object[]) strArray78);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, (long) (byte) 100);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (-1L));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray2, floatArray7, 1.0f);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 0);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) (short) 0);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray19, floatArray24, 1.0f);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray30, 0.0f);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray36, floatArray41, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray41, (float) (byte) 10);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) (short) 0);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray49, floatArray54, 1.0f);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray60, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray30, floatArray49, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray14, floatArray49, (float) 2);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray14, 100.0f);
        float[] floatArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray71, (float) '4');
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, 'a', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray15 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray9, doubleArray15, (double) 100);
        double[] doubleArray24 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray30 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray24, doubleArray30, (double) 100);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray45, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray9, doubleArray30, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1L, (long) ' ');
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 1, (long) 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
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
        java.lang.String str17 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.badapples");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "hi!");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.badapples");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields25, fields39, false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("tests.monster", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.maxfailures", indexReader28, terms29, terms30, false);
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader12, (int) '4', postingsEnum14, postingsEnum15);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 10);
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.slow", indexReader24, terms25, terms26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.nightly", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests22.assertDocsSkippingEquals("tests.maxfailures", indexReader37, 0, postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '#', (java.lang.Object) indexReader37);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) -1, (double) 2, (double) 0L);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests1.longToPrefixCoded(1L, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests19.queryParser = indexQueryParserService27;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("node_s_0", postingsEnum30, postingsEnum31, true);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("random", postingsEnum36, postingsEnum37, true);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray75);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray85);
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray85, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray85);
        boolean boolean92 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray80);
        boolean boolean94 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) executorServiceArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "random");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray15);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray39, byteArray42);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray39, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray34, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) byteArray1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) ' ');
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) '#');
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 100, 0L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray38);
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
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray38);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray68);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) strArray68);
        java.lang.Class<?> wildcardClass75 = strArray68.getClass();
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) strArray68, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray72);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) strArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray6, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray14);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (-1), postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, (int) (short) 1, postingsEnum41, postingsEnum42);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests31.queryParser = indexQueryParserService44;
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests31.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests31.queryParser = indexQueryParserService48;
        simpleIndexQueryParserTests31.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests31.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService53 = simpleIndexQueryParserTests31.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str55 = mockMoreLikeThisFetchService54.nodeName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests31, (java.lang.Object) mockMoreLikeThisFetchService54);
        java.lang.String str57 = mockMoreLikeThisFetchService54.nodeName();
        java.lang.String str58 = mockMoreLikeThisFetchService54.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray0, (java.lang.Object) str58);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        int[] intArray5 = new int[] { 1, '#', 0, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray5, intArray6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str20 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str21 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str22 = mockMoreLikeThisFetchService19.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) byteArray4, (java.lang.Object) mockMoreLikeThisFetchService19);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) ruleChain40);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests12.longToPrefixCoded((long) (short) 10, 0);
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.weekly", indexReader32, (int) '4', postingsEnum34, postingsEnum35, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray9, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray15);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray37);
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray37, byteArray41);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray48, byteArray51);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray56, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray48, byteArray56);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray56, byteArray64);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray71, byteArray74);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray79);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray71, byteArray79);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray86, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray79, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray64, byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray64);
        byte[] byteArray94 = new byte[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray94);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
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
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader44, terms45, terms46, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests1.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 0, (java.lang.Object) indexQueryParserService56);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0, (double) (byte) 10);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
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
        org.apache.lucene.util.BytesRef[] bytesRefArray19 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray20 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray21 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray19, bytesRefArray20 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) bytesRefArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) bytesRefArray21);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        int[] intArray4 = new int[] { (byte) 1, '4', '#' };
        int[] intArray9 = new int[] { (byte) 10, 10, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray9);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 100, (long) 1);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, 100, 10 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests2.ruleChain;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.badapples");
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.badapples");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("tests.nightly", fields20, fields27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.slow", indexReader30, terms31, terms32, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = null;
        simpleIndexQueryParserTests35.queryParser = indexQueryParserService43;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests35.assertDocsEnumEquals("node_s_0", postingsEnum46, postingsEnum47, true);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests51.assertPositionsSkippingEquals("tests.maxfailures", indexReader53, (-1), postingsEnum55, postingsEnum56);
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests51.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests51.getqueryParser();
        java.lang.String str61 = simpleIndexQueryParserTests51.getTestName();
        simpleIndexQueryParserTests51.setUp();
        org.junit.rules.RuleChain ruleChain63 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain63;
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = simpleIndexQueryParserTests35.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests35);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) executorServiceArray19);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.nightly");
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) executorServiceArray34);
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.nightly");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str9, (java.lang.Object) executorServiceArray44);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray3);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (byte) 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 'a');
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray12);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (-1), postingsEnum32, postingsEnum33);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests28.queryParser = indexQueryParserService36;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests28.queryParser = indexQueryParserService38;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) byteArray4, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests16.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests16.getqueryParser();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests16.queryParser;
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests30.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (-1), postingsEnum34, postingsEnum35);
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("", indexReader41, terms42, terms43, true);
        org.junit.rules.RuleChain ruleChain46 = null;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests30.queryParser;
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.setIndexWriterMaxDocs((int) (short) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests16, (java.lang.Object) simpleIndexQueryParserTests30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) terms12, (java.lang.Object) simpleIndexQueryParserTests30);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray32, byteArray35);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray40);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray40, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray26, byteArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) ' ', (long) (short) 1);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        int[] intArray4 = new int[] { 'a', (byte) 0, '4', (short) 1 };
        int[] intArray10 = new int[] { (byte) 0, '#', (short) 1, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService20;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests30.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (-1), postingsEnum34, postingsEnum35);
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests30.queryParser;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("tests.nightly", indexReader40, terms41, terms42, false);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) strArray51);
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "node_s_0");
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.badapples");
        simpleIndexQueryParserTests30.assertFieldStatisticsEquals("tests.maxfailures", fields56, fields61);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService65 = null;
        simpleIndexQueryParserTests64.setqueryParser(indexQueryParserService65);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests64, (java.lang.Object) fields74);
        org.junit.rules.TestRule testRule76 = simpleIndexQueryParserTests64.ruleChain;
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.badapples");
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.badapples");
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.nightly");
        simpleIndexQueryParserTests64.assertFieldStatisticsEquals("tests.nightly", fields82, fields89);
        simpleIndexQueryParserTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields61, fields89, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexReader29);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        char[] charArray5 = new char[] { 'a', '#' };
        char[] charArray8 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        char[] charArray12 = new char[] { 'a', '#' };
        char[] charArray15 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        org.junit.Assert.assertArrayEquals(charArray5, charArray15);
        char[] charArray20 = new char[] { 'a', '#' };
        char[] charArray23 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray23);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray23);
        char[] charArray28 = new char[] { 'a', '#' };
        char[] charArray31 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        char[] charArray35 = new char[] { 'a', '#' };
        char[] charArray38 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        org.junit.Assert.assertArrayEquals(charArray28, charArray38);
        org.junit.Assert.assertArrayEquals(charArray23, charArray28);
        char[] charArray44 = new char[] { 'a', '#' };
        char[] charArray47 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray23, charArray47);
        char[] charArray53 = new char[] { 'a', '#' };
        char[] charArray56 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray56);
        char[] charArray60 = new char[] { 'a', '#' };
        char[] charArray63 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray63);
        org.junit.Assert.assertArrayEquals(charArray53, charArray63);
        char[] charArray68 = new char[] { 'a', '#' };
        char[] charArray71 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray68, charArray71);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray53, charArray71);
        org.junit.Assert.assertArrayEquals("random", charArray23, charArray53);
        short[][][] shortArray75 = new short[][][] {};
        java.util.Set<short[][]> shortArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) shortArray75);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        int[] intArray6 = new int[] { (byte) 1, 'a', 10, (short) -1, (byte) -1 };
        int[] intArray10 = new int[] { 1, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray6, intArray10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        int[] intArray3 = new int[] { (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { (short) -1, 10, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray3, intArray8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (-1), postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests14.queryParser();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain24;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray32);
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "<unknown>");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader28, fields29, fields39, true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader21, (-1), postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, true);
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests29.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests29);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        char[] charArray1 = null;
        char[] charArray6 = new char[] { 'a', '#' };
        char[] charArray9 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray13 = new char[] { 'a', '#' };
        char[] charArray16 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray6, charArray16);
        char[] charArray21 = new char[] { 'a', '#' };
        char[] charArray24 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray6, charArray24);
        char[] charArray29 = new char[] { 'a', '#' };
        char[] charArray32 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        char[] charArray36 = new char[] { 'a', '#' };
        char[] charArray39 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals(charArray29, charArray39);
        org.junit.Assert.assertArrayEquals(charArray24, charArray29);
        char[] charArray45 = new char[] { 'a', '#' };
        char[] charArray48 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray24, charArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray48);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, 0.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, true);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) '4', (double) 1.0f);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.apache.lucene.util.BytesRef[] bytesRefArray0 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray1 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray2 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray0, bytesRefArray1 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray2);
        java.util.Set<java.lang.Cloneable> cloneableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray15);
        java.lang.Class<?> wildcardClass24 = executorServiceArray10.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService38;
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests25.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader43 = null;
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields47, (java.lang.Object) locale49);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.badapples");
        simpleIndexQueryParserTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader43, fields47, fields55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("tests.weekly", indexReader59, terms60, terms61, true);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass65 = ruleChain64.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        wildcardClassArray68[0] = wildcardClass24;
        wildcardClassArray68[1] = wildcardClass65;
        java.util.Set<java.lang.Class<?>> wildcardClassSet73 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray68);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray68);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) bytesRefArray2, (java.lang.Object[]) wildcardClassArray68);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 10L, (long) 100);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests6.ruleChain;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.slow", indexReader11, 100, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService29;
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests16.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader34 = null;
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields38, (java.lang.Object) locale40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        simpleIndexQueryParserTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields38, fields46, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests49.assertPositionsSkippingEquals("tests.maxfailures", indexReader51, (-1), postingsEnum53, postingsEnum54);
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.resetCheckIndexStatus();
        simpleIndexQueryParserTests49.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        simpleIndexQueryParserTests49.assertTermsEquals("", indexReader60, terms61, terms62, true);
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain65;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule70 = simpleIndexQueryParserTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.monster", postingsEnum72, postingsEnum73, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", obj1, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (short) 1, 0.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray24);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale30, locale32 };
        java.util.List<java.util.Locale> localeList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, localeArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) localeArray33);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100.0d, (double) '#', 10.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
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
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray31);
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("tests.nightly", objArray38, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, objArray38);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "hi!");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.badapples");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) strArray55);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, 2, (-1) };
        int[] intArray10 = new int[] { 1, (short) 1, (byte) -1, 2, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) 1);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { 'a' };
        long[] longArray6 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { 'a' };
        long[] longArray11 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray15 = new long[] { 'a' };
        long[] longArray17 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { 'a' };
        long[] longArray22 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray17, longArray20);
        org.junit.Assert.assertArrayEquals(longArray6, longArray17);
        long[] longArray28 = new long[] { 'a' };
        long[] longArray30 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray33 = new long[] { 'a' };
        long[] longArray35 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        long[] longArray38 = new long[] { 'a' };
        long[] longArray40 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        long[] longArray44 = new long[] { 'a' };
        long[] longArray46 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray44, longArray46);
        long[] longArray49 = new long[] { 'a' };
        long[] longArray51 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        org.junit.Assert.assertArrayEquals(longArray46, longArray49);
        org.junit.Assert.assertArrayEquals(longArray35, longArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray46);
        long[] longArray58 = new long[] { 'a' };
        long[] longArray60 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray58, longArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray46, longArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray58);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '4', (double) (short) 10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader11);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "hi!");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "hi!");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests34.setqueryParser(indexQueryParserService35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests34, (java.lang.Object) fields44);
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests34.ruleChain;
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.badapples");
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.badapples");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.nightly");
        simpleIndexQueryParserTests34.assertFieldStatisticsEquals("tests.nightly", fields52, fields59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields32, fields52);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0L, (long) (short) 100);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) -1, (long) (short) 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) str10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        int[] intArray1 = null;
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray6);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 0);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 1);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[][] strArray63 = new java.lang.String[][] { strArray32, strArray38, strArray44, strArray50, strArray56, strArray62 };
        java.util.Set<java.lang.String[]> strArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray63);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (byte) 100, postingsEnum42, postingsEnum43, false);
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 2);
        java.lang.String str48 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str48);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.nightly", indexReader12, terms13, terms14, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests2.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests2.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService19;
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests2.longToPrefixCoded((long) 2, (int) (byte) 10);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) executorServiceArray35);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray42);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "");
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) strArray42);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.nightly", (java.lang.Object) boolean51);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
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
        java.lang.Class<?> wildcardClass17 = bytesRef16.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests18.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("hi!", indexReader30, terms31, terms32, false);
        java.lang.String str35 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass17, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 1);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 100.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
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
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        int[] intArray6 = new int[] { (byte) 1, 2, 100, 0, (byte) 100 };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray8);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray68);
        java.lang.Class<?> wildcardClass72 = executorServiceArray68.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) wildcardClass72);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10L);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray13);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        short[] shortArray30 = new short[] { (byte) 1 };
        short[] shortArray32 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray20, shortArray32);
        short[] shortArray37 = new short[] { (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (byte) 1 };
        short[] shortArray44 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests55.assertPositionsSkippingEquals("tests.maxfailures", indexReader57, (-1), postingsEnum59, postingsEnum60);
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService63 = simpleIndexQueryParserTests55.queryParser();
        simpleIndexQueryParserTests55.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests55.assertDocsSkippingEquals("tests.weekly", indexReader66, (int) (short) 10, postingsEnum68, postingsEnum69, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) shortArray20, (java.lang.Object) true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10L, (double) 100.0f, (double) 0.0f);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
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
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        char[][] charArray0 = new char[][] {};
        java.util.Set<char[]> charArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(charArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "hi!");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.badapples");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray0, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService33;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
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
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray22);
        org.apache.lucene.util.BytesRef[] bytesRefArray30 = new org.apache.lucene.util.BytesRef[] {};
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet31 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray30);
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet32 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) bytesRefArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray34);
        org.apache.lucene.util.BytesRef[] bytesRefArray37 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray38 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray39 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray37, bytesRefArray38 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray39);
        java.util.Set<java.lang.Cloneable> cloneableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray39);
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) bytesRefArray39);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 1, (double) 10.0f, (double) 1L);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        double[] doubleArray6 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray12, (double) 100);
        double[] doubleArray21 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray27 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray27, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray21, (double) (short) 1);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        double[] doubleArray69 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray75 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray69, doubleArray75, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray75, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray75, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray75, (double) (-1.0f));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray10, 1.0f);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray16, 0.0f);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray22, floatArray27, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray27, (float) (byte) 10);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 0);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray35, floatArray40, 1.0f);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray46, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray35, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray1, (java.lang.Object) floatArray35);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
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
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.badapples");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) executorServiceArray27);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.badapples");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "");
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("tests.maxfailures", indexReader55, (-1), postingsEnum57, postingsEnum58);
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests53.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = simpleIndexQueryParserTests53.getqueryParser();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray65 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests53 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet66 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray65);
        java.util.List<org.junit.Assert> assertList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.junit.Assert[]) luceneTestCaseArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray2, (java.lang.Object[]) luceneTestCaseArray65);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 100, (long) 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.junit.rules.RuleChain ruleChain26 = null;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("tests.monster", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.slow", (java.lang.Object) simpleIndexQueryParserTests10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("tests.maxfailures", indexReader40, (-1), postingsEnum42, postingsEnum43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("tests.maxfailures", indexReader46, (int) (short) 1, postingsEnum48, postingsEnum49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests38.queryParser = indexQueryParserService51;
        simpleIndexQueryParserTests38.setUp();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests10, (java.lang.Object) simpleIndexQueryParserTests38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests38);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("", indexReader13, terms14, terms15, true);
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests2.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests9.queryParser = indexQueryParserService22;
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests9.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader27 = null;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields31, (java.lang.Object) locale33);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.badapples");
        simpleIndexQueryParserTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields31, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.weekly", indexReader43, terms44, terms45, true);
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain48;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = null;
        simpleIndexQueryParserTests53.setqueryParser(indexQueryParserService54);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests53, (java.lang.Object) fields63);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService65 = simpleIndexQueryParserTests53.queryParser();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests53);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        int[] intArray5 = new int[] { (-1), (short) -1, (short) 0, '#', (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        byte[] byteArray1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray16);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray35, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray1, byteArray8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) 10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3, executorServiceArray5, executorServiceArray7, executorServiceArray9, executorServiceArray11 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray12);
        java.util.Set<java.lang.Object[]> objArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) executorServiceArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests15.assertDocsSkippingEquals("tests.weekly", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30, true);
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) objArraySet14, (java.lang.Object) testRule33);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (short) 1, (long) (byte) 100);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "hi!");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.badapples");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
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
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray15);
        long[] longArray38 = new long[] { 'a' };
        long[] longArray40 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray45 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        long[] longArray49 = new long[] { 'a' };
        long[] longArray51 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        long[] longArray54 = new long[] { 'a' };
        long[] longArray56 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray54, longArray56);
        org.junit.Assert.assertArrayEquals(longArray51, longArray54);
        long[] longArray60 = new long[] { 'a' };
        long[] longArray62 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray60, longArray62);
        long[] longArray65 = new long[] { 'a' };
        long[] longArray67 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray65, longArray67);
        org.junit.Assert.assertArrayEquals(longArray62, longArray65);
        org.junit.Assert.assertArrayEquals(longArray51, longArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray51);
        org.junit.Assert.assertArrayEquals(longArray15, longArray51);
        long[] longArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray15, longArray73);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests1.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.lang.Class<?> wildcardClass24 = executorServiceArray22.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) testRule21, (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '#', 0.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests21.ruleChain;
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService33;
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0L, (double) ' ');
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray14);
        short[] shortArray21 = new short[] { (byte) 1 };
        short[] shortArray23 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray33);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray21);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray21, shortArray57);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests62.assertPositionsSkippingEquals("tests.maxfailures", indexReader64, (-1), postingsEnum66, postingsEnum67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests62.assertPositionsSkippingEquals("tests.maxfailures", indexReader70, (int) (short) 1, postingsEnum72, postingsEnum73);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService75 = null;
        simpleIndexQueryParserTests62.queryParser = indexQueryParserService75;
        org.apache.lucene.util.BytesRef bytesRef78 = simpleIndexQueryParserTests62.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) shortArray57, (java.lang.Object) ' ');
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray32);
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
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray47);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) serializableArray64);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling4, throttling5, throttling7, throttling10, throttling13 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet17 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray15);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (int) (short) 1, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests19.queryParser = indexQueryParserService32;
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests19.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests19.setqueryParser(indexQueryParserService36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "hi!");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.badapples");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.maxfailures", indexReader54, (-1), postingsEnum56, postingsEnum57);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.maxfailures", indexReader60, (int) (short) 1, postingsEnum62, postingsEnum63);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService65 = null;
        simpleIndexQueryParserTests52.queryParser = indexQueryParserService65;
        org.apache.lucene.util.BytesRef bytesRef68 = simpleIndexQueryParserTests52.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader70 = null;
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields74, (java.lang.Object) locale76);
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.badapples");
        simpleIndexQueryParserTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields74, fields82, false);
        simpleIndexQueryParserTests19.assertFieldsEquals("tests.nightly", indexReader39, fields51, fields82, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) throttlingArray15, (java.lang.Object) true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
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
        short[] shortArray52 = new short[] { (byte) 1 };
        short[] shortArray54 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray52);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) shortArray15);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
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
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader23, terms24, terms25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0L, (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray13);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray21);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray28, byteArray31);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray36, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray28, byteArray36);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray21, byteArray44);
        byte[] byteArray48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray48);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 100, (long) '4');
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.badapples");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray3);
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields14);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceSet1 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) strArray41);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.badapples");
        org.junit.Assert.assertEquals((java.lang.Object[]) mockMoreLikeThisFetchServiceArray0, (java.lang.Object[]) strArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests49.assertPositionsSkippingEquals("tests.maxfailures", indexReader51, (-1), postingsEnum53, postingsEnum54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests49.assertPositionsSkippingEquals("tests.maxfailures", indexReader57, (int) (short) 1, postingsEnum59, postingsEnum60);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = null;
        simpleIndexQueryParserTests49.queryParser = indexQueryParserService62;
        org.apache.lucene.util.BytesRef bytesRef65 = simpleIndexQueryParserTests49.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = null;
        simpleIndexQueryParserTests49.queryParser = indexQueryParserService66;
        simpleIndexQueryParserTests49.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests49.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray41, (java.lang.Object) simpleIndexQueryParserTests49);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16, true);
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        long[] longArray1 = null;
        long[] longArray3 = new long[] { 'a' };
        long[] longArray5 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { 'a' };
        long[] longArray10 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        long[] longArray14 = new long[] { 'a' };
        long[] longArray16 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { 'a' };
        long[] longArray21 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals(longArray8, longArray16);
        long[] longArray27 = new long[] { 'a' };
        long[] longArray29 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        long[] longArray32 = new long[] { 'a' };
        long[] longArray34 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        org.junit.Assert.assertArrayEquals(longArray29, longArray32);
        long[] longArray38 = new long[] { 'a' };
        long[] longArray40 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray45 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray43);
        org.junit.Assert.assertArrayEquals(longArray16, longArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray32);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray12);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray25, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray33, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray25, byteArray33);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray42, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray19);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray54, byteArray57);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray54, byteArray62);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray71, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray19, byteArray71);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        simpleIndexQueryParserTests79.assertPositionsSkippingEquals("tests.maxfailures", indexReader81, (-1), postingsEnum83, postingsEnum84);
        simpleIndexQueryParserTests79.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService87 = simpleIndexQueryParserTests79.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService88 = simpleIndexQueryParserTests79.getqueryParser();
        java.lang.String str89 = simpleIndexQueryParserTests79.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService90 = simpleIndexQueryParserTests79.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.nightly", (java.lang.Object) indexQueryParserService90);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
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
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray7);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) testRule16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray8 = new int[] { ' ', 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray8);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (byte) 100, (long) (short) -1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.slow", indexReader3, terms4, terms5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader9, (int) (short) 10, postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests15.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests15.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray26 = new char[] { 'a', '#' };
        char[] charArray29 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        org.junit.Assert.assertArrayEquals(charArray19, charArray29);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray37);
        char[] charArray44 = new char[] { 'a', '#' };
        char[] charArray47 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray51 = new char[] { 'a', '#' };
        char[] charArray54 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        org.junit.Assert.assertArrayEquals(charArray44, charArray54);
        char[] charArray59 = new char[] { 'a', '#' };
        char[] charArray62 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray44, charArray62);
        char[] charArray67 = new char[] { 'a', '#' };
        char[] charArray70 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        char[] charArray74 = new char[] { 'a', '#' };
        char[] charArray77 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals(charArray67, charArray77);
        org.junit.Assert.assertArrayEquals(charArray62, charArray67);
        org.junit.Assert.assertArrayEquals(charArray37, charArray62);
        char[] charArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray37, charArray82);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 100.0d, (double) 1L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 0.0d, (double) 0L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 'a');
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "hi!");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader19, fields20, fields34, false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        short[] shortArray0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (-1), postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.nightly", indexReader13, terms14, terms15, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("<unknown>", indexReader20, terms21, terms22, false);
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
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
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) shortArray35);
        short[] shortArray53 = new short[] { (byte) 1 };
        short[] shortArray55 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        short[] shortArray58 = new short[] { (byte) 1 };
        short[] shortArray60 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray60);
        short[] shortArray64 = new short[] { (byte) 1 };
        short[] shortArray66 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray66);
        short[] shortArray69 = new short[] { (byte) 1 };
        short[] shortArray71 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray71);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray60, shortArray64);
        short[] shortArray77 = new short[] { (byte) 1 };
        short[] shortArray79 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray79);
        short[] shortArray82 = new short[] { (byte) 1 };
        short[] shortArray84 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        short[] shortArray87 = new short[] { (byte) 1 };
        short[] shortArray89 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray77, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray77);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray35, shortArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray35);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
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
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, (-1), postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) (short) 1, postingsEnum43, postingsEnum44);
        org.junit.rules.RuleChain ruleChain46 = null;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests33.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests33.setqueryParser(indexQueryParserService49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService49);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 0);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray12, floatArray17, 1.0f);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray23, 0.0f);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 0);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray29, floatArray34, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray34, (float) (byte) 10);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray42, floatArray47, 1.0f);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray53, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray23, floatArray42, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray7, floatArray42, (float) 2);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, 0.0f);
        float[] floatArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray64, (float) '4');
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
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
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling49, throttling51, throttling52, throttling54, throttling57, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet64 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) throttlingArray62);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
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
        java.lang.String str20 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader29, 100, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader35, (-1), postingsEnum37, postingsEnum38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray3);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader43, terms44, terms45, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader50, terms51, terms52, false);
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum56, postingsEnum57);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService20);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
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
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) executorServiceArray34);
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) true, (java.lang.Object) fields42);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 0L);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues68 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues68, numericDocValues69);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader14, 10, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests20.queryParser;
        simpleIndexQueryParserTests20.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) testRule19, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        long[] longArray3 = new long[] { 'a' };
        long[] longArray5 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { 'a' };
        long[] longArray10 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        long[] longArray14 = new long[] { 'a' };
        long[] longArray16 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { 'a' };
        long[] longArray21 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals(longArray5, longArray16);
        long[] longArray27 = new long[] { 'a' };
        long[] longArray29 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        long[] longArray32 = new long[] { 'a' };
        long[] longArray34 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        long[] longArray37 = new long[] { 'a' };
        long[] longArray39 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray37);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray45 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        long[] longArray48 = new long[] { 'a' };
        long[] longArray50 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals(longArray34, longArray45);
        org.junit.Assert.assertArrayEquals("hi!", longArray29, longArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray16, longArray29);
        long[] longArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray16, longArray56);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) -1, (int) ' ');
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 100);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (-1), postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (int) (short) 1, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = null;
        simpleIndexQueryParserTests28.queryParser = indexQueryParserService41;
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests28.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader46 = null;
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields50, (java.lang.Object) locale52);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.badapples");
        simpleIndexQueryParserTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields50, fields58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        simpleIndexQueryParserTests28.assertTermsEquals("tests.weekly", indexReader62, terms63, terms64, true);
        org.junit.rules.RuleChain ruleChain67 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain67;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray5, (java.lang.Object) ruleChain67);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray15 = new short[] { (byte) 1 };
        short[] shortArray17 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray27);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray38);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray44);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (byte) 1 };
        short[] shortArray58 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        short[] shortArray61 = new short[] { (byte) 1 };
        short[] shortArray63 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray51, shortArray63);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        short[] shortArray79 = new short[] { (byte) 1 };
        short[] shortArray81 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray8, shortArray33);
        short[] shortArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray87);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) (short) -1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        short[] shortArray29 = new short[] { (byte) 1 };
        short[] shortArray31 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        short[] shortArray35 = new short[] { (byte) 1 };
        short[] shortArray37 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray24);
        java.lang.Object obj42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray4, obj42);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService31;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests18.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService35;
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum41, postingsEnum42, false);
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray29, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray29, 0.0d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 1);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray11);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.nightly");
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) executorServiceArray26);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.nightly");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray73);
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) strArray3);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 0L);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, false);
        java.lang.Object obj26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, obj26);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1.0f, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests0.queryParser;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray41);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.badapples");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "hi!");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.badapples");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "hi!");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "enwiki.random.lines.txt");
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) strArray53);
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) strArray53);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
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
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) bytesRef16);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) locale2, (java.lang.Object) executorServiceArray11);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) strArray22);
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "node_s_0");
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.maxfailures", fields27, fields32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader35, (int) (short) 10, postingsEnum37, postingsEnum38);
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) (short) -1);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum21, postingsEnum22, true);
        java.lang.String str25 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests2.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) indexQueryParserService14);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
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
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray28);
        short[] shortArray46 = new short[] { (byte) 1 };
        short[] shortArray48 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray28, shortArray46);
        short[] shortArray58 = new short[] { (byte) 1 };
        short[] shortArray60 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray58);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests63.assertPositionsSkippingEquals("tests.maxfailures", indexReader65, (-1), postingsEnum67, postingsEnum68);
        org.junit.rules.TestRule testRule70 = simpleIndexQueryParserTests63.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef72 = simpleIndexQueryParserTests63.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests63.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        simpleIndexQueryParserTests74.assertPositionsSkippingEquals("tests.maxfailures", indexReader76, (-1), postingsEnum78, postingsEnum79);
        simpleIndexQueryParserTests74.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests74.resetCheckIndexStatus();
        simpleIndexQueryParserTests74.ensureCleanedUp();
        simpleIndexQueryParserTests74.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests63, (java.lang.Object) simpleIndexQueryParserTests74);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        simpleIndexQueryParserTests74.assertTermsEquals("tests.badapples", indexReader87, terms88, terms89, false);
        simpleIndexQueryParserTests74.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray58, (java.lang.Object) simpleIndexQueryParserTests74);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray2, intArray4);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray40);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray40);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "hi!");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.badapples");
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray64);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) (byte) 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 1.0d, (double) (short) -1);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        short[] shortArray6 = new short[] { (byte) 0, (short) -1, (short) 10, (byte) 100, (short) 10, (short) 1 };
        short[] shortArray13 = new short[] { (byte) 0, (short) -1, (short) 10, (byte) 100, (short) 10, (short) 1 };
        short[] shortArray20 = new short[] { (byte) 0, (short) -1, (short) 10, (byte) 100, (short) 10, (short) 1 };
        short[][] shortArray21 = new short[][] { shortArray6, shortArray13, shortArray20 };
        java.util.Set<short[]> shortArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray21);
        java.lang.Object[] objArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray21, objArray23);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 0L);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 100, (int) (byte) 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests25.ruleChain;
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader35, 10, postingsEnum37, postingsEnum38);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests25.assertDocsEnumEquals("random", postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("<unknown>", indexReader46, terms47, terms48, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) terms47);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("", postingsEnum35, postingsEnum36, true);
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests26.queryParser;
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain41;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests43.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = simpleIndexQueryParserTests43.getqueryParser();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        simpleIndexQueryParserTests43.setUp();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain41, (java.lang.Object) simpleIndexQueryParserTests43);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object[] objArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray11, objArray20);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader21, (-1), postingsEnum23, postingsEnum24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader34, (int) (short) 1, postingsEnum36, postingsEnum37);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService39;
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests26.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService43;
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (-1));
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests26.assertDocsSkippingEquals("", indexReader49, (int) (byte) 1, postingsEnum51, postingsEnum52, true);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1), (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
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
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests1.queryParser();
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        java.lang.Class<?> wildcardClass44 = executorServiceArray30.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.maxfailures", indexReader47, (-1), postingsEnum49, postingsEnum50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.maxfailures", indexReader53, (int) (short) 1, postingsEnum55, postingsEnum56);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService58 = null;
        simpleIndexQueryParserTests45.queryParser = indexQueryParserService58;
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests45.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader63 = null;
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields67, (java.lang.Object) locale69);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.badapples");
        simpleIndexQueryParserTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields67, fields75, false);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("tests.weekly", indexReader79, terms80, terms81, true);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass85 = ruleChain84.getClass();
        java.lang.Class[] classArray87 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray88 = (java.lang.Class<?>[]) classArray87;
        wildcardClassArray88[0] = wildcardClass44;
        wildcardClassArray88[1] = wildcardClass85;
        java.util.Set<java.lang.Class<?>> wildcardClassSet93 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) wildcardClassSet93);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 100, 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
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
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray28);
        short[] shortArray46 = new short[] { (byte) 1 };
        short[] shortArray48 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray51);
        short[] shortArray58 = new short[] { (byte) 1 };
        short[] shortArray60 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        short[] shortArray63 = new short[] { (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests76.assertPositionsSkippingEquals("tests.maxfailures", indexReader78, (-1), postingsEnum80, postingsEnum81);
        org.junit.rules.TestRule testRule83 = simpleIndexQueryParserTests76.ruleChain;
        simpleIndexQueryParserTests76.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests76.resetCheckIndexStatus();
        simpleIndexQueryParserTests76.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) shortArray70, (java.lang.Object) simpleIndexQueryParserTests76);
        java.lang.Class<?> wildcardClass89 = simpleIndexQueryParserTests76.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) wildcardClass89);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str14 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (byte) 100, postingsEnum42, postingsEnum43, false);
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 2);
        java.lang.String str48 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray14);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray24);
        short[] shortArray30 = new short[] { (byte) 1 };
        short[] shortArray32 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray19);
        short[] shortArray37 = new short[] { (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (byte) 1 };
        short[] shortArray44 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        short[] shortArray47 = new short[] { (byte) 1 };
        short[] shortArray49 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray47);
        short[] shortArray53 = new short[] { (byte) 1 };
        short[] shortArray55 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray19);
        short[] shortArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray61);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '#', (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService13);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService22;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) '#', (double) 0L);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, 0L);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        java.lang.Object[] objArray1 = null;
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
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 2, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 2, (int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (byte) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1.0f, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        char[] charArray1 = null;
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray7, charArray14);
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
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests17.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests17.longToPrefixCoded((long) 'a', (int) ' ');
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule46 = simpleIndexQueryParserTests17.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray7, (java.lang.Object) testRule46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService11;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 1, (long) 10);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
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
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
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
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) 1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100, (double) (short) 100);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray15);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        short[] shortArray25 = new short[] { (byte) 1 };
        short[] shortArray27 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray48);
        short[] shortArray54 = new short[] { (byte) 1 };
        short[] shortArray56 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray40);
        java.lang.Object obj61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) shortArray40, obj61);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        int[] intArray2 = new int[] { ' ' };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray9, intArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray5, intArray9);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray18, intArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray5, intArray18);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray32, intArray35);
        org.junit.Assert.assertArrayEquals(intArray18, intArray32);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray45, intArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray41, intArray45);
        org.junit.Assert.assertArrayEquals(intArray18, intArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray45);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 0, (long) (byte) 100);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        java.lang.Object obj0 = null;
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
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.badapples");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) strArray34);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.maxfailures");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.badapples");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "hi!");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "");
        simpleIndexQueryParserTests20.assertFieldStatisticsEquals("tests.maxfailures", fields45, fields55);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) (short) 1, (java.lang.Object) strArray59);
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("", fields45, fields64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) fields45);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (short) -1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 1L);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader31, terms32, terms33, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms33);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 10);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray39, byteArray86);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 100.0d, (double) 10L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 1);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray13, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray13, byteArray21);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray30, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray30);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray41, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray49, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray41, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) byteArray4, (java.lang.Object) 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, (long) 'a');
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
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
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 0, (int) (byte) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService38;
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests25.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests25.setqueryParser(indexQueryParserService42);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService44;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.maxfailures", indexReader48, (-1), postingsEnum50, postingsEnum51);
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests46.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests46.getqueryParser();
        simpleIndexQueryParserTests46.ensureCheckIndexPassed();
        simpleIndexQueryParserTests46.ensureCheckIndexPassed();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests59.assertPositionsSkippingEquals("tests.maxfailures", indexReader61, (-1), postingsEnum63, postingsEnum64);
        simpleIndexQueryParserTests59.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = null;
        simpleIndexQueryParserTests59.queryParser = indexQueryParserService67;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests59.assertDocsEnumEquals("node_s_0", postingsEnum70, postingsEnum71, true);
        simpleIndexQueryParserTests59.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests75.assertPositionsSkippingEquals("tests.maxfailures", indexReader77, (-1), postingsEnum79, postingsEnum80);
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests75.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService84 = simpleIndexQueryParserTests75.getqueryParser();
        java.lang.String str85 = simpleIndexQueryParserTests75.getTestName();
        simpleIndexQueryParserTests75.setUp();
        org.junit.rules.RuleChain ruleChain87 = simpleIndexQueryParserTests75.failureAndSuccessEvents;
        simpleIndexQueryParserTests59.failureAndSuccessEvents = ruleChain87;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain87;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain87;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain87);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) (short) -1);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray14);
        short[] shortArray21 = new short[] { (byte) 1 };
        short[] shortArray23 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray33);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray21);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray21, shortArray57);
        short[] shortArray63 = new short[] { (byte) 1 };
        short[] shortArray65 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray68);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray21);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests24.resetCheckIndexStatus();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests24, (java.lang.Object) locale35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray2, (java.lang.Object) locale35);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 2, (double) 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray18 = new char[] { 'a', '#' };
        char[] charArray21 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        char[] charArray25 = new char[] { 'a', '#' };
        char[] charArray28 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        org.junit.Assert.assertArrayEquals(charArray18, charArray28);
        org.junit.Assert.assertArrayEquals(charArray13, charArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray18);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray16);
        short[] shortArray22 = new short[] { (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray27 = new short[] { (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        short[] shortArray32 = new short[] { (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray22, shortArray34);
        short[] shortArray39 = new short[] { (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray44);
        short[] shortArray50 = new short[] { (byte) 1 };
        short[] shortArray52 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray39);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        short[] shortArray67 = new short[] { (byte) 1 };
        short[] shortArray69 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray67);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray16, shortArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (byte) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests1.indexedValueForSearch((long) '#');
        simpleIndexQueryParserTests1.ensureCleanedUp();
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray14, floatArray19, 1.0f);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 0);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray25, floatArray30, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray30, (float) (short) 0);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 0);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray38, floatArray43, 1.0f);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray49, 0.0f);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) (short) 0);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray55, floatArray60, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray60, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray49, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 100L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, 1.0d, (double) (byte) -1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader18, terms19, terms20, false);
        double[] doubleArray29 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray35 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray29, doubleArray35, (double) 100);
        double[] doubleArray44 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray50 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray44, doubleArray50, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray50, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) doubleArray50);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray32);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) serializableArray48, (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) serializableArray48);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "hi!");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (int) (short) 1, postingsEnum44, postingsEnum45);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests34.queryParser = indexQueryParserService47;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests34.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader52 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields56, (java.lang.Object) locale58);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.badapples");
        simpleIndexQueryParserTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields56, fields64, false);
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader21, fields33, fields64, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader70, (int) 'a', postingsEnum72, postingsEnum73);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService75 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService77 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService77;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        simpleIndexQueryParserTests79.assertPositionsSkippingEquals("tests.maxfailures", indexReader81, (-1), postingsEnum83, postingsEnum84);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        simpleIndexQueryParserTests79.assertPositionsSkippingEquals("tests.maxfailures", indexReader87, (int) (short) 1, postingsEnum89, postingsEnum90);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService92 = null;
        simpleIndexQueryParserTests79.queryParser = indexQueryParserService92;
        org.junit.rules.RuleChain ruleChain94 = simpleIndexQueryParserTests79.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests79);
        org.apache.lucene.index.PostingsEnum postingsEnum97 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests79.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum97, postingsEnum98);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray27, charArray37);
        org.junit.Assert.assertArrayEquals(charArray22, charArray27);
        char[] charArray44 = new char[] { 'a', '#' };
        char[] charArray47 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray51 = new char[] { 'a', '#' };
        char[] charArray54 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        org.junit.Assert.assertArrayEquals(charArray44, charArray54);
        char[] charArray59 = new char[] { 'a', '#' };
        char[] charArray62 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray44, charArray62);
        org.junit.Assert.assertArrayEquals(charArray27, charArray62);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests66.assertPositionsSkippingEquals("tests.maxfailures", indexReader68, (-1), postingsEnum70, postingsEnum71);
        simpleIndexQueryParserTests66.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests66.resetCheckIndexStatus();
        simpleIndexQueryParserTests66.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests66.assertDocsSkippingEquals("", indexReader77, (int) (short) 0, postingsEnum79, postingsEnum80, false);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray62, (java.lang.Object) postingsEnum80);
        char[] charArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray62, charArray84);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
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
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) ' ');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) '4', numericDocValues38, numericDocValues39);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling3, throttling4, throttling6, throttling9, throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("", indexReader27, terms28, terms29, true);
        org.junit.rules.RuleChain ruleChain32 = null;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain32;
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests16.longToPrefixCoded((long) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray14, (java.lang.Object) (short) 10);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 2);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strSet13);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.slow");
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray70);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) ruleChain21, (java.lang.Object) executorServiceArray56);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) ' ', 100.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray13);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray22, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray22);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray32, byteArray35);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.maxfailures", indexReader49, (-1), postingsEnum51, postingsEnum52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.maxfailures", indexReader55, (int) (short) 1, postingsEnum57, postingsEnum58);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = null;
        simpleIndexQueryParserTests47.queryParser = indexQueryParserService60;
        org.apache.lucene.util.BytesRef bytesRef63 = simpleIndexQueryParserTests47.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader65 = null;
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields69, (java.lang.Object) locale71);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.badapples");
        simpleIndexQueryParserTests47.assertFieldsEquals("europarl.lines.txt.gz", indexReader65, fields69, fields77, false);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("tests.weekly", indexReader81, terms82, terms83, true);
        org.junit.rules.RuleChain ruleChain86 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray40, (java.lang.Object) simpleIndexQueryParserTests47);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray40);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
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
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) executorServiceArray22);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "random");
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray71);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray71);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray33);
        java.lang.Object[] objArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray1, objArray87);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (-1), postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("", indexReader25, (int) 'a', postingsEnum27, postingsEnum28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexReader25);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader14, (-1), postingsEnum16, postingsEnum17, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        long[] longArray3 = new long[] { 'a' };
        long[] longArray5 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { 'a' };
        long[] longArray10 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        long[] longArray14 = new long[] { 'a' };
        long[] longArray16 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { 'a' };
        long[] longArray21 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals(longArray5, longArray16);
        long[] longArray27 = new long[] { 'a' };
        long[] longArray29 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray27, longArray29);
        long[] longArray32 = new long[] { 'a' };
        long[] longArray34 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        long[] longArray37 = new long[] { 'a' };
        long[] longArray39 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray37);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray45 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        long[] longArray48 = new long[] { 'a' };
        long[] longArray50 = new long[] { 'a' };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals(longArray34, longArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray45);
        long[] longArray62 = new long[] { (byte) 100, 100, ' ', 'a', 1, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray45, longArray62);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray25);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) fields31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray34);
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields31, fields41, false);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.maxfailures", indexReader48, (-1), postingsEnum50, postingsEnum51);
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests46.resetCheckIndexStatus();
        simpleIndexQueryParserTests46.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("", indexReader57, terms58, terms59, true);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.monster", indexReader64, 1, postingsEnum66, postingsEnum67);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests46.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = simpleIndexQueryParserTests46.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) indexQueryParserService70);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) (byte) 10);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "");
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray51);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray51);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray8, 1.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray14, floatArray19, 1.0f);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray25, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray14, (float) (short) 1);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 0);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) (short) 0);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray37, floatArray42, 1.0f);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray48, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray37, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray33, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray1, floatArray33, (float) (short) 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests21.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("random", indexReader31, (int) (byte) 100, postingsEnum33, postingsEnum34, true);
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests21.ruleChain;
        org.junit.rules.TestRule testRule40 = simpleIndexQueryParserTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
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
        short[] shortArray39 = new short[] { (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray29, shortArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("tests.slow", indexReader47, terms48, terms49, true);
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests45.indexedValueForSearch(0L);
        short[] shortArray55 = new short[] { (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) shortArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray57);
        short[] shortArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray57, shortArray62);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100L, (double) (short) 10);
    }
}

