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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = simpleIndexQueryParserTests1.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) 1, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.failfast", indexReader30, fields31, fields32, false);
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) 1, postingsEnum40, postingsEnum41);
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain45 = null;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain45;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.ensureCleanedUp();
        simpleIndexQueryParserTests47.ensureCleanedUp();
        simpleIndexQueryParserTests47.setUp();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests56, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        simpleIndexQueryParserTests56.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests56.setUp();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain65;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) wildcardClass8, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray4);
        java.lang.Object obj8 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray4, obj8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray57);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray52);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) executorServiceArray34);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader11, (int) 'a', postingsEnum13, postingsEnum14, false);
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) (short) 100);
        double[] doubleArray24 = new double[] { 0.0d };
        double[] doubleArray26 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) (short) 100);
        double[] doubleArray31 = new double[] { 0.0d };
        double[] doubleArray33 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        double[] doubleArray44 = new double[] { 0.0d };
        double[] doubleArray46 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray46, (double) '#');
        double[] doubleArray53 = new double[] { 0.0d };
        double[] doubleArray55 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray55, (double) (short) 100);
        double[] doubleArray59 = new double[] { 0.0d };
        double[] doubleArray61 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray61, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray61, (double) '#');
        double[] doubleArray67 = new double[] { 0.0d };
        double[] doubleArray69 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray69, (double) (short) 100);
        double[] doubleArray73 = new double[] { 0.0d };
        double[] doubleArray75 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray75, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray75, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray61, doubleArray75, 0.0d);
        double[] doubleArray83 = new double[] { 0.0d };
        double[] doubleArray85 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray85, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray83, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray61, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray38, (double) 'a');
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray38, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray24, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) postingsEnum13, (java.lang.Object) doubleArray24);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
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
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 0.0d, (double) 0L);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray5);
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
        int[] intArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray10);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 0.0d, (double) (short) 1);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][][] doubleArray3 = new double[][][][] { doubleArray1, doubleArray2 };
        java.util.Set<double[][][]> doubleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray3);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) doubleArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray20);
        java.lang.Object obj24 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray20, obj24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray39);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray3, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray8, byteArray9);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray8, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray19, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("node_s_0", indexReader35, (int) (short) -1, postingsEnum37, postingsEnum38, true);
        simpleIndexQueryParserTests29.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        simpleIndexQueryParserTests44.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, false);
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, (int) (byte) 1, postingsEnum57, postingsEnum58);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain60);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) ruleChain60, (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests29, (java.lang.Object) "node_s_0");
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("", indexReader66, (int) (short) 0, postingsEnum68, postingsEnum69);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("hi!", indexReader72, terms73, terms74, true);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("tests.slow", indexReader78, (-1), postingsEnum80, postingsEnum81, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) byteArray19, (java.lang.Object) postingsEnum81);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        float[] floatArray8 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray15 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray24 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray31 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray31, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray8, floatArray24, (float) '#');
        float[] floatArray44 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray51 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray51, (float) (byte) 100);
        float[] floatArray60 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray67 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray67, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray44, floatArray60, (float) '#');
        float[] floatArray78 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray85 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray85, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray44, floatArray78, (float) 1L);
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray78, (float) (byte) 0);
        float[] floatArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray92, (float) '#');
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
        long[] longArray4 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 0 };
        long[] longArray12 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray10);
        short[] shortArray18 = new short[] { (short) -1 };
        short[] shortArray20 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        short[] shortArray25 = new short[] { (short) -1 };
        short[] shortArray27 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        short[] shortArray31 = new short[] { (short) -1 };
        short[] shortArray33 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (short) -1 };
        short[] shortArray38 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray31, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray25, shortArray31);
        short[] shortArray43 = new short[] { (short) -1 };
        short[] shortArray45 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals("hi!", shortArray31, shortArray43);
        org.junit.Assert.assertArrayEquals("hi!", shortArray20, shortArray31);
        short[] shortArray51 = new short[] { (short) -1 };
        short[] shortArray53 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (short) -1 };
        short[] shortArray58 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        org.junit.Assert.assertArrayEquals("", shortArray53, shortArray56);
        short[] shortArray63 = new short[] { (short) -1 };
        short[] shortArray65 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray69 = new short[] { (short) -1 };
        short[] shortArray71 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        short[] shortArray74 = new short[] { (short) -1 };
        short[] shortArray76 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray69, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray63, shortArray69);
        short[] shortArray82 = new short[] { (short) -1 };
        short[] shortArray84 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        short[] shortArray87 = new short[] { (short) -1 };
        short[] shortArray89 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals("", shortArray84, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray63);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) longArray10, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray8);
        java.lang.Object obj12 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray8, obj12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray24);
        java.lang.Object obj28 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray24, obj28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray49);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        java.util.concurrent.ExecutorService[][] executorServiceArray63 = new java.util.concurrent.ExecutorService[][] { executorServiceArray58, executorServiceArray60, executorServiceArray62 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray63);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 1);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        java.lang.Iterable[][] iterableArray1 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray2 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray1;
        java.lang.Iterable[][] iterableArray4 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray5 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray4;
        java.lang.Iterable[][] iterableArray7 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray8 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray7;
        java.lang.Iterable[][][] iterableArray10 = new java.lang.Iterable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][] strComparableIterableArray11 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]) iterableArray10;
        strComparableIterableArray11[0] = strComparableIterableArray2;
        strComparableIterableArray11[1] = strComparableIterableArray5;
        strComparableIterableArray11[2] = strComparableIterableArray8;
        java.lang.Iterable[][] iterableArray19 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray20 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray19;
        java.lang.Iterable[][] iterableArray22 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray23 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray22;
        java.lang.Iterable[][] iterableArray25 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray26 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray25;
        java.lang.Iterable[][][] iterableArray28 = new java.lang.Iterable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][] strComparableIterableArray29 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]) iterableArray28;
        strComparableIterableArray29[0] = strComparableIterableArray20;
        strComparableIterableArray29[1] = strComparableIterableArray23;
        strComparableIterableArray29[2] = strComparableIterableArray26;
        java.lang.Iterable[][][][] iterableArray37 = new java.lang.Iterable[2][][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][][] strComparableIterableArray38 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][][]) iterableArray37;
        strComparableIterableArray38[0] = strComparableIterableArray11;
        strComparableIterableArray38[1] = strComparableIterableArray29;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]> comparableIterableArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray38);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray44);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strComparableIterableArray38, (java.lang.Object[]) simpleIndexQueryParserTestsArray44);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray62);
        java.util.Set<java.lang.Object> objSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray3, longArray5);
        long[] longArray11 = new long[] { (byte) 0 };
        long[] longArray13 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray11, longArray13);
        long[] longArray17 = new long[] { (byte) 0 };
        long[] longArray19 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray17);
        long[] longArray25 = new long[] { (byte) 0 };
        long[] longArray27 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray25, longArray27);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray31, longArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray27, longArray31);
        org.junit.Assert.assertArrayEquals(longArray13, longArray27);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray13, longArray41);
        org.junit.Assert.assertArrayEquals(longArray5, longArray13);
        long[] longArray47 = new long[] { (byte) 0 };
        long[] longArray49 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray47, longArray49);
        long[] longArray53 = new long[] { (byte) 0 };
        long[] longArray55 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray53, longArray55);
        org.junit.Assert.assertArrayEquals(longArray49, longArray55);
        long[] longArray60 = new long[] { (byte) 0 };
        long[] longArray62 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray60, longArray62);
        long[] longArray66 = new long[] { (byte) 0 };
        long[] longArray68 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray66, longArray68);
        org.junit.Assert.assertArrayEquals(longArray60, longArray68);
        org.junit.Assert.assertArrayEquals(longArray55, longArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray5, longArray60);
        long[] longArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray73);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests31.ruleChain;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) testRule34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) '#', (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader4, (int) (byte) 100, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13);
        java.lang.String str15 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.nightly", indexReader21, terms22, terms23, false);
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1.0f, (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (int) 'a', postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str25 = simpleIndexQueryParserTests1.getTestName();
        java.lang.Object obj26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) str25, obj26);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, (long) (byte) 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 1);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1.0f));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader4, 1, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        int[] intArray10 = new int[] {};
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals(intArray10, intArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) intArray15);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray40);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray72);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray80);
        java.lang.Object obj84 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray80, obj84);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray80);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService[][][] executorServiceArray91 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList92 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, executorServiceArray91);
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList93 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, executorServiceArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray91);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100L, (double) (byte) 10);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 4);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1L), 0.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str8 = simpleIndexQueryParserTests2.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) 1, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests26.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.setUp();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader39, fields40, fields41, false);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, (int) (byte) 1, postingsEnum49, postingsEnum50);
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.setUp();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray54 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests9, simpleIndexQueryParserTests26, simpleIndexQueryParserTests31, simpleIndexQueryParserTests36 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet55 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray54);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet56 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray54);
        java.util.List<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (org.elasticsearch.test.ElasticsearchTestCase[]) elasticsearchSingleNodeTestArray54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests58.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests58.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) elasticsearchTestCaseList57, (java.lang.Object) simpleIndexQueryParserTests58);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.failfast", indexReader38, fields39, fields40, false);
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) (short) 100);
        double[] doubleArray15 = new double[] { 0.0d };
        double[] doubleArray17 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) (short) 100);
        double[] doubleArray21 = new double[] { 0.0d };
        double[] doubleArray23 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) '#');
        double[] doubleArray30 = new double[] { 0.0d };
        double[] doubleArray32 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) (short) 100);
        double[] doubleArray36 = new double[] { 0.0d };
        double[] doubleArray38 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray38, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray38, (double) '#');
        double[] doubleArray44 = new double[] { 0.0d };
        double[] doubleArray46 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) (short) 100);
        double[] doubleArray50 = new double[] { 0.0d };
        double[] doubleArray52 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray52, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray52, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray38, doubleArray52, 0.0d);
        double[] doubleArray60 = new double[] { 0.0d };
        double[] doubleArray62 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray60, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray38, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray15, (double) 'a');
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray15);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
        long[] longArray4 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 0 };
        long[] longArray12 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals(longArray4, longArray12);
        long[] longArray17 = new long[] { (byte) 0 };
        long[] longArray19 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray12, longArray19);
        long[] longArray25 = new long[] { (byte) 0 };
        long[] longArray27 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray25, longArray27);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray31, longArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray27, longArray31);
        long[] longArray39 = new long[] { (byte) 0 };
        long[] longArray41 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray39, longArray41);
        long[] longArray45 = new long[] { (byte) 0 };
        long[] longArray47 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray45, longArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray41, longArray45);
        org.junit.Assert.assertArrayEquals(longArray27, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray19, longArray27);
        long[] longArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray27, longArray52);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
        short[] shortArray2 = new short[] {};
        short[][] shortArray3 = new short[][] { shortArray2 };
        java.util.Set<short[]> shortArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray3);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) shortArray3);
        java.util.Set<short[]> shortArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet9 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray8);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray8);
        java.util.concurrent.ExecutorService[][][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, executorServiceArray13);
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, executorServiceArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray8, (java.lang.Object[]) executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) shortArray3, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 10.0f);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 'a', (double) 0.0f, 0.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("node_s_0", indexReader7, (int) (short) -1, postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("node_s_0", indexReader14, terms15, terms16, true);
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests28.assertTermsEquals("tests.nightly", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (short) 1, postingsEnum41, postingsEnum42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        simpleIndexQueryParserTests44.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, false);
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("tests.awaitsfix", indexReader55, (int) 'a', postingsEnum57, postingsEnum58);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain60;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain60);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain60;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain60);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0L, (long) (short) 100);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray3, longArray5);
        long[] longArray9 = new long[] { (byte) 0 };
        long[] longArray11 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray3, longArray11);
        long[] longArray16 = new long[] { (byte) 0 };
        long[] longArray18 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray16, longArray18);
        long[] longArray22 = new long[] { (byte) 0 };
        long[] longArray24 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray22, longArray24);
        org.junit.Assert.assertArrayEquals(longArray18, longArray24);
        org.junit.Assert.assertArrayEquals(longArray3, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 0, (double) (byte) 100, (double) 4);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 0);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2557");
        java.lang.Object obj0 = null;
        double[] doubleArray2 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) (short) 100);
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) (short) 100);
        double[] doubleArray15 = new double[] { 0.0d };
        double[] doubleArray17 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) (short) 100);
        double[] doubleArray21 = new double[] { 0.0d };
        double[] doubleArray23 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) '#');
        double[] doubleArray30 = new double[] { 0.0d };
        double[] doubleArray32 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) (short) 100);
        double[] doubleArray36 = new double[] { 0.0d };
        double[] doubleArray38 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray38, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray38, (double) '#');
        double[] doubleArray44 = new double[] { 0.0d };
        double[] doubleArray46 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) (short) 100);
        double[] doubleArray50 = new double[] { 0.0d };
        double[] doubleArray52 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray52, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray52, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray38, doubleArray52, 0.0d);
        double[] doubleArray60 = new double[] { 0.0d };
        double[] doubleArray62 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray60, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray38, 100.0d);
        double[] doubleArray70 = new double[] { 0.0d };
        double[] doubleArray72 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray72, (double) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray72, (double) 100L);
        double[] doubleArray79 = new double[] { 0.0d };
        double[] doubleArray81 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray81, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray79, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray10, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) doubleArray2);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2558");
        int[] intArray1 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray6);
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) ruleChain20);
        int[] intArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray24);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 1, (double) 100);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2560");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2561");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 1, (double) 10);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2563");
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray23, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray27, charArray31);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray35, charArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray27, charArray39);
        org.junit.Assert.assertArrayEquals("hi!", charArray13, charArray27);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray46, charArray50);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray50, charArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray27, charArray54);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) executorServiceArray59);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2565");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        java.lang.Object obj15 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray11, obj15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) executorServiceArray23);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader20, (int) '4', postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35, false);
        org.junit.rules.TestRule testRule38 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests39.assertFieldsEquals("tests.failfast", indexReader42, fields43, fields44, false);
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) testRule38, (java.lang.Object) 1);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2567");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 10.0d, (double) 1.0f);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2568");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray7);
        java.lang.Object obj11 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray7, obj11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray40);
        java.lang.Object obj44 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray40, obj44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray52);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray66);
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        java.util.Set<java.lang.Object> objSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray66);
        double[][][] doubleArray80 = new double[][][] {};
        double[][][] doubleArray81 = new double[][][] {};
        double[][][][] doubleArray82 = new double[][][][] { doubleArray80, doubleArray81 };
        java.util.Set<double[][][]> doubleArraySet83 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) doubleArray82);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2569");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 10);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2572");
        java.lang.Object obj0 = null;
        float[] floatArray9 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray16 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray25 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray32 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray9, floatArray25, (float) '#');
        float[] floatArray45 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray52 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray61 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray68 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray68, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray45, floatArray61, (float) '#');
        float[] floatArray79 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray86 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray86, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray61, floatArray79, (float) 0L);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray25, floatArray61, (float) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2573");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        java.lang.String str17 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        simpleIndexQueryParserTests39.setUp();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) testRule19, (java.lang.Object) ruleChain43);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader20, (int) (short) -1, postingsEnum22, postingsEnum23, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("node_s_0", indexReader33, 1, postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        int[] intArray39 = new int[] {};
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray42, intArray44);
        org.junit.Assert.assertArrayEquals(intArray39, intArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests29, (java.lang.Object) intArray44);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray54, intArray56);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray62, intArray64);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray54, intArray62);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray72, intArray74);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray72, intArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray54, intArray80);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray44, intArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain27, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (int) 'a', postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.awaitsfix", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("node_s_0", 1, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2578");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2579");
        java.lang.Iterable[] iterableArray3 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[] strComparableIterableArray4 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[]) iterableArray3;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray4);
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] elasticsearchSingleNodeTestArray7 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] {};
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest[][]> elasticsearchSingleNodeTestArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray7);
        org.junit.Assert.assertNotNull("", (java.lang.Object) elasticsearchSingleNodeTestArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strComparableIterableArray4, (java.lang.Object[]) elasticsearchSingleNodeTestArray7);
        int[] intArray15 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[] intArray20 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[] intArray25 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[][] intArray26 = new int[][] { intArray15, intArray20, intArray25 };
        int[][][] intArray27 = new int[][][] { intArray26 };
        java.util.Set<int[][]> intArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(intArray27);
        java.util.Set<java.io.Serializable[]> serializableArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) intArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) elasticsearchSingleNodeTestArray7, (java.lang.Object[]) intArray27);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 10);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2581");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2582");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray42);
        java.lang.Object obj46 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray42, obj46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray54);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests62.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        simpleIndexQueryParserTests64.assertFieldsEquals("tests.failfast", indexReader67, fields68, fields69, false);
        org.junit.rules.RuleChain ruleChain72 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        java.lang.String str73 = simpleIndexQueryParserTests64.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum75, postingsEnum76, true);
        org.junit.rules.RuleChain ruleChain79 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray80 = new org.junit.rules.RuleChain[] { ruleChain79 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet81 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray80);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests62, (java.lang.Object) ruleChainArray80);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) ruleChainArray80);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 1, (double) 2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2585");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2 };
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, queryCachingPolicyArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet7 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray6);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) simpleIndexQueryParserTestsArray6);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2586");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader16, terms17, terms18, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2588");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray25);
        java.lang.Object obj29 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray25, obj29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray51);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy65 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray66 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy65 };
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, queryCachingPolicyArray66);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) queryCachingPolicyArray66);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str14 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader16, fields17, fields18, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests21, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2590");
        float[] floatArray7 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray14 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray25 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray32 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray32, (float) (byte) 100);
        float[] floatArray41 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray48 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray25, floatArray41, (float) '#');
        float[] floatArray60 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray67 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray67, (float) (byte) 100);
        float[] floatArray76 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray83 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray83, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray60, floatArray76, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray41, floatArray76, 0.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray7, floatArray41, (float) (byte) 10);
        float[] floatArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray92, (float) (short) 10);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2591");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray44);
        java.lang.Object obj48 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray44, obj48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2592");
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
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray13);
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray25);
        java.lang.Object obj29 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray25, obj29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray19);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet35 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) simpleIndexQueryParserTestsArray34);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (short) 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2594");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader19, 4, postingsEnum21, postingsEnum22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 100);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, (double) (short) 10, (double) (byte) 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 1);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2599");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader22, 10, postingsEnum24, postingsEnum25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum25);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2600");
        double[] doubleArray2 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) (short) 100);
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray10, (double) '#');
        double[] doubleArray17 = new double[] { 0.0d };
        double[] doubleArray19 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray19, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray25, (double) '#');
        double[] doubleArray31 = new double[] { 0.0d };
        double[] doubleArray33 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) (short) 100);
        double[] doubleArray37 = new double[] { 0.0d };
        double[] doubleArray39 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray39, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray25, doubleArray39, 0.0d);
        double[] doubleArray47 = new double[] { 0.0d };
        double[] doubleArray49 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray49, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray47, (double) 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray10, doubleArray47, 1.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) (short) 10);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2602");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str8 = simpleIndexQueryParserTests2.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) 1, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests26.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.setUp();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader39, fields40, fields41, false);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, (int) (byte) 1, postingsEnum49, postingsEnum50);
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.setUp();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray54 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests9, simpleIndexQueryParserTests26, simpleIndexQueryParserTests31, simpleIndexQueryParserTests36 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet55 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray54);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, elasticsearchSingleNodeTestArray54);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet57 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) elasticsearchSingleNodeTestArray54);
        int[] intArray62 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[] intArray67 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[] intArray72 = new int[] { 10, (byte) 10, (short) 100, '4' };
        int[][] intArray73 = new int[][] { intArray62, intArray67, intArray72 };
        int[][][] intArray74 = new int[][][] { intArray73 };
        java.util.Set<int[][]> intArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(intArray74);
        java.util.Set<java.io.Serializable[]> serializableArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) intArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) elasticsearchSingleNodeTestArray54, (java.lang.Object[]) intArray74);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2604");
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
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader20, fields21, fields22, true);
        java.lang.String[][][] strArray25 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray26 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray28 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray29 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray30 = new java.lang.String[][][][] { strArray25, strArray26, strArray27, strArray28, strArray29 };
        java.util.Set<java.lang.String[][][]> strArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields21, (java.lang.Object) strArray30);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2606");
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
        java.lang.String str26 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2607");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d, (double) 3);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2608");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray43);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(100);
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
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader38, (int) (byte) 1, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        simpleIndexQueryParserTests44.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, false);
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, (int) (byte) 1, postingsEnum57, postingsEnum58);
        java.lang.String str60 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.setUp();
        simpleIndexQueryParserTests44.setUp();
        simpleIndexQueryParserTests44.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) postingsEnum41, (java.lang.Object) simpleIndexQueryParserTests44);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 1L, (long) 2);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2611");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str24 = simpleIndexQueryParserTests18.getTestName();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) ' ', postingsEnum28, postingsEnum29, false);
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("node_s_0", indexReader35, terms36, terms37, true);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) boolean17, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests18.ruleChain;
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2612");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray3);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) '#', (double) (short) -1, 0.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2615");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray5);
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain19;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain19;
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) ruleChain19);
        java.lang.Object obj23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray5, obj23);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 0, 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (short) -1);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2618");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str35 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        java.lang.Object obj40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj40);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2619");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) (short) 100);
        double[] doubleArray25 = new double[] { 0.0d };
        double[] doubleArray27 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray27, (double) (short) 100);
        double[] doubleArray31 = new double[] { 0.0d };
        double[] doubleArray33 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) '#');
        double[] doubleArray40 = new double[] { 0.0d };
        double[] doubleArray42 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray42, (double) (short) 100);
        double[] doubleArray46 = new double[] { 0.0d };
        double[] doubleArray48 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray48, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray48, (double) '#');
        double[] doubleArray54 = new double[] { 0.0d };
        double[] doubleArray56 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray56, (double) (short) 100);
        double[] doubleArray60 = new double[] { 0.0d };
        double[] doubleArray62 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray62, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray48, doubleArray62, 0.0d);
        double[] doubleArray70 = new double[] { 0.0d };
        double[] doubleArray72 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray72, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray70, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray48, 100.0d);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray18, doubleArray48, 10.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray11, doubleArray48, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray48, (double) (byte) 10);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests13.setIndexWriterMaxDocs((int) '4');
        java.lang.String str18 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.awaitsfix", indexReader31, (int) 'a', postingsEnum33, postingsEnum34);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0L, (double) (short) 10, (double) (-1.0f));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10, (double) 'a', (double) 10.0f);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2624");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray7);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray13, byteArray18);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray23, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray23, byteArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray23);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray35, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray40, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray40);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray51, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray36, byteArray51);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray51);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray64, byteArray65);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray64, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray69);
        byte[] byteArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray73);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) 3, (double) (byte) 1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 0, (double) 0.0f);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2628");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader4, (int) (byte) 100, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        simpleIndexQueryParserTests30.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests20, (java.lang.Object) simpleIndexQueryParserTests30);
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        simpleIndexQueryParserTests37.assertFieldsEquals("tests.failfast", indexReader40, fields41, fields42, false);
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (byte) 1, postingsEnum50, postingsEnum51);
        simpleIndexQueryParserTests37.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain54;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests20.assertDocsSkippingEquals("tests.awaitsfix", indexReader57, (int) (byte) 1, postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum59);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2629");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 10, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2630");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 2);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2632");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2633");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray3, (double) (short) 100);
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) (short) 100);
        double[] doubleArray14 = new double[] { 0.0d };
        double[] doubleArray16 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray16, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray16, (double) '#');
        double[] doubleArray23 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) (short) 100);
        double[] doubleArray29 = new double[] { 0.0d };
        double[] doubleArray31 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray31, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) '#');
        double[] doubleArray37 = new double[] { 0.0d };
        double[] doubleArray39 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) (short) 100);
        double[] doubleArray43 = new double[] { 0.0d };
        double[] doubleArray45 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray45, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray45, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray31, doubleArray45, 0.0d);
        double[] doubleArray53 = new double[] { 0.0d };
        double[] doubleArray55 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray55, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray53, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray31, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray8, (double) 'a');
        double[] doubleArray66 = new double[] { 0.0d };
        double[] doubleArray68 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray68, (double) (short) 100);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray66);
        double[] doubleArray73 = new double[] { 0.0d };
        double[] doubleArray75 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray75, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray73, (double) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray73, (double) (-1));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2634");
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
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2638");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2639");
        short[] shortArray3 = new short[] { (short) -1 };
        short[] shortArray5 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) -1 };
        short[] shortArray11 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        short[] shortArray14 = new short[] { (short) -1 };
        short[] shortArray16 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray9, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray3, shortArray9);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray27 = new short[] { (short) -1 };
        short[] shortArray29 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        simpleIndexQueryParserTests34.resetCheckIndexStatus();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests34.assertDocsEnumEquals("tests.awaitsfix", postingsEnum39, postingsEnum40, true);
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests34.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) shortArray3, (java.lang.Object) simpleIndexQueryParserTests34);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2640");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) '#', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2641");
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] elasticsearchSingleNodeTestArray0 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] elasticsearchSingleNodeTestArray1 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] elasticsearchSingleNodeTestArray2 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] elasticsearchSingleNodeTestArray3 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][] {};
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][][][] elasticsearchSingleNodeTestArray4 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][][][] { elasticsearchSingleNodeTestArray0, elasticsearchSingleNodeTestArray1, elasticsearchSingleNodeTestArray2, elasticsearchSingleNodeTestArray3 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest[][][]> elasticsearchSingleNodeTestArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray4);
        java.util.Set<java.lang.Cloneable> cloneableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) elasticsearchSingleNodeTestArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray64);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray82);
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray82);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray4, (java.lang.Object[]) executorServiceArray59);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2642");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2643");
        short[] shortArray5 = new short[] { (short) -1, (byte) 0, (byte) 1, (short) 0, (short) 1 };
        short[] shortArray8 = new short[] { (short) -1 };
        short[] shortArray10 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray21 = new short[] { (short) -1 };
        short[] shortArray23 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (short) -1 };
        short[] shortArray28 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray21, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray15, shortArray21);
        short[] shortArray33 = new short[] { (short) -1 };
        short[] shortArray35 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals("hi!", shortArray21, shortArray33);
        org.junit.Assert.assertArrayEquals("hi!", shortArray10, shortArray21);
        short[] shortArray40 = new short[] { (short) -1 };
        short[] shortArray42 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        short[] shortArray46 = new short[] { (short) -1 };
        short[] shortArray48 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        short[] shortArray53 = new short[] { (short) -1 };
        short[] shortArray55 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        short[] shortArray59 = new short[] { (short) -1 };
        short[] shortArray61 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        short[] shortArray64 = new short[] { (short) -1 };
        short[] shortArray66 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray59, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray53, shortArray59);
        short[] shortArray71 = new short[] { (short) -1 };
        short[] shortArray73 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray73);
        org.junit.Assert.assertArrayEquals("hi!", shortArray59, shortArray71);
        org.junit.Assert.assertArrayEquals("hi!", shortArray48, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray21);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2644");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray11);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray11, byteArray16);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("", byteArray16, byteArray26);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray31);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray26);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) '4');
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2646");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.lang.Object[] objArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, objArray16);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0L, 100.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2648");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2649");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, (int) 'a', postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.nightly", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader39, fields40, fields41, false);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.awaitsfix", indexReader47, (int) 'a', postingsEnum49, postingsEnum50);
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.weekly", (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests57.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        simpleIndexQueryParserTests57.assertFieldsEquals("tests.failfast", indexReader60, fields61, fields62, false);
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        simpleIndexQueryParserTests57.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("tests.awaitsfix", indexReader68, (int) 'a', postingsEnum70, postingsEnum71);
        org.junit.rules.RuleChain ruleChain73 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests57.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain74;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain74;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain74);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2650");
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
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 10, (double) 1);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, false);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        java.lang.String str30 = simpleIndexQueryParserTests21.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum32, postingsEnum33, true);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests21);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests21);
        short[] shortArray40 = new short[] {};
        short[][] shortArray41 = new short[][] { shortArray40 };
        java.util.Set<short[]> shortArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray41);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) shortArray41);
        java.util.Set<short[]> shortArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) shortArray41);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2653");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray5);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2654");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { 1.0d };
        double[] doubleArray5 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { 1.0d };
        double[] doubleArray9 = new double[] { 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7, doubleArray9 };
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 1.0d };
        double[] doubleArray16 = new double[] { 1.0d };
        double[] doubleArray18 = new double[] { 1.0d };
        double[] doubleArray20 = new double[] { 1.0d };
        double[][] doubleArray21 = new double[][] { doubleArray12, doubleArray14, doubleArray16, doubleArray18, doubleArray20 };
        double[] doubleArray23 = new double[] { 1.0d };
        double[] doubleArray25 = new double[] { 1.0d };
        double[] doubleArray27 = new double[] { 1.0d };
        double[] doubleArray29 = new double[] { 1.0d };
        double[] doubleArray31 = new double[] { 1.0d };
        double[][] doubleArray32 = new double[][] { doubleArray23, doubleArray25, doubleArray27, doubleArray29, doubleArray31 };
        double[][][] doubleArray33 = new double[][][] { doubleArray10, doubleArray21, doubleArray32 };
        java.util.Set<double[][]> doubleArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray33);
        java.util.Set<double[][]> doubleArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray33, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2655");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray12, byteArray13);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray17, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray17);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray8);
        java.lang.Class<?> wildcardClass28 = byteArray8.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) wildcardClass28);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2657");
        short[] shortArray0 = new short[] {};
        short[][] shortArray1 = new short[][] { shortArray0 };
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray10);
        java.lang.Object obj14 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray10, obj14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray43);
        java.lang.Object obj47 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray43, obj47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray55);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray69);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray76);
        java.util.Set<java.lang.Object> objSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray69);
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray1, (java.lang.Object[]) executorServiceArray69);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10L, 1L);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2659");
        java.lang.Object[] objArray1 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", objArray1, (java.lang.Object[]) localeArray12);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2660");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) '4', 0.0d, (double) (-1L));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) '#');
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 1, (long) (byte) 10);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2663");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray21, strArray27 };
        java.util.Set<java.lang.String[]> strArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray28, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray28);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray42);
        java.lang.Object obj46 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray42, obj46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray58);
        java.lang.Object obj62 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray58, obj62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray70);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray84);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        java.util.concurrent.ExecutorService executorService90 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] { executorService90 };
        boolean boolean92 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray91);
        boolean boolean93 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray91);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray91);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) executorServiceArray84);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2664");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2665");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 'a');
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2668");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray24);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2669");
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (short) 100);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) '#');
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) (short) 100);
        double[] doubleArray24 = new double[] { 0.0d };
        double[] doubleArray26 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray26, (double) '#');
        double[] doubleArray32 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray26, doubleArray40, 0.0d);
        double[] doubleArray48 = new double[] { 0.0d };
        double[] doubleArray50 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray50, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray48, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray26, 100.0d);
        double[] doubleArray59 = new double[] { 0.0d };
        double[] doubleArray61 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray61, (double) (short) 100);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray59);
        double[] doubleArray66 = new double[] { 0.0d };
        double[] doubleArray68 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray68, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 1);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray26, doubleArray66, (double) 100L);
        double[] doubleArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray75, (double) 10.0f);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2670");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray3, longArray5);
        long[] longArray9 = new long[] { (byte) 0 };
        long[] longArray11 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray3, longArray11);
        long[] longArray16 = new long[] { (byte) 0 };
        long[] longArray18 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray16, longArray18);
        long[] longArray22 = new long[] { (byte) 0 };
        long[] longArray24 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray22, longArray24);
        org.junit.Assert.assertArrayEquals(longArray18, longArray24);
        org.junit.Assert.assertArrayEquals(longArray3, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) longArray3);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2671");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader4, (int) (byte) 100, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str17 = simpleIndexQueryParserTests1.getTestName();
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray31);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray23, intArray42);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray49, intArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray42, intArray51);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) intArray51);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2673");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.String str17 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) str17);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.monster", (int) (byte) 100, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2676");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests9, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.setUp();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2678");
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.util.Set<java.lang.String[][][]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        short[] shortArray11 = new short[] { (byte) -1, (byte) 100, (byte) -1 };
        short[] shortArray15 = new short[] { (byte) -1, (byte) 100, (byte) -1 };
        short[] shortArray19 = new short[] { (byte) -1, (byte) 100, (byte) -1 };
        short[] shortArray23 = new short[] { (byte) -1, (byte) 100, (byte) -1 };
        short[] shortArray27 = new short[] { (byte) -1, (byte) 100, (byte) -1 };
        short[][] shortArray28 = new short[][] { shortArray11, shortArray15, shortArray19, shortArray23, shortArray27 };
        java.util.Set<short[]> shortArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray28);
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) shortArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray6, (java.lang.Object[]) shortArray28);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.slow", "node_s_0", "random", "tests.failfast" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus15 = simpleIndexQueryParserTests0.ensureGreen(strArray12);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader6, terms7, terms8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("node_s_0", indexReader23, terms24, terms25, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests28.assertDocsSkippingEquals("tests.maxfailures", indexReader35, (int) '#', postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests28.assertFieldsEquals("enwiki.random.lines.txt", indexReader42, fields43, fields44, true);
        org.junit.rules.TestRule testRule47 = simpleIndexQueryParserTests28.ruleChain;
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "node_s_0", (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2681");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (short) -1 };
        short[] shortArray6 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray11 = new short[] { (short) -1 };
        short[] shortArray13 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        short[] shortArray17 = new short[] { (short) -1 };
        short[] shortArray19 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (short) -1 };
        short[] shortArray24 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray11, shortArray17);
        short[] shortArray29 = new short[] { (short) -1 };
        short[] shortArray31 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals("hi!", shortArray17, shortArray29);
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray17);
        short[] shortArray37 = new short[] { (short) -1 };
        short[] shortArray39 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (short) -1 };
        short[] shortArray44 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray42);
        short[] shortArray49 = new short[] { (short) -1 };
        short[] shortArray51 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        short[] shortArray55 = new short[] { (short) -1 };
        short[] shortArray57 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray55, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray49, shortArray55);
        short[] shortArray68 = new short[] { (short) -1 };
        short[] shortArray70 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (short) -1 };
        short[] shortArray75 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray70, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray6);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2682");
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
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray14);
        java.lang.Object obj18 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray14, obj18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray33);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray26);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "tests.nightly", "tests.monster", "random", "hi!", "tests.failfast" };
        java.util.List<java.lang.CharSequence> charSequenceList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, charSequenceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) charSequenceArray46);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2683");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray17 = new org.junit.rules.RuleChain[] { ruleChain16 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet18 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests19.assertFieldsEquals("tests.failfast", indexReader22, fields23, fields24, false);
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        java.lang.String str28 = simpleIndexQueryParserTests19.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum30, postingsEnum31, true);
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests19.assertFieldsEquals("node_s_0", indexReader36, fields37, fields38, false);
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) ruleChainSet18, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests3.ruleChain;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests3.ruleChain;
        short[] shortArray13 = new short[] { (short) -1 };
        short[] shortArray15 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray18 = new short[] { (short) -1 };
        short[] shortArray20 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray13, shortArray18);
        short[] shortArray25 = new short[] { (short) -1 };
        short[] shortArray27 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray27);
        short[] shortArray31 = new short[] { (short) -1 };
        short[] shortArray33 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (short) -1 };
        short[] shortArray38 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray31, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray25, shortArray31);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray25);
        short[] shortArray45 = new short[] { (short) -1 };
        short[] shortArray47 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        short[] shortArray51 = new short[] { (short) -1 };
        short[] shortArray53 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray56 = new short[] { (short) -1 };
        short[] shortArray58 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray51, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray45, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray13, shortArray45);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) testRule8, (java.lang.Object) shortArray13);
        short[] shortArray65 = new short[] { (short) -1 };
        short[] shortArray67 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray67);
        short[] shortArray70 = new short[] { (short) -1 };
        short[] shortArray72 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray13, shortArray67);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests76.ensureCleanedUp();
        simpleIndexQueryParserTests76.ensureCleanedUp();
        simpleIndexQueryParserTests76.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests76.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        simpleIndexQueryParserTests76.assertDocsSkippingEquals("tests.slow", indexReader82, (int) (short) 0, postingsEnum84, postingsEnum85, false);
        simpleIndexQueryParserTests76.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) shortArray13, (java.lang.Object) simpleIndexQueryParserTests76);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2685");
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][][] doubleArray3 = new double[][][][] { doubleArray1, doubleArray2 };
        java.util.Set<double[][][]> doubleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray3);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) doubleArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("tests.failfast", indexReader9, fields10, fields11, false);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str15 = simpleIndexQueryParserTests6.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum17, postingsEnum18, true);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray22 = new org.junit.rules.RuleChain[] { ruleChain21 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet23 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChainArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray3, (java.lang.Object[]) ruleChainArray22);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2686");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray12, byteArray13);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray17, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray17);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray29, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray34, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray34);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray45, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray45);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("random", byteArray45, byteArray56);
        org.junit.Assert.assertArrayEquals("random", byteArray17, byteArray45);
        byte[] byteArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray60);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2687");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray16, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("", intArray18, intArray22);
        org.junit.Assert.assertArrayEquals(intArray10, intArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray10);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray34, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("", intArray36, intArray40);
        org.junit.Assert.assertArrayEquals(intArray28, intArray36);
        org.junit.Assert.assertArrayEquals(intArray10, intArray28);
        int[] intArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray28, intArray46);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (-1), (long) (short) 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0L, (long) (-1));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (-1), (long) 1);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) ' ');
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2694");
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
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader32, fields33, fields34, false);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 3, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        java.lang.String str6 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("hi!", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray16, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray21, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray21);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray32, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) byteArray21);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2696");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2697");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray9, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray20, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray20);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray33, byteArray38);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray43, byteArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray38, byteArray43);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray53, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray43, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray53);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2698");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray17);
        java.lang.Object obj21 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray17, obj21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray33);
        java.lang.Object obj37 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray33, obj37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray45);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) 0, (double) 0);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2700");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2701");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str8 = simpleIndexQueryParserTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) ' ', postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2703");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray13);
        java.util.List<java.lang.String[]> strArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, strArray13);
        java.util.Set<java.lang.String[]> strArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests20);
        org.junit.Assert.assertNotSame((java.lang.Object) strArraySet18, (java.lang.Object) simpleIndexQueryParserTests20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests20.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2704");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (byte) 1, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("", indexReader34, fields35, fields36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests17.assertDocsSkippingEquals("tests.slow", indexReader40, (int) '#', postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("tests.maxfailures", postingsEnum47, postingsEnum48, true);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests11, (java.lang.Object) simpleIndexQueryParserTests17);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests58.ensureCleanedUp();
        simpleIndexQueryParserTests58.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests58.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests58.assertDocsSkippingEquals("node_s_0", indexReader64, (int) (short) -1, postingsEnum66, postingsEnum67, true);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("node_s_0", indexReader71, terms72, terms73, true);
        org.junit.rules.TestRule testRule76 = simpleIndexQueryParserTests58.ruleChain;
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("europarl.lines.txt.gz", indexReader78, terms79, terms80, true);
        org.junit.rules.RuleChain ruleChain83 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests11, (java.lang.Object) simpleIndexQueryParserTests58);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2706");
        java.lang.Iterable[][] iterableArray1 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray2 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray1;
        java.lang.Iterable[][] iterableArray4 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray5 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray4;
        java.lang.Iterable[][] iterableArray7 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray8 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray7;
        java.lang.Iterable[][][] iterableArray10 = new java.lang.Iterable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][] strComparableIterableArray11 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]) iterableArray10;
        strComparableIterableArray11[0] = strComparableIterableArray2;
        strComparableIterableArray11[1] = strComparableIterableArray5;
        strComparableIterableArray11[2] = strComparableIterableArray8;
        java.lang.Iterable[][] iterableArray19 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray20 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray19;
        java.lang.Iterable[][] iterableArray22 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray23 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray22;
        java.lang.Iterable[][] iterableArray25 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][] strComparableIterableArray26 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][]) iterableArray25;
        java.lang.Iterable[][][] iterableArray28 = new java.lang.Iterable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][] strComparableIterableArray29 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]) iterableArray28;
        strComparableIterableArray29[0] = strComparableIterableArray20;
        strComparableIterableArray29[1] = strComparableIterableArray23;
        strComparableIterableArray29[2] = strComparableIterableArray26;
        java.lang.Iterable[][][][] iterableArray37 = new java.lang.Iterable[2][][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][][] strComparableIterableArray38 = (java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][][]) iterableArray37;
        strComparableIterableArray38[0] = strComparableIterableArray11;
        strComparableIterableArray38[1] = strComparableIterableArray29;
        java.util.Set<java.lang.Iterable<java.lang.Comparable<java.lang.String>>[][][]> comparableIterableArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(strComparableIterableArray38);
        org.junit.rules.TestRule[][] testRuleArray45 = new org.junit.rules.TestRule[][] {};
        java.util.List<org.junit.rules.TestRule[]> testRuleArrayList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, testRuleArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) comparableIterableArraySet43, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2707");
        int[] intArray2 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray7);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray19, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("", intArray21, intArray25);
        org.junit.Assert.assertArrayEquals(intArray13, intArray21);
        int[] intArray30 = new int[] {};
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray33, intArray35);
        org.junit.Assert.assertArrayEquals(intArray30, intArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray35);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray7, intArray35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        simpleIndexQueryParserTests42.assertFieldsEquals("tests.failfast", indexReader45, fields46, fields47, false);
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.awaitsfix", indexReader53, (int) 'a', postingsEnum55, postingsEnum56);
        simpleIndexQueryParserTests42.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests42.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        simpleIndexQueryParserTests42.assertFieldsEquals("", indexReader63, fields64, fields65, false);
        simpleIndexQueryParserTests42.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "node_s_0", (java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2709");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray18, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) byteArray7, (java.lang.Object) simpleIndexQueryParserTests27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests27.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2711");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) executorServiceArray2, (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2712");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray8, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray16, charArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray8, charArray20);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray26, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("hi!", charArray34, charArray38);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray26, charArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray20, charArray38);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray45, charArray49);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals("hi!", charArray53, charArray57);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray45, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray45, charArray62);
        org.junit.Assert.assertArrayEquals(charArray20, charArray45);
        char[] charArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray20, charArray66);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2713");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12);
        java.lang.String str14 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (byte) 1, postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.failfast", indexReader38, fields39, fields40, false);
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) (byte) 1, postingsEnum48, postingsEnum49);
        simpleIndexQueryParserTests35.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain53 = null;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain53;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        simpleIndexQueryParserTests55.setUp();
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain59;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum63, postingsEnum64, false);
        org.junit.rules.TestRule testRule67 = simpleIndexQueryParserTests17.ruleChain;
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain15, (java.lang.Object) simpleIndexQueryParserTests17);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2714");
        float[] floatArray8 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray15 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray24 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray31 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray31, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray8, floatArray24, (float) '#');
        float[] floatArray44 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray51 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray51, (float) (byte) 100);
        float[] floatArray60 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray67 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray67, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray44, floatArray60, (float) '#');
        float[] floatArray78 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray85 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray85, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray44, floatArray78, (float) 1L);
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray78, (float) (byte) 0);
        float[] floatArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray92, (float) 10);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 10, (double) '4', (double) (short) -1);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2717");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("", intArray9, intArray13);
        org.junit.Assert.assertArrayEquals(intArray1, intArray9);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray22, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray30, intArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray22, intArray30);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray40, intArray42);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray40, intArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray22, intArray48);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals(intArray48, intArray56);
        org.junit.Assert.assertArrayEquals(intArray1, intArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) intArray56);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 0.0d, (double) 1L);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2721");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) '#', (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2723");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray8);
        java.lang.Object obj12 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray8, obj12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray24);
        java.lang.Object obj28 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray24, obj28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray36);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray36);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) '#', (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanOrQueryBuilder();
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2726");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        double[] doubleArray35 = new double[] { 0.0d };
        double[] doubleArray37 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray37, (double) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray37);
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader45, (-1), postingsEnum47, postingsEnum48);
        float[] floatArray57 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray64 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray64, (float) (byte) 100);
        float[] floatArray73 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray80 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray80, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray57, floatArray73, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) floatArray73);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2727");
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
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.monster", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests18.assertDocValuesEquals("tests.failfast", (int) 'a', numericDocValues31, numericDocValues32);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader5, 1, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (byte) 1, postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.failfast", indexReader38, fields39, fields40, false);
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) (byte) 1, postingsEnum48, postingsEnum49);
        simpleIndexQueryParserTests35.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain53 = null;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain53;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        simpleIndexQueryParserTests55.setUp();
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests17, (java.lang.Object) "tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 10);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("node_s_0", indexReader7, (int) (short) -1, postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("node_s_0", indexReader14, terms15, terms16, true);
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.failfast", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("node_s_0", indexReader36, terms37, terms38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("random", indexReader42, terms43, terms44, false);
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule49 = simpleIndexQueryParserTests27.ruleChain;
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray50 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] {};
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet51 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule49, (java.lang.Object) elasticsearchSingleNodeTestSet51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) ruleChain26, (java.lang.Object) elasticsearchSingleNodeTestSet51);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2731");
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
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum23, postingsEnum24, true);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray32, intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray32, intArray40);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray50, intArray52);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray50, intArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray32, intArray58);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals(intArray58, intArray66);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray72, intArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray66, intArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '#', (double) 10);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2733");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray23, intArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2735");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray9, byteArray14);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray20, byteArray25);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray30, byteArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray25, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray30);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray42, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray47, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray47);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray58, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray58, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray58);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals("random", byteArray58, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray69);
        org.junit.Assert.assertArrayEquals("random", byteArray4, byteArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray69);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (byte) 10);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2738");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray6);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        long[] longArray16 = new long[] { (byte) 0 };
        long[] longArray18 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray16, longArray18);
        long[] longArray24 = new long[] { (byte) 0 };
        long[] longArray26 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray24, longArray26);
        long[] longArray30 = new long[] { (byte) 0 };
        long[] longArray32 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray30, longArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray26, longArray30);
        long[] longArray38 = new long[] { (byte) 0 };
        long[] longArray40 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray38, longArray40);
        long[] longArray44 = new long[] { (byte) 0 };
        long[] longArray46 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray44, longArray46);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray40, longArray44);
        org.junit.Assert.assertArrayEquals(longArray26, longArray40);
        long[] longArray52 = new long[] { (byte) 0 };
        long[] longArray54 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray52, longArray54);
        org.junit.Assert.assertArrayEquals("", longArray26, longArray54);
        org.junit.Assert.assertArrayEquals(longArray18, longArray26);
        long[] longArray60 = new long[] { (byte) 0 };
        long[] longArray62 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray60, longArray62);
        long[] longArray66 = new long[] { (byte) 0 };
        long[] longArray68 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray66, longArray68);
        org.junit.Assert.assertArrayEquals(longArray62, longArray68);
        long[] longArray73 = new long[] { (byte) 0 };
        long[] longArray75 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray73, longArray75);
        long[] longArray79 = new long[] { (byte) 0 };
        long[] longArray81 = new long[] { 0 };
        org.junit.Assert.assertArrayEquals("tests.monster", longArray79, longArray81);
        org.junit.Assert.assertArrayEquals(longArray73, longArray81);
        org.junit.Assert.assertArrayEquals(longArray68, longArray73);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray18, longArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) longArray18);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2740");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("node_s_0", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("node_s_0", indexReader19, terms20, terms21, true);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests6.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        simpleIndexQueryParserTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("node_s_0", indexReader35, 1, postingsEnum37, postingsEnum38);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests41.assertFieldsEquals("tests.failfast", indexReader44, fields45, fields46, false);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (byte) 1, postingsEnum54, postingsEnum55);
        simpleIndexQueryParserTests41.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain59 = null;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        simpleIndexQueryParserTests61.setUp();
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests61.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain65;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests67.ensureCleanedUp();
        simpleIndexQueryParserTests67.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests67.assertPositionsSkippingEquals("node_s_0", indexReader71, 1, postingsEnum73, postingsEnum74);
        simpleIndexQueryParserTests67.ensureAllSearchContextsReleased();
        int[] intArray77 = new int[] {};
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals(intArray77, intArray82);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests67, (java.lang.Object) intArray82);
        org.junit.rules.TestRule testRule88 = simpleIndexQueryParserTests67.ruleChain;
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray89 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests6, simpleIndexQueryParserTests31, simpleIndexQueryParserTests41, simpleIndexQueryParserTests67 };
        org.elasticsearch.test.ElasticsearchSingleNodeTest[][] elasticsearchSingleNodeTestArray90 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[][] { elasticsearchSingleNodeTestArray89 };
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest[]> elasticsearchSingleNodeTestArrayList91 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, elasticsearchSingleNodeTestArray90);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) elasticsearchSingleNodeTestArray90);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2741");
        short[] shortArray4 = new short[] { (short) -1 };
        short[] shortArray6 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) -1 };
        short[] shortArray12 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray15 = new short[] { (short) -1 };
        short[] shortArray17 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray10, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray4, shortArray10);
        short[] shortArray23 = new short[] { (short) -1 };
        short[] shortArray25 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray25);
        short[] shortArray28 = new short[] { (short) -1 };
        short[] shortArray30 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray25, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray4);
        short[] shortArray37 = new short[] { (short) -1 };
        short[] shortArray39 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        short[] shortArray42 = new short[] { (short) -1 };
        short[] shortArray44 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray42);
        short[] shortArray49 = new short[] { (short) -1 };
        short[] shortArray51 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        short[] shortArray55 = new short[] { (short) -1 };
        short[] shortArray57 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        short[] shortArray60 = new short[] { (short) -1 };
        short[] shortArray62 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray55, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray49, shortArray55);
        short[] shortArray68 = new short[] { (short) -1 };
        short[] shortArray70 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (short) -1 };
        short[] shortArray75 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray70, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray49);
        short[] shortArray82 = new short[] { (short) -1 };
        short[] shortArray84 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        short[] shortArray87 = new short[] { (short) -1 };
        short[] shortArray89 = new short[] { (byte) -1 };
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray82, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray82);
        short[] shortArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray82, shortArray94);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2742");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2743");
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
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader10, 3, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2745");
        float[] floatArray7 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray14 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray23 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray30 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray30, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray7, floatArray23, (float) '#');
        float[] floatArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray35, (float) (short) -1);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2746");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray58);
        java.lang.Object obj62 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray58, obj62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet80 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray79);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) simpleIndexQueryParserTestsArray79);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2747");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (short) 1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests33.assertFieldsEquals("tests.failfast", indexReader36, fields37, fields38, false);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.awaitsfix", indexReader44, (int) 'a', postingsEnum46, postingsEnum47);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum55, postingsEnum56);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (byte) 100);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2749");
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.util.Set<java.lang.String[][][]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.Class<?> wildcardClass8 = strArraySet7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass8;
        java.util.List<java.lang.Class<?>> wildcardClassList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, wildcardClassArray11);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray41);
        java.lang.Object obj45 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray41, obj45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray53);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray74);
        java.util.Set<java.lang.Object> objSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray67);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray11, (java.lang.Object[]) executorServiceArray53);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("node_s_0", indexReader15, 1, postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain20;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests22.setIndexWriterMaxDocs((int) '4');
        java.lang.String str27 = simpleIndexQueryParserTests22.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests22.assertDocsSkippingEquals("hi!", indexReader29, 100, postingsEnum31, postingsEnum32, false);
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        java.lang.String str36 = simpleIndexQueryParserTests22.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests22);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests39.assertFieldsEquals("tests.failfast", indexReader42, fields43, fields44, false);
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        java.lang.String str48 = simpleIndexQueryParserTests39.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests39.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum50, postingsEnum51, true);
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        simpleIndexQueryParserTests39.assertFieldsEquals("tests.maxfailures", indexReader56, fields57, fields58, true);
        org.junit.rules.TestRule testRule61 = simpleIndexQueryParserTests39.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule61;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule61;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) testRule61);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2753");
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
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader19, (int) '4', postingsEnum21, postingsEnum22, false);
        simpleIndexQueryParserTests0.setUp();
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray29, charArray33);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("hi!", charArray37, charArray41);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray29, charArray41);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray47, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("hi!", charArray55, charArray59);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray47, charArray59);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray66, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray70, charArray74);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray78, charArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray70, charArray82);
        org.junit.Assert.assertArrayEquals(charArray47, charArray70);
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray87);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray41, charArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray70);
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) '#');
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2755");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 1L);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2756");
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
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray33, byteArray38);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray43, byteArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray38, byteArray43);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray53, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray43, byteArray53);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) byteArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 10.0d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2758");
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
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray43, intArray45);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray51, intArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray43, intArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) doubleArray33, (java.lang.Object) intArray43);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2759");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("node_s_0", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader18, terms19, terms20, false);
        java.lang.String str23 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("tests.failfast", indexReader28, fields29, fields30, false);
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.awaitsfix", indexReader36, (int) 'a', postingsEnum38, postingsEnum39);
        simpleIndexQueryParserTests25.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests25.setIndexWriterMaxDocs((int) (byte) 0);
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("tests.maxfailures", indexReader47, terms48, terms49, true);
        org.junit.rules.TestRule testRule52 = simpleIndexQueryParserTests25.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests25);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
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
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, (int) (byte) 1, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) (short) 100);
        double[] doubleArray15 = new double[] { 0.0d };
        double[] doubleArray17 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) (short) 100);
        double[] doubleArray21 = new double[] { 0.0d };
        double[] doubleArray23 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray23, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) '#');
        double[] doubleArray30 = new double[] { 0.0d };
        double[] doubleArray32 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray32, (double) (short) 100);
        double[] doubleArray36 = new double[] { 0.0d };
        double[] doubleArray38 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray38, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray38, (double) '#');
        double[] doubleArray44 = new double[] { 0.0d };
        double[] doubleArray46 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) (short) 100);
        double[] doubleArray50 = new double[] { 0.0d };
        double[] doubleArray52 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray52, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray52, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray38, doubleArray52, 0.0d);
        double[] doubleArray60 = new double[] { 0.0d };
        double[] doubleArray62 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray62, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray60, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray38, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray15, (double) 'a');
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray15);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "enwiki.random.lines.txt" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus5 = simpleIndexQueryParserTests0.ensureGreen(strArray4);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2764");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields8, false);
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("node_s_0", indexReader17, 1, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain22;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests24.setIndexWriterMaxDocs((int) '4');
        java.lang.String str29 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests24.assertDocsSkippingEquals("hi!", indexReader31, 100, postingsEnum33, postingsEnum34, false);
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        java.lang.String str38 = simpleIndexQueryParserTests24.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) simpleIndexQueryParserTests24);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) locale2, (java.lang.Object) simpleIndexQueryParserTests24);
        simpleIndexQueryParserTests24.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        simpleIndexQueryParserTests43.assertFieldsEquals("tests.failfast", indexReader46, fields47, fields48, false);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        simpleIndexQueryParserTests53.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests43, (java.lang.Object) simpleIndexQueryParserTests53);
        simpleIndexQueryParserTests43.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests60.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        simpleIndexQueryParserTests60.assertFieldsEquals("tests.failfast", indexReader63, fields64, fields65, false);
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        simpleIndexQueryParserTests60.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests60.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader71, (int) (byte) 1, postingsEnum73, postingsEnum74);
        simpleIndexQueryParserTests60.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain77;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests24, (java.lang.Object) simpleIndexQueryParserTests43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2765");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray13);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests28.assertTermsEquals("random", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests28.assertFieldsEquals("", indexReader42, fields43, fields44, true);
        simpleIndexQueryParserTests28.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) boolean27, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0, (double) 0L);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2767");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2768");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", obj1);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader6, (int) (byte) 1, postingsEnum8, postingsEnum9, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (-1L));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2771");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", obj1);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader10, fields11, fields12, true);
        java.lang.String str15 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str23 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("<unknown>", indexReader26, fields27, fields28, true);
        java.lang.String str31 = simpleIndexQueryParserTests17.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests17 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray16, simpleIndexQueryParserTestsArray32 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][][] simpleIndexQueryParserTestsArray34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][][] { simpleIndexQueryParserTestsArray33 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests[][]> simpleIndexQueryParserTestsArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray34);
        int[] intArray38 = new int[] { (short) 10 };
        int[][] intArray39 = new int[][] { intArray38 };
        int[] intArray41 = new int[] { (short) 10 };
        int[][] intArray42 = new int[][] { intArray41 };
        int[] intArray44 = new int[] { (short) 10 };
        int[][] intArray45 = new int[][] { intArray44 };
        int[] intArray47 = new int[] { (short) 10 };
        int[][] intArray48 = new int[][] { intArray47 };
        int[][][] intArray49 = new int[][][] { intArray39, intArray42, intArray45, intArray48 };
        java.util.List<int[][]> intArrayList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) simpleIndexQueryParserTestsArray34, (java.lang.Object[]) intArray49);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2775");
        float[] floatArray8 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray15 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray24 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray31 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray31, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray8, floatArray24, (float) '#');
        float[] floatArray44 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray51 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray51, (float) (byte) 100);
        float[] floatArray60 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray67 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray67, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray44, floatArray60, (float) '#');
        float[] floatArray78 = new float[] { 10L, (short) -1, (-1.0f), (byte) -1, 10.0f, (byte) 0 };
        float[] floatArray85 = new float[] { (byte) 0, (short) 1, (byte) 1, 0.0f, (short) 1, '#' };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray85, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray60, floatArray78, (float) 0L);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray24, floatArray60, (float) 0);
        float[] floatArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray92, (float) ' ');
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2776");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray12);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray18, byteArray23);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray28, byteArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray23, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) byteArray28);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("", indexReader7, (int) (byte) 100, postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("tests.failfast", indexReader17, fields18, fields19, false);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (byte) 1, postingsEnum27, postingsEnum28);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain30);
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain30;
        double[] doubleArray36 = new double[] { 0.0d };
        double[] doubleArray38 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray38, (double) (short) 100);
        double[] doubleArray42 = new double[] { 0.0d };
        double[] doubleArray44 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray44, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray44, (double) '#');
        double[] doubleArray50 = new double[] { 0.0d };
        double[] doubleArray52 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray52, (double) (short) 100);
        double[] doubleArray56 = new double[] { 0.0d };
        double[] doubleArray58 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray58, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray58, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray44, doubleArray58, 0.0d);
        double[] doubleArray66 = new double[] { 0.0d };
        double[] doubleArray68 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray68, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray66, (double) 10.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests73.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        simpleIndexQueryParserTests73.assertFieldsEquals("tests.failfast", indexReader76, fields77, fields78, false);
        org.junit.rules.RuleChain ruleChain81 = simpleIndexQueryParserTests73.failureAndSuccessEvents;
        java.lang.String str82 = simpleIndexQueryParserTests73.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        simpleIndexQueryParserTests73.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum84, postingsEnum85, true);
        org.junit.rules.RuleChain ruleChain88 = simpleIndexQueryParserTests73.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0f, (java.lang.Object) ruleChain88);
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain88;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain88;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues95 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues95, numericDocValues96);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2779");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.nightly", "tests.failfast", "hi!", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray13);
        java.util.List<java.lang.String[]> strArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, strArray13);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray32);
        java.lang.Object obj36 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray32, obj36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray32);
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0L, (double) 0L);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2782");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        java.lang.Object obj31 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray27, obj31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray50);
        java.lang.Object obj54 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray50, obj54);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray50);
        java.lang.Object[] objArray68 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray50, objArray68);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("tests.failfast", indexReader13, fields14, fields15, false);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        java.lang.String str19 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests10.assertDocValuesEquals("tests.maxfailures", (int) (short) 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 0, (long) '4');
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2785");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray11, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray16);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray28, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray33, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray33);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray44, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) byteArray33, (java.lang.Object) simpleIndexQueryParserTests53);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray59, byteArray64);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray70, byteArray75);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray80, byteArray81);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray80, byteArray85);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray75, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray33);
        byte[] byteArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray92);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) 3);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2788");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray8);
        java.lang.Object obj12 = new java.lang.Object();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray8, obj12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2789");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader15, 10, postingsEnum17, postingsEnum18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests20.ruleChain;
        double[] doubleArray31 = new double[] { 0.0d };
        double[] doubleArray33 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) (short) 100);
        double[] doubleArray38 = new double[] { 0.0d };
        double[] doubleArray40 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) (short) 100);
        double[] doubleArray44 = new double[] { 0.0d };
        double[] doubleArray46 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray46, (double) '#');
        double[] doubleArray53 = new double[] { 0.0d };
        double[] doubleArray55 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray55, (double) (short) 100);
        double[] doubleArray59 = new double[] { 0.0d };
        double[] doubleArray61 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray61, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray61, (double) '#');
        double[] doubleArray67 = new double[] { 0.0d };
        double[] doubleArray69 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray69, (double) (short) 100);
        double[] doubleArray73 = new double[] { 0.0d };
        double[] doubleArray75 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray75, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray75, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray61, doubleArray75, 0.0d);
        double[] doubleArray83 = new double[] { 0.0d };
        double[] doubleArray85 = new double[] { (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray85, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray83, (double) 10.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray61, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray38, (double) 'a');
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests20, (java.lang.Object) doubleArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", (java.lang.Object) doubleArray33);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2790");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray9, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray20, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) byteArray9, (java.lang.Object) simpleIndexQueryParserTests29);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray35, byteArray40);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray46, byteArray51);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray56, byteArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray51, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray35);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("hi!", byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray35, byteArray68);
        byte[] byteArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray68, byteArray72);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 0.0d, (double) ' ');
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2792");
        float[] floatArray7 = new float[] { 10.0f, 100, 4, 10L, 10L, (-1.0f) };
        float[] floatArray8 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray7, floatArray8, (float) 4);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2793");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 1);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0, (double) (byte) 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) '#', (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) (short) 1);
    }
}

