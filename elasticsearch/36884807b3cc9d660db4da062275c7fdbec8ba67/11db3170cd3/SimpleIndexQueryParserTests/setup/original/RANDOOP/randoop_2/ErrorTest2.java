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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testSpanNotQueryBuilder();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray4);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
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
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests3.assertDocValuesEquals("", (int) (short) 1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        double[] doubleArray15 = new double[] { (byte) 10 };
        double[] doubleArray17 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) ' ');
        double[] doubleArray21 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray17, doubleArray23, (double) 10);
        double[] doubleArray30 = new double[] { (byte) 10 };
        double[] doubleArray32 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) ' ');
        double[] doubleArray37 = new double[] { (byte) 10 };
        double[] doubleArray39 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) ' ');
        double[] doubleArray43 = new double[] { (byte) 10 };
        double[] doubleArray45 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray45, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray39, doubleArray45, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray45, (double) 10);
        double[] doubleArray53 = new double[] { (byte) 10 };
        double[] doubleArray55 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray55, (double) ' ');
        double[] doubleArray60 = new double[] { (byte) 10 };
        double[] doubleArray62 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) ' ');
        double[] doubleArray66 = new double[] { (byte) 10 };
        double[] doubleArray68 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray68, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray62, doubleArray68, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray68, (double) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray45, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray23, doubleArray45, 0.0d);
        double[] doubleArray80 = new double[] { (byte) 10 };
        double[] doubleArray82 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray82, (double) ' ');
        double[] doubleArray86 = new double[] { (byte) 10 };
        double[] doubleArray88 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray86, doubleArray88, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray86, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray45, doubleArray82, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ' ');
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("node_s_0", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.maxfailures", indexReader16, fields17, fields18, false);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests2.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray2, shortArray5);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3, executorServiceArray5, executorServiceArray7 };
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        java.util.concurrent.ExecutorService[][] executorServiceArray17 = new java.util.concurrent.ExecutorService[][] { executorServiceArray10, executorServiceArray12, executorServiceArray14, executorServiceArray16 };
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        java.util.concurrent.ExecutorService[][] executorServiceArray26 = new java.util.concurrent.ExecutorService[][] { executorServiceArray19, executorServiceArray21, executorServiceArray23, executorServiceArray25 };
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray28, executorServiceArray30, executorServiceArray32, executorServiceArray34 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray8, executorServiceArray17, executorServiceArray26, executorServiceArray35 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray36);
        java.util.Set<java.lang.Cloneable> cloneableSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) executorServiceArray36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.setUp();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests41);
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests41.assertDocsSkippingEquals("", indexReader47, (int) (byte) 0, postingsEnum49, postingsEnum50, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests41);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("", indexReader55, 0, postingsEnum57, postingsEnum58);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62, throttling63 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling67, throttling68 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray64, (java.lang.Object[]) throttlingArray69);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73, throttling74 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList76 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray64, (java.lang.Object[]) throttlingArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum58, (java.lang.Object) throttlingArray75);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling81 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray83 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling81, throttling82 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray83);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling87 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray88 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling86, throttling87 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList89 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray88);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray83, (java.lang.Object[]) throttlingArray88);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) throttlingArray75, (java.lang.Object[]) throttlingArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) throttlingArray75);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        java.util.List[] listArray2 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[] throttlingEnumListArray3 = (java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[]) listArray2;
        java.util.Set<java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>> throttlingEnumListSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingEnumListArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests5.assertDocsSkippingEquals("", indexReader7, 10, postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests5.assertDocsSkippingEquals("tests.nightly", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) throttlingEnumListArray3, (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray6);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36, throttling37 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray33, (java.lang.Object[]) throttlingArray38);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray33);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) throttlingArray6, (java.lang.Object) throttlingEnumSet42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingEnumSet42, (java.lang.Object) simpleIndexQueryParserTests44);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 'a', (long) (byte) -1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        java.lang.String str6 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) simpleIndexQueryParserTests8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("tests.failfast", indexReader25, fields26, fields27, true);
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.setUp();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        java.lang.String str36 = simpleIndexQueryParserTests33.getTestName();
        simpleIndexQueryParserTests33.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.setUp();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests33, (java.lang.Object) simpleIndexQueryParserTests38);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        java.lang.String str43 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.setUp();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests46);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests46.assertDocsEnumEquals("random", postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain57;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain57;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain57);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain57;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) ruleChain57);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        byte[] byteArray1 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray7);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray10, charArray12);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray6, charArray10);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray18, charArray22);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray10, charArray18);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray35, charArray39);
        org.junit.Assert.assertArrayEquals("", charArray31, charArray39);
        org.junit.Assert.assertArrayEquals(charArray10, charArray39);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray51);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray61, charArray63);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray57, charArray61);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals(charArray73, charArray75);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray69, charArray73);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray61, charArray69);
        org.junit.Assert.assertArrayEquals(charArray49, charArray61);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray10, charArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray13);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray7, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray11);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray20, charArray22);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray28, charArray32);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray40, charArray44);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray32, charArray40);
        org.junit.Assert.assertArrayEquals(charArray20, charArray32);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        org.junit.Assert.assertArrayEquals(charArray20, charArray54);
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray54);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray66, charArray70);
        org.junit.Assert.assertArrayEquals(charArray63, charArray66);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        org.junit.Assert.assertArrayEquals(charArray63, charArray78);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray78);
        char[] charArray87 = new char[] { '4', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray87);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1), (double) '#');
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray7, byteArray9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.Object obj21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, obj21);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (byte) -1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray4);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests7);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("", indexReader21, 0, postingsEnum23, postingsEnum24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28, throttling29 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum24, (java.lang.Object) throttlingArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray41);
        float[] floatArray49 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray50 = new float[][] { floatArray49 };
        float[] floatArray54 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray55 = new float[][] { floatArray54 };
        float[] floatArray59 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray60 = new float[][] { floatArray59 };
        float[] floatArray64 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray65 = new float[][] { floatArray64 };
        float[] floatArray69 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray70 = new float[][] { floatArray69 };
        float[] floatArray74 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray75 = new float[][] { floatArray74 };
        float[][][] floatArray76 = new float[][][] { floatArray50, floatArray55, floatArray60, floatArray65, floatArray70, floatArray75 };
        java.util.Set<float[][]> floatArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray41, (java.lang.Object[]) floatArray76);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) 100L);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testQueryStringFields1Builder();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        long[] longArray3 = new long[] { 10, (short) 100, 100L };
        long[] longArray9 = new long[] { (short) -1, (short) 1, 10, 1L, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (-1.0d), (double) (-1));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("node_s_0");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray33, (float) (short) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 100L);
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray29, floatArray36, 0.0f);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 100L);
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray49, (float) (short) 100);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray55, 10.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray55, floatArray60, (float) 3);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testBoostingQueryBuilder();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 1, (long) (byte) 10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 10, 1L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        long[] longArray3 = new long[] { (short) -1, 0L };
        long[] longArray7 = new long[] { '#', (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray7);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testEmptyBooleanQuery();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", obj1, (java.lang.Object) "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus25 = simpleIndexQueryParserTests6.ensureGreen(strArray23);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray9);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray17, charArray19);
        org.junit.Assert.assertArrayEquals(charArray9, charArray17);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray25);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray25, charArray32);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray38, charArray42);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray50, charArray52);
        org.junit.Assert.assertArrayEquals(charArray42, charArray50);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray25, charArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) charArray58);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray26, charArray30);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        org.junit.Assert.assertArrayEquals(charArray30, charArray38);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray38, charArray46);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray46, charArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) charArray53);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 100L);
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (short) 10);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) (short) 10);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) 100L);
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, 0.0f);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray9, floatArray26, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray26, (float) 10);
        float[] floatArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray33, 10.0f);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, (double) ' ');
        double[] doubleArray10 = new double[] { (byte) 10 };
        double[] doubleArray12 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray12, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray10, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray10);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus36 = simpleIndexQueryParserTests0.ensureGreen(strArray33);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray25);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray10, charArray12);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray6, charArray10);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray10);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray27, charArray31);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray39, charArray43);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray31, charArray39);
        org.junit.Assert.assertArrayEquals(charArray19, charArray31);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        org.junit.Assert.assertArrayEquals(charArray19, charArray53);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray53);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader25, (int) (byte) 1, postingsEnum27, postingsEnum28);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.slow", 1, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) -1, 10.0d, (double) (byte) 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.awaitsfix", "<unknown>", "tests.slow", "tests.weekly", "tests.slow", "" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray10, charArray14);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray22, charArray26);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray14, charArray22);
        org.junit.Assert.assertArrayEquals(charArray2, charArray14);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        org.junit.Assert.assertArrayEquals(charArray2, charArray36);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray47, charArray51);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray36, charArray47);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray36, charArray60);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.setUp();
        simpleIndexQueryParserTests65.ensureAllSearchContextsReleased();
        java.lang.String str68 = simpleIndexQueryParserTests65.getTestName();
        simpleIndexQueryParserTests65.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.setUp();
        simpleIndexQueryParserTests70.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests65, (java.lang.Object) simpleIndexQueryParserTests70);
        simpleIndexQueryParserTests70.ensureCheckIndexPassed();
        java.lang.String str75 = simpleIndexQueryParserTests70.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests77.setUp();
        simpleIndexQueryParserTests77.ensureAllSearchContextsReleased();
        java.lang.String str80 = simpleIndexQueryParserTests77.getTestName();
        simpleIndexQueryParserTests77.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests82 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests82.setUp();
        simpleIndexQueryParserTests82.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests77, (java.lang.Object) simpleIndexQueryParserTests82);
        org.junit.rules.RuleChain ruleChain86 = simpleIndexQueryParserTests82.failureAndSuccessEvents;
        simpleIndexQueryParserTests70.failureAndSuccessEvents = ruleChain86;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray60, (java.lang.Object) simpleIndexQueryParserTests70);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.nightly", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.failfast", indexReader36, fields37, fields38, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray13);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests7.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        java.lang.String str17 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests14, (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain23;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 100, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        java.lang.String str6 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) simpleIndexQueryParserTests8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests12);
        simpleIndexQueryParserTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (short) 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests16.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray11 = new int[] { 3, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray11);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) (short) 10);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray9, 0.0f);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray22, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray22, (float) (short) 100);
        float[] floatArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray22, floatArray27, (float) (short) -1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) '4');
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
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
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray15);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray15);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale20 };
        java.util.Set<java.util.Locale> localeSet22 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) localeArray21);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        long[] longArray5 = new long[] { '#', ' ', (byte) 100, (byte) 10, (byte) -1 };
        long[] longArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        short[] shortArray4 = new short[] { (byte) -1, (byte) 0, (short) -1, (byte) 1 };
        short[] shortArray10 = new short[] { (byte) -1, (short) 10, (byte) 1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.junit.rules.RuleChain[][] ruleChainArray0 = new org.junit.rules.RuleChain[][] {};
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40, throttling41 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46, throttling47 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53, throttling54 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray55, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray0, (java.lang.Object[]) throttlingArray37);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain31);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) '4');
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36, throttling37 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray33, (java.lang.Object[]) throttlingArray38);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray33);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) throttlingArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray33);
        java.lang.Object obj45 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingArray5, obj45);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        java.lang.String str6 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) simpleIndexQueryParserTests8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("tests.failfast", indexReader25, fields26, fields27, true);
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests32.assertDocsEnumEquals("tests.monster", postingsEnum38, postingsEnum39, false);
        simpleIndexQueryParserTests32.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) simpleIndexQueryParserTests32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests32);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("europarl.lines.txt.gz", indexReader34, terms35, terms36, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) terms36);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray4 = new long[] { 0L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testRegexpQueryBuilder();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1), 1.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        long[] longArray4 = new long[] { 'a', (short) -1, 10L };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray4, longArray5);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { (short) 10, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray5);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray12);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        short[] shortArray5 = new short[] { (byte) 1, (short) -1, (short) 10, (short) 1, (byte) 0 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) executorServiceArray37);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) 10, (long) (short) -1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testPrefixQueryBuilder();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) (short) 10);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 100L);
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray12, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray8, 0.0f);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) 100L);
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray21, (float) (short) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        simpleIndexQueryParserTests26.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests26.assertDocsSkippingEquals("<unknown>", indexReader38, (int) (short) 0, postingsEnum40, postingsEnum41, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 100, (java.lang.Object) (short) 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (long) 10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray5, byteArray7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        short[] shortArray5 = new short[] { (byte) 0, (short) 10, (short) 100, (byte) 0, (byte) -1 };
        short[] shortArray12 = new short[] { (byte) 10, (byte) 1, (byte) 1, (short) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray1, byteArray3);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0d, 10.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10L, (long) (-1));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) ' ', postingsEnum11, postingsEnum12);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        float[] floatArray18 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray19 = new float[][] { floatArray18 };
        float[] floatArray23 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray24 = new float[][] { floatArray23 };
        float[] floatArray28 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray29 = new float[][] { floatArray28 };
        float[] floatArray33 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray34 = new float[][] { floatArray33 };
        float[] floatArray38 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray39 = new float[][] { floatArray38 };
        float[] floatArray43 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray44 = new float[][] { floatArray43 };
        float[][][] floatArray45 = new float[][][] { floatArray19, floatArray24, floatArray29, floatArray34, floatArray39, floatArray44 };
        java.util.Set<float[][]> floatArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) floatArray45);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0L, (double) (-1L));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("random", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.failfast", postingsEnum26, postingsEnum27, true);
        simpleIndexQueryParserTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 1, (long) 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 0, (double) (-1L));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("node_s_0", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("tests.badapples", indexReader25, fields26, fields27, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        short[] shortArray5 = new short[] { (byte) 1, (short) 100, (byte) 1, (byte) 10, (short) 1 };
        short[] shortArray8 = new short[] { (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests3, simpleIndexQueryParserTests12 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray16);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray27 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures19, testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures25 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet28 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) simpleIndexQueryParserTestsArray16, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray27);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
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
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray11);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray6);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray43);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53, throttling54 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray50, (java.lang.Object[]) throttlingArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling61, throttling62 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling66, throttling67 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray63, (java.lang.Object[]) throttlingArray68);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling72, throttling73 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray63, (java.lang.Object[]) throttlingArray74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling79, throttling80 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList82 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling84, throttling85 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList87 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray81, (java.lang.Object[]) throttlingArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray63, (java.lang.Object[]) throttlingArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling92 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling93 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray94 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling92, throttling93 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList95 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray94);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray94);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray94);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray11, charArray15);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray23, charArray27);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray15, charArray23);
        org.junit.Assert.assertArrayEquals(charArray3, charArray15);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        org.junit.Assert.assertArrayEquals(charArray3, charArray37);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray52, charArray54);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray37, charArray48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests63.setUp();
        simpleIndexQueryParserTests63.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests63);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        simpleIndexQueryParserTests63.assertTermsEquals("random", indexReader68, terms69, terms70, false);
        simpleIndexQueryParserTests63.setUp();
        simpleIndexQueryParserTests63.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        simpleIndexQueryParserTests63.assertDocsEnumEquals("tests.maxfailures", postingsEnum76, postingsEnum77, false);
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "node_s_0", (java.lang.Object) simpleIndexQueryParserTests63);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
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
        simpleIndexQueryParserTests6.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray9, charArray13);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray21, charArray25);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray13, charArray21);
        org.junit.Assert.assertArrayEquals(charArray1, charArray13);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray38, charArray42);
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        org.junit.Assert.assertArrayEquals(charArray1, charArray35);
        char[] charArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray35, charArray51);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray17, (java.lang.Object[]) throttlingArray22);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray17);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray45, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray45);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray17, (java.lang.Object[]) throttlingArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) throttlingArray45);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) (short) 10);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 100L);
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray3, floatArray10, 0.0f);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) 100L);
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray24, (float) (short) 10);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray20, floatArray27, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray27, (float) 1L);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray43, (float) (short) 10);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) 100L);
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray50, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray39, floatArray46, 0.0f);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 100L);
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray60, (float) (short) 10);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) 100L);
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray67, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray56, floatArray63, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray63, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray63, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) 10L, (java.lang.Object) 1L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling13, throttling14 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling39 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray35, (java.lang.Object[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44, throttling45 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray35, (java.lang.Object[]) throttlingArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling51, throttling52 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray58 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56, throttling57 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray53, (java.lang.Object[]) throttlingArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray35, (java.lang.Object[]) throttlingArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling64, throttling65 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray66);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.setUp();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        simpleIndexQueryParserTests70.assertFieldsEquals("random", indexReader73, fields74, fields75, false);
        org.junit.rules.RuleChain ruleChain78 = simpleIndexQueryParserTests70.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests79.resetCheckIndexStatus();
        simpleIndexQueryParserTests79.resetCheckIndexStatus();
        simpleIndexQueryParserTests79.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray83 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests70, simpleIndexQueryParserTests79 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray83);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet85 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray83);
        java.util.Set<org.junit.Assert> assertSet86 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray83);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) simpleIndexQueryParserTestsArray83);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        short[] shortArray4 = new short[] { (short) 0, (byte) 10, (byte) 0, (byte) 100 };
        short[] shortArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) (short) 10);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 100L);
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray3, floatArray10, 0.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray23, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray23, (float) (short) 100);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray23, floatArray29, 10.0f);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray29, floatArray34, (float) 3);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 3, (java.lang.Object) strSet48);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray2 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
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
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests16.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        long[] longArray5 = new long[] { (short) 0, 3, (short) 100, 1, 3 };
        long[] longArray10 = new long[] { (byte) 10, 100L, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10, throttling11 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) throttlingArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) "tests.failfast", (java.lang.Object) throttlingArray12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) throttlingArray10);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        java.lang.String str20 = simpleIndexQueryParserTests16.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray10, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("", indexReader15, (int) (byte) 0, postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("", indexReader23, 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum26, (java.lang.Object) throttlingArray43);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray43);
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray6);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) throttlingArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        simpleIndexQueryParserTests52.assertFieldsEquals("random", indexReader55, fields56, fields57, false);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests61.resetCheckIndexStatus();
        simpleIndexQueryParserTests61.resetCheckIndexStatus();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests52, simpleIndexQueryParserTests61 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray65);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet67 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray65);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray65);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) simpleIndexQueryParserTestsArray65);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 10, (short) -1, (short) -1, (byte) 1 };
        short[] shortArray13 = new short[] { (byte) 10, (short) 1, (short) -1, (byte) 100, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray13);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
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
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray33, (float) (short) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 100L);
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray29, floatArray36, 0.0f);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 100L);
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray49, (float) (short) 100);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray55, 10.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray55, floatArray60, (float) 3);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        short[] shortArray7 = new short[] { (short) -1, (byte) 0, (short) 0, (short) 10, (short) 1, (byte) -1 };
        short[] shortArray14 = new short[] { (short) 100, (byte) 100, (byte) 10, (short) 10, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, (double) ' ');
        double[] doubleArray10 = new double[] { (byte) 10 };
        double[] doubleArray12 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray12, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray10, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray10);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus37 = simpleIndexQueryParserTests0.ensureGreen(strArray33);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests1, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10, throttling11 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray12, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray12, (java.lang.Object[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28, throttling29 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray12, (java.lang.Object[]) throttlingArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray6, (java.lang.Object[]) throttlingArray30);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryQueryBuilder();
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray6);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        org.junit.Assert.assertArrayEquals(charArray6, charArray14);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray23, charArray27);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        org.junit.Assert.assertArrayEquals(charArray27, charArray35);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray35, charArray43);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals(charArray35, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray14, charArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray35);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0L, (-1.0d));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testDisMaxBuilder();
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        java.lang.Class<?> wildcardClass24 = simpleIndexQueryParserTests6.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray34);
        java.lang.Class<?> wildcardClass37 = throttlingArray34.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass39 = throttling38.getClass();
        java.lang.Class[] classArray41 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        wildcardClassArray42[0] = wildcardClass24;
        wildcardClassArray42[1] = wildcardClass37;
        wildcardClassArray42[2] = wildcardClass39;
        java.util.Set<java.lang.Class<?>> wildcardClassSet49 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57, throttling58 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray54, (java.lang.Object[]) throttlingArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling63, throttling64 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray54, (java.lang.Object[]) throttlingArray65);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70, throttling71 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray77 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling75, throttling76 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray77);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray72, (java.lang.Object[]) throttlingArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray54, (java.lang.Object[]) throttlingArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray42, (java.lang.Object[]) throttlingArray77);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("hi!", (int) ' ', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testQueryStringFields3Builder();
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (byte) 10 };
        short[] shortArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray6, shortArray7);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) (short) 10);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray9, 0.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray23, (float) (short) 10);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 100L);
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray30, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray19, floatArray26, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray26, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) (short) -1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader10, (int) ' ', postingsEnum12, postingsEnum13);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.badapples", indexReader21, terms22, terms23, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6, throttling7 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11, throttling12 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray8, (java.lang.Object[]) throttlingArray13);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray8);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray8, (java.lang.Object[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling39 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray35, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray35);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) throttlingArray8, (java.lang.Object) throttlingEnumSet44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling47, throttling48 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray8, (java.lang.Object[]) throttlingArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray49, (java.lang.Object[]) executorServiceArray53);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
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
        simpleIndexQueryParserTests6.testConstantScoreParsesFilter();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0, (double) 2);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanTermQueryBuilder();
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 10, (double) 0, (double) 2);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
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
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet17 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) throttlingArray27);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) throttlingArray22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray4 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray4);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) throttlingArray10);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] { charSequenceArray20, charSequenceArray27, charSequenceArray34 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray10, (java.lang.Object[]) charSequenceArray35);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        double[] doubleArray17 = new double[] { (byte) 10 };
        double[] doubleArray19 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) ' ');
        double[] doubleArray24 = new double[] { (byte) 10 };
        double[] doubleArray26 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) ' ');
        double[] doubleArray31 = new double[] { (byte) 10 };
        double[] doubleArray33 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) ' ');
        double[] doubleArray37 = new double[] { (byte) 10 };
        double[] doubleArray39 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray33, doubleArray39, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray39, (double) 10);
        double[] doubleArray47 = new double[] { (byte) 10 };
        double[] doubleArray49 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray49, (double) ' ');
        double[] doubleArray54 = new double[] { (byte) 10 };
        double[] doubleArray56 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray56, (double) ' ');
        double[] doubleArray60 = new double[] { (byte) 10 };
        double[] doubleArray62 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray56, doubleArray62, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray62, (double) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray39, doubleArray49, (double) 100L);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray19, doubleArray49, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray8, doubleArray49, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0f);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
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
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray33, (float) (short) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 100L);
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray29, floatArray36, 0.0f);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 100L);
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray49, (float) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) floatArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain25, (java.lang.Object) floatArray29);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        byte[] byteArray0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.weekly", 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        long[] longArray6 = new long[] { (byte) 100, 1L, 10L, ' ', (-1L), (short) 10 };
        long[] longArray8 = new long[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum7, postingsEnum8, true);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        short[] shortArray3 = new short[] { (short) -1, (short) 0, (short) -1 };
        short[] shortArray10 = new short[] { (short) 100, (short) 0, (short) 0, (byte) -1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests10 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26, throttling27 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray23);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        java.util.List<java.lang.Object> objList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Object[]) throttlingArray23);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, throttlingArray23);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) throttlingArray23);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) (short) 10);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray9, 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        java.lang.String str21 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        java.lang.String str23 = simpleIndexQueryParserTests18.getTestName();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.monster", indexReader25, fields26, fields27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        long[] longArray0 = new long[] {};
        long[] longArray6 = new long[] { ' ', (-1), '4', (byte) 100, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) queryCachingPolicy1, (java.lang.Object) 100.0f);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1L, (double) 100L, (double) 10L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        double[] doubleArray5 = new double[] { (byte) 10 };
        double[] doubleArray7 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray7, (double) ' ');
        double[] doubleArray11 = new double[] { (byte) 10 };
        double[] doubleArray13 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray13, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray11, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests19.ruleChain;
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray11, (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) doubleArray11);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 0, (java.lang.Object) testRule28);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray3 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) ' ');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.awaitsfix", indexReader10, 1, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray1, (java.lang.Object) ruleChain17);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0.0d, (double) 100L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray11, charArray15);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray23, charArray25);
        org.junit.Assert.assertArrayEquals(charArray15, charArray23);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray23, charArray31);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray39, charArray43);
        org.junit.Assert.assertArrayEquals(charArray23, charArray43);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29, throttling30 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray31);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling47, throttling48 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray44, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray31, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57, throttling58 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62, throttling63 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray59, (java.lang.Object[]) throttlingArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70, throttling71 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray77 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling75, throttling76 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray77);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray72, (java.lang.Object[]) throttlingArray77);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray72);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray64, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray72);
        java.lang.String[] strArray91 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet92 = org.apache.lucene.util.LuceneTestCase.asSet(strArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) strArray91);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 1, (long) (short) 100);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) (short) 10);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray2, floatArray9, 0.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray23, (float) (short) 10);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 100L);
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray30, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray19, floatArray26, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray26, (float) 1L);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 100L);
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) (short) 10);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 100L);
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray38, floatArray45, 0.0f);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) 100L);
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray59, (float) (short) 10);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray66, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray55, floatArray62, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray62, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray62, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) 1L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
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
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests6.ruleChain;
        simpleIndexQueryParserTests6.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testBooleanParsesFilter();
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (-1.0f), (double) 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (-1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        long[] longArray6 = new long[] { (byte) 100, 3, 10L, (short) 10, (byte) -1, 'a' };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        int[] intArray3 = new int[] { '#', ' ' };
        int[] intArray8 = new int[] { (short) 0, (byte) 100, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        short[] shortArray3 = new short[] { (byte) 0, (short) -1, (short) 100 };
        short[] shortArray6 = new short[] { (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 2, (double) (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16, false);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray22, charArray26);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray34, charArray38);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray26, charArray34);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals("", charArray47, charArray55);
        org.junit.Assert.assertArrayEquals(charArray26, charArray55);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals(charArray77, charArray79);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray73, charArray77);
        char[] charArray85 = new char[] {};
        char[] charArray86 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray85, charArray86);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray91, charArray92);
        org.junit.Assert.assertArrayEquals(charArray89, charArray91);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray85, charArray89);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray77, charArray85);
        org.junit.Assert.assertArrayEquals(charArray65, charArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray26, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) postingsEnum15, (java.lang.Object) charArray65);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        java.util.concurrent.ExecutorService[][] executorServiceArray9 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6, executorServiceArray8 };
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray11, executorServiceArray13, executorServiceArray15, executorServiceArray17 };
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        java.util.concurrent.ExecutorService[][] executorServiceArray27 = new java.util.concurrent.ExecutorService[][] { executorServiceArray20, executorServiceArray22, executorServiceArray24, executorServiceArray26 };
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray29, executorServiceArray31, executorServiceArray33, executorServiceArray35 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray37 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray9, executorServiceArray18, executorServiceArray27, executorServiceArray36 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray37);
        java.util.Set<java.lang.Cloneable> cloneableSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) executorServiceArray37);
        float[] floatArray43 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray44 = new float[][] { floatArray43 };
        float[] floatArray48 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray49 = new float[][] { floatArray48 };
        float[] floatArray53 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray54 = new float[][] { floatArray53 };
        float[] floatArray58 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray59 = new float[][] { floatArray58 };
        float[] floatArray63 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray64 = new float[][] { floatArray63 };
        float[] floatArray68 = new float[] { 10, 0.0f, (byte) 10 };
        float[][] floatArray69 = new float[][] { floatArray68 };
        float[][][] floatArray70 = new float[][][] { floatArray44, floatArray49, floatArray54, floatArray59, floatArray64, floatArray69 };
        java.util.Set<float[][]> floatArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) floatArray70);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
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
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("hi!", (int) (short) 10, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, (double) 10.0f, 1.0d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) 0.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests6.assertDocValuesEquals("<unknown>", 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        long[] longArray4 = new long[] { (-1), 3, 'a' };
        long[] longArray8 = new long[] { 0L, (byte) 1, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray4, longArray8);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 1L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray24);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) testRule13, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (-1), numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests2, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests10, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests18, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Iterable[] iterableArray26 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray27 = (java.lang.Iterable<java.lang.Object>[]) iterableArray26;
        objIterableArray27[0] = objSet8;
        objIterableArray27[1] = objSet16;
        objIterableArray27[2] = objSet24;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling55, throttling56 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling60, throttling61 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray57, (java.lang.Object[]) throttlingArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray62);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray70 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling68, throttling69 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList71 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73, throttling74 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList76 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray70, (java.lang.Object[]) throttlingArray75);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling79, throttling80 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList82 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray70, (java.lang.Object[]) throttlingArray81);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling87 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray88 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling86, throttling87 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList89 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray88);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling91 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling92 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray93 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling91, throttling92 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList94 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray93);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray88, (java.lang.Object[]) throttlingArray93);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray70, (java.lang.Object[]) throttlingArray93);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) objIterableArray27, (java.lang.Object[]) throttlingArray39);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum7, postingsEnum8, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray4, byteArray10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        long[] longArray7 = new long[] { (short) 100, 0, (byte) 0, 1, 'a', 1 };
        long[] longArray14 = new long[] { '#', (short) 100, (short) 1, ' ', 100L, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray7, longArray14);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests10 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray14);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet16 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray44);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) throttlingArray21);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 100L);
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) (short) 10);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 100L);
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) (short) 10);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) 100L);
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, 0.0f);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray10, floatArray27, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray27, (float) 10);
        float[] floatArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray34, (float) 'a');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 10, (long) '#');
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("tests.monster", postingsEnum28, postingsEnum29, false);
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("tests.monster", indexReader34, fields35, fields36, false);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.awaitsfix", indexReader43, (int) (byte) 100, postingsEnum45, postingsEnum46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        long[] longArray6 = new long[] { 0L, 1L, (byte) 100, 3, 100L, 3 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.setUp();
        simpleIndexQueryParserTests70.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests70);
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests70.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule75 = simpleIndexQueryParserTests70.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests77.setUp();
        simpleIndexQueryParserTests77.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests77);
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        simpleIndexQueryParserTests77.assertDocsEnumEquals("random", postingsEnum82, postingsEnum83, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests86 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests86.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain88 = simpleIndexQueryParserTests86.failureAndSuccessEvents;
        simpleIndexQueryParserTests77.failureAndSuccessEvents = ruleChain88;
        simpleIndexQueryParserTests70.failureAndSuccessEvents = ruleChain88;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader37, (java.lang.Object) simpleIndexQueryParserTests70);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) 1.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        simpleIndexQueryParserTests6.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests6.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader4, 1, postingsEnum6, postingsEnum7, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests6);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("random", indexReader11, terms12, terms13, false);
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("tests.failfast", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("", indexReader25, terms26, terms27, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        java.lang.String str35 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.setUp();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests32, (java.lang.Object) simpleIndexQueryParserTests37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests41.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests41);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        simpleIndexQueryParserTests41.assertFieldsEquals("tests.failfast", indexReader54, fields55, fields56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain59;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain59);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests9.assertDocsSkippingEquals("", indexReader15, (int) (byte) 0, postingsEnum17, postingsEnum18, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("", indexReader23, 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum26, (java.lang.Object) throttlingArray43);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray43);
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray6);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) throttlingArray6);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale51, locale53 };
        java.util.Set<java.util.Locale> localeSet55 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray54);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) localeArray54);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
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
        simpleIndexQueryParserTests6.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testRangeQueryBuilder();
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { (short) 0, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) (short) 10);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 100L);
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray3, floatArray10, 0.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray23, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray23, (float) (short) 100);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray23, floatArray29, 10.0f);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 100L);
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray39, (float) (short) 10);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 100L);
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray46, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray35, floatArray42, 0.0f);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray56, (float) (short) 10);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 100L);
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray63, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray52, floatArray59, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray59, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray35, (float) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) floatArray35);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        short[] shortArray4 = new short[] { (byte) 10, (short) 1, (short) 10 };
        short[] shortArray7 = new short[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray4, shortArray7);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) '4');
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) '4');
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("node_s_0", indexReader27, (int) (short) 0, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests19.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader33, (int) (byte) 10, postingsEnum35, postingsEnum36, true);
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "tests.failfast", (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, false);
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        double[] doubleArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests4, simpleIndexQueryParserTests13 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray17);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray17);
        double[] doubleArray22 = new double[] { (byte) 10 };
        double[] doubleArray24 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray24, (double) ' ');
        double[] doubleArray28 = new double[] { (byte) 10 };
        double[] doubleArray30 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray30, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray24, doubleArray30, (double) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray17, (java.lang.Object) doubleArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray24, (-1.0d));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 10);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        long[] longArray2 = new long[] { (byte) 10, (short) 0 };
        long[] longArray8 = new long[] { 3, 100, (-1), '4', 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 100, (double) 10L, (double) ' ');
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray6);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray14, charArray18);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray6, charArray14);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray31, charArray35);
        org.junit.Assert.assertArrayEquals("", charArray27, charArray35);
        org.junit.Assert.assertArrayEquals(charArray6, charArray35);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray47, charArray51);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals(charArray63, charArray65);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray59, charArray63);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray51, charArray59);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals(charArray80, charArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray76, charArray80);
        org.junit.Assert.assertArrayEquals("", charArray72, charArray80);
        org.junit.Assert.assertArrayEquals(charArray51, charArray80);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) charArray80);
        org.junit.Assert.assertArrayEquals(charArray35, charArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray80);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray3);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) ' ');
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 0, (double) 4);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray9);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        int[] intArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testQueryStringFields2Builder();
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] { (byte) 10, (byte) -1, (short) 10, (short) -1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29, throttling30 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum20, (java.lang.Object) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray45, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) throttlingArray50);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray13);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray7, charArray11);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray4, charArray19);
        org.junit.Assert.assertNotNull("", (java.lang.Object) charArray19);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray26, charArray30);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        org.junit.Assert.assertArrayEquals(charArray30, charArray38);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray38, charArray46);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray54, charArray58);
        org.junit.Assert.assertArrayEquals(charArray38, charArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray19, charArray58);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests67.setUp();
        simpleIndexQueryParserTests67.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests67.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests67.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum72, postingsEnum73, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) charArray58, (java.lang.Object) postingsEnum73);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures12 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet14 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray21);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.util.List<java.lang.Object> objList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Object[]) throttlingArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray13, (java.lang.Object[]) throttlingArray21);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.setUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        simpleIndexQueryParserTests42.assertFieldsEquals("random", indexReader45, fields46, fields47, false);
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests42.assertDocsEnumEquals("node_s_0", postingsEnum54, postingsEnum55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests42.assertTermsEquals("tests.nightly", indexReader59, terms60, terms61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        simpleIndexQueryParserTests42.assertFieldsEquals("tests.weekly", indexReader65, fields66, fields67, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests70.resetCheckIndexStatus();
        simpleIndexQueryParserTests70.resetCheckIndexStatus();
        simpleIndexQueryParserTests70.ensureCleanedUp();
        simpleIndexQueryParserTests70.ensureCleanedUp();
        simpleIndexQueryParserTests70.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests70.ensureCheckIndexPassed();
        simpleIndexQueryParserTests70.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain79 = simpleIndexQueryParserTests70.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests80.ensureAllSearchContextsReleased();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray82 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests42, simpleIndexQueryParserTests70, simpleIndexQueryParserTests80 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet83 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) luceneTestCaseArray82);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 3);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        long[] longArray4 = new long[] { (byte) 100, 5, (-1), 0 };
        long[] longArray6 = new long[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
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
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests7.ruleChain;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests7.testFilteredQueryBuilder();
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        short[] shortArray7 = new short[] { (byte) 1, (byte) -1, (short) 1, (byte) -1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
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
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests6.ruleChain;
        simpleIndexQueryParserTests6.setUp();
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus38 = simpleIndexQueryParserTests6.ensureGreen(strArray36);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray10);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35, throttling36 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray37);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray32);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray45, (java.lang.Object[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray45);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling63, throttling64 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray60, (java.lang.Object[]) throttlingArray65);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray73 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling71, throttling72 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray73);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling77 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling76, throttling77 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray73, (java.lang.Object[]) throttlingArray78);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray73);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray73);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray65, (java.lang.Object[]) throttlingArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) throttlingArray24);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanTermQueryBuilder();
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus21 = simpleIndexQueryParserTests6.ensureGreen(strArray18);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) -1);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray3, byteArray5);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        simpleIndexQueryParserTests14.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests14.ensureCleanedUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) simpleIndexQueryParserTests14);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) postingsEnum7, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (-1.0d));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        double[] doubleArray6 = new double[] { 'a', 0L, (-1L), 10L, 0.0d };
        double[] doubleArray9 = new double[] { (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) ' ');
        double[] doubleArray15 = new double[] { (byte) 10 };
        double[] doubleArray17 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray11, doubleArray17, (double) 10);
        double[] doubleArray24 = new double[] { (byte) 10 };
        double[] doubleArray26 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) ' ');
        double[] doubleArray30 = new double[] { (byte) 10 };
        double[] doubleArray32 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray30, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.setUp();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests38);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests38.ruleChain;
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray30, (java.lang.Object) simpleIndexQueryParserTests38);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray30, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray30, (double) ' ');
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.junit.rules.TestRule[] testRuleArray0 = new org.junit.rules.TestRule[] {};
        java.util.Set<org.junit.rules.TestRule> testRuleSet1 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRuleArray0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { (byte) 0, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader4, terms5, terms6, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader11, fields12, fields13, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) fields13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 100, (long) (short) 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '#', (long) (short) 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 3, (double) (byte) 10);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray14, (java.lang.Object[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray14, (java.lang.Object[]) throttlingArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) throttlingArray25);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
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
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray6);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.setUp();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests23);
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain27;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean10, (java.lang.Object) ruleChain27);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
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
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests16.testMoreLikeThisIds();
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testWildcardQueryBuilder();
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling13, throttling14 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray15, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray9);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        short[] shortArray4 = new short[] { (byte) 10, (short) -1, (short) -1 };
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 2, (long) (short) 1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests3, simpleIndexQueryParserTests12 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray16);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray16);
        double[] doubleArray21 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) ' ');
        double[] doubleArray27 = new double[] { (byte) 10 };
        double[] doubleArray29 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray29, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray16, (java.lang.Object) doubleArray23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.setUp();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        java.lang.String str39 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.setUp();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests36, (java.lang.Object) simpleIndexQueryParserTests41);
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        java.lang.String str46 = simpleIndexQueryParserTests41.getTestName();
        simpleIndexQueryParserTests41.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests41.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTestsArray16, (java.lang.Object) simpleIndexQueryParserTests41);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 0L);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 10L);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("", indexReader14, 10, postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("tests.weekly", indexReader21, fields22, fields23, false);
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests12.ruleChain;
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 100 };
        short[] shortArray5 = new short[] { (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        int[] intArray3 = new int[] { 3, (short) 10, 1 };
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests7.ruleChain;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests7.testMoreLikeThisBuilder();
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.monster", (int) (byte) 100, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10.0f, 1.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        long[] longArray2 = new long[] { 100, 10L };
        long[] longArray6 = new long[] { (byte) -1, 1L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 1, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.setUp();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        java.lang.String str20 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests17, (java.lang.Object) simpleIndexQueryParserTests22);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        java.lang.String str27 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        simpleIndexQueryParserTests22.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) simpleIndexQueryParserTests22);
        simpleIndexQueryParserTests22.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) ruleChain4);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDisMaxBuilder();
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40, throttling41 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45, throttling46 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) throttlingArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling51, throttling52 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray42, (java.lang.Object[]) throttlingArray53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling63, throttling64 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray60, (java.lang.Object[]) throttlingArray65);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray71 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling69, throttling70 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray60, (java.lang.Object[]) throttlingArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray42, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray60);
        java.lang.Object obj76 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray23, obj76);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests78 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        simpleIndexQueryParserTests78.assertDocsSkippingEquals("", indexReader80, 10, postingsEnum82, postingsEnum83, true);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        simpleIndexQueryParserTests78.assertDocsSkippingEquals("tests.nightly", indexReader87, (int) (byte) 100, postingsEnum89, postingsEnum90, true);
        simpleIndexQueryParserTests78.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj76, (java.lang.Object) simpleIndexQueryParserTests78);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
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
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) 10 };
        short[] shortArray8 = new short[] { (short) 0, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests7.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        java.lang.String str17 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests14, (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain23;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
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
        simpleIndexQueryParserTests6.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray2);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray14, (java.lang.Object[]) throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray32);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray27);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling39 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray40, (java.lang.Object[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests57.setUp();
        simpleIndexQueryParserTests57.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests57);
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests57.assertDocsSkippingEquals("", indexReader63, (int) (byte) 0, postingsEnum65, postingsEnum66, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests57);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("", indexReader71, 0, postingsEnum73, postingsEnum74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling78 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray80 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling78, throttling79 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling83, throttling84 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList86 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray80, (java.lang.Object[]) throttlingArray85);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling90 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray91 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling89, throttling90 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList92 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray80, (java.lang.Object[]) throttlingArray91);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum74, (java.lang.Object) throttlingArray91);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray54, (java.lang.Object[]) throttlingArray91);
        java.util.Set<java.io.Serializable> serializableSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRuleIgnoreAfterMaxFailuresSet9, (java.lang.Object) throttlingArray27);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray11);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) -1, (double) 100.0f, (double) 1.0f);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 100, (double) 10);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6, throttling7 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray14);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray20, charArray24);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray24, charArray32);
        org.junit.Assert.assertArrayEquals(charArray12, charArray24);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray49, charArray53);
        org.junit.Assert.assertArrayEquals(charArray46, charArray49);
        org.junit.Assert.assertArrayEquals(charArray12, charArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingArray3, (java.lang.Object) charArray46);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 10, (short) 10, (byte) 100 };
        short[] shortArray8 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray6, shortArray8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling14, throttling15 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray16, (java.lang.Object[]) throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray16, (java.lang.Object[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray34, (java.lang.Object[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray34, (java.lang.Object[]) throttlingArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray16, (java.lang.Object[]) throttlingArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling51, throttling52 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray58 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56, throttling57 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray53, (java.lang.Object[]) throttlingArray58);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray34, (java.lang.Object[]) throttlingArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) throttlingArray58);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        short[] shortArray2 = new short[] { (byte) 100, (byte) -1 };
        short[] shortArray9 = new short[] { (short) 1, (short) -1, (byte) -1, (short) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
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
        java.lang.String str20 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum25);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
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
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray17, charArray21);
        org.junit.Assert.assertArrayEquals(charArray14, charArray17);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray14, charArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) charArray29);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBuilder();
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
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
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet17 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20, throttling21 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) throttlingArray27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests32.assertDocsSkippingEquals("", indexReader38, (int) (byte) 0, postingsEnum40, postingsEnum41, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests32.assertPositionsSkippingEquals("", indexReader46, 0, postingsEnum48, postingsEnum49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53, throttling54 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray55, (java.lang.Object[]) throttlingArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling64, throttling65 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray55, (java.lang.Object[]) throttlingArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum49, (java.lang.Object) throttlingArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling72, throttling73 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling77 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling78 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray79 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling77, throttling78 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList80 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray79);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray74, (java.lang.Object[]) throttlingArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) throttlingArray66, (java.lang.Object[]) throttlingArray79);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray66);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) throttlingArray27);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) (short) 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        short[] shortArray2 = new short[] { (byte) 0, (short) 100 };
        short[] shortArray5 = new short[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testEmptyBooleanQuery();
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        long[] longArray2 = new long[] { 3, 2 };
        long[] longArray4 = new long[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("node_s_0", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.maxfailures", indexReader30, fields31, fields32, false);
        org.junit.rules.TestRule testRule35 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) 1, (java.lang.Object) testRule35);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
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
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("random", indexReader15, terms16, terms17, false);
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests10.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.nightly", indexReader31, terms32, terms33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader37, fields38, fields39, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0d), (double) (short) 10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
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
        simpleIndexQueryParserTests6.setUp();
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus24 = simpleIndexQueryParserTests6.ensureGreen(strArray21);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray12);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests2, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11, throttling12 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray13, (java.lang.Object[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29, throttling30 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray31);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray26);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray26, (java.lang.Object[]) throttlingArray39);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57, throttling58 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray54, (java.lang.Object[]) throttlingArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray67 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling65, throttling66 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70, throttling71 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray67, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray67);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray59, (java.lang.Object[]) throttlingArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", objArray7, (java.lang.Object[]) throttlingArray67);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        short[] shortArray5 = new short[] { (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 1, (short) 1, (short) 100, (short) 100 };
        short[] shortArray9 = new short[] { (byte) 100, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1), (double) 1);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        org.junit.rules.RuleChain[][] ruleChainArray1 = new org.junit.rules.RuleChain[][] {};
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("<unknown>", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) ' ', postingsEnum14, postingsEnum15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChainArray1, (java.lang.Object) ' ');
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray11, charArray15);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray23, charArray27);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray15, charArray23);
        org.junit.Assert.assertArrayEquals(charArray3, charArray15);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        org.junit.Assert.assertArrayEquals(charArray3, charArray37);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray52, charArray54);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray37, charArray48);
        char[] charArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray48, charArray61);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.setUp();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.setUp();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests29);
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain33;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.setUp();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests41);
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.setUp();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.setUp();
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests51);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray56 = new org.junit.rules.RuleChain[] { ruleChain45, ruleChain49, ruleChain55 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, ruleChainArray56);
        java.util.Set<org.junit.rules.TestRule> testRuleSet58 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain33, (java.lang.Object) testRuleSet58);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("random", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("tests.awaitsfix", indexReader15, fields16, fields17, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("tests.monster", indexReader22, terms23, terms24, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) locale2, (java.lang.Object) terms24);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray1, shortArray3);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 5);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("", indexReader20, (int) (byte) 0, postingsEnum22, postingsEnum23, true);
        simpleIndexQueryParserTests14.setUp();
        java.lang.String str27 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanTermQueryBuilder();
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests8);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests8.assertDocsSkippingEquals("", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("", indexReader22, 0, postingsEnum24, postingsEnum25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29, throttling30 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray31, (java.lang.Object[]) throttlingArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40, throttling41 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray31, (java.lang.Object[]) throttlingArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum25, (java.lang.Object) throttlingArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests47.assertDocsSkippingEquals("tests.failfast", indexReader51, (int) (short) 100, postingsEnum53, postingsEnum54, true);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.monster", indexReader58, (int) '4', postingsEnum60, postingsEnum61);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        java.util.concurrent.ExecutorService[][] executorServiceArray76 = new java.util.concurrent.ExecutorService[][] { executorServiceArray65, executorServiceArray67, executorServiceArray69, executorServiceArray71, executorServiceArray73, executorServiceArray75 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, executorServiceArray76);
        java.lang.Object[] objArray78 = new java.lang.Object[] { '4', executorServiceArrayList77 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) throttlingArray5, objArray78);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        short[] shortArray3 = new short[] { (short) 0, (byte) 10, (short) 0 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling13, throttling14 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray15, (java.lang.Object[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray15, (java.lang.Object[]) throttlingArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36, throttling37 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray33, (java.lang.Object[]) throttlingArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42, throttling43 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray33, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray15, (java.lang.Object[]) throttlingArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray7, (java.lang.Object[]) throttlingArray33);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
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
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum18, (java.lang.Object) throttlingArray35);
        java.lang.Object[] objArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray35, objArray39);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        java.lang.String str9 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) simpleIndexQueryParserTests11);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        java.lang.String str16 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("random", postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain30;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain30);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain30;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) ruleChain30);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36, throttling37 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray45, (java.lang.Object[]) throttlingArray50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling54, throttling55 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray45, (java.lang.Object[]) throttlingArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) throttlingArray27);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("node_s_0", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) testRule15);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 100, (short) 1, (short) -1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 100, 0.0d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
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
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests7.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) '4');
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100, (double) 10, (double) (-1));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testSpanOrQueryBuilder();
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests7);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("", indexReader21, 0, postingsEnum23, postingsEnum24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28, throttling29 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum24, (java.lang.Object) throttlingArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray41);
        java.util.List[] listArray47 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[] throttlingEnumListArray48 = (java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>[]) listArray47;
        java.util.Set<java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>> throttlingEnumListSet49 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingEnumListArray48);
        java.util.Set<java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>>> throttlingEnumListSet50 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingEnumListArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingEnumListArray48);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
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
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests16.testSpanNearQueryBuilder();
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        long[] longArray2 = new long[] { (short) 10 };
        long[] longArray8 = new long[] { (byte) 0, 5, 4, 'a', 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray2, longArray8);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
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
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests6.ruleChain;
        simpleIndexQueryParserTests6.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
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
        java.lang.String str14 = simpleIndexQueryParserTests7.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.setUp();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.setUp();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests28);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain32;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests16);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("random", postingsEnum40, postingsEnum41, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests7, (java.lang.Object) true);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (short) 0 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray9);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        long[] longArray7 = new long[] { 10, (short) 10, (byte) 0, (byte) 0, (short) -1, '#' };
        long[] longArray12 = new long[] { 'a', 10L, (byte) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray7, longArray12);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryBuilder();
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        long[] longArray2 = new long[] { (short) 1 };
        long[] longArray7 = new long[] { 2, '4', 100L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray11);
        java.lang.Class<?> wildcardClass14 = throttlingArray11.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) '4', (java.lang.Object) throttlingArray11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures4 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures10, testRuleIgnoreAfterMaxFailures11 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures18 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray27 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures25 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures32);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray34 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures32 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray35 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray6, testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray20, testRuleIgnoreAfterMaxFailuresArray27, testRuleIgnoreAfterMaxFailuresArray34 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray35, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) throttlingArray9);
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
        java.lang.String str23 = simpleIndexQueryParserTests18.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingArray9, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
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
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests3, simpleIndexQueryParserTests12 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray16);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) simpleIndexQueryParserTestsArray16);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, (double) ' ');
        double[] doubleArray10 = new double[] { (byte) 10 };
        double[] doubleArray12 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray12, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests18.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray10, (java.lang.Object) simpleIndexQueryParserTests18);
        double[] doubleArray27 = new double[] { (byte) 10 };
        double[] doubleArray29 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray29, (double) ' ');
        double[] doubleArray34 = new double[] { (byte) 10 };
        double[] doubleArray36 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray36, (double) ' ');
        double[] doubleArray40 = new double[] { (byte) 10 };
        double[] doubleArray42 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray42, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray36, doubleArray42, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray42, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray29, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray29, (double) (byte) 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 2);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testTermsQueryFilter();
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum7, postingsEnum8, true);
        java.lang.Class<?> wildcardClass11 = simpleIndexQueryParserTests2.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        java.lang.Class<?> wildcardClass14 = simpleIndexQueryParserTests12.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests15.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.awaitsfix", indexReader27, terms28, terms29, true);
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass33 = simpleIndexQueryParserTests15.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass35 = throttling34.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling39 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray40, (java.lang.Object[]) throttlingArray45);
        java.lang.Class<?> wildcardClass48 = throttlingArray45.getClass();
        java.lang.Class[] classArray50 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass11;
        wildcardClassArray51[1] = wildcardClass14;
        wildcardClassArray51[2] = wildcardClass33;
        wildcardClassArray51[3] = wildcardClass35;
        wildcardClassArray51[4] = wildcardClass48;
        java.util.List<java.lang.Class<?>> wildcardClassList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, wildcardClassArray51);
        java.util.Set<java.lang.reflect.Type> typeSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClassArray51);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 2, (long) 10);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1L));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) (short) 10);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) 100L);
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray25, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray14, floatArray21, 0.0f);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray35, (float) (short) 10);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 100L);
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray31, floatArray38, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray38, (float) 1L);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray50, 100.0f);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray23);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray18);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray10, (java.lang.Object[]) throttlingArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests31.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests31, simpleIndexQueryParserTests40 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray44);
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTestsArray44);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray10, (java.lang.Object[]) simpleIndexQueryParserTestsArray44);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
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
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "enwiki.random.lines.txt", "node_s_0", "europarl.lines.txt.gz", "<unknown>", "", "tests.weekly" };
        java.lang.CharSequence[][] charSequenceArray21 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13, charSequenceArray20 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray25, executorServiceArray27, executorServiceArray29, executorServiceArray31, executorServiceArray33, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) executorServiceArray36);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 1, (double) 5);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        long[] longArray5 = new long[] { (short) 1, 0L, 10L, (short) 1, 10 };
        long[] longArray12 = new long[] { '#', 0L, (byte) -1, '#', (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        short[] shortArray7 = new short[] { (short) 100, (byte) 100, (short) -1, (short) 1, (short) 100, (byte) 10 };
        short[] shortArray13 = new short[] { (byte) 1, (byte) -1, (byte) 0, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain30);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { (byte) 0, 0L, 10L, 5, 'a', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
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
        simpleIndexQueryParserTests6.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests6.testMoreLikeThisIds();
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) (short) 10, 0.0d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
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
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus34 = simpleIndexQueryParserTests6.ensureGreen(strArray32);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMatchAllBuilder();
    }
}

