import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4501");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 1, (double) 2, (double) (short) 10);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4502");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (byte) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4503");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray5, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray10, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray10, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray5, shortArray10);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray30);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray45);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray55);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray51, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray45, shortArray51);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray72, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals("", shortArray73, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray30);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4504");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray10, (double) 2);
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 2, obj16);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4505");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) serializableArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray9);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) serializableArray19);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) executorServiceArray24);
        long[] longArray29 = new long[] { (byte) -1, 5 };
        long[] longArray32 = new long[] { (byte) -1, 5 };
        long[] longArray35 = new long[] { (byte) -1, 5 };
        long[] longArray38 = new long[] { (byte) -1, 5 };
        long[] longArray41 = new long[] { (byte) -1, 5 };
        long[] longArray44 = new long[] { (byte) -1, 5 };
        long[][] longArray45 = new long[][] { longArray29, longArray32, longArray35, longArray38, longArray41, longArray44 };
        java.util.Set<long[]> longArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(longArray45);
        java.util.Set<long[]> longArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(longArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) longArray45);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4506");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        java.lang.String str15 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        java.lang.String str18 = kuromojiAnalysisTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4507");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray17);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray26);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray30, byteArray34);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray40, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray40);
        org.junit.Assert.assertArrayEquals("", byteArray25, byteArray34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests50.tearDown();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        kuromojiAnalysisTests50.assertTermsEquals("tests.failfast", indexReader53, terms54, terms55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests50.assertDocsSkippingEquals("tests.nightly", indexReader59, (int) (byte) -1, postingsEnum61, postingsEnum62, false);
        org.junit.rules.RuleChain ruleChain65 = kuromojiAnalysisTests50.failureAndSuccessEvents;
        kuromojiAnalysisTests50.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests68.ruleChain;
        kuromojiAnalysisTests68.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests68);
        org.junit.rules.RuleChain ruleChain72 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        kuromojiAnalysisTests68.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests50, (java.lang.Object) kuromojiAnalysisTests68);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) byteArray34, (java.lang.Object) kuromojiAnalysisTests68);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray34);
        byte[] byteArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray17, byteArray77);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4508");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement12 = null;
        org.junit.runner.Description description13 = null;
        org.junit.runners.model.Statement statement14 = ruleChain11.apply(statement12, description13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain11);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4509");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "tests.badapples", "tests.weekly" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.util.Set<java.lang.String[]> strArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.List<java.lang.CharSequence[]> charSequenceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, (java.lang.CharSequence[][]) strArray5);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests8.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests8.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("hi!", indexReader25, 4, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests8.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests8.ruleChain;
        kuromojiAnalysisTests8.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("<unknown>", indexReader35, (int) (short) 0, postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests8.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests8.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArrayList7, (java.lang.Object) kuromojiAnalysisTests8);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4510");
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray10);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) serializableArray31);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray28);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4511");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests13);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests13.assertTermsEquals("", indexReader19, terms20, terms21, true);
        kuromojiAnalysisTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("tests.slow", indexReader26, 1, postingsEnum28, postingsEnum29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) postingsEnum28);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) 0.0f);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4513");
        java.lang.Object obj0 = null;
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray4 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { (byte) 0 };
        long[] longArray9 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
        long[] longArray14 = new long[] { (byte) 0 };
        long[] longArray16 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        long[] longArray19 = new long[] { (byte) 0 };
        long[] longArray21 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        org.junit.Assert.assertArrayEquals(longArray14, longArray21);
        long[] longArray25 = new long[] { (byte) 0 };
        long[] longArray27 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray25, longArray27);
        long[] longArray30 = new long[] { (byte) 0 };
        long[] longArray32 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray30, longArray32);
        org.junit.Assert.assertArrayEquals(longArray25, longArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray14, longArray25);
        org.junit.Assert.assertArrayEquals(longArray9, longArray25);
        long[] longArray43 = new long[] { (byte) 0 };
        long[] longArray45 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        long[] longArray48 = new long[] { (byte) 0 };
        long[] longArray50 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        org.junit.Assert.assertArrayEquals("", longArray43, longArray50);
        long[] longArray55 = new long[] { (byte) 0 };
        long[] longArray57 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray55, longArray57);
        long[] longArray60 = new long[] { (byte) 0 };
        long[] longArray62 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray60, longArray62);
        org.junit.Assert.assertArrayEquals("", longArray55, longArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray43, longArray62);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) longArray62);
        long[] longArray69 = new long[] { (byte) 0 };
        long[] longArray71 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray69, longArray71);
        long[] longArray74 = new long[] { (byte) 0 };
        long[] longArray76 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray74, longArray76);
        org.junit.Assert.assertArrayEquals("", longArray69, longArray76);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray62, longArray76);
        org.junit.Assert.assertArrayEquals(longArray9, longArray76);
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) longArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 100, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) '#', (float) '#');
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4516");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray21, (java.lang.Object[]) serializableArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray23);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray28);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray39);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray53, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray50, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule62 = kuromojiAnalysisTests61.ruleChain;
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests61);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        kuromojiAnalysisTests61.assertTermsEquals("random", indexReader66, terms67, terms68, false);
        org.junit.rules.RuleChain ruleChain71 = kuromojiAnalysisTests61.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement72 = null;
        org.junit.runner.Description description73 = null;
        org.junit.runners.model.Statement statement74 = ruleChain71.apply(statement72, description73);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule77 = kuromojiAnalysisTests76.ruleChain;
        kuromojiAnalysisTests76.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests76);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        kuromojiAnalysisTests76.assertTermsEquals("random", indexReader81, terms82, terms83, false);
        org.junit.rules.RuleChain ruleChain86 = kuromojiAnalysisTests76.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement87 = null;
        org.junit.runner.Description description88 = null;
        org.junit.runners.model.Statement statement89 = ruleChain86.apply(statement87, description88);
        org.junit.runner.Description description90 = null;
        org.junit.runners.model.Statement statement91 = ruleChain71.apply(statement89, description90);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) serializableArray47, (java.lang.Object) description90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) serializableArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) serializableArray47);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4517");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray13, byteArray17);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray23, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray23, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray23);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests33.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests33.assertDocsSkippingEquals("tests.nightly", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45, false);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests33.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests51);
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        kuromojiAnalysisTests51.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests33, (java.lang.Object) kuromojiAnalysisTests51);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) byteArray17, (java.lang.Object) kuromojiAnalysisTests51);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray17);
        byte[] byteArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray60);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4518");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader5, fields6, fields7, true);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.monster", postingsEnum11, postingsEnum12, true);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCleanedUp();
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray29);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray43);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) executorServiceArray58);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray63, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray38);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        java.util.List<java.lang.Object> objList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Object[]) executorServiceArray78);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray38, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0f, (float) (byte) 10, (float) 1L);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4520");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray3, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray8);
        org.junit.rules.RuleChain[][] ruleChainArray13 = new org.junit.rules.RuleChain[][] {};
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) ruleChainArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.lang.Object[] objArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, objArray17);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, 100.0f, 0.0f);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (-1.0d), (double) 10);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4523");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "tests.badapples", "tests.weekly" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        java.util.Set<java.lang.String[]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.util.List<java.lang.CharSequence[]> charSequenceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, (java.lang.CharSequence[][]) strArray6);
        java.util.Set<java.lang.String[]> strArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet13 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray12);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet17 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray12, (java.lang.Object[]) throttlingArray16);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) throttlingArray12);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 0, (long) (byte) 100);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4525");
        double[] doubleArray7 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        double[] doubleArray15 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        double[] doubleArray23 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray31 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        double[] doubleArray39 = new double[] { '4', 3, 1L, (short) 1, (-1.0f), 0 };
        double[][] doubleArray40 = new double[][] { doubleArray39 };
        double[][][] doubleArray41 = new double[][][] { doubleArray8, doubleArray16, doubleArray24, doubleArray32, doubleArray40 };
        java.util.Set<double[][]> doubleArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray41);
        java.util.List<double[][]> doubleArrayList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, doubleArray41);
        java.lang.Iterable[] iterableArray45 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray46 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray45;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray41, (java.lang.Object[]) serializableIterableArray46);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) '4');
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4528");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray3, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests22.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("tests.nightly", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (short) -1, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests44);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        kuromojiAnalysisTests22.failureAndSuccessEvents = ruleChain48;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests22.assertDocsSkippingEquals("tests.badapples", indexReader51, 0, postingsEnum53, postingsEnum54, true);
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests10, (java.lang.Object) kuromojiAnalysisTests22);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests10.assertDocValuesEquals("tests.maxfailures", (int) (byte) -1, numericDocValues65, numericDocValues66);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4529");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray5);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray2);
        java.lang.Object[] objArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, objArray20);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 2, 10L);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 'a');
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4532");
        long[] longArray1 = new long[] { (byte) 0 };
        long[] longArray3 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray6 = new long[] { (byte) 0 };
        long[] longArray8 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) longArray8);
        long[] longArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4533");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader13, terms14, terms15, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("hi!", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader26, terms27, terms28, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4534");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 1, (long) 10);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4535");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader22, (int) (byte) 100, postingsEnum24, postingsEnum25, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule32;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("enwiki.random.lines.txt", indexReader37, fields38, fields39, true);
        kuromojiAnalysisTests34.setUp();
        kuromojiAnalysisTests34.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests34.resetCheckIndexStatus();
        kuromojiAnalysisTests34.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests34.assertDocsEnumEquals("", postingsEnum49, postingsEnum50, true);
        kuromojiAnalysisTests34.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule32, (java.lang.Object) kuromojiAnalysisTests34);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 0.0d, (double) (byte) 10);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4537");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.junit.rules.RuleChain ruleChain20 = ruleChain17.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet24 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray23);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet28 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain17, (java.lang.Object) throttlingArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray1, (java.lang.Object[]) throttlingArray27);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4538");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader30, fields31, fields32, false);
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.tearDown();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests39.assertTermsEquals("tests.failfast", indexReader42, terms43, terms44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests39.assertTermsEquals("", indexReader48, terms49, terms50, false);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests37, (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests39);
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests39.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests39);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4539");
        char[] charArray1 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray17, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("random", charArray17, charArray24);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray24, charArray32);
        org.junit.Assert.assertArrayEquals(charArray11, charArray32);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray46, charArray49);
        org.junit.Assert.assertArrayEquals("random", charArray39, charArray46);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray46, charArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray32, charArray54);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals(charArray68, charArray71);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals(charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("random", charArray68, charArray75);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray75, charArray83);
        org.junit.Assert.assertArrayEquals(charArray62, charArray83);
        org.junit.Assert.assertArrayEquals("random", charArray54, charArray83);
        org.junit.Assert.assertArrayEquals(charArray3, charArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray1, charArray54);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4540");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.util.Set[] setArray13 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray14 = (java.util.Set<java.io.Serializable>[]) setArray13;
        serializableSetArray14[0] = serializableSet3;
        serializableSetArray14[1] = serializableSet5;
        serializableSetArray14[2] = serializableSet7;
        serializableSetArray14[3] = serializableSet9;
        serializableSetArray14[4] = serializableSet11;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray14);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, serializableSetArray14);
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Iterable<java.io.Serializable>[]) serializableSetArray14);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.maxfailures" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableSetArray14, (java.lang.Object[]) charSequenceArray30);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1.0f, (double) 100);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4542");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray8);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) serializableArray13);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray30);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray35);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) serializableArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.util.Set[] setArray64 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray65 = (java.util.Set<java.io.Serializable>[]) setArray64;
        serializableSetArray65[0] = serializableSet54;
        serializableSetArray65[1] = serializableSet56;
        serializableSetArray65[2] = serializableSet58;
        serializableSetArray65[3] = serializableSet60;
        serializableSetArray65[4] = serializableSet62;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableSetArray65);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4543");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (short) -1, postingsEnum20, postingsEnum21);
        java.lang.String str23 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", obj1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4544");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests2.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields21, fields22, true);
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("tests.monster", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests17.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.tearDown();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests36.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.nightly", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (short) -1, postingsEnum54, postingsEnum55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests58.ruleChain;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests58);
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests58.failureAndSuccessEvents;
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.badapples", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        kuromojiAnalysisTests36.assertTermsEquals("random", indexReader72, terms73, terms74, false);
        kuromojiAnalysisTests36.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("tests.weekly", indexReader80, (int) (short) 100, postingsEnum82, postingsEnum83);
        org.junit.rules.TestRule testRule85 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.assertPathHasBeenCleared("tests.maxfailures");
        org.junit.rules.RuleChain ruleChain88 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests17, (java.lang.Object) kuromojiAnalysisTests36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 4);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4546");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("europarl.lines.txt.gz", 2, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4547");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "tests.slow" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray13, (java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray15);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray20);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray38);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray46, (java.lang.Object[]) serializableArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray43, (java.lang.Object[]) serializableArray48);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray43);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) serializableArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) serializableArray20, (java.lang.Object[]) serializableArray54);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray69, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray4, (java.lang.Object[]) serializableArray54);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, 0.0d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4549");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (byte) 10, (double) 3, (double) '#');
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4551");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader10, 3, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4552");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader19, (int) (byte) 100, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 100);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests27.assertTermsEquals("tests.failfast", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.nightly", indexReader36, (int) (byte) -1, postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader43, (int) (short) -1, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests49.ruleChain;
        kuromojiAnalysisTests49.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests49);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.badapples", indexReader56, 0, postingsEnum58, postingsEnum59, true);
        kuromojiAnalysisTests27.ensureCheckIndexPassed();
        kuromojiAnalysisTests27.setUp();
        kuromojiAnalysisTests27.setIndexWriterMaxDocs((int) ' ');
        kuromojiAnalysisTests27.tearDown();
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests27);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4553");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) '4');
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain16);
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain17);
        org.junit.rules.TestRule testRule19 = null;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.outerRule(testRule19);
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain27);
        org.junit.rules.RuleChain ruleChain30 = ruleChain21.around((org.junit.rules.TestRule) ruleChain29);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        org.junit.rules.RuleChain ruleChain32 = ruleChain17.around((org.junit.rules.TestRule) ruleChain30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests34.ruleChain;
        kuromojiAnalysisTests34.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests34);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.tearDown();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests39.assertTermsEquals("tests.failfast", indexReader42, terms43, terms44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests39.assertTermsEquals("", indexReader48, terms49, terms50, false);
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement54 = null;
        org.junit.runner.Description description55 = null;
        org.junit.runners.model.Statement statement56 = ruleChain53.apply(statement54, description55);
        org.junit.runner.Description description57 = null;
        org.junit.runners.model.Statement statement58 = ruleChain38.apply(statement56, description57);
        org.junit.runner.Description description59 = null;
        org.junit.runners.model.Statement statement60 = ruleChain17.apply(statement58, description59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) statement58);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 1L);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) '4', (float) 0);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4556");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23, false);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.junit.rules.RuleChain ruleChain29 = ruleChain26.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet33 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray32);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet37 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) throttlingArray36);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain26);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain45 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (short) -1, numericDocValues48, numericDocValues49);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4557");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain11);
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain12);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (short) -1, postingsEnum34, postingsEnum35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests38.ruleChain;
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests38);
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.badapples", indexReader45, 0, postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        kuromojiAnalysisTests16.assertTermsEquals("random", indexReader52, terms53, terms54, false);
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("tests.weekly", indexReader60, (int) (short) 100, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule65;
        org.junit.rules.RuleChain ruleChain67 = ruleChain14.around(testRule65);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests68.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests70.tearDown();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        kuromojiAnalysisTests70.assertTermsEquals("tests.failfast", indexReader73, terms74, terms75, false);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        kuromojiAnalysisTests70.assertTermsEquals("", indexReader79, terms80, terms81, false);
        org.junit.rules.RuleChain ruleChain84 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests68, (java.lang.Object) kuromojiAnalysisTests70);
        kuromojiAnalysisTests70.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRule65, (java.lang.Object) kuromojiAnalysisTests70);
        kuromojiAnalysisTests70.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests70.setIndexWriterMaxDocs(3);
        org.junit.rules.TestRule testRule91 = kuromojiAnalysisTests70.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests70.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum93, postingsEnum94);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4559");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        java.lang.Class<?> wildcardClass39 = kuromojiAnalysisTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass39);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4560");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests6.assertTermsEquals("", indexReader8, terms9, terms10, false);
        kuromojiAnalysisTests6.setUp();
        kuromojiAnalysisTests6.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests6.ruleChain;
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests6, (java.lang.Object) locale17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests6);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4561");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4562");
        long[] longArray3 = new long[] { (byte) -1, 5 };
        long[] longArray6 = new long[] { (byte) -1, 5 };
        long[] longArray9 = new long[] { (byte) -1, 5 };
        long[] longArray12 = new long[] { (byte) -1, 5 };
        long[] longArray15 = new long[] { (byte) -1, 5 };
        long[] longArray18 = new long[] { (byte) -1, 5 };
        long[][] longArray19 = new long[][] { longArray3, longArray6, longArray9, longArray12, longArray15, longArray18 };
        java.util.Set<long[]> longArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(longArray19);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy23 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy24 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray25 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy22, queryCachingPolicy23, queryCachingPolicy24 };
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, queryCachingPolicyArray25);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet27 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray25);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet28 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) longArray19, (java.lang.Object[]) queryCachingPolicyArray25);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4563");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule0;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.outerRule(testRule0);
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain3);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4564");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray11);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) executorServiceArray26);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray32 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray32);
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) eSTestCaseArray32);
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray32);
        java.util.Set<org.junit.Assert[]> assertArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) eSTestCaseArray32);
        java.util.Set<org.junit.Assert[]> assertArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) eSTestCaseArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray41 = new java.util.concurrent.ExecutorService[][] { executorServiceArray39, executorServiceArray40 };
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray44 = new java.util.concurrent.ExecutorService[][] { executorServiceArray42, executorServiceArray43 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray45 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray41, executorServiceArray44 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) eSTestCaseArray32, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (short) -1, (float) 2, 1.0f);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4566");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("hi!", indexReader43, fields44, fields45, true);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) kuromojiAnalysisTests1);
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues54 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("<unknown>", 3, numericDocValues54, numericDocValues55);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4567");
        float[] floatArray0 = null;
        float[] floatArray8 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray15 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray32 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray32, 1.0f);
        float[] floatArray44 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray51 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray44, floatArray51, (float) (byte) 100);
        float[] floatArray61 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray68 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray61, floatArray68, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray68, 1.0f);
        float[] floatArray80 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray87 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray87, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray68, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray15, (float) '#');
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4568");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray7, (java.lang.Object) 100.0d);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray20, intArray23);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray20, (java.lang.Object) 100.0d);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray20, intArray30);
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray20);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray38, (java.lang.Object) 100.0d);
        org.junit.Assert.assertArrayEquals(intArray20, intArray38);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray51, intArray52);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray52, intArray55);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray52, (java.lang.Object) 100.0d);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray52, intArray62);
        org.junit.Assert.assertArrayEquals(intArray38, intArray62);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) "<unknown>", (java.lang.Object) intArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4569");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader16, 1, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader23, terms24, terms25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4570");
        float[] floatArray0 = new float[] {};
        float[] floatArray9 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray16 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray33 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray33, 1.0f);
        float[] floatArray45 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray52 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray62 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray69 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray62, floatArray69, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray69, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray16, floatArray69, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray69, (float) 0);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, 0.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4572");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String str16 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) '#', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100.0f, (double) 3);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4574");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23, false);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.junit.rules.RuleChain ruleChain29 = ruleChain26.around((org.junit.rules.TestRule) testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet33 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray32);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet37 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) throttlingArray36);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) ruleChain26);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        java.lang.String str43 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule44 = kuromojiAnalysisTests0.ruleChain;
        java.lang.Object obj45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, obj45);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 10, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4576");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) 0);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100.0f, (double) 10);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4579");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader17, 4, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule23);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4580");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4581");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14, false);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests18.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule34 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        org.junit.rules.RuleChain ruleChain36 = ruleChain33.around(testRule34);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain33;
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setUp();
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray45, byteArray49);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray55, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray55);
        org.junit.Assert.assertArrayEquals("", byteArray42, byteArray49);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray67, byteArray68);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray67, byteArray71);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray77, byteArray78);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray77, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray77);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) byteArray77);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4582");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("<unknown>", indexReader25, (int) (byte) 100, postingsEnum27, postingsEnum28, false);
        kuromojiAnalysisTests3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests3.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        java.lang.Class<?> wildcardClass36 = testRule33.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray37 = new java.lang.reflect.GenericDeclaration[] { wildcardClass36 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, genericDeclarationArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) genericDeclarationArray37);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 100, (double) ' ');
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4584");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray17, (java.lang.Object[]) executorServiceArray22);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) executorServiceArray22);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader29, fields30, fields31, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.failfast", indexReader37, terms38, terms39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests34.assertDocsSkippingEquals("tests.nightly", indexReader43, (int) (byte) -1, postingsEnum45, postingsEnum46, false);
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("hi!", indexReader51, 4, postingsEnum53, postingsEnum54);
        kuromojiAnalysisTests34.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests34);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 0L, 0.0d, (double) 100);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4587");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        java.lang.String str22 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray23 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests1 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet24 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray23);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray33, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray30);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray27, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray51);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray68);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) serializableArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) eSTestCaseArray23, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4588");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        org.junit.Assert.assertArrayEquals("random", charArray11, charArray18);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray18, charArray26);
        org.junit.Assert.assertArrayEquals(charArray5, charArray26);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray31, charArray34);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray47, charArray50);
        org.junit.Assert.assertArrayEquals("random", charArray40, charArray47);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray47, charArray55);
        org.junit.Assert.assertArrayEquals(charArray34, charArray55);
        org.junit.Assert.assertArrayEquals(charArray5, charArray55);
        char[] charArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray55, charArray60);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4589");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        java.lang.String str19 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain20, (java.lang.Object) kuromojiAnalysisTests21);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("tests.nightly", indexReader36, (int) (byte) 100, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests42.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) (byte) -1, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        kuromojiAnalysisTests42.assertDocsSkippingEquals("random", indexReader58, (int) ' ', postingsEnum60, postingsEnum61, true);
        kuromojiAnalysisTests42.setUp();
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals(charArray68, charArray71);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals(charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("random", charArray68, charArray75);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray75, charArray83);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) kuromojiAnalysisTests42, (java.lang.Object) charArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "tests.nightly", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4590");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray9, (java.lang.Object[]) serializableArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray11);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) serializableArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray16);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet34 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray33);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray41, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray38);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray49, (java.lang.Object[]) serializableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) serializableArray49);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray62);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray62, (java.lang.Object[]) serializableArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray75);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) serializableArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) serializableArray75);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray66, (java.lang.Object[]) executorServiceArray70);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) serializableArray6, (java.lang.Object[]) executorServiceArray70);
        double[][] doubleArray83 = new double[][] {};
        java.util.Set<double[]> doubleArraySet84 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray83);
        java.util.Set<double[]> doubleArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray83);
        java.util.Set<double[]> doubleArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray83);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) doubleArray83);
        int[][][][][] intArray88 = new int[][][][][] {};
        int[][][][][] intArray89 = new int[][][][][] {};
        int[][][][][] intArray90 = new int[][][][][] {};
        int[][][][][] intArray91 = new int[][][][][] {};
        int[][][][][] intArray92 = new int[][][][][] {};
        int[][][][][] intArray93 = new int[][][][][] {};
        int[][][][][][] intArray94 = new int[][][][][][] { intArray88, intArray89, intArray90, intArray91, intArray92, intArray93 };
        java.util.Set<int[][][][][]> intArraySet95 = org.apache.lucene.util.LuceneTestCase.asSet(intArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) intArray94);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 10.0d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4592");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 0.0f, (double) '#', (double) 'a');
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4593");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.monster", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.nightly", indexReader21, terms22, terms23, false);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 0, (float) (short) 1);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100.0d, (double) '#');
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 0, 100L);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 10, (double) (short) -1, (double) 3);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4598");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 10.0d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4599");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) (short) 100, 1.0d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4601");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '4');
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) '4');
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray18, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray13, (double) 100);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) '4');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray31, (double) (short) 10);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) '4');
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray41, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray31, doubleArray36, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray4, doubleArray36, 0.0d);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '4');
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray55, (double) (short) 10);
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray60, (double) 10L);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray50, (double) 1L);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) '4');
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray70, (double) (short) 10);
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray75, (double) 10L);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray36, doubleArray75, (double) (short) 0);
        double[] doubleArray80 = new double[] {};
        double[] doubleArray81 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray81, (double) '4');
        double[] doubleArray84 = new double[] {};
        double[] doubleArray85 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray84, doubleArray85, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray85, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray81, (double) 3);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray81, doubleArray92, (double) (byte) -1);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 1, (long) (short) 100);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4603");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray15);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray21);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray27, shortArray40);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray40);
        short[] shortArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray51);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) 0);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) '#');
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0f, (float) 3, 1.0f);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4607");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.nightly", postingsEnum7, postingsEnum8, true);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        java.lang.Object obj13 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests14.tearDown();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.setUp();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.monster", obj13, (java.lang.Object) kuromojiAnalysisTests14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChain11, obj13);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4608");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.badapples", indexReader8, (int) ' ', postingsEnum10, postingsEnum11);
        java.lang.String str13 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.slow", indexReader16, (int) 'a', postingsEnum18, postingsEnum19, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "hi!");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10L, (long) (byte) 0);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4610");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader44, terms45, terms46, true);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.String str51 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) str51);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (-1L), (float) (byte) 0);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 1);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4613");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader20, 0, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("<unknown>", indexReader27, fields28, fields29, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4614");
        long[] longArray3 = new long[] { (byte) 0 };
        long[] longArray5 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (byte) 0 };
        long[] longArray10 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray10);
        long[] longArray15 = new long[] { (byte) 0 };
        long[] longArray17 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        long[] longArray20 = new long[] { (byte) 0 };
        long[] longArray22 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals(longArray15, longArray22);
        long[] longArray26 = new long[] { (byte) 0 };
        long[] longArray28 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        long[] longArray31 = new long[] { (byte) 0 };
        long[] longArray33 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        org.junit.Assert.assertArrayEquals(longArray26, longArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray15, longArray26);
        org.junit.Assert.assertArrayEquals(longArray3, longArray26);
        long[] longArray40 = new long[] { (byte) 0 };
        long[] longArray42 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray40, longArray42);
        long[] longArray45 = new long[] { (byte) 0 };
        long[] longArray47 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        org.junit.Assert.assertArrayEquals(longArray40, longArray47);
        long[] longArray51 = new long[] { (byte) 0 };
        long[] longArray53 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray51, longArray53);
        long[] longArray56 = new long[] { (byte) 0 };
        long[] longArray58 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray56, longArray58);
        org.junit.Assert.assertArrayEquals(longArray51, longArray58);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray40, longArray51);
        org.junit.Assert.assertArrayEquals(longArray3, longArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) longArray3);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4615");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader11, terms12, terms13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum22, postingsEnum23, false);
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (-1), (long) 5);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 1L);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4618");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum37, postingsEnum38, false);
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests46.tearDown();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("enwiki.random.lines.txt", indexReader49, fields50, fields51, true);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests46.assertDocsEnumEquals("tests.monster", postingsEnum55, postingsEnum56, true);
        kuromojiAnalysisTests46.resetCheckIndexStatus();
        kuromojiAnalysisTests46.ensureCleanedUp();
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray62, (java.lang.Object[]) serializableArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray62, (java.lang.Object[]) executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests46, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) executorServiceArray67);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader77, fields78, fields79, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) 100L);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4620");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(obj0, obj1);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 3, (double) 10L, (double) (short) 1);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 5, (-1L));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4624");
        float[] floatArray7 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray14 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray31 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray31, (float) (byte) 100);
        float[] floatArray41 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray48 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray41, floatArray48, (float) (byte) 100);
        float[] floatArray58 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray65 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray58, floatArray65, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray65, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray65, (float) 5);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray31, 0.0f);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1, (double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4626");
        int[][][][] intArray0 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests3.assertTermsEquals("", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests3.assertDocsSkippingEquals("<unknown>", indexReader25, (int) (byte) 100, postingsEnum27, postingsEnum28, false);
        kuromojiAnalysisTests3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests3.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        java.lang.Class<?> wildcardClass36 = testRule33.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray37 = new java.lang.reflect.GenericDeclaration[] { wildcardClass36 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, genericDeclarationArray37);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet39 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray37);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet40 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray0, (java.lang.Object[]) genericDeclarationArray37);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4627");
        java.util.Set[][] setArray2 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[][] serializableSetArray3 = (java.util.Set<java.io.Serializable>[][]) setArray2;
        java.util.Set[][][] setArray5 = new java.util.Set[1][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[][][] serializableSetArray6 = (java.util.Set<java.io.Serializable>[][][]) setArray5;
        serializableSetArray6[0] = serializableSetArray3;
        java.util.Set<java.util.Set<java.io.Serializable>[][]> serializableSetArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray6);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray17);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray17, (java.lang.Object[]) serializableArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) serializableArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray21, (java.lang.Object[]) executorServiceArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("enwiki.random.lines.txt", indexReader41, fields42, fields43, true);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests38.assertDocsEnumEquals("tests.monster", postingsEnum47, postingsEnum48, true);
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.ensureCleanedUp();
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests38, (java.lang.Object) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) serializableSetArray6, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4628");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader36, terms37, terms38, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        java.lang.String str42 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.badapples", indexReader44, fields45, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader50, (int) (byte) -1, postingsEnum52, postingsEnum53, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader59, fields60, fields61, true);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", 5, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4629");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum6, postingsEnum7, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 0, (float) 2);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4631");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.slow", indexReader6, fields7, fields8, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4632");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray19);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray15, shortArray28);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray39);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray44, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray35, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray48);
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray54);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) shortArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresSet11, (java.lang.Object) shortArray48);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4633");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader31, fields32, fields33, true);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.badapples");
        java.lang.String str38 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) str38);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0f, (float) 2, (float) 1);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4635");
        byte[][] byteArray2 = new byte[][] {};
        byte[][] byteArray3 = new byte[][] {};
        byte[][] byteArray4 = new byte[][] {};
        byte[][] byteArray5 = new byte[][] {};
        byte[][][] byteArray6 = new byte[][][] { byteArray2, byteArray3, byteArray4, byteArray5 };
        java.util.Set<byte[][]> byteArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        org.junit.rules.RuleChain ruleChain19 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement20 = null;
        org.junit.runner.Description description21 = null;
        org.junit.runners.model.Statement statement22 = ruleChain19.apply(statement20, description21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests24.assertTermsEquals("random", indexReader29, terms30, terms31, false);
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement35 = null;
        org.junit.runner.Description description36 = null;
        org.junit.runners.model.Statement statement37 = ruleChain34.apply(statement35, description36);
        org.junit.runner.Description description38 = null;
        org.junit.runners.model.Statement statement39 = ruleChain19.apply(statement37, description38);
        org.junit.rules.TestRule testRule40 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.outerRule(testRule40);
        org.junit.rules.RuleChain ruleChain42 = ruleChain19.around(testRule40);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain48 = ruleChain42.around((org.junit.rules.TestRule) ruleChain47);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) byteArray6, (java.lang.Object) ruleChain48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray63, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray54);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray51, (java.lang.Object) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) byteArray6, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (-1), (double) 3);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 3, (long) 100);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4638");
        org.junit.rules.RuleChain[][][] ruleChainArray1 = new org.junit.rules.RuleChain[][][] {};
        java.util.Set<org.junit.rules.RuleChain[][]> ruleChainArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain10);
        org.junit.rules.RuleChain ruleChain12 = ruleChain7.around((org.junit.rules.TestRule) ruleChain11);
        int[] intArray16 = new int[] { (-1), 1, 2 };
        int[] intArray20 = new int[] { (-1), 1, 2 };
        int[] intArray24 = new int[] { (-1), 1, 2 };
        int[] intArray28 = new int[] { (-1), 1, 2 };
        int[] intArray32 = new int[] { (-1), 1, 2 };
        int[][] intArray33 = new int[][] { intArray16, intArray20, intArray24, intArray28, intArray32 };
        java.util.Set<int[]> intArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(intArray33);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain11, (java.lang.Object) intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) ruleChainArray1, (java.lang.Object[]) intArray33);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 10L, (double) 100);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) (byte) 0, 0.0f);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1L);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4642");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        java.lang.String str13 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader15, (int) (byte) 0, postingsEnum17, postingsEnum18, false);
        java.lang.String str21 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10.0f);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (-1.0d), (double) (byte) 100);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4645");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) serializableArray6);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray1, (java.lang.Object[]) serializableArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests10.setUp();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("tests.monster", indexReader28, (int) (byte) 1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests33.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests33.assertDocsSkippingEquals("tests.nightly", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45, false);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain49 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule52 = kuromojiAnalysisTests51.ruleChain;
        kuromojiAnalysisTests51.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests51);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests51.assertTermsEquals("random", indexReader56, terms57, terms58, false);
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests51.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement62 = null;
        org.junit.runner.Description description63 = null;
        org.junit.runners.model.Statement statement64 = ruleChain61.apply(statement62, description63);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests66 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule67 = kuromojiAnalysisTests66.ruleChain;
        kuromojiAnalysisTests66.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests66);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        kuromojiAnalysisTests66.assertTermsEquals("random", indexReader71, terms72, terms73, false);
        org.junit.rules.RuleChain ruleChain76 = kuromojiAnalysisTests66.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement77 = null;
        org.junit.runner.Description description78 = null;
        org.junit.runners.model.Statement statement79 = ruleChain76.apply(statement77, description78);
        org.junit.runner.Description description80 = null;
        org.junit.runners.model.Statement statement81 = ruleChain61.apply(statement79, description80);
        org.junit.runner.Description description82 = null;
        org.junit.runners.model.Statement statement83 = ruleChain49.apply(statement79, description82);
        org.junit.runner.Description description84 = null;
        org.junit.runners.model.Statement statement85 = ruleChain48.apply(statement79, description84);
        org.junit.rules.RuleChain ruleChain86 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain48);
        kuromojiAnalysisTests10.failureAndSuccessEvents = ruleChain48;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray1, (java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4646");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray3);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) throttlingArray3);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures12);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures10, testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures17 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet19 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray18);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet20 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.failfast", indexReader24, terms25, terms26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests21.assertTermsEquals("", indexReader30, terms31, terms32, false);
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray18, (java.lang.Object) ruleChain35);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet37 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray18);
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, testRuleIgnoreAfterMaxFailuresArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray3, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray18);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4647");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests3.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        kuromojiAnalysisTests3.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16, false);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) testRule19);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4648");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray7);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4649");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0, (-1.0d));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) ' ');
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4651");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, true);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) -1, (float) (byte) 1, (float) 1);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4653");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4654");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        java.lang.String str13 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader15, (int) (byte) 0, postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests21, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.awaitsfix", indexReader28, terms29, terms30, true);
        kuromojiAnalysisTests21.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) 0, (java.lang.Object) kuromojiAnalysisTests21);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests21.assertDocsAndPositionsEnumEquals("", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1L, (double) 3);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4656");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests6.assertTermsEquals("tests.failfast", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests6.assertDocsSkippingEquals("tests.nightly", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18, false);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests23.assertTermsEquals("random", indexReader28, terms29, terms30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement34 = null;
        org.junit.runner.Description description35 = null;
        org.junit.runners.model.Statement statement36 = ruleChain33.apply(statement34, description35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests38.ruleChain;
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests38);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests38.assertTermsEquals("random", indexReader43, terms44, terms45, false);
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement49 = null;
        org.junit.runner.Description description50 = null;
        org.junit.runners.model.Statement statement51 = ruleChain48.apply(statement49, description50);
        org.junit.runner.Description description52 = null;
        org.junit.runners.model.Statement statement53 = ruleChain33.apply(statement51, description52);
        org.junit.rules.TestRule testRule54 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain55 = org.junit.rules.RuleChain.outerRule(testRule54);
        org.junit.rules.RuleChain ruleChain56 = ruleChain33.around(testRule54);
        org.junit.rules.RuleChain ruleChain57 = ruleChain21.around((org.junit.rules.TestRule) ruleChain56);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader61, (int) (byte) 10, postingsEnum63, postingsEnum64, true);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum69, postingsEnum70, true);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum75, postingsEnum76);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4657");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests15.ruleChain;
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests15);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests15.assertTermsEquals("random", indexReader20, terms21, terms22, false);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement26 = null;
        org.junit.runner.Description description27 = null;
        org.junit.runners.model.Statement statement28 = ruleChain25.apply(statement26, description27);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests30.ruleChain;
        kuromojiAnalysisTests30.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests30);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests30.assertTermsEquals("random", indexReader35, terms36, terms37, false);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests30.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement41 = null;
        org.junit.runner.Description description42 = null;
        org.junit.runners.model.Statement statement43 = ruleChain40.apply(statement41, description42);
        org.junit.runner.Description description44 = null;
        org.junit.runners.model.Statement statement45 = ruleChain25.apply(statement43, description44);
        org.junit.runner.Description description46 = null;
        org.junit.runners.model.Statement statement47 = ruleChain13.apply(statement43, description46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        kuromojiAnalysisTests48.assertTermsEquals("tests.failfast", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests48.assertDocsSkippingEquals("tests.nightly", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader64, (int) (short) -1, postingsEnum66, postingsEnum67);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests70 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule71 = kuromojiAnalysisTests70.ruleChain;
        kuromojiAnalysisTests70.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests70);
        org.junit.rules.RuleChain ruleChain74 = kuromojiAnalysisTests70.failureAndSuccessEvents;
        kuromojiAnalysisTests48.failureAndSuccessEvents = ruleChain74;
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        kuromojiAnalysisTests48.assertDocsSkippingEquals("tests.badapples", indexReader77, 0, postingsEnum79, postingsEnum80, true);
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain13, (java.lang.Object) kuromojiAnalysisTests48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests85 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule86 = kuromojiAnalysisTests85.ruleChain;
        org.junit.rules.RuleChain ruleChain87 = org.junit.rules.RuleChain.outerRule(testRule86);
        org.junit.rules.RuleChain ruleChain88 = ruleChain13.around(testRule86);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain13;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.junit.rules.RuleChain ruleChain93 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4658");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray7);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray20);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray28, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray25);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) serializableArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray49);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray59);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray44, (java.lang.Object[]) serializableArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray69);
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray69, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) serializableArray71);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray15);
        java.lang.Object[] objArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, objArray77);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4659");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule37 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests36);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.badapples", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum51, postingsEnum52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("hi!", indexReader56, 0, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.nightly", indexReader63, terms64, terms65, false);
        kuromojiAnalysisTests14.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests14);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4660");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (short) -1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests24);
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests24.failureAndSuccessEvents;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.badapples", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader38, terms39, terms40, false);
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.weekly", indexReader46, (int) (short) 100, postingsEnum48, postingsEnum49);
        org.junit.rules.TestRule testRule51 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.nightly");
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4661");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, 100L);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) ' ', 10.0d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) 100L, (float) (-1L));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4665");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.weekly", indexReader17, fields18, fields19, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.failfast", (int) (short) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4666");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray10);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray16);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray10);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray1, byteArray3);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4667");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests12.ruleChain;
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (short) 1);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("hi!");
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4668");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests20.assertTermsEquals("", indexReader22, terms23, terms24, false);
        kuromojiAnalysisTests20.ensureCleanedUp();
        kuromojiAnalysisTests20.ensureCheckIndexPassed();
        kuromojiAnalysisTests20.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests20);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4669");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", 100, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4670");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests11.ruleChain;
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests11.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests11);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4671");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) '#');
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4673");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("tests.failfast", (int) (short) 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 3, (double) '#', (double) ' ');
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4675");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) -1 };
        byte[][] byteArray13 = new byte[][] { byteArray2, byteArray4, byteArray6, byteArray8, byteArray10, byteArray12 };
        byte[] byteArray15 = new byte[] { (byte) -1 };
        byte[] byteArray17 = new byte[] { (byte) -1 };
        byte[] byteArray19 = new byte[] { (byte) -1 };
        byte[] byteArray21 = new byte[] { (byte) -1 };
        byte[] byteArray23 = new byte[] { (byte) -1 };
        byte[] byteArray25 = new byte[] { (byte) -1 };
        byte[][] byteArray26 = new byte[][] { byteArray15, byteArray17, byteArray19, byteArray21, byteArray23, byteArray25 };
        byte[] byteArray28 = new byte[] { (byte) -1 };
        byte[] byteArray30 = new byte[] { (byte) -1 };
        byte[] byteArray32 = new byte[] { (byte) -1 };
        byte[] byteArray34 = new byte[] { (byte) -1 };
        byte[] byteArray36 = new byte[] { (byte) -1 };
        byte[] byteArray38 = new byte[] { (byte) -1 };
        byte[][] byteArray39 = new byte[][] { byteArray28, byteArray30, byteArray32, byteArray34, byteArray36, byteArray38 };
        byte[] byteArray41 = new byte[] { (byte) -1 };
        byte[] byteArray43 = new byte[] { (byte) -1 };
        byte[] byteArray45 = new byte[] { (byte) -1 };
        byte[] byteArray47 = new byte[] { (byte) -1 };
        byte[] byteArray49 = new byte[] { (byte) -1 };
        byte[] byteArray51 = new byte[] { (byte) -1 };
        byte[][] byteArray52 = new byte[][] { byteArray41, byteArray43, byteArray45, byteArray47, byteArray49, byteArray51 };
        byte[] byteArray54 = new byte[] { (byte) -1 };
        byte[] byteArray56 = new byte[] { (byte) -1 };
        byte[] byteArray58 = new byte[] { (byte) -1 };
        byte[] byteArray60 = new byte[] { (byte) -1 };
        byte[] byteArray62 = new byte[] { (byte) -1 };
        byte[] byteArray64 = new byte[] { (byte) -1 };
        byte[][] byteArray65 = new byte[][] { byteArray54, byteArray56, byteArray58, byteArray60, byteArray62, byteArray64 };
        byte[] byteArray67 = new byte[] { (byte) -1 };
        byte[] byteArray69 = new byte[] { (byte) -1 };
        byte[] byteArray71 = new byte[] { (byte) -1 };
        byte[] byteArray73 = new byte[] { (byte) -1 };
        byte[] byteArray75 = new byte[] { (byte) -1 };
        byte[] byteArray77 = new byte[] { (byte) -1 };
        byte[][] byteArray78 = new byte[][] { byteArray67, byteArray69, byteArray71, byteArray73, byteArray75, byteArray77 };
        byte[][][] byteArray79 = new byte[][][] { byteArray13, byteArray26, byteArray39, byteArray52, byteArray65, byteArray78 };
        java.util.Set<byte[][]> byteArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray79);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) byteArray79);
        java.lang.Object[] objArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) byteArray79, objArray82);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4676");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 5, (double) ' ');
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4677");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("tests.weekly", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (short) -1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests35.ruleChain;
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests35);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain39;
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain39;
        kuromojiAnalysisTests3.tearDown();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests3);
        kuromojiAnalysisTests3.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4678");
        double[] doubleArray6 = new double[] { 100, 10.0f, '4', (byte) 100, 0.0f };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests7.assertDocsSkippingEquals("tests.nightly", indexReader16, (int) (byte) -1, postingsEnum18, postingsEnum19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) '4');
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray34, (double) 2);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain23, (java.lang.Object) doubleArray25);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) '4');
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) '4');
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray52, (double) (short) 10);
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) '4');
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray62, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray52, doubleArray57, (double) 4);
        org.junit.Assert.assertArrayEquals("random", doubleArray43, doubleArray57, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray43, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray6, doubleArray43, (double) 10.0f);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, 0.0d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 100, (double) (short) 1);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) '4', (double) (-1L));
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4682");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum41, postingsEnum42, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests45.assertTermsEquals("tests.failfast", indexReader48, terms49, terms50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("tests.nightly", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests45.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader61, (int) (short) -1, postingsEnum63, postingsEnum64);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule68 = kuromojiAnalysisTests67.ruleChain;
        kuromojiAnalysisTests67.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests67);
        org.junit.rules.RuleChain ruleChain71 = kuromojiAnalysisTests67.failureAndSuccessEvents;
        kuromojiAnalysisTests45.failureAndSuccessEvents = ruleChain71;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("tests.badapples", indexReader74, 0, postingsEnum76, postingsEnum77, true);
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests45.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests45.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests45);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 100, (float) (byte) 1);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4684");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.nightly", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("random", indexReader25, 5, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests1.tearDown();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) (short) 1, (float) 1);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4686");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, true);
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (byte) 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4687");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4688");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests17.assertTermsEquals("", indexReader33, terms34, terms35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("<unknown>", indexReader39, (int) (byte) 100, postingsEnum41, postingsEnum42, false);
        kuromojiAnalysisTests17.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests17.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        kuromojiAnalysisTests48.assertTermsEquals("tests.failfast", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests48.assertDocsSkippingEquals("tests.nightly", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60, false);
        org.junit.rules.RuleChain ruleChain63 = kuromojiAnalysisTests48.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests48.failureAndSuccessEvents;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain64;
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) testRule14, (java.lang.Object) ruleChain66);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 1L);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4690");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        java.lang.String str36 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (byte) 1);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4692");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        org.junit.rules.RuleChain ruleChain18 = ruleChain15.around(testRule16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests20);
        org.junit.rules.RuleChain ruleChain24 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule25 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.outerRule(testRule25);
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] { ruleChain15, ruleChain24, ruleChain26 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet28 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        java.util.Set<org.junit.rules.TestRule> testRuleSet29 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChainArray27);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet31 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray27);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray35, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray40);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        int[][] intArray47 = new int[][] {};
        java.util.Set<int[]> intArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(intArray47);
        java.util.List<int[]> intArrayList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, intArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) intArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray27, (java.lang.Object[]) intArray47);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 2, (double) 1L);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4694");
        float[] floatArray1 = null;
        float[] floatArray10 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray17 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray34 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray27, floatArray34, (float) (byte) 100);
        float[] floatArray44 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray51 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray44, floatArray51, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray51, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray51, 10.0f);
        float[] floatArray65 = new float[] { 3, 0.0f, 0, 1.0f, 1, ' ' };
        float[] floatArray72 = new float[] { (-1L), 10.0f, (-1.0f), 0.0f, (short) -1, 100L };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray65, floatArray72, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray51, floatArray72, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray51, 0.0f);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4695");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray11);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals("random", charArray29, charArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray36);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray46, charArray49);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray54, charArray57);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray61, charArray64);
        org.junit.Assert.assertArrayEquals("random", charArray54, charArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray49, charArray61);
        org.junit.Assert.assertArrayEquals(charArray36, charArray49);
        org.junit.Assert.assertArrayEquals("random", charArray11, charArray49);
        char[] charArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray11, charArray71);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4696");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str21 = kuromojiAnalysisTests1.getTestName();
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray25, byteArray29);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray35, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray35);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray47, byteArray48);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray52, byteArray56);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray66, byteArray67);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray62, byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray56);
        java.lang.Object obj72 = null;
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray75, byteArray76);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray75, byteArray79);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray85, byteArray86);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray89, byteArray90);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray85, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray85);
        org.junit.Assert.assertNotSame(obj72, (java.lang.Object) byteArray79);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray56, byteArray79);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) str21, (java.lang.Object) byteArray79);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4697");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1.0f));
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4698");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) '4');
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) (short) 10);
        double[] doubleArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray10, 10.0d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1L, (double) (-1), (double) (byte) 100);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) 1);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4701");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (short) 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) '#');
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 10, 0L);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (byte) -1);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4705");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader31, fields32, fields33, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.tearDown();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests36.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.nightly", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (short) -1, postingsEnum54, postingsEnum55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule59 = kuromojiAnalysisTests58.ruleChain;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests58);
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests58.failureAndSuccessEvents;
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.badapples", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        kuromojiAnalysisTests36.assertTermsEquals("random", indexReader72, terms73, terms74, false);
        kuromojiAnalysisTests36.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        kuromojiAnalysisTests36.assertTermsEquals("europarl.lines.txt.gz", indexReader80, terms81, terms82, false);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("tests.maxfailures", indexReader86, fields87, fields88, false);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) fields87);
        java.lang.String str92 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues95 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("", 1, numericDocValues95, numericDocValues96);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4706");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader16, 1, postingsEnum18, postingsEnum19, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str24 = kuromojiAnalysisTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) '4', (double) 10.0f);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4708");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, (float) 10, (float) (short) 1);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4709");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader19, 1, postingsEnum21, postingsEnum22, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.emptyRuleChain();
        long[] longArray38 = new long[] { (byte) 0 };
        long[] longArray40 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) ruleChain36, (java.lang.Object) longArray38);
        long[] longArray45 = new long[] { (byte) 0 };
        long[] longArray47 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        long[] longArray50 = new long[] { (byte) 0 };
        long[] longArray52 = new long[] { (short) 0 };
        org.junit.Assert.assertArrayEquals(longArray50, longArray52);
        org.junit.Assert.assertArrayEquals("", longArray45, longArray52);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray38, longArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4710");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4711");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 1L, (float) (byte) 0);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) (short) 10);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4714");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray11);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray11, charArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charArray11);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4715");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        java.lang.String str17 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("<unknown>", (int) (byte) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) (byte) 100, (float) 10L);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4717");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("enwiki.random.lines.txt", indexReader41, fields42, fields43, true);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests38.assertDocsEnumEquals("tests.monster", postingsEnum47, postingsEnum48, true);
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.ensureCleanedUp();
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray54);
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray54, (java.lang.Object[]) serializableArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray54, (java.lang.Object[]) executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests38, (java.lang.Object) executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests38);
        kuromojiAnalysisTests0.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests68.ruleChain;
        kuromojiAnalysisTests68.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests68);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        kuromojiAnalysisTests68.assertTermsEquals("random", indexReader73, terms74, terms75, false);
        org.junit.rules.RuleChain ruleChain78 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        kuromojiAnalysisTests68.tearDown();
        kuromojiAnalysisTests68.overrideTestDefaultQueryCache();
        java.lang.String str81 = kuromojiAnalysisTests68.getTestName();
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.ensureCheckIndexPassed();
        kuromojiAnalysisTests68.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests68);
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum87, postingsEnum88);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4718");
        int[] intArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray6, (java.lang.Object) 100.0d);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray19, (java.lang.Object) 100.0d);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray19, intArray29);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray6, (java.lang.Object) "<unknown>");
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertArrayEquals(intArray6, intArray41);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray49, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray50, (java.lang.Object) 100.0d);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray50, intArray60);
        org.junit.Assert.assertArrayEquals(intArray41, intArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray50);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100L, (double) 0L, (double) 1L);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4720");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray5 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray0, queryCachingPolicyArray1, queryCachingPolicyArray2, queryCachingPolicyArray3, queryCachingPolicyArray4, queryCachingPolicyArray5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray15, (java.lang.Object[]) serializableArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray17);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray12, (java.lang.Object[]) serializableArray22);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet39 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray38);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray38, (java.lang.Object[]) serializableArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray40);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray50);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray45);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray62);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray70);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray72);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray70, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray67);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray78);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray78, (java.lang.Object[]) serializableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray78);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray6, (java.lang.Object[]) serializableArray22);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4721");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.util.Set[] setArray13 = new java.util.Set[5];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray14 = (java.util.Set<java.io.Serializable>[]) setArray13;
        serializableSetArray14[0] = serializableSet3;
        serializableSetArray14[1] = serializableSet5;
        serializableSetArray14[2] = serializableSet7;
        serializableSetArray14[3] = serializableSet9;
        serializableSetArray14[4] = serializableSet11;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray14);
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray14);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, serializableSetArray14);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, serializableSetArray14);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray37);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) executorServiceArray52);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) serializableArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray57, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray32, (java.lang.Object[]) executorServiceArray62);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray14, (java.lang.Object[]) executorServiceArray62);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4722");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, true);
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        kuromojiAnalysisTests3.ensureCleanedUp();
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray30);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray40);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray40, (java.lang.Object[]) serializableArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) serializableArray42);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet52 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray51);
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray51, (java.lang.Object[]) serializableArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray53);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray58);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray61);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray61, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray58, (java.lang.Object[]) serializableArray63);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray48, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray42, (java.lang.Object[]) serializableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) serializableArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", objArray1, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4723");
        char[][] charArray1 = new char[][] {};
        char[][] charArray2 = new char[][] {};
        char[][] charArray3 = new char[][] {};
        char[][] charArray4 = new char[][] {};
        char[][] charArray5 = new char[][] {};
        char[][] charArray6 = new char[][] {};
        char[][][] charArray7 = new char[][][] { charArray1, charArray2, charArray3, charArray4, charArray5, charArray6 };
        java.util.Set<char[][]> charArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charArray7);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) charArray7, objArray9);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4724");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '4');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, (double) 100);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '4');
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray30, (double) (short) 10);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '4');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray40, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray30, doubleArray35, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray35, 0.0d);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) '4');
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) '4');
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray54, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray54, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray35, (double) (-1L));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4725");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1, (double) '4');
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4726");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) serializableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray5);
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) serializableArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray27);
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray32);
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet36 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray35);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray35, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray32, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) serializableArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray22, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray22);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling47 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet49 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray48);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, throttlingArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling51 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet53 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray48, (java.lang.Object[]) throttlingArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) throttlingArray52);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (-1L));
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) 0.0f, (double) (byte) 100);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4729");
        int[] intArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, true);
        kuromojiAnalysisTests3.setUp();
        kuromojiAnalysisTests3.tearDown();
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray17, (java.lang.Object) 100.0d);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray30, intArray33);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray30, (java.lang.Object) 100.0d);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray30, intArray40);
        org.junit.Assert.assertArrayEquals("random", intArray17, intArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray17, (java.lang.Object) "<unknown>");
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray48, intArray49);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray49, intArray52);
        org.junit.Assert.assertArrayEquals(intArray17, intArray52);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray52);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4730");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray11);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray17, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray17);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray11);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray34, byteArray38);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray44, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray30, byteArray38);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray56, byteArray57);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray61, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray61, byteArray65);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray71, byteArray72);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray71, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray57, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray57);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray11);
        byte[] byteArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray84);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 'a', (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4732");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (-1), postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader20, 5, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4733");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests3.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, true);
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        kuromojiAnalysisTests3.ensureCleanedUp();
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray19);
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray19, (java.lang.Object[]) serializableArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray19, (java.lang.Object[]) executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests40.assertTermsEquals("", indexReader42, terms43, terms44, false);
        kuromojiAnalysisTests40.setUp();
        kuromojiAnalysisTests40.resetCheckIndexStatus();
        kuromojiAnalysisTests40.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests40.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests40.assertFieldsEquals("tests.monster", indexReader54, fields55, fields56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        kuromojiAnalysisTests40.assertTermsEquals("tests.nightly", indexReader60, terms61, terms62, false);
        kuromojiAnalysisTests40.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        kuromojiAnalysisTests40.assertTermsEquals("tests.nightly", indexReader67, terms68, terms69, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) boolean39, (java.lang.Object) terms69);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4734");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29, false);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule33 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        org.junit.rules.RuleChain ruleChain35 = ruleChain32.around(testRule33);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain32;
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setUp();
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray44, byteArray48);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray54, byteArray55);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray54, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray41, byteArray48);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray66, byteArray70);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray76, byteArray77);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray80, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray76, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray76);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) byteArray76);
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum88, postingsEnum89);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4735");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain6 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("", indexReader8, fields9, fields10, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.failfast", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (short) -1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests35.ruleChain;
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests35);
        org.junit.rules.RuleChain ruleChain39 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain39;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests13.assertDocsSkippingEquals("tests.badapples", indexReader42, 0, postingsEnum44, postingsEnum45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        kuromojiAnalysisTests13.assertTermsEquals("random", indexReader49, terms50, terms51, false);
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests13.assertDocsEnumEquals("tests.maxfailures", postingsEnum56, postingsEnum57, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.badapples");
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) "tests.badapples");
        org.junit.rules.TestRule testRule63 = kuromojiAnalysisTests3.ruleChain;
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", obj1, (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, (long) 0);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4737");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.awaitsfix", indexReader18, fields19, fields20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, 0.0f, (float) (short) 0);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '#', 0.0f, (float) 1L);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4741");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests21);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("tests.weekly", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        kuromojiAnalysisTests31.assertTermsEquals("tests.failfast", indexReader34, terms35, terms36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests31.assertDocsSkippingEquals("tests.nightly", indexReader40, (int) (byte) -1, postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, (int) (short) -1, postingsEnum49, postingsEnum50);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule54 = kuromojiAnalysisTests53.ruleChain;
        kuromojiAnalysisTests53.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests53);
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests53.failureAndSuccessEvents;
        kuromojiAnalysisTests31.failureAndSuccessEvents = ruleChain57;
        kuromojiAnalysisTests21.failureAndSuccessEvents = ruleChain57;
        kuromojiAnalysisTests21.tearDown();
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain61;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain61;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4742");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests10.ruleChain;
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests10.assertTermsEquals("random", indexReader15, terms16, terms17, false);
        kuromojiAnalysisTests10.ensureCheckIndexPassed();
        kuromojiAnalysisTests10.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests10.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("enwiki.random.lines.txt", indexReader26, fields27, fields28, true);
        kuromojiAnalysisTests23.setUp();
        kuromojiAnalysisTests23.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, false);
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests23.ruleChain;
        org.junit.rules.RuleChain ruleChain41 = ruleChain22.around(testRule40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule44 = kuromojiAnalysisTests43.ruleChain;
        kuromojiAnalysisTests43.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests43);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        kuromojiAnalysisTests43.assertTermsEquals("random", indexReader48, terms49, terms50, false);
        kuromojiAnalysisTests43.ensureCheckIndexPassed();
        kuromojiAnalysisTests43.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests43.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests43.ruleChain;
        org.junit.rules.RuleChain ruleChain57 = org.junit.rules.RuleChain.outerRule(testRule56);
        org.junit.rules.RuleChain ruleChain58 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain57);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain57;
        org.junit.rules.RuleChain ruleChain60 = ruleChain22.around((org.junit.rules.TestRule) ruleChain57);
        org.junit.rules.RuleChain ruleChain61 = ruleChain8.around((org.junit.rules.TestRule) ruleChain22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests62.tearDown();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        kuromojiAnalysisTests62.assertFieldsEquals("enwiki.random.lines.txt", indexReader65, fields66, fields67, true);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        kuromojiAnalysisTests62.assertDocsEnumEquals("tests.monster", postingsEnum71, postingsEnum72, true);
        org.junit.rules.RuleChain ruleChain75 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests77 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule78 = kuromojiAnalysisTests77.ruleChain;
        kuromojiAnalysisTests77.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests77);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        kuromojiAnalysisTests77.assertTermsEquals("random", indexReader82, terms83, terms84, false);
        org.junit.rules.RuleChain ruleChain87 = kuromojiAnalysisTests77.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement88 = null;
        org.junit.runner.Description description89 = null;
        org.junit.runners.model.Statement statement90 = ruleChain87.apply(statement88, description89);
        kuromojiAnalysisTests62.failureAndSuccessEvents = ruleChain87;
        org.junit.rules.RuleChain ruleChain92 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain87);
        org.junit.runners.model.Statement statement93 = null;
        org.junit.runner.Description description94 = null;
        org.junit.runners.model.Statement statement95 = ruleChain92.apply(statement93, description94);
        org.junit.runner.Description description96 = null;
        org.junit.runners.model.Statement statement97 = ruleChain22.apply(statement95, description96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain22);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4743");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum30, postingsEnum31, false);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests36.assertTermsEquals("", indexReader38, terms39, terms40, false);
        kuromojiAnalysisTests36.ensureCleanedUp();
        kuromojiAnalysisTests36.ensureCheckIndexPassed();
        kuromojiAnalysisTests36.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.tearDown();
        org.junit.rules.TestRule testRule48 = kuromojiAnalysisTests36.ruleChain;
        kuromojiAnalysisTests36.assertPathHasBeenCleared("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests36);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4744");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.badapples", indexReader8, (int) ' ', postingsEnum10, postingsEnum11);
        java.lang.String str13 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.String str15 = kuromojiAnalysisTests1.getTestName();
        java.lang.String[] strArray22 = new java.lang.String[] { "<unknown>", "tests.weekly", "enwiki.random.lines.txt", "tests.monster", "tests.weekly", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strSet25);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (long) 100, (long) (byte) 100);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4746");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        kuromojiAnalysisTests12.setUp();
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        java.lang.String str29 = kuromojiAnalysisTests12.getTestName();
        java.lang.String str30 = kuromojiAnalysisTests12.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests31.assertTermsEquals("", indexReader33, terms34, terms35, false);
        kuromojiAnalysisTests31.ensureCheckIndexPassed();
        kuromojiAnalysisTests31.tearDown();
        kuromojiAnalysisTests31.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) str30, (java.lang.Object) kuromojiAnalysisTests31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests31);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4747");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader17, 4, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader29, terms30, terms31, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0f), 100.0f, (float) (byte) 10);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4749");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (-1));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray29, (java.lang.Object[]) serializableArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray31);
        java.io.Serializable[] serializableArray36 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray36);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray39);
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray39, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray36, (java.lang.Object[]) serializableArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) serializableArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) serializableArray26, (java.lang.Object[]) executorServiceArray46);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) executorServiceArray46);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.elasticsearch.test.ESTestCase[][] eSTestCaseArray52 = new org.elasticsearch.test.ESTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray52);
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) eSTestCaseArray52);
        java.util.Set<org.elasticsearch.test.ESTestCase[]> eSTestCaseArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray52);
        double[][] doubleArray57 = new double[][] {};
        java.util.Set<double[]> doubleArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray57);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet61 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray60);
        java.io.Serializable[] serializableArray62 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) serializableArray60, (java.lang.Object[]) serializableArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray60, (java.lang.Object[]) executorServiceArray65);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray57, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) eSTestCaseArray52, (java.lang.Object[]) doubleArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) eSTestCaseArray52);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4750");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("enwiki.random.lines.txt", indexReader21, fields22, fields23, true);
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("tests.monster", indexReader29, fields30, fields31, false);
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests18);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests18);
        kuromojiAnalysisTests18.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 5);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4752");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, (double) 'a');
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4753");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader37, terms38, terms39, false);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader45, (int) (short) 100, postingsEnum47, postingsEnum48);
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.awaitsfix", 4, numericDocValues56, numericDocValues57);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4754");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader4, fields5, fields6, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        java.lang.String str19 = kuromojiAnalysisTests1.getTestName();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests21.ruleChain;
        kuromojiAnalysisTests21.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain20, (java.lang.Object) kuromojiAnalysisTests21);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, false);
        kuromojiAnalysisTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests21.assertDocsSkippingEquals("tests.awaitsfix", indexReader37, 0, postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4755");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader22, terms23, terms24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4756");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, true);
        kuromojiAnalysisTests1.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("enwiki.random.lines.txt", indexReader25, fields26, fields27, true);
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("tests.monster", indexReader33, fields34, fields35, false);
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain38;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("hi!", indexReader44, fields45, fields46, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, (double) 0L, (double) ' ');
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4758");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader6, (int) ' ', postingsEnum8, postingsEnum9);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", (int) (short) 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4759");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray4, strArray8, strArray12, strArray16 };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray21, strArray25, strArray29, strArray33 };
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray51 = new java.lang.String[][] { strArray38, strArray42, strArray46, strArray50 };
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray68 = new java.lang.String[][] { strArray55, strArray59, strArray63, strArray67 };
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "tests.awaitsfix", "tests.nightly" };
        java.lang.String[][] strArray85 = new java.lang.String[][] { strArray72, strArray76, strArray80, strArray84 };
        java.lang.String[][][] strArray86 = new java.lang.String[][][] { strArray17, strArray34, strArray51, strArray68, strArray85 };
        java.util.List<java.lang.String[][]> strArrayList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, strArray86);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) strArray86);
        java.util.Set<java.lang.String[][]> strArraySet89 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArraySet89);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) '#', (float) (byte) 10);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1.0f, (double) 0);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4762");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String str22 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) 'a', postingsEnum27, postingsEnum28, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', (double) (short) 1);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4764");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) -1, (double) (short) 0);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 'a', (double) (byte) 1);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 100);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (long) 5);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 100, (double) 100L, (double) 'a');
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4769");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("random", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests18.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests18.assertPositionsSkippingEquals("hi!", indexReader35, 4, postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.awaitsfix", indexReader42, terms43, terms44, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.failfast");
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) kuromojiAnalysisTests18);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        kuromojiAnalysisTests18.assertTermsEquals("<unknown>", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests18.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum57, postingsEnum58);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4770");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        java.lang.String str22 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray23 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests1 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet24 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray23);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) eSTestCaseArray23);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0L, (long) ' ');
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (-1.0f), (float) (byte) 10, (float) (short) 10);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 100);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) -1, 1.0d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4775");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests23.ruleChain;
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests23);
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests23.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.badapples", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader44, terms45, terms46, true);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.badapples", postingsEnum50, postingsEnum51, true);
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule58 = kuromojiAnalysisTests57.ruleChain;
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests57.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests57, (java.lang.Object) (-1));
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("", indexReader65, fields66, fields67, false);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        kuromojiAnalysisTests57.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader71, (int) 'a', postingsEnum73, postingsEnum74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        kuromojiAnalysisTests57.assertDocsSkippingEquals("tests.nightly", indexReader77, 10, postingsEnum79, postingsEnum80, true);
        kuromojiAnalysisTests57.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests57);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 1.0d, (double) 1.0f);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4778");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '#', (double) 10L);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (short) 1, (-1.0d), (double) 'a');
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 'a', (double) 'a');
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4781");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests22);
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests22.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain26;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4782");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray6, (java.lang.Object) 100.0d);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray19, (java.lang.Object) 100.0d);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray19, intArray29);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray19);
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray19, intArray38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule43 = kuromojiAnalysisTests42.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule43;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule43;
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.outerRule(testRule43);
        org.junit.rules.RuleChain ruleChain47 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain46);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray51, intArray52);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray52, intArray55);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray52, (java.lang.Object) 100.0d);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray64, intArray65);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray68, intArray69);
        org.junit.Assert.assertArrayEquals(intArray65, intArray68);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray65, (java.lang.Object) 100.0d);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray75, intArray76);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray65, intArray75);
        org.junit.Assert.assertArrayEquals("random", intArray52, intArray65);
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray80);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) ruleChain46, (java.lang.Object) intArray80);
        org.junit.Assert.assertArrayEquals("", intArray19, intArray80);
        int[] intArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray19, intArray84);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4783");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader16, terms17, terms18, false);
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test4784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 1.0f);
    }
}

