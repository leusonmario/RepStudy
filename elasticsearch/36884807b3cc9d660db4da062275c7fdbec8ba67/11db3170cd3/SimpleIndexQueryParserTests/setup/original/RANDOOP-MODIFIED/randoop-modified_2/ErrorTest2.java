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
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str40 = simpleIndexQueryParserTests39.getTestName();
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain43 = null;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.monster", indexReader47, (int) (byte) 10, postingsEnum49, postingsEnum50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "hi!", (java.lang.Object) postingsEnum49);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray4 = new long[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) (byte) -1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        long[] longArray4 = new long[] { 1L, (byte) 0, (short) 0 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { (short) 0, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray1, longArray5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        java.lang.Object obj10 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList9, obj10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList16, obj17);
        java.lang.Iterable[] iterableArray20 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray21 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray20;
        cloneableIterableArray21[0] = cloneableList9;
        cloneableIterableArray21[1] = cloneableList16;
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.lang.Object obj31 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList30, obj31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        java.lang.Object obj38 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList37, obj38);
        java.lang.Iterable[] iterableArray41 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray42 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray41;
        cloneableIterableArray42[0] = cloneableList30;
        cloneableIterableArray42[1] = cloneableList37;
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        java.lang.Object obj52 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList51, obj52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList58, obj59);
        java.lang.Iterable[] iterableArray62 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray63 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray62;
        cloneableIterableArray63[0] = cloneableList51;
        cloneableIterableArray63[1] = cloneableList58;
        java.lang.Iterable[][] iterableArray69 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray70 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray69;
        cloneableIterableArray70[0] = cloneableIterableArray21;
        cloneableIterableArray70[1] = cloneableIterableArray42;
        cloneableIterableArray70[2] = cloneableIterableArray63;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableIterableArray70);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
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
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 3, (long) (byte) 10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) cloneableArray4);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) -1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain26 = null;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain26;
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.nightly", (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum6, postingsEnum7, false);
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.awaitsfix", indexReader25, terms26, terms27, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain32;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str36 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests35.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests35.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain32, (java.lang.Object) testRule45);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        short[] shortArray5 = new short[] { (byte) 0, (short) 10, (short) 100, (byte) 0, (byte) -1 };
        short[] shortArray12 = new short[] { (byte) 10, (byte) 1, (byte) 1, (short) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray3);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        long[] longArray1 = new long[] { ' ' };
        long[] longArray8 = new long[] { (short) 100, (byte) 1, 100L, (byte) 100, (-1L), 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1, (double) 10L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 3, (long) (byte) 1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray4);
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
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
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.slow", indexReader34, (int) (byte) 10, postingsEnum36, postingsEnum37, true);
        simpleIndexQueryParserTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        simpleIndexQueryParserTests18.assertFieldsEquals("tests.failfast", indexReader42, fields43, fields44, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexReader42);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) (short) 100);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray14, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 10.0f);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        double[] doubleArray4 = new double[] { 'a', 10.0d };
        double[] doubleArray7 = new double[] { 'a', 10.0d };
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        java.util.List<double[]> doubleArrayList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray17);
        java.util.List<double[]> doubleArrayList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray17);
        double[] doubleArray23 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray28 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[] doubleArray33 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray34 = new double[][] { doubleArray33 };
        double[] doubleArray38 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray39 = new double[][] { doubleArray38 };
        double[] doubleArray43 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray44 = new double[][] { doubleArray43 };
        double[] doubleArray48 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        double[][][] doubleArray50 = new double[][][] { doubleArray24, doubleArray29, doubleArray34, doubleArray39, doubleArray44, doubleArray49 };
        java.util.Set<double[][]> doubleArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray17, (java.lang.Object[]) doubleArray50);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 3, (-1.0d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule4, (java.lang.Object) locale7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 5, (double) 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.awaitsfix", indexReader25, terms26, terms27, false);
        org.junit.rules.TestRule testRule30 = simpleIndexQueryParserTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        double[] doubleArray5 = new double[] { 'a', 10.0d };
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray11 = new double[] { 'a', 10.0d };
        double[] doubleArray14 = new double[] { 'a', 10.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0d };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        java.util.List<double[]> doubleArrayList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray18);
        java.util.List<double[]> doubleArrayList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("tests.nightly", indexReader31, (int) (byte) 10, postingsEnum33, postingsEnum34, true);
        java.lang.Class<?> wildcardClass37 = simpleIndexQueryParserTests21.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str39 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain42 = null;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests38.assertDocsSkippingEquals("tests.nightly", indexReader45, 100, postingsEnum47, postingsEnum48, false);
        simpleIndexQueryParserTests38.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass52 = simpleIndexQueryParserTests38.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str54 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain57 = null;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain57;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests53.assertDocsSkippingEquals("tests.nightly", indexReader60, 100, postingsEnum62, postingsEnum63, false);
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass67 = simpleIndexQueryParserTests53.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str69 = simpleIndexQueryParserTests68.getTestName();
        simpleIndexQueryParserTests68.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests68.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain72 = null;
        simpleIndexQueryParserTests68.failureAndSuccessEvents = ruleChain72;
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests68.assertDocsSkippingEquals("tests.nightly", indexReader75, 100, postingsEnum77, postingsEnum78, false);
        simpleIndexQueryParserTests68.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass82 = simpleIndexQueryParserTests68.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests83 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str84 = simpleIndexQueryParserTests83.getTestName();
        simpleIndexQueryParserTests83.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests83.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain87 = null;
        simpleIndexQueryParserTests83.failureAndSuccessEvents = ruleChain87;
        simpleIndexQueryParserTests83.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass90 = simpleIndexQueryParserTests83.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests91 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass92 = simpleIndexQueryParserTests91.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray93 = new java.lang.reflect.GenericDeclaration[] { wildcardClass52, wildcardClass67, wildcardClass82, wildcardClass90, wildcardClass92 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet94 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray93);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests21, (java.lang.Object) genericDeclarationArray93);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) doubleArray18, (java.lang.Object[]) genericDeclarationArray93);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        java.lang.String str16 = simpleIndexQueryParserTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("hi!", indexReader29, terms30, terms31, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) terms30);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        long[] longArray6 = new long[] { 100, 100, (byte) 100, (byte) 0, (short) 10 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray7);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 100L);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (short) 100);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) 100L);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray20, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray10, floatArray20, (float) 'a');
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray33, (float) (short) 100);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 100L);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray43, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray33, floatArray43, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray20, floatArray33, (float) 3);
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
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray53, floatArray64, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray20, floatArray64, (float) 10);
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray64, floatArray71, (float) (byte) 1);
        float[] floatArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray77, (float) (short) 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) cloneableArray10, (java.lang.Object) 10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        double[] doubleArray2 = new double[] { (-1.0d), 0 };
        double[] doubleArray5 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100.0f);
        double[] doubleArray10 = new double[] { (-1.0d), 0 };
        double[] doubleArray13 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray13, (double) (short) 100);
        double[] doubleArray20 = new double[] { (-1.0d), 0 };
        double[] doubleArray23 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100.0f);
        double[] doubleArray28 = new double[] { (-1.0d), 0 };
        double[] doubleArray31 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray31, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray31, (double) (-1));
        double[] doubleArray43 = new double[] { (byte) 100, 1, 10.0d, (byte) 1, (-1.0d) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray43, (double) (short) 10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests12);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures20 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet22 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain17, (java.lang.Object) testRuleIgnoreAfterMaxFailuresSet22);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling41, throttling44, throttling47, throttling49, throttling50 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) cloneableArray9, (java.lang.Object[]) throttlingArray51);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.List<java.lang.String> strList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests9, simpleIndexQueryParserTests12, simpleIndexQueryParserTests18 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet23 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray22);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet24 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray22);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet25 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) simpleIndexQueryParserTestsArray22);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 100, (double) 3);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray13, (java.lang.Object[]) cloneableArray18);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("node_s_0", postingsEnum28, postingsEnum29, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str33 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain36;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests32.assertDocsSkippingEquals("tests.nightly", indexReader39, 100, postingsEnum41, postingsEnum42, false);
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("tests.awaitsfix", indexReader47, terms48, terms49, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain54;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain54);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        double[] doubleArray2 = new double[] { (-1.0d), 0 };
        double[] doubleArray5 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100.0f);
        double[] doubleArray10 = new double[] { (-1.0d), 0 };
        double[] doubleArray13 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray13, (double) (short) 100);
        double[] doubleArray23 = new double[] { 0, 10, 1L, (-1L), (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray23, (double) 2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling4, throttling7, throttling10, throttling12, throttling13 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray25);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray20, (java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray14, (java.lang.Object[]) cloneableArray20);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        float[] floatArray0 = null;
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
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray19, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray9, floatArray19, (float) 'a');
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray32, (float) (short) 100);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray32, floatArray42, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray19, floatArray32, (float) 3);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray57, (float) (short) 100);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray52, floatArray63, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray19, floatArray63, (float) 10);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray75, (float) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray19, (float) (byte) -1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str25 = simpleIndexQueryParserTests24.getTestName();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        java.lang.String str28 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests35.assertDocsEnumEquals("", postingsEnum39, postingsEnum40, true);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain44;
        java.lang.Object obj46 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain44, obj46);
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain44;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain44;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain44);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain44;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str54 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests53);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("tests.maxfailures", indexReader59, (-1), postingsEnum61, postingsEnum62);
        simpleIndexQueryParserTests53.resetCheckIndexStatus();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) ruleChain44, (java.lang.Object) simpleIndexQueryParserTests53);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testConstantScoreParsesFilter();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        double[] doubleArray3 = new double[] { (-1.0d), 0 };
        double[] doubleArray6 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100.0f);
        double[] doubleArray11 = new double[] { (-1.0d), 0 };
        double[] doubleArray14 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) (short) 100);
        double[] doubleArray23 = new double[] { (short) -1, 5, (-1.0d), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray23, (double) (byte) 10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray4, byteArray7);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 5, (long) (byte) -1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        java.util.Locale[] localeArray2 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        java.util.List<java.util.Locale> localeList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, localeArray2);
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray11 = new double[] { 'a', 10.0d };
        double[] doubleArray14 = new double[] { 'a', 10.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0d };
        double[] doubleArray20 = new double[] { 'a', 10.0d };
        double[][] doubleArray21 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        java.util.List<double[]> doubleArrayList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) localeArray2, (java.lang.Object[]) doubleArray21);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray2);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4, simpleIndexQueryParserTestsArray5 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTestsArrayList7);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet4 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Set<org.junit.rules.TestRule> testRuleSet5 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.lang.Iterable[] iterableArray12 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray13 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray12;
        cloneableIterableArray13[0] = cloneableList10;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray13);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) cloneableIterableArray13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { (byte) 100, 100L, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray6);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
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
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray11, floatArray21, (float) 'a');
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) (short) 100);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray44, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray34, floatArray44, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray21, floatArray34, (float) 3);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 100L);
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray59, (float) (short) 100);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray59, floatArray65, 10.0f);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray70, 10.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray21, floatArray65, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray1, (java.lang.Object) floatArray65);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, 1, postingsEnum25, postingsEnum26);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList33, obj34);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.maxfailures", indexReader38, fields39, fields40, false);
        org.junit.Assert.assertNotSame("tests.slow", obj34, (java.lang.Object) simpleIndexQueryParserTests36);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests36);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray5);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        long[] longArray6 = new long[] { (byte) -1, 4, '#', 100L, 'a', '4' };
        long[] longArray8 = new long[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        short[] shortArray3 = new short[] { (short) -1, (short) 0, (short) -1 };
        short[] shortArray10 = new short[] { (short) 100, (short) 0, (short) 0, (byte) -1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.List<java.lang.String> strList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray7, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        int[] intArray3 = new int[] { 10, (-1) };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray3, intArray8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader18, terms19, terms20, false);
        double[] doubleArray26 = new double[] { 'a', 10.0d };
        double[] doubleArray29 = new double[] { 'a', 10.0d };
        double[] doubleArray32 = new double[] { 'a', 10.0d };
        double[] doubleArray35 = new double[] { 'a', 10.0d };
        double[] doubleArray38 = new double[] { 'a', 10.0d };
        double[][] doubleArray39 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        java.util.List<double[]> doubleArrayList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray39);
        java.util.Set<double[]> doubleArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) indexReader18, (java.lang.Object) doubleArray39);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        long[] longArray0 = new long[] {};
        long[] longArray6 = new long[] { (short) -1, (byte) -1, 1, 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
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
        simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
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
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray6;
        cloneableIterableArray7[0] = cloneableList4;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray7);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableSet10);
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
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) cloneableIterableSet10, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray7);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        java.util.Locale[] localeArray4 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet5 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain2, (java.lang.Object) localeSet5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0d, (double) 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 2);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        long[] longArray6 = new long[] { '#', 10, (short) 100, 1L, 3, 10 };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray10 = new int[] { (-1), (byte) -1, ' ', 0, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray2, intArray10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray4, (java.lang.Object) simpleIndexQueryParserTests6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("", postingsEnum14, postingsEnum15, true);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain19;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 1.0f);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.maxfailures", indexReader21, terms22, terms23, true);
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("tests.maxfailures", indexReader29, terms30, terms31, false);
        java.lang.Class<?> wildcardClass34 = simpleIndexQueryParserTests17.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str36 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests35.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain39 = null;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain39;
        java.lang.String str41 = simpleIndexQueryParserTests35.getTestName();
        java.lang.Class<?> wildcardClass42 = simpleIndexQueryParserTests35.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str44 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        java.lang.String str47 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests43.setUp();
        java.lang.String str51 = simpleIndexQueryParserTests43.getTestName();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.badapples", indexReader53, (-1), postingsEnum55, postingsEnum56);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests43.assertDocsEnumEquals("tests.failfast", postingsEnum59, postingsEnum60, true);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("europarl.lines.txt.gz", indexReader64, terms65, terms66, true);
        java.lang.Class<?> wildcardClass69 = simpleIndexQueryParserTests43.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str71 = simpleIndexQueryParserTests70.getTestName();
        simpleIndexQueryParserTests70.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests70.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain74 = null;
        simpleIndexQueryParserTests70.failureAndSuccessEvents = ruleChain74;
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests70.assertDocsSkippingEquals("tests.nightly", indexReader77, 100, postingsEnum79, postingsEnum80, false);
        simpleIndexQueryParserTests70.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass84 = simpleIndexQueryParserTests70.getClass();
        java.lang.Class[] classArray86 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray87 = (java.lang.Class<?>[]) classArray86;
        wildcardClassArray87[0] = wildcardClass34;
        wildcardClassArray87[1] = wildcardClass42;
        wildcardClassArray87[2] = wildcardClass69;
        wildcardClassArray87[3] = wildcardClass84;
        java.util.Set<java.lang.Class<?>> wildcardClassSet96 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray15, (java.lang.Object[]) wildcardClassArray87);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) 10, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNotQueryBuilder();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 0.0f);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("hi!", postingsEnum6, postingsEnum7, false);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader18, fields19, fields20, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("node_s_0");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10L, (double) (short) 10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        long[] longArray4 = new long[] { 'a', '4', 5 };
        long[] longArray8 = new long[] { (byte) 10, '#', (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray8);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 4);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { 2, (byte) 10, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray6);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        java.lang.Object[] objArray0 = null;
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) localeArray1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("node_s_0", indexReader14, terms15, terms16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) terms16);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMoreLikeThisBuilder();
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        long[] longArray7 = new long[] { 4, 2, 5, (short) 0, 10, (short) 100 };
        long[] longArray14 = new long[] { (byte) 10, (byte) 1, (byte) 10, (-1L), (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray7, longArray14);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.junit.rules.TestRule> testRuleSet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) cloneableArray59);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) wildcardClassArray71);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 100L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) (short) 100);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray3, floatArray14, (float) 3);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, 10.0f);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray32, (float) (short) 100);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray32, floatArray42, (float) 'a');
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
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray65, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray55, floatArray65, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray42, floatArray55, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray14, floatArray42, (float) (-1));
        float[] floatArray76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray14, floatArray76, (float) (byte) 100);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) '#', (long) 6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        java.lang.Object obj34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "random", obj34);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet4 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Set<org.junit.rules.TestRule> testRuleSet5 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet6 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray27);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray38);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) cloneableArray15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.Object obj11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, obj11);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        double[] doubleArray4 = new double[] { 'a', 10.0d };
        double[] doubleArray7 = new double[] { 'a', 10.0d };
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        java.util.List<double[]> doubleArrayList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray17);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) doubleArray17, (java.lang.Object[]) cloneableArray24);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        double[] doubleArray3 = new double[] { 'a', 10.0d };
        double[] doubleArray6 = new double[] { 'a', 10.0d };
        double[] doubleArray9 = new double[] { 'a', 10.0d };
        double[] doubleArray12 = new double[] { 'a', 10.0d };
        double[] doubleArray15 = new double[] { 'a', 10.0d };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        java.util.List<double[]> doubleArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray16);
        java.util.Set<double[]> doubleArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray16);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray16);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray29, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray29);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray49 = new java.lang.Cloneable[] { locale48 };
        java.util.List<java.lang.Cloneable> cloneableList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray49);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray55 = new java.lang.Cloneable[] { locale54 };
        java.util.List<java.lang.Cloneable> cloneableList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray55);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray60 = new java.lang.Cloneable[] { locale59 };
        java.util.List<java.lang.Cloneable> cloneableList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray55, (java.lang.Object[]) cloneableArray60);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray23, (java.lang.Object[]) cloneableArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray16, (java.lang.Object[]) cloneableArray23);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader15, 1, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        short[] shortArray5 = new short[] { (short) 100, (byte) 0, (byte) -1, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        java.lang.String str25 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 0, 0L, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        long[] longArray7 = new long[] { '#', (short) 0, 10, 4, (short) 10, (short) 10 };
        long[] longArray13 = new long[] { (short) 0, ' ', 5, (byte) 100, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray13);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        short[] shortArray4 = new short[] { (byte) 10, (short) 1, (short) 10 };
        short[] shortArray7 = new short[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray4, shortArray7);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 0.0f);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) ' ');
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet6 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
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
        double[] doubleArray58 = new double[] { 'a', 10.0d };
        double[] doubleArray61 = new double[] { 'a', 10.0d };
        double[] doubleArray64 = new double[] { 'a', 10.0d };
        double[] doubleArray67 = new double[] { 'a', 10.0d };
        double[] doubleArray70 = new double[] { 'a', 10.0d };
        double[][] doubleArray71 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67, doubleArray70 };
        java.util.List<double[]> doubleArrayList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray71);
        java.util.Set<double[]> doubleArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray71);
        java.util.Set<double[]> doubleArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray51, (java.lang.Object[]) doubleArray71);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        double[] doubleArray20 = new double[] { (-1.0d), 0 };
        double[] doubleArray23 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) (short) 100);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        double[] doubleArray38 = new double[] { (-1.0d), 0 };
        double[] doubleArray41 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray41, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray41, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray41, (double) 1L);
        double[] doubleArray52 = new double[] { (-1.0d), 0 };
        double[] doubleArray55 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray7, doubleArray52, (double) 1L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1.0d), 0 };
        double[] doubleArray25 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100.0f);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray33, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray7, (double) 3);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (short) 100);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1.0f), (double) 1L, (double) (short) -1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 5);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) '#');
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, 10.0d, (double) 1.0f);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
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
        simpleIndexQueryParserTests4.testQueryQueryBuilder();
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        double[] doubleArray20 = new double[] { (-1.0d), 0 };
        double[] doubleArray23 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) (short) 100);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        double[] doubleArray38 = new double[] { (-1.0d), 0 };
        double[] doubleArray41 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray41, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray41, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray4, doubleArray41, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) 'a');
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, 100L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
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
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray13, (float) 3);
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
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray30, 10.0f);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray35, (float) '#');
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) 100L);
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
        org.junit.Assert.assertArrayEquals("", floatArray53, floatArray59, 10.0f);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray59, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray43, (float) 1L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str75 = simpleIndexQueryParserTests74.getTestName();
        org.junit.rules.TestRule testRule76 = simpleIndexQueryParserTests74.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) 1L, (java.lang.Object) testRule76);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
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
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray13, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray19, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) floatArray13);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray27);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray47, (java.lang.Object[]) cloneableArray52);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray52);
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) cloneableArray52, objArray56);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray13 = new java.lang.Cloneable[] { locale12 };
        java.util.List<java.lang.Cloneable> cloneableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray13);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray24);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) cloneableArray24);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
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
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.junit.rules.TestRule> testRuleSet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 10L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 10.0d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        long[] longArray4 = new long[] { 100, 'a', (short) 0, 1 };
        long[] longArray6 = new long[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) ' ', (double) ' ');
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        double[] doubleArray5 = new double[] { 'a', 10.0d };
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray11 = new double[] { 'a', 10.0d };
        double[] doubleArray14 = new double[] { 'a', 10.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0d };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        java.util.List<double[]> doubleArrayList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray18);
        java.util.List<double[]> doubleArrayList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests22);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.slow", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests22.assertDocsSkippingEquals("tests.monster", indexReader34, 0, postingsEnum36, postingsEnum37, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) (byte) 0, (java.lang.Object) postingsEnum37);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        short[] shortArray7 = new short[] { (byte) 1, (byte) -1, (short) 1, (byte) -1, (short) 100, (short) 1 };
        short[] shortArray11 = new short[] { (short) 1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray11);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableArray22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests31.assertDocsSkippingEquals("tests.slow", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.awaitsfix", indexReader42, (int) (short) 1, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests31.assertTermsEquals("tests.nightly", indexReader48, terms49, terms50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        simpleIndexQueryParserTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str61 = simpleIndexQueryParserTests60.getTestName();
        simpleIndexQueryParserTests60.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests60.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests60);
        org.junit.rules.RuleChain ruleChain65 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain65;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) cloneableIterableArray22, (java.lang.Object) ruleChain65);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
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
        simpleIndexQueryParserTests1.testEmptyBooleanQuery();
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet6 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray9);
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) cloneableArray17);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        java.lang.String str34 = simpleIndexQueryParserTests30.getTestName();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        simpleIndexQueryParserTests30.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests41.assertDocsEnumEquals("", postingsEnum45, postingsEnum46, true);
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain50;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str56 = simpleIndexQueryParserTests55.getTestName();
        org.junit.rules.TestRule testRule57 = simpleIndexQueryParserTests55.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) testRule57);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        long[] longArray5 = new long[] { (byte) 10, (short) 10, (-1), 1L };
        long[] longArray12 = new long[] { 1, 0L, '#', 4, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray5, longArray12);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (byte) 100);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.setup();
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        double[] doubleArray20 = new double[] { (-1.0d), 0 };
        double[] doubleArray23 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) (short) 100);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        double[] doubleArray38 = new double[] { (-1.0d), 0 };
        double[] doubleArray41 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray41, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray41, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray4, doubleArray41, (double) 'a');
        double[] doubleArray52 = new double[] { (-1.0d), 0 };
        double[] doubleArray55 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray55, (double) 1.0f);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray23 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures22 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet24 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray23);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet25 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray23);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) cloneableArray10, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray23);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray45);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray63, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray45);
        double[] doubleArray78 = new double[] { 'a', 10.0d };
        double[] doubleArray81 = new double[] { 'a', 10.0d };
        double[] doubleArray84 = new double[] { 'a', 10.0d };
        double[] doubleArray87 = new double[] { 'a', 10.0d };
        double[] doubleArray90 = new double[] { 'a', 10.0d };
        double[][] doubleArray91 = new double[][] { doubleArray78, doubleArray81, doubleArray84, doubleArray87, doubleArray90 };
        java.util.List<double[]> doubleArrayList92 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray91);
        java.util.List<double[]> doubleArrayList93 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) cloneableArray45, (java.lang.Object[]) doubleArray91);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 100L, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) (short) -1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 'a', 10L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        double[] doubleArray3 = new double[] { 'a', 10.0d };
        double[] doubleArray6 = new double[] { 'a', 10.0d };
        double[] doubleArray9 = new double[] { 'a', 10.0d };
        double[] doubleArray12 = new double[] { 'a', 10.0d };
        double[] doubleArray15 = new double[] { 'a', 10.0d };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        java.util.List<double[]> doubleArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray16);
        java.util.Set<double[]> doubleArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray16);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "tests.maxfailures", "hi!", "tests.weekly", "tests.badapples", "", "tests.slow" };
        java.util.List<java.lang.CharSequence> charSequenceList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charSequenceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray16, (java.lang.Object[]) charSequenceArray26);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", obj1);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray11, (java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("", indexReader18, terms19, terms20, true);
        simpleIndexQueryParserTests13.setUp();
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests13.ruleChain;
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray6);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray12, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray12, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("random", intArray17, intArray22);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray17, intArray28);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray34, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray34, intArray39);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray46);
        org.junit.Assert.assertArrayEquals("random", intArray39, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray39, intArray50);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray55, intArray57);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals(intArray55, intArray60);
        org.junit.Assert.assertArrayEquals(intArray39, intArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray17, intArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) intArray17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '4', (long) (short) 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
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
        double[] doubleArray22 = new double[] { (-1.0d), 0 };
        double[] doubleArray25 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100.0f);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        double[] doubleArray38 = new double[] { (-1.0d), 0 };
        double[] doubleArray41 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray41, (double) (short) 100);
        double[] doubleArray48 = new double[] { (-1.0d), 0 };
        double[] doubleArray51 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray51, (double) 100.0f);
        double[] doubleArray56 = new double[] { (-1.0d), 0 };
        double[] doubleArray59 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray59, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray59, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray59, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray22, doubleArray59, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) doubleArray22);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader18, terms19, terms20, false);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, luceneTestCaseArray24);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet26 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) luceneTestCaseArray24);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
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
        float[] floatArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray65, floatArray74, (float) (-1L));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray45);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray63, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) cloneableArray9);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (short) 10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 4, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 0, (double) (byte) 1);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (-1L));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
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
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        long[] longArray2 = new long[] { 2, 5 };
        long[] longArray6 = new long[] { (-1), (byte) 1, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
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
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests52.assertDocValuesEquals("enwiki.random.lines.txt", (int) '#', numericDocValues77, numericDocValues78);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str25 = simpleIndexQueryParserTests24.getTestName();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        java.lang.String str28 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests35.assertDocsEnumEquals("", postingsEnum39, postingsEnum40, true);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain44;
        java.lang.Object obj46 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain44, obj46);
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain44;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain44;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain44);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain44;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain44);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
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
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray13, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray19, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) 10.0f);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
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
        simpleIndexQueryParserTests3.testEmptyBooleanQuery();
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests8.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader18, 0, postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests8.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, false);
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
        java.lang.Object obj31 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain29, obj31);
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", obj1, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray16, charArray23);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray29, charArray31);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray38, charArray40);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray38, charArray44);
        org.junit.Assert.assertArrayEquals(charArray31, charArray44);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray44, charArray49);
        org.junit.Assert.assertArrayEquals(charArray23, charArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain9, (java.lang.Object) charArray44);
        char[] charArray55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray44, charArray55);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        org.junit.rules.RuleChain ruleChain11 = null;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("<unknown>", indexReader14, fields15, fields16, false);
        java.lang.String str19 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.monster", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) 10 };
        short[] shortArray8 = new short[] { (short) 0, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray2);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
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
        simpleIndexQueryParserTests3.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray8);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray19);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray31);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray42 = new java.lang.Cloneable[] { locale41 };
        java.util.List<java.lang.Cloneable> cloneableList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray37, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray50 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures49 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet51 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray50);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet52 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray50);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray42, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray50);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) '#');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        short[] shortArray2 = new short[] { (byte) 100, (byte) -1 };
        short[] shortArray9 = new short[] { (short) 1, (short) -1, (byte) -1, (short) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        java.lang.String str8 = simpleIndexQueryParserTests4.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("tests.nightly", indexReader16, (int) 'a', postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        java.lang.String str23 = simpleIndexQueryParserTests4.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray0, (java.lang.Object) str23);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
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
        simpleIndexQueryParserTests3.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(100);
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
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain29);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        double[] doubleArray2 = new double[] { (-1.0d), 0 };
        double[] doubleArray5 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100.0f);
        double[] doubleArray10 = new double[] { 1.0d, 5 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray10, (double) 1L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray6;
        cloneableIterableArray7[0] = cloneableList4;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray7);
        java.lang.CharSequence[][][] charSequenceArray11 = new java.lang.CharSequence[][][] {};
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) charSequenceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableIterableArray7, (java.lang.Object[]) charSequenceArray11);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
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
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum6, postingsEnum7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests11);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        java.lang.String str9 = simpleIndexQueryParserTests3.getTestName();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) "tests.weekly", (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        long[] longArray5 = new long[] { 10L, 0, '4', (byte) 100, 100L };
        long[] longArray8 = new long[] { 100, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
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
        simpleIndexQueryParserTests1.testQueryStringBuilder();
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 1, (short) 1, (short) 100, (short) 100 };
        short[] shortArray9 = new short[] { (byte) 100, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100.0f, (double) 10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
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
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain30, obj32);
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.slow", (java.lang.Object) ruleChain30);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
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
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        simpleIndexQueryParserTests0.setUp();
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray27, (float) (short) 100);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) 100L);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray27, floatArray37, (float) 'a');
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 100L);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (short) 100);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) 100L);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray60, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray50, floatArray60, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray37, floatArray50, (float) 3);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) (short) 100);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray70, floatArray81, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray37, floatArray81, (float) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) floatArray37);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray1, shortArray3);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 10.0f);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray1, simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = null;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests7, simpleIndexQueryParserTests10, simpleIndexQueryParserTests16 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet21 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray20);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet22 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray20);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet23 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray5, (java.lang.Object[]) simpleIndexQueryParserTestsArray20);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests5, (java.lang.Object) 1L);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
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
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) serializableArray46);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) cloneableArray4);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        int[] intArray3 = new int[] { 5, 6 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray12);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray18, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray18, intArray23);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray28, intArray30);
        org.junit.Assert.assertArrayEquals("random", intArray23, intArray28);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray23, intArray34);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray39, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray39, intArray44);
        org.junit.Assert.assertArrayEquals(intArray23, intArray44);
        org.junit.Assert.assertArrayEquals(intArray12, intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray12);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
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
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray20);
        java.lang.Object[] objArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, objArray24);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
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
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray13, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray19, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) floatArray19);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
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
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet26 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray23);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet27 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTestsArray23);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 100, (short) 1, (short) -1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray6);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 0, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        long[] longArray3 = new long[] { (byte) 100, (short) 100, 0 };
        long[] longArray6 = new long[] { '4', 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (short) 0 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray6, shortArray9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableIterableArray7, objArray11);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
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
        simpleIndexQueryParserTests3.testFilteredQueryBuilder();
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray5);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray17, (java.lang.Object[]) cloneableArray22);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray45);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray45);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray53 = new java.lang.Cloneable[] { locale52 };
        java.util.List<java.lang.Cloneable> cloneableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray53);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray58, (java.lang.Object[]) cloneableArray63);
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray70 = new java.lang.Cloneable[] { locale69 };
        java.util.List<java.lang.Cloneable> cloneableList71 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray70);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray75 = new java.lang.Cloneable[] { locale74 };
        java.util.List<java.lang.Cloneable> cloneableList76 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray70, (java.lang.Object[]) cloneableArray75);
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray81 = new java.lang.Cloneable[] { locale80 };
        java.util.List<java.lang.Cloneable> cloneableList82 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray81);
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray86 = new java.lang.Cloneable[] { locale85 };
        java.util.List<java.lang.Cloneable> cloneableList87 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray81, (java.lang.Object[]) cloneableArray86);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray70, (java.lang.Object[]) cloneableArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray63, (java.lang.Object[]) cloneableArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray53, (java.lang.Object[]) cloneableArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) cloneableArray63);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) 10);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 0, (long) (byte) 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        int[] intArray7 = new int[] { 100, 'a', ' ', 1, 10, 0 };
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray11, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals(intArray11, intArray16);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray23, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals(intArray23, intArray28);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray33, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray28, intArray33);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray28, intArray39);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray44, intArray49);
        org.junit.Assert.assertArrayEquals(intArray28, intArray49);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray28, intArray54);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray7, intArray16);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        long[] longArray7 = new long[] { (short) 100, (byte) 100, (byte) 1, ' ', ' ', 100 };
        long[] longArray11 = new long[] { ' ', (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray11);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        long[] longArray4 = new long[] { 10L, 'a', (-1L) };
        long[] longArray7 = new long[] { 5, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray4, longArray7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
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
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray33);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray44);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray62);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) cloneableArray62);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0d), (double) 10L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        long[] longArray5 = new long[] { 0, (byte) -1, (short) 1, 100, ' ' };
        long[] longArray12 = new long[] { 1, (byte) 0, 100, (byte) 100, 4, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 10.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { (byte) 1, 1, (short) -1, (-1), 10L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.junit.rules.TestRule> testRuleSet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray50);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) cloneableArray14);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str39 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        java.lang.String str42 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests38.setUp();
        java.lang.String str46 = simpleIndexQueryParserTests38.getTestName();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("tests.badapples", indexReader48, (-1), postingsEnum50, postingsEnum51);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests38.assertDocsEnumEquals("tests.failfast", postingsEnum54, postingsEnum55, true);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests38.assertTermsEquals("europarl.lines.txt.gz", indexReader59, terms60, terms61, true);
        org.junit.rules.TestRule testRule64 = simpleIndexQueryParserTests38.ruleChain;
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests38, (java.lang.Object) executorServiceArray66);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray32, (java.lang.Object[]) executorServiceArray66);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryBuilder();
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
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
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray33);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray44);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray64 = new java.lang.Cloneable[] { locale63 };
        java.util.List<java.lang.Cloneable> cloneableList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray64);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { locale68 };
        java.util.List<java.lang.Cloneable> cloneableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray64, (java.lang.Object[]) cloneableArray69);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray75 = new java.lang.Cloneable[] { locale74 };
        java.util.List<java.lang.Cloneable> cloneableList76 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray75);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray80 = new java.lang.Cloneable[] { locale79 };
        java.util.List<java.lang.Cloneable> cloneableList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray75, (java.lang.Object[]) cloneableArray80);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray64, (java.lang.Object[]) cloneableArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray57);
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray89 = new java.lang.Cloneable[] { locale88 };
        java.util.List<java.lang.Cloneable> cloneableList90 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray89);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) cloneableArray21);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        long[] longArray6 = new long[] { 'a', 1L, '4', 10L, 3, (short) 100 };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100.0d, (double) 1L, 0.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
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
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests8);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
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
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet16 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray14);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray14);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum28, postingsEnum29, false);
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests19.ruleChain;
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) elasticsearchTestCaseSet18, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray1, doubleArray7, (double) 10L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests13.assertDocsSkippingEquals("tests.slow", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str25 = simpleIndexQueryParserTests24.getTestName();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests24.ensureCleanedUp();
        java.lang.String str28 = simpleIndexQueryParserTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        simpleIndexQueryParserTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("tests.nightly", postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        simpleIndexQueryParserTests24.assertTermsEquals("hi!", indexReader41, terms42, terms43, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) "hi!");
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("node_s_0", indexReader48, terms49, terms50, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
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
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, true);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 100, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.maxfailures", indexReader20, terms21, terms22, true);
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
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain45;
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray58, (java.lang.Object[]) cloneableArray63);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray58, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray58);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) ruleChain45, (java.lang.Object) cloneableArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) cloneableArray52, (java.lang.Object[]) executorServiceArray70);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
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
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        short[] shortArray3 = new short[] { (short) 0, (short) 100, (byte) -1 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (-1), (long) 10);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList6, obj7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        java.lang.Object obj19 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList18, obj19);
        java.lang.Iterable[] iterableArray22 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray23 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray22;
        cloneableIterableArray23[0] = cloneableList6;
        cloneableIterableArray23[1] = cloneableList13;
        cloneableIterableArray23[2] = cloneableList18;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) cloneableIterableArray23);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) 3);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
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
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) '4', (long) 4);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
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
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        long[] longArray6 = new long[] { 1, 1L, 0, (byte) 0, 0L };
        long[] longArray13 = new long[] { 100, (short) 1, (-1L), 0L, 100L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        long[] longArray6 = new long[] { 1L, 2, 100L, 2, (byte) 100, 6 };
        long[] longArray8 = new long[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        long[] longArray1 = new long[] { 6 };
        long[] longArray5 = new long[] { (short) 0, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
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
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (short) -1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 1, (byte) 10, (short) 10, (byte) 10 };
        short[] shortArray10 = new short[] { (byte) 100, (byte) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        long[] longArray5 = new long[] { 10, 6, 10, ' ' };
        long[] longArray9 = new long[] { ' ', (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray5, longArray9);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        byte[] byteArray1 = null;
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray2);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
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
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) -1 };
        byte[] byteArray4 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
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
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) boolean5);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        long[] longArray5 = new long[] { (short) -1, (short) 100, (byte) 0, 10L };
        long[] longArray11 = new long[] { '#', 6, 1L, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray11);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
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
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet16 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray14);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray31);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray38, (java.lang.Object[]) cloneableArray43);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray49 = new java.lang.Cloneable[] { locale48 };
        java.util.List<java.lang.Cloneable> cloneableList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray49);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray54 = new java.lang.Cloneable[] { locale53 };
        java.util.List<java.lang.Cloneable> cloneableList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray49, (java.lang.Object[]) cloneableArray54);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray38, (java.lang.Object[]) cloneableArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray31);
        java.lang.Object obj60 = null;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) cloneableArray31, obj60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) cloneableArray31);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        long[] longArray1 = new long[] { (byte) 100 };
        long[] longArray5 = new long[] { (-1L), 6, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
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
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        org.junit.Assert.assertArrayEquals(charArray3, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray32, charArray36);
        java.lang.Object obj44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "tests.maxfailures", obj44);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 0, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
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
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests15);
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests15, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) postingsEnum10, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray5, (java.lang.Object) 0.0f);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray18);
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
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str53 = simpleIndexQueryParserTests52.getTestName();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str56 = simpleIndexQueryParserTests55.getTestName();
        simpleIndexQueryParserTests55.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests55.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain59 = null;
        simpleIndexQueryParserTests55.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str62 = simpleIndexQueryParserTests61.getTestName();
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests52, simpleIndexQueryParserTests55, simpleIndexQueryParserTests61 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet66 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray65);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet67 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray65);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet68 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) cloneableArray5, (java.lang.Object) elasticsearchSingleNodeTestSet68);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain10 = null;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.nightly", indexReader13, 100, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests6.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.maxfailures", indexReader23, 100, postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) indexReader23);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str6 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, true);
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, false);
        java.lang.Class<?> wildcardClass22 = simpleIndexQueryParserTests5.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str24 = simpleIndexQueryParserTests23.getTestName();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests23.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = null;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain27;
        java.lang.String str29 = simpleIndexQueryParserTests23.getTestName();
        java.lang.Class<?> wildcardClass30 = simpleIndexQueryParserTests23.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        java.lang.String str35 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests31.setUp();
        java.lang.String str39 = simpleIndexQueryParserTests31.getTestName();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.badapples", indexReader41, (-1), postingsEnum43, postingsEnum44);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests31.assertDocsEnumEquals("tests.failfast", postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        simpleIndexQueryParserTests31.assertTermsEquals("europarl.lines.txt.gz", indexReader52, terms53, terms54, true);
        java.lang.Class<?> wildcardClass57 = simpleIndexQueryParserTests31.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str59 = simpleIndexQueryParserTests58.getTestName();
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests58.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain62 = null;
        simpleIndexQueryParserTests58.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests58.assertDocsSkippingEquals("tests.nightly", indexReader65, 100, postingsEnum67, postingsEnum68, false);
        simpleIndexQueryParserTests58.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass72 = simpleIndexQueryParserTests58.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass22;
        wildcardClassArray75[1] = wildcardClass30;
        wildcardClassArray75[2] = wildcardClass57;
        wildcardClassArray75[3] = wildcardClass72;
        java.util.Set<java.lang.Class<?>> wildcardClassSet84 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) wildcardClassArray75);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("random", intArray9, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        org.junit.Assert.assertArrayEquals(intArray9, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray9, intArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray46);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str51 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        java.lang.String str54 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests50.setUp();
        java.lang.String str58 = simpleIndexQueryParserTests50.getTestName();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests50.assertPositionsSkippingEquals("tests.badapples", indexReader60, (-1), postingsEnum62, postingsEnum63);
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests50.assertDocsEnumEquals("tests.failfast", postingsEnum66, postingsEnum67, true);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        simpleIndexQueryParserTests50.assertTermsEquals("europarl.lines.txt.gz", indexReader71, terms72, terms73, true);
        org.junit.rules.TestRule testRule76 = simpleIndexQueryParserTests50.ruleChain;
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests50, (java.lang.Object) executorServiceArray78);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray16);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) cloneableArray11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
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
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10L, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) serializableArray5);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) strComparableList9);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
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
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        short[] shortArray5 = new short[] { (byte) 10, (short) 1, (byte) -1, (byte) 100, (byte) -1 };
        short[] shortArray12 = new short[] { (short) 0, (short) 10, (short) 100, (byte) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 0L);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("tests.maxfailures", indexReader23, fields24, fields25, false);
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("random", postingsEnum32, postingsEnum33, false);
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests37.assertFieldsEquals("tests.maxfailures", indexReader39, fields40, fields41, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests44.ensureCleanedUp();
        java.lang.String str48 = simpleIndexQueryParserTests44.getTestName();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        simpleIndexQueryParserTests44.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests55.assertDocsEnumEquals("", postingsEnum59, postingsEnum60, true);
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain64;
        java.lang.Object obj66 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain64, obj66);
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain64;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain64;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain64);
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain64;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests93 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str94 = simpleIndexQueryParserTests93.getTestName();
        simpleIndexQueryParserTests93.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests93.ensureCleanedUp();
        java.lang.String str97 = simpleIndexQueryParserTests93.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) wildcardClassArray80, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.RuleChain ruleChain3 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader6, fields7, fields8, false);
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList33, obj34);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.maxfailures", indexReader38, fields39, fields40, false);
        org.junit.Assert.assertNotSame("tests.slow", obj34, (java.lang.Object) simpleIndexQueryParserTests36);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain27, (java.lang.Object) simpleIndexQueryParserTests36);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("enwiki.random.lines.txt", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests30);
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests30);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        short[] shortArray5 = new short[] { (short) -1, (short) 0, (short) 100, (byte) -1, (short) 0 };
        short[] shortArray11 = new short[] { (short) 0, (short) -1, (short) 10, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray11);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str54 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("<unknown>", indexReader61, (int) '4', postingsEnum63, postingsEnum64);
        simpleIndexQueryParserTests53.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("tests.badapples", indexReader68, 1, postingsEnum70, postingsEnum71);
        simpleIndexQueryParserTests53.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain46, (java.lang.Object) simpleIndexQueryParserTests53);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str78 = simpleIndexQueryParserTests77.getTestName();
        simpleIndexQueryParserTests77.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests77.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests77);
        org.junit.rules.RuleChain ruleChain82 = simpleIndexQueryParserTests77.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain82;
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("random", indexReader85, (int) (short) 10, postingsEnum87, postingsEnum88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) (short) 10);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "node_s_0");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 5, (double) 'a', (double) (byte) 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        long[] longArray1 = new long[] { 100L };
        long[] longArray5 = new long[] { 0, 4, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("", indexReader10, terms11, terms12, true);
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests5.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        long[] longArray1 = new long[] { (-1L) };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 100 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray4);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray11);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) ruleChainArray1, (java.lang.Object[]) cloneableArray11);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.slow", indexReader14, terms15, terms16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) indexReader14);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (short) 0, (byte) 100, (byte) 0, (short) 0, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray8);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) 100);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) 100L);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray18, (float) (short) 100);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) 100L);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray28, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray18, floatArray28, (float) 'a');
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray18, (float) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) floatArray18);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
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
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) cloneableArray6);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        short[] shortArray2 = new short[] { (byte) -1, (short) 10 };
        short[] shortArray5 = new short[] { (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 'a', 100L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray2, byteArray5);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = null;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        java.lang.String str26 = simpleIndexQueryParserTests17.getTestName();
        java.lang.String str27 = simpleIndexQueryParserTests17.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests17.assertDocsSkippingEquals("tests.monster", indexReader29, (int) (byte) 10, postingsEnum31, postingsEnum32, false);
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests17.assertDocsSkippingEquals("<unknown>", indexReader37, (int) (byte) 0, postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "node_s_0", (java.lang.Object) postingsEnum40);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
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
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
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
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        int[] intArray0 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("random", intArray9, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        org.junit.Assert.assertArrayEquals(intArray9, intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray30);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0L, (double) 10L);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        double[] doubleArray3 = new double[] { (-1.0d), 0 };
        double[] doubleArray6 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100.0f);
        double[] doubleArray11 = new double[] { (-1.0d), 0 };
        double[] doubleArray14 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100.0f);
        double[] doubleArray19 = new double[] { (-1.0d), 0 };
        double[] doubleArray22 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray22, (double) (short) 100);
        double[] doubleArray29 = new double[] { (-1.0d), 0 };
        double[] doubleArray32 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100.0f);
        double[] doubleArray37 = new double[] { (-1.0d), 0 };
        double[] doubleArray40 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray40, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray40, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray40, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray40, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray6);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
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
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.lang.Object obj26 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList25, obj26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) cloneableList25);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1L), (-1.0d));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1L, (double) 100, (double) 3);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
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
        simpleIndexQueryParserTests1.testBooleanParsesFilter();
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 1.0f, (double) '4');
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        short[] shortArray2 = new short[] { (short) 0, (short) -1 };
        short[] shortArray6 = new short[] { (byte) -1, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
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
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
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
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray22, (java.lang.Object[]) cloneableArray27);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray39);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray50);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray17, (java.lang.Object[]) cloneableArray27);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray64 = new java.lang.Cloneable[] { locale63 };
        java.util.List<java.lang.Cloneable> cloneableList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray59, (java.lang.Object[]) cloneableArray64);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        short[] shortArray3 = new short[] { (byte) 0, (byte) 100 };
        short[] shortArray8 = new short[] { (byte) 0, (short) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray3, shortArray8);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray3, charSequenceArray4, charSequenceArray5 };
        java.lang.CharSequence[][][] charSequenceArray7 = new java.lang.CharSequence[][][] { charSequenceArray6 };
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.CharSequence[][][] charSequenceArray13 = new java.lang.CharSequence[][][] { charSequenceArray12 };
        java.lang.CharSequence[][][][] charSequenceArray14 = new java.lang.CharSequence[][][][] { charSequenceArray7, charSequenceArray13 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.util.List<java.lang.CharSequence[][][]> charSequenceArrayList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charSequenceArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = null;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("random", indexReader25, terms26, terms27, false);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) charSequenceArray14, (java.lang.Object) simpleIndexQueryParserTests17);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
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
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) 100, (double) (short) 1);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList4, obj5);
        java.lang.Iterable[] iterableArray8 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray9 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray8;
        cloneableIterableArray9[0] = cloneableList4;
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList16, obj17);
        java.lang.Iterable[] iterableArray20 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray21 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray20;
        cloneableIterableArray21[0] = cloneableList16;
        java.lang.Iterable[][] iterableArray25 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray26 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray25;
        cloneableIterableArray26[0] = cloneableIterableArray9;
        cloneableIterableArray26[1] = cloneableIterableArray21;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray26);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray41, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray41);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableIterableArray26, (java.lang.Object[]) cloneableArray35);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        java.lang.Class<?> wildcardClass3 = charArray0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass3, (java.lang.Object) 6);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 10L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        long[] longArray2 = new long[] { (short) 100 };
        long[] longArray8 = new long[] { (short) 0, 10, (byte) -1, 6, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray2, longArray8);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader16, (int) (byte) 100, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests21.ruleChain;
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("<unknown>", indexReader28, fields29, fields30, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) indexReader16, (java.lang.Object) fields29);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.Class<?> wildcardClass7 = simpleIndexQueryParserTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        long[] longArray6 = new long[] { (-1), (byte) -1, 1L, (short) 1, (byte) -1, ' ' };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        long[] longArray5 = new long[] { 100, 5, 3, 4, ' ' };
        long[] longArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 2);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests5.testWildcardQueryBuilder();
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) str7);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray19);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray14, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray45);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray45);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) cloneableArray45);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray3, byteArray9);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        long[] longArray2 = new long[] { (byte) 10, (-1) };
        long[] longArray7 = new long[] { 2, 6, 3, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray2 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, luceneTestCaseArray2);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet4 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray6, simpleIndexQueryParserTestsArray7, simpleIndexQueryParserTestsArray8, simpleIndexQueryParserTestsArray9 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) luceneTestCaseArray2, (java.lang.Object[]) simpleIndexQueryParserTestsArray10);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray8);
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
        java.lang.Class<?> wildcardClass27 = simpleIndexQueryParserTests11.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str29 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = null;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain32;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests28.assertDocsSkippingEquals("tests.nightly", indexReader35, 100, postingsEnum37, postingsEnum38, false);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass42 = simpleIndexQueryParserTests28.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str44 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain47 = null;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain47;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests43.assertDocsSkippingEquals("tests.nightly", indexReader50, 100, postingsEnum52, postingsEnum53, false);
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass57 = simpleIndexQueryParserTests43.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str59 = simpleIndexQueryParserTests58.getTestName();
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests58.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain62 = null;
        simpleIndexQueryParserTests58.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests58.assertDocsSkippingEquals("tests.nightly", indexReader65, 100, postingsEnum67, postingsEnum68, false);
        simpleIndexQueryParserTests58.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass72 = simpleIndexQueryParserTests58.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str74 = simpleIndexQueryParserTests73.getTestName();
        simpleIndexQueryParserTests73.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests73.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain77 = null;
        simpleIndexQueryParserTests73.failureAndSuccessEvents = ruleChain77;
        simpleIndexQueryParserTests73.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass80 = simpleIndexQueryParserTests73.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass82 = simpleIndexQueryParserTests81.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray83 = new java.lang.reflect.GenericDeclaration[] { wildcardClass42, wildcardClass57, wildcardClass72, wildcardClass80, wildcardClass82 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet84 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests11, (java.lang.Object) genericDeclarationArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) genericDeclarationArray83);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray3, intArray10);
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
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray37, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray37, intArray42);
        org.junit.Assert.assertArrayEquals(intArray21, intArray42);
        org.junit.Assert.assertArrayEquals(intArray10, intArray21);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray49, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray49, intArray54);
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str59 = simpleIndexQueryParserTests58.getTestName();
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests58.ensureCleanedUp();
        java.lang.String str62 = simpleIndexQueryParserTests58.getTestName();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        simpleIndexQueryParserTests58.assertFieldsEquals("europarl.lines.txt.gz", indexReader64, fields65, fields66, true);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests58.assertDocsEnumEquals("tests.nightly", postingsEnum70, postingsEnum71, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) intArray21, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray49);
        double[] doubleArray83 = new double[] { 'a', 10.0d };
        double[] doubleArray86 = new double[] { 'a', 10.0d };
        double[] doubleArray89 = new double[] { 'a', 10.0d };
        double[] doubleArray92 = new double[] { 'a', 10.0d };
        double[] doubleArray95 = new double[] { 'a', 10.0d };
        double[][] doubleArray96 = new double[][] { doubleArray83, doubleArray86, doubleArray89, doubleArray92, doubleArray95 };
        java.util.List<double[]> doubleArrayList97 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray96);
        java.util.List<double[]> doubleArrayList98 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) doubleArray96);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        float[] floatArray6 = new float[] {};
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 100L);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray13, (float) (short) 100);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray13, floatArray19, 10.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray6, floatArray19, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) executorServiceArray2, (java.lang.Object) 100);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) 100);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader19, (int) ' ', postingsEnum21, postingsEnum22);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 2, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray5, (java.lang.Object) simpleIndexQueryParserTests7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) cloneableArray5);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
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
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "random", "europarl.lines.txt.gz", "tests.slow", "tests.nightly", "tests.badapples" };
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] { charSequenceArray17 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) charSequenceArray18);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str35 = simpleIndexQueryParserTests34.getTestName();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = null;
        simpleIndexQueryParserTests34.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests31, simpleIndexQueryParserTests34, simpleIndexQueryParserTests40 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet45 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray44);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet46 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray44);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet47 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray44);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableIterableArray22, (java.lang.Object[]) simpleIndexQueryParserTestsArray44);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWildcardQueryBuilder();
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        long[] longArray5 = new long[] { ' ', 0L, (byte) 1, 'a' };
        long[] longArray10 = new long[] { 6, (-1), 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.List<java.lang.String> strList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray7);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList15, obj16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList27, obj28);
        java.lang.Iterable[] iterableArray31 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray32 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray31;
        cloneableIterableArray32[0] = cloneableList15;
        cloneableIterableArray32[1] = cloneableList22;
        cloneableIterableArray32[2] = cloneableList27;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray32);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) strArray7, (java.lang.Object) cloneableIterableArray32);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.weekly", indexReader9, 0, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests2.ruleChain;
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        long[] longArray4 = new long[] { (-1), 3, (byte) 100, (-1) };
        long[] longArray10 = new long[] { 1, (byte) -1, 100L, 10L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1L));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) ' ', (double) 2);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
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
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray19, (java.lang.Object) 0.0f);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray32);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { locale49 };
        java.util.List<java.lang.Cloneable> cloneableList51 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray50);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray56, (java.lang.Object[]) cloneableArray61);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray45);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) cloneableArray45);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str28 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) -1);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) 100L);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray18, (float) (short) 100);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray13, floatArray24, (float) 3);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray2, floatArray13, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) 1);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 6, (double) 3);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        long[] longArray4 = new long[] { (short) 0, 1L, '4' };
        long[] longArray11 = new long[] { (short) -1, (byte) 0, 3, 1L, (byte) 1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray11);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (-1L));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { (byte) -1, 0, 1L, (short) 0, 10L, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
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
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("hi!", postingsEnum27, postingsEnum28, false);
        org.junit.rules.TestRule testRule31 = simpleIndexQueryParserTests22.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.failfast", indexReader33, terms34, terms35, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) testRule21, (java.lang.Object) false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 100L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 100L);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (short) 100);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray10, floatArray16, 10.0f);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray16, (float) (short) 10);
        float[] floatArray29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray29, 0.0f);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
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
        simpleIndexQueryParserTests4.testMatchAllBuilder();
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray19 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures18 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet20 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray15, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray19);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
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
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 10, (long) (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum15, postingsEnum16);
    }
}

