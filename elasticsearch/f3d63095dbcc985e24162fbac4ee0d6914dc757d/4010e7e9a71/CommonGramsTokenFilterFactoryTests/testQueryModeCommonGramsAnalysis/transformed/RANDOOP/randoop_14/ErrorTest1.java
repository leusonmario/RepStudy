import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        int[] intArray2 = new int[] { 2 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray4);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) charSequenceArray63);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray63);
        java.lang.Object obj67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) charSequenceArray63, obj67);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) ' ');
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        long[] longArray6 = new long[] { (byte) 1, (-1L), (byte) 10, 100L, 0 };
        long[] longArray9 = new long[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray9);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.Set<java.util.Locale> localeSet27 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) localeArray25);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, 100.0d);
        double[] doubleArray22 = new double[] { ' ', (-1) };
        double[] doubleArray25 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray12, doubleArray25, (double) (byte) 10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("", indexReader29, terms30, terms31, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray11, (java.lang.Object) terms31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling36 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests43.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule46);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray40, (java.lang.Object) testRule46);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray37, (java.lang.Object[]) throttlingArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) throttlingArray37);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        char[] charArray6 = new char[] { ' ', '#', '#', ' ', '4' };
        char[] charArray13 = new char[] { '#', 'a', ' ', 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray13);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        float[] floatArray3 = new float[] { (byte) 0, (short) 10, (short) -1 };
        float[] floatArray5 = new float[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) (short) 1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, 0, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("tests.weekly", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("tests.failfast", indexReader21, (int) '4', postingsEnum23, postingsEnum24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) '4');
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        int[] intArray7 = new int[] { 10, (byte) -1, (byte) 10, (byte) 100, 1, 0 };
        int[] intArray11 = new int[] { (byte) 10, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray7, intArray11);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader10, fields11, fields12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, (-1), 100, 100 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray18, (java.lang.Object) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray64);
        java.lang.Class<?> wildcardClass83 = charSequenceArray64.getClass();
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray84 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet85 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray64, (java.lang.Object) queryCachingPolicyArray84);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        char[] charArray6 = new char[] { '#', '#', ' ', '4', '4' };
        char[] charArray10 = new char[] { 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray6, charArray10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0.0d, (double) 'a', (double) 100);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests1.ruleChain;
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray20, byteArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule16, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "<unknown>");
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("tests.awaitsfix", postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("<unknown>", indexReader40, terms41, terms42, true);
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 0, (float) (-1L), 0.0f);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        long[] longArray6 = new long[] { (byte) -1, (byte) 100, 'a', (-1L), 0, (short) 10 };
        long[] longArray8 = new long[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("tests.weekly", indexReader25, (int) '#', postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("enwiki.random.lines.txt", indexReader31, fields32, fields33, true);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.monster", postingsEnum41, postingsEnum42, false);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests16.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 0.0f, 0.0f);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        char[] charArray4 = new char[] { '#', 'a', ' ', '#' };
        char[] charArray6 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) locale1);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("", shortArray10, shortArray12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray12, shortArray17);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray27, shortArray29);
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray27, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray27);
        org.junit.Assert.assertArrayEquals("random", shortArray5, shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) shortArray12);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, (short) 0, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray6);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        long[] longArray3 = new long[] { (short) -1, (-1), 2 };
        long[] longArray5 = new long[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        float[] floatArray4 = new float[] { 0, 10L, 0L };
        float[] floatArray9 = new float[] { 100, ' ', 0L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray4, floatArray9, (float) '4');
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { (byte) 100, 2, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray4, shortArray15);
        java.lang.Class<?> wildcardClass20 = shortArray4.getClass();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray62);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests67.setUp();
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray74, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests67, (java.lang.Object) charSequenceArray74);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray4, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        char[] charArray4 = new char[] { '4', '#', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, (long) ' ');
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule7);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray1, (java.lang.Object) testRule7);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray1);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) charSequenceArray23);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        char[] charArray3 = new char[] { '#', '4', 'a' };
        char[] charArray9 = new char[] { '#', ' ', '#', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) (short) 100, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        float[] floatArray5 = new float[] { 1L, 10, '4', '#', (short) 10 };
        float[] floatArray9 = new float[] { 0L, '4', 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) (short) 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        long[] longArray6 = new long[] { '4', (-1L), '#', '#', 1 };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray7);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (-1.0f), (float) (short) 100, 100.0f);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule4);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale13, locale15, locale17 };
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray18);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule11, (java.lang.Object) localeArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule35);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, 0, postingsEnum43, postingsEnum44);
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("tests.weekly", indexReader48, (int) '#', postingsEnum50, postingsEnum51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields55, fields56, true);
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests39.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.monster", postingsEnum66, postingsEnum67, true);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests72.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader74, 0, postingsEnum76, postingsEnum77);
        commonGramsTokenFilterFactoryTests72.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests72.assertPositionsSkippingEquals("tests.weekly", indexReader81, (int) '#', postingsEnum83, postingsEnum84);
        org.junit.rules.TestRule testRule86 = commonGramsTokenFilterFactoryTests72.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) testRule86);
        org.junit.rules.TestRule[] testRuleArray88 = new org.junit.rules.TestRule[] { testRule4, testRule11, testRule30, testRule35, testRule70, testRule86 };
        org.junit.rules.TestRule[][] testRuleArray89 = new org.junit.rules.TestRule[][] { testRuleArray88 };
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet90 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray89);
        short[][] shortArray91 = new short[][] {};
        java.util.Set<short[]> shortArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleArray89, (java.lang.Object[]) shortArray91);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, 0, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.weekly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader23, (int) (short) -1, postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.failfast", indexReader30, terms31, terms32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.awaitsfix", indexReader36, 0, postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.maxfailures", indexReader43, fields44, fields45, false);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals("", shortArray55, shortArray57);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray57, shortArray62);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray72, shortArray74);
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray72, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray72);
        org.junit.Assert.assertArrayEquals("random", shortArray50, shortArray57);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) fields45, (java.lang.Object) shortArray50);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) fields45, (java.lang.Object) shortArray83);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        char[] charArray1 = new char[] {};
        char[] charArray7 = new char[] { '#', '#', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 100);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        float[] floatArray5 = new float[] { (short) 0, 10L, ' ', 10L };
        float[] floatArray8 = new float[] { 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray5, floatArray8, (float) (byte) 1);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray8 = new int[] { 'a', 'a', (byte) 10, '4', (short) -1, 2 };
        int[] intArray15 = new int[] { (byte) -1, 0, 2, (short) 0, (short) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8, intArray15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        int[] intArray2 = new int[] { (short) 0, (byte) 1 };
        int[] intArray5 = new int[] { (short) 100, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        java.lang.Class<?> wildcardClass9 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass9, (java.lang.Object) false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        long[] longArray5 = new long[] { (short) 10, (short) 100, 10, '4' };
        long[] longArray8 = new long[] { 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        char[] charArray5 = new char[] { ' ', '#', ' ', '#', '4' };
        char[] charArray12 = new char[] { '#', '4', 'a', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        java.lang.Object[] objArray1 = null;
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray20, (java.lang.Object) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet82 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray81);
        java.lang.CharSequence[] charSequenceArray89 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet90 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray89);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) charSequenceArray20);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 100.0d);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) builder6, obj7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, 0, postingsEnum13, postingsEnum14);
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("tests.weekly", indexReader18, (int) '#', postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, 0, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader30, (int) (short) -1, postingsEnum32, postingsEnum33, true);
        commonGramsTokenFilterFactoryTests9.setUp();
        commonGramsTokenFilterFactoryTests9.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("hi!", indexReader40, (int) (short) 0, postingsEnum42, postingsEnum43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("", indexReader46, 100, postingsEnum48, postingsEnum49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj7, (java.lang.Object) indexReader46);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        char[] charArray3 = new char[] { 'a', '4' };
        char[] charArray7 = new char[] { ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        short[] shortArray21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray14, shortArray21);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) ' ', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, 0, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.weekly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader17, fields18, fields19, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        float[] floatArray3 = new float[] { 100L, 0L, 2 };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (-1L));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        float[] floatArray7 = new float[] { 1.0f, (short) 100, 0, 100L, (byte) 0, ' ' };
        float[] floatArray11 = new float[] { 10, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray7, floatArray11, (float) (byte) 100);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 'a');
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader13, (int) (byte) 1, postingsEnum15, postingsEnum16);
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray39);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy43 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass44 = queryCachingPolicy43.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy45 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass46 = queryCachingPolicy45.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass44;
        wildcardClassArray49[1] = wildcardClass46;
        java.util.Set<java.lang.Class<?>> wildcardClassSet54 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray39, (java.lang.Object) wildcardClassSet54);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray3, charArray4);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 100);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        long[] longArray6 = new long[] { 10, (byte) 1, 1, 0L, (byte) 100, 'a' };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (long) (short) 0, 0L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        int[] intArray2 = new int[] { '4', ' ' };
        int[] intArray7 = new int[] { (byte) 100, (-1), (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray4 = new long[] { 10L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        long[] longArray4 = new long[] { 10L, 0, (byte) 10, 1 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 1.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) '4');
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10.0d, (-1.0d), (double) 10L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        float[] floatArray3 = new float[] { 1L, 0L };
        float[] floatArray8 = new float[] { (short) 100, 10.0f, 1L, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray3, floatArray8, 1.0f);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.rules.TestRule[] testRuleArray37 = new org.junit.rules.TestRule[] { testRule9, testRule18, testRule27, testRule36 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        java.lang.Class<?> wildcardClass42 = throttlingArray40.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) testRuleArray37, (java.lang.Object) wildcardClass42);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArraySet1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        long[] longArray3 = new long[] { ' ', '#', (-1) };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1L, (double) 10L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        long[] longArray1 = new long[] { (short) 10 };
        long[] longArray8 = new long[] { 1, 100, (short) 10, 10L, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray11, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray21);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray33, byteArray37);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray37, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray21, byteArray37);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray57, byteArray61);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray67, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray61, byteArray67);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray78, byteArray79);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray82, byteArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray79, byteArray83);
        byte[] byteArray88 = new byte[] {};
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray88, byteArray89);
        byte[] byteArray92 = new byte[] {};
        byte[] byteArray93 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray92, byteArray93);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray89, byteArray92);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray83, byteArray89);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray67, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray5, byteArray83);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        double[] doubleArray5 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[] doubleArray11 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray11 };
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArraySet13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, 0, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader31, (int) (short) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader37, 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests43.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum39, (java.lang.Object) builder44);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 100L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        int[] intArray5 = new int[] { (short) 100, '#', (short) -1, (short) 10 };
        int[] intArray11 = new int[] { 2, '#', (short) 100, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        float[] floatArray3 = new float[] { (byte) 100, (short) 0 };
        float[] floatArray7 = new float[] { 10.0f, (short) 1, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray3, floatArray7, (float) 2);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet11 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray44);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) shortArray1, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        long[] longArray6 = new long[] { 100L, 1L, 0L, 2, (byte) 10, (-1) };
        long[] longArray13 = new long[] { ' ', 2, 10L, 1, '4', 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray48);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) strArray48);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.monster", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10L, (double) (short) -1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray8 = new int[] { 2, (short) 1, '#', 100, (byte) 0, 0 };
        int[] intArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8, intArray9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        char[] charArray3 = new char[] { '#', '4' };
        char[] charArray8 = new char[] { '#', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray3, charArray8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        float[] floatArray3 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray7 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100L);
        float[] floatArray13 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray17 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray17, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray17, 0.0f);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule12);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray6, (java.lang.Object) testRule12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) throttlingArray3);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        long[] longArray6 = new long[] { 'a', 0, ' ', (short) -1, (byte) 1, 1L };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) -1);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        long[] longArray1 = new long[] { 1 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) -1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("tests.weekly", indexReader25, (int) '#', postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader37, (int) (short) -1, postingsEnum39, postingsEnum40, true);
        commonGramsTokenFilterFactoryTests16.setUp();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray55);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures60 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures61 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures60);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures62 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures63 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures62);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures64 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures64);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray66 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures60, testRuleIgnoreAfterMaxFailures63, testRuleIgnoreAfterMaxFailures65 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet67 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray66);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray66, (java.lang.Object) charSequenceSet73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray66);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        long[] longArray1 = new long[] { 2 };
        long[] longArray4 = new long[] { (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { (byte) 10, 2, (short) 1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        char[] charArray4 = new char[] { ' ', ' ', '#' };
        char[] charArray8 = new char[] { '#', 'a', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray8);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        float[] floatArray3 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray7 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100L);
        float[] floatArray10 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray10, (float) 'a');
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) (short) -1, obj2);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        java.lang.Object[] objArray0 = null;
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) charSequenceArray57);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        float[] floatArray7 = new float[] { 1, '#', 'a', (short) 10, 10, (short) 0 };
        float[] floatArray11 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray15 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray15, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray15, 1.0f);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        long[] longArray4 = new long[] { 0L, (byte) 1, 'a' };
        long[] longArray11 = new long[] { (byte) 10, (short) 1, ' ', 0L, (-1L), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        long[] longArray4 = new long[] { (byte) 1, 0L, (byte) 0 };
        long[] longArray8 = new long[] { (short) 0, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray4, longArray8);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) (byte) 10, (java.lang.Object) byteArray9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) (byte) 100, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray9 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray5, (float) '#');
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader14, terms15, terms16, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { (byte) 100, 2, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) -1, (long) (short) 1);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) 100);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("", shortArray12, shortArray14);
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray18);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray8);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray20 = new double[] { ' ', (-1) };
        double[] doubleArray23 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray20, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray20, (double) 1);
        double[] doubleArray32 = new double[] { ' ', (-1) };
        double[] doubleArray35 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray35, (double) 100);
        double[] doubleArray45 = new double[] { ' ', (-1) };
        double[] doubleArray48 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray48, (double) 100L);
        double[] doubleArray54 = new double[] { ' ', (-1) };
        double[] doubleArray57 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray57, (double) 100L);
        double[] doubleArray62 = new double[] { ' ', (-1) };
        double[] doubleArray65 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray65, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray62, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray62, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray62);
        double[] doubleArray75 = new double[] { ' ', (-1) };
        double[] doubleArray78 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray78, (double) 100L);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray62, doubleArray75, (double) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", doubleArray35, doubleArray75, (double) (short) 1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        long[] longArray3 = new long[] { (short) 10, (short) 1 };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 10, 0.0f, 1.0f);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 'a', (float) '4', (float) '#');
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray35);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) localeArray44);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 0, (double) '#', (double) (short) 100);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (-1.0d), (double) '#', (-1.0d));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", objArray1, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 1, (double) (-1), (double) ' ');
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        float[] floatArray3 = new float[] { 10, (byte) 100, (byte) 1 };
        float[] floatArray7 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray11 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray11, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray11, (float) 0L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.monster", postingsEnum28, postingsEnum29, true);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) ' ');
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) 2, (float) (byte) 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule3);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (-1.0f), (float) 1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        int[] intArray2 = new int[] { 100 };
        int[] intArray7 = new int[] { (short) 100, 2, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray7);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray3);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray8 = new char[] { ' ', '#', '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        int[] intArray4 = new int[] { (byte) -1, 1, (byte) 0 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        long[] longArray5 = new long[] { 10, 1L, 10, (short) 100, (short) 10 };
        long[] longArray11 = new long[] { 1, (byte) 1, '4', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        long[] longArray1 = new long[] { ' ' };
        long[] longArray5 = new long[] { 100L, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        float[] floatArray3 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray7 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100L);
        float[] floatArray13 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray17 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray17, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, 0.0f);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        long[] longArray3 = new long[] { (short) 100, (byte) 1 };
        long[] longArray10 = new long[] { (byte) -1, 0, 0L, 1L, 100L, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { '4', 10, (-1L), 0, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) ' ');
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 10.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray18, (java.lang.Object) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling84 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray85);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling87 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray88 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling87 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray88);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests91 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests91.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests91);
        org.junit.rules.TestRule testRule94 = commonGramsTokenFilterFactoryTests91.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule94);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray88, (java.lang.Object) testRule94);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray85, (java.lang.Object[]) throttlingArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) throttlingArray88);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray7, (java.lang.Object[]) charSequenceArray22);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        long[] longArray3 = new long[] { (byte) 10, (short) 10 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray4);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("tests.weekly", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("enwiki.random.lines.txt", indexReader40, fields41, fields42, true);
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests25.tearDown();
        commonGramsTokenFilterFactoryTests25.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        long[] longArray5 = new long[] { '4', (short) -1, (short) 10, 1L, (byte) 1 };
        long[] longArray7 = new long[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        java.lang.Object obj1 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, 0, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.weekly", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("enwiki.random.lines.txt", indexReader19, fields20, fields21, true);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj1, (java.lang.Object) builder24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, 0, postingsEnum30, postingsEnum31);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.weekly", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("enwiki.random.lines.txt", indexReader41, fields42, fields43, true);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("", postingsEnum51, postingsEnum52, true);
        java.lang.String str55 = commonGramsTokenFilterFactoryTests26.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocsAndPositionsEnumEquals("random", postingsEnum57, postingsEnum58);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 1.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 100, (double) (byte) 0, (double) 'a');
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) (byte) -1, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests22.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests22.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray18, (java.lang.Object) str28);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray30 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet31 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) queryCachingPolicyArray30);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) -1, (long) (short) 10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, (byte) 10, (short) 0, 'a', 1 };
        int[] intArray13 = new int[] { (short) 100, (short) 100, (byte) 0, 0, (short) 0, ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { '#', 'a', ' ', 2, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 100, 0L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray6 = new char[] { ' ', '#', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray18, 0.0f);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (long) (short) 0, (long) 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        int[] intArray3 = new int[] { (short) 0, 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray4);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray43);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray53);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray70, (java.lang.Object[]) charSequenceArray76);
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet85 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray84);
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet91 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray90);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray84, (java.lang.Object[]) charSequenceArray90);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray76, (java.lang.Object[]) charSequenceArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray76);
        java.lang.Object obj95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray22, obj95);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 'a', (double) '4');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1L), (double) '4', (double) ' ');
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        int[] intArray5 = new int[] { (short) 10, 'a', (byte) 1, 1, (byte) 0 };
        int[] intArray11 = new int[] { (short) 10, 'a', (byte) -1, 'a', 2 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        int[] intArray0 = new int[] {};
        int[] intArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) 100);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        char[] charArray1 = null;
        char[] charArray5 = new char[] { '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray1, charArray5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader22, (int) (short) -1, postingsEnum24, postingsEnum25, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) '#');
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests38.ruleChain;
        org.junit.rules.TestRule[] testRuleArray47 = new org.junit.rules.TestRule[] { testRule19, testRule28, testRule37, testRule46 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet48 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray47);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) testRuleArray47);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { (byte) 100, '#', (short) -1, 10 };
        int[] intArray12 = new int[] { '4', 2, 10, (short) 10, (short) -1 };
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray17);
        int[] intArray23 = new int[] { 1, 10, 2, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray12, strArray17, intArray23, (java.lang.Integer) 2);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule4);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule4);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray2, charArray4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray8);
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray17);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) shortArray6);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray32, shortArray37);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("", shortArray47, shortArray49);
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray47, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray47);
        org.junit.Assert.assertArrayEquals("random", shortArray25, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        commonGramsTokenFilterFactoryTests58.assertTermsEquals("", indexReader60, terms61, terms62, false);
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsEnumEquals("tests.weekly", postingsEnum66, postingsEnum67, false);
        java.lang.String str70 = commonGramsTokenFilterFactoryTests58.getTestName();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("tests.awaitsfix", indexReader72, 10, postingsEnum74, postingsEnum75, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray25, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray40);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) localeArray50);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, (int) '#', postingsEnum9, postingsEnum10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        char[] charArray1 = new char[] { '4' };
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 'a');
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray5 = new long[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 2, 10L);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.rules.TestRule[] testRuleArray38 = new org.junit.rules.TestRule[] { testRule10, testRule19, testRule28, testRule37 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet39 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray38);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleSet39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, (int) (byte) -1, postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("random", indexReader50, fields51, fields52, false);
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests41.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) testRuleSet39, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray14, 1.0f);
        float[] floatArray24 = new float[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray14, floatArray24, (float) 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray14, 1.0f);
        float[] floatArray27 = new float[] { (short) 0, 1L, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray27, (float) (short) 10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        int[] intArray3 = new int[] { 2, ' ' };
        int[] intArray8 = new int[] { 2, (short) 1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray8);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (-1L), (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass14 = queryCachingPolicy13.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass16 = queryCachingPolicy15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass14;
        wildcardClassArray19[1] = wildcardClass16;
        java.util.Set<java.lang.Class<?>> wildcardClassSet24 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("tests.weekly", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClassSet24, (java.lang.Object) testRule39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1L), (java.lang.Object) wildcardClassSet24);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        char[] charArray3 = new char[] { '#', '#', '4' };
        char[] charArray9 = new char[] { ' ', '#', ' ', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 0.0d, (-1.0d));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (-1), numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) 0, (long) (short) 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 100, 10L);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) -1, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.setUp();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet46 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray45, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) charSequenceArray45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader58, (int) (byte) -1, postingsEnum60, postingsEnum61);
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray66 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests16, commonGramsTokenFilterFactoryTests26, commonGramsTokenFilterFactoryTests38, commonGramsTokenFilterFactoryTests55 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet67 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray66);
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet73 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray66, (java.lang.Object[]) strArray72);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '4', (double) 'a', (double) 100.0f);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = null;
        int[] intArray7 = new int[] { 0, (-1), (short) -1, 1 };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "tests.slow" };
        int[] intArray18 = new int[] { (-1), (byte) -1, (byte) 0, (short) 1, 'a', 'a' };
        int[] intArray20 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray7, strArray11, intArray18, intArray20, (java.lang.Integer) 2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, ' ', 'a', (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        char[] charArray3 = new char[] { 'a', 'a', ' ' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals("", shortArray19, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray21, shortArray26);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals("", shortArray36, shortArray38);
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray36, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray36);
        org.junit.Assert.assertArrayEquals("random", shortArray14, shortArray21);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray21, shortArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) builder10, (java.lang.Object) shortArray46);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, 0, postingsEnum32, postingsEnum33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 100.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (short) 1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, (long) (byte) 1);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 2, (long) '4');
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 100, (long) (short) 10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        int[] intArray4 = new int[] { (byte) 0, 100, (byte) 100, (byte) 1 };
        int[] intArray8 = new int[] { 'a', (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, 0, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray7);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray15, byteArray19);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray19, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray25);
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray25, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray40, byteArray44);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray51, byteArray54);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray61, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray62, byteArray66);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray71, byteArray72);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray72, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray66, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray72);
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray72, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray40, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray72);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 1, (long) (short) -1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray2 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray1);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet46 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray45, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray22, (java.lang.Object) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet78 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray77);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray77, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray83);
        java.lang.CharSequence[] charSequenceArray91 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet92 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray91);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) collectionArray1, (java.lang.Object[]) charSequenceArray91);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray3 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray2);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet11 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray23, (java.lang.Object) charSequenceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) collectionArray2, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        char[] charArray5 = new char[] { 'a', ' ', '#', ' ' };
        char[] charArray9 = new char[] { '#', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0d, (double) 'a');
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray18, (java.lang.Object) charSequenceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray18);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { ' ', '#', 10, 1 };
        int[] intArray12 = new int[] { 2, 2, ' ', 100, (short) 10 };
        java.lang.String[] strArray19 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.slow", "tests.badapples", "random", "tests.monster", "" };
        int[] intArray22 = new int[] { 'a', '4' };
        int[] intArray25 = new int[] { 1, (byte) 0 };
        boolean[] booleanArray32 = new boolean[] { false, false, false, true, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray12, strArray19, intArray22, intArray25, (java.lang.Integer) 100, booleanArray32, true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 1, (double) 10L, (double) 1L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        int[] intArray6 = new int[] { (byte) 100, 10, (-1), (byte) -1, (byte) 100, (short) 10 };
        int[] intArray9 = new int[] { (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader14, terms15, terms16, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        char[] charArray4 = new char[] { '#', '4', ' ' };
        char[] charArray7 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray7);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, 100.0d);
        double[] doubleArray22 = new double[] { ' ', (-1) };
        double[] doubleArray25 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        double[] doubleArray31 = new double[] { ' ', (-1) };
        double[] doubleArray34 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        double[] doubleArray39 = new double[] { ' ', (-1) };
        double[] doubleArray42 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray39, (double) 1);
        double[] doubleArray51 = new double[] { ' ', (-1) };
        double[] doubleArray54 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray54, (double) 100);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray12, doubleArray22, (double) 2);
        double[] doubleArray63 = new double[] { ' ', (-1) };
        double[] doubleArray66 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray66, (double) 100L);
        double[] doubleArray72 = new double[] { ' ', (-1) };
        double[] doubleArray75 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100L);
        double[] doubleArray80 = new double[] { ' ', (-1) };
        double[] doubleArray83 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray83, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray75, doubleArray80, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray75, (double) (short) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray75, (double) (-1.0f));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray13);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray25, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests38.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray30, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray8, (float) ' ');
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray9);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Object obj22 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj22, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("tests.weekly", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("enwiki.random.lines.txt", indexReader40, fields41, fields42, true);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj22, (java.lang.Object) builder45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests47.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader49, 0, postingsEnum51, postingsEnum52);
        commonGramsTokenFilterFactoryTests47.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests47.assertPositionsSkippingEquals("tests.weekly", indexReader56, (int) '#', postingsEnum58, postingsEnum59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        commonGramsTokenFilterFactoryTests47.assertFieldsEquals("enwiki.random.lines.txt", indexReader62, fields63, fields64, true);
        commonGramsTokenFilterFactoryTests47.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests47.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests47.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule20, (java.lang.Object) "random");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 100);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) '#', (double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests6.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests6);
        commonGramsTokenFilterFactoryTests6.tearDown();
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, 1L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray12);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (byte) 100, 1.0d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray6 = new int[] { (short) -1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100, (double) ' ');
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        int[] intArray6 = new int[] { (short) 10, (short) 1, 'a', (short) 0, (byte) 10, (short) 100 };
        int[] intArray13 = new int[] { (short) 0, (byte) 1, 0, (short) 0, 10, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 100L, (float) (short) 10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) ' ', (-1.0f));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray3);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray15, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray33);
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray40);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals("", shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals("hi!", shortArray40, shortArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray46);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 10, (float) 100, (float) '#');
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 2, 0L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray1);
        short[] shortArray9 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray9);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("", shortArray10, shortArray12);
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray10, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("", indexReader36, terms37, terms38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.nightly", indexReader42, (int) (byte) 10, postingsEnum44, postingsEnum45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray1, (java.lang.Object) postingsEnum44);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader20, 10, postingsEnum22, postingsEnum23, false);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests28.tearDown();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) charSequenceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 100.0d, (double) 10, (double) (byte) 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader5, (int) (byte) 1, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 100, (long) 2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        byte[] byteArray0 = null;
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray10);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray16);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray32);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray52, byteArray56);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray61, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray56, byteArray62);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray73, byteArray74);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray74, byteArray78);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray83, byteArray84);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray87, byteArray88);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray84, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray78, byteArray84);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray62, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray62);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        char[] charArray3 = new char[] { ' ', '4', '#' };
        char[] charArray7 = new char[] { 'a', '#', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) '#');
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray9 = new char[] { '#', 'a', '#', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray9);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, 0, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader21, (int) (short) -1, postingsEnum23, postingsEnum24, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (byte) -1, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.badapples", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', 100L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100, 1.0d, (double) 0.0f);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) ' ', (double) (-1L));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1.0f, (double) '4', (double) (byte) 100);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        char[] charArray5 = new char[] { ' ', ' ', 'a', '#', ' ' };
        char[] charArray10 = new char[] { 'a', '#', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 2, (double) (-1.0f));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        char[] charArray5 = new char[] { 'a', ' ', ' ', 'a' };
        char[] charArray7 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray14, 1.0f);
        float[] floatArray27 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray31 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) 100L);
        float[] floatArray37 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray41 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray41, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray37, 1.0f);
        float[] floatArray49 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray53 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray53, (float) 100L);
        float[] floatArray59 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray63 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray59, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray27, floatArray49, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray27, (float) 1L);
        float[] floatArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray27, floatArray72, (float) (-1L));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray10);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray16);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) byteArray32);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) ' ');
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] { (short) 100, 1, (short) 10 };
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray11);
        int[] intArray17 = new int[] { (short) -1, (short) 0, 'a', 2 };
        int[] intArray21 = new int[] { (byte) -1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray6, strArray11, intArray17, intArray21, (java.lang.Integer) 1);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) 'a');
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 2, (-1L));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray20 = new double[] { ' ', (-1) };
        double[] doubleArray23 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray20, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray15, (double) (short) 10);
        double[] doubleArray32 = new double[] { ' ', (-1) };
        double[] doubleArray35 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        double[] doubleArray41 = new double[] { ' ', (-1) };
        double[] doubleArray44 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 100L);
        double[] doubleArray49 = new double[] { ' ', (-1) };
        double[] doubleArray52 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray52, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray44, doubleArray49, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray49, (double) 1);
        double[] doubleArray61 = new double[] { ' ', (-1) };
        double[] doubleArray64 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray64, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray64, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) doubleArray64);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader10, fields11, fields12, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (short) 10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader16, (-1), postingsEnum18, postingsEnum19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) postingsEnum19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader11, fields12, fields13, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) testRule18);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 1L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.badapples", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        char[] charArray6 = new char[] { 'a', ' ', '#', ' ', ' ', '4' };
        char[] charArray10 = new char[] { 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray3);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray15, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray33);
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray40);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals("", shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals("hi!", shortArray40, shortArray46);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("", shortArray56, shortArray58);
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray56, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals("", shortArray66, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray66);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray46, shortArray66);
        short[] shortArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray74);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) '#', (double) 1L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray10);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray16);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray32);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray52, byteArray56);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray61, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray56, byteArray62);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray73, byteArray74);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray74, byteArray78);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray83, byteArray84);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray87, byteArray88);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray84, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray78, byteArray84);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray62, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) byteArray62);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1L), (double) (byte) 100, (double) 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        char[] charArray6 = new char[] { '#', ' ', '4', ' ', '4' };
        char[] charArray12 = new char[] { 'a', '#', '#', '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, 100.0d, (double) 100L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        long[] longArray4 = new long[] { (short) 10, '#', 1L };
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray9, longArray12);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray16, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray19, longArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray9, longArray19);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray29, longArray32);
        org.junit.Assert.assertArrayEquals("", longArray19, longArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray4, longArray19);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) ' ');
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 2, (long) (short) 1);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        java.lang.Object obj1 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, 0, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.weekly", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("enwiki.random.lines.txt", indexReader19, fields20, fields21, true);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj1, (java.lang.Object) builder24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, 0, postingsEnum30, postingsEnum31);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.weekly", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("enwiki.random.lines.txt", indexReader41, fields42, fields43, true);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("", postingsEnum51, postingsEnum52, true);
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum58, postingsEnum59);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0f, (float) 100, (float) 2);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        char[] charArray3 = new char[] { '#', '#', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 1, (long) ' ');
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.failfast", indexReader10, 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 10);
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray30, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals("", shortArray46, shortArray48);
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray46, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray46, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray36, shortArray46);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals("", shortArray70, shortArray72);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray77);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray72, shortArray77);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals("", shortArray87, shortArray89);
        short[] shortArray93 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray87, shortArray93);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray87);
        org.junit.Assert.assertArrayEquals("random", shortArray65, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) testRule24, (java.lang.Object) shortArray46);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, 100, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        char[] charArray4 = new char[] { 'a', ' ', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray14, 1.0f);
        float[] floatArray26 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray30 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray30, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray14, floatArray30, (float) (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.rules.TestRule[] testRuleArray36 = new org.junit.rules.TestRule[] { testRule8, testRule17, testRule26, testRule35 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet37 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray86);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray80, (java.lang.Object[]) charSequenceArray86);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray86);
        java.lang.CharSequence[] charSequenceArray94 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet95 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray94);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray94);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) charSequenceArray94);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleArray36, (java.lang.Object[]) charSequenceArray56);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 0 };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        int[] intArray9 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3, intArray5, strArray7, intArray9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray26);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray26, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray31);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray41);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals("", shortArray51, shortArray53);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray53, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray58);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("", shortArray69, shortArray71);
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray69, shortArray75);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray78);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals("", shortArray84, shortArray86);
        org.junit.Assert.assertArrayEquals("hi!", shortArray78, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray78);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests92 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder93 = commonGramsTokenFilterFactoryTests92.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests92.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests92, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests92.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) shortArray78, (java.lang.Object) commonGramsTokenFilterFactoryTests92);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, 0L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] { localeArray0 };
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests4.ruleChain;
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule7, (java.lang.Object) localeArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray1, (java.lang.Object[]) localeArray14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (-1L), (float) 100L, 0.0f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray11);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray19);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray30, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray48);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray58, shortArray60);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray60, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray65);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals("", shortArray76, shortArray78);
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray76, shortArray82);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray85);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray36, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { 10, 10, (short) -1, (byte) -1, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        char[] charArray3 = new char[] { '4', ' ' };
        char[] charArray5 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, 0, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("tests.weekly", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, 0, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader26, (int) (short) -1, postingsEnum28, postingsEnum29, true);
        commonGramsTokenFilterFactoryTests5.setUp();
        commonGramsTokenFilterFactoryTests5.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("hi!", indexReader36, (int) (short) 0, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, (int) (byte) -1, postingsEnum46, postingsEnum47);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule50;
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum38, (java.lang.Object) testRule50);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttlingArray3, (java.lang.Object) postingsEnum38);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 100, (float) 0L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader22, (int) (short) -1, postingsEnum24, postingsEnum25, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Object obj30 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, (int) (byte) -1, postingsEnum36, postingsEnum37);
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("tests.weekly", indexReader41, (int) (byte) 1, postingsEnum43, postingsEnum44);
        org.junit.Assert.assertNotEquals(obj30, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) builder29, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (byte) 100, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, (short) 0, '4', (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader13, 1, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("enwiki.random.lines.txt", 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 2);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        java.lang.Object[] objArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray62, objArray67);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, 0, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("tests.weekly", indexReader29, (int) '#', postingsEnum31, postingsEnum32);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRule34);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) str3);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) (byte) 100, (double) 100);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        double[] doubleArray2 = new double[] { ' ', (-1) };
        double[] doubleArray5 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray11 = new double[] { ' ', (-1) };
        double[] doubleArray14 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        double[] doubleArray19 = new double[] { ' ', (-1) };
        double[] doubleArray22 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray14, doubleArray19, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray19, (double) 1);
        double[] doubleArray31 = new double[] { ' ', (-1) };
        double[] doubleArray34 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        double[] doubleArray40 = new double[] { ' ', (-1) };
        double[] doubleArray43 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray43, (double) 100L);
        double[] doubleArray48 = new double[] { ' ', (-1) };
        double[] doubleArray51 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray51, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray43, doubleArray48, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray48, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray48, (double) (-1));
        java.lang.Object obj60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray48, obj60);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        int[] intArray4 = new int[] { 100, '#', 10, (byte) 10 };
        int[] intArray9 = new int[] { 100, (short) 1, 2, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule12);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray6, (java.lang.Object) testRule12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray6);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceSet21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) throttlingArray3, (java.lang.Object) charSequenceSet21);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, 0, (byte) -1, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, 10.0d, 1.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("hi!", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, 2, postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader22, (int) (short) -1, postingsEnum24, postingsEnum25, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.failfast", 100, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray11, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray4, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray24, longArray27);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray34);
        org.junit.Assert.assertArrayEquals(longArray24, longArray34);
        org.junit.Assert.assertArrayEquals(longArray4, longArray24);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray42, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray49, longArray50);
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray49, longArray52);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray55, longArray56);
        org.junit.Assert.assertArrayEquals(longArray52, longArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray42, longArray52);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray63);
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray62, longArray65);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray69, longArray72);
        org.junit.Assert.assertArrayEquals(longArray62, longArray72);
        org.junit.Assert.assertArrayEquals(longArray42, longArray62);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray78, longArray79);
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray78, longArray81);
        long[] longArray84 = new long[] {};
        long[] longArray85 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray84, longArray85);
        org.junit.Assert.assertArrayEquals(longArray81, longArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray62, longArray81);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray62);
        long[] longArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray90);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (long) (byte) 100, (long) 100);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, 10.0d, 100.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) 10, 0.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) -1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) -1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, 0, postingsEnum11, postingsEnum12);
        commonGramsTokenFilterFactoryTests7.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("tests.weekly", indexReader16, (int) '#', postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, 0, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("", indexReader28, (int) (short) -1, postingsEnum30, postingsEnum31, true);
        commonGramsTokenFilterFactoryTests7.setUp();
        commonGramsTokenFilterFactoryTests7.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder36);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet1 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("<unknown>", indexReader16, terms17, terms18, true);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicySet1, (java.lang.Object) builder25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray30, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("", shortArray50, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray52, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        commonGramsTokenFilterFactoryTests65.assertTermsEquals("", indexReader67, terms68, terms69, false);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests65.assertDocsEnumEquals("tests.weekly", postingsEnum73, postingsEnum74, false);
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests65.assertDocsEnumEquals("tests.maxfailures", postingsEnum78, postingsEnum79, true);
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray57, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder25, (java.lang.Object) shortArray57);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        char[] charArray6 = new char[] { '4', ' ', '4', ' ', '#', 'a' };
        char[] charArray8 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) -1, (double) (short) 100, (double) 100);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        char[] charArray5 = new char[] { '#', '#', 'a', ' ' };
        char[] charArray7 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray5, charArray7);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 10, (long) (byte) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader10, fields11, fields12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, 0, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.weekly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader17, fields18, fields19, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader28, (int) (byte) 0, postingsEnum30, postingsEnum31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "random");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (-1.0f));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        int[] intArray1 = new int[] {};
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray2);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        double[] doubleArray6 = new double[] { ' ', (-1) };
        double[] doubleArray9 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 100L);
        double[] doubleArray15 = new double[] { ' ', (-1) };
        double[] doubleArray18 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 100L);
        double[] doubleArray23 = new double[] { ' ', (-1) };
        double[] doubleArray26 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray18, doubleArray23, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray23, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray23);
        double[] doubleArray36 = new double[] { ' ', (-1) };
        double[] doubleArray39 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray39, (double) 100L);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray23, doubleArray36, (double) (short) 100);
        double[] doubleArray49 = new double[] { ' ', (-1) };
        double[] doubleArray52 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray52, (double) 100L);
        double[] doubleArray58 = new double[] { ' ', (-1) };
        double[] doubleArray61 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        double[] doubleArray66 = new double[] { ' ', (-1) };
        double[] doubleArray69 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray69, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray61, doubleArray66, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray66, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray66);
        double[] doubleArray79 = new double[] { ' ', (-1) };
        double[] doubleArray82 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray82, (double) 100L);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray66, doubleArray79, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray79, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) 100L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests18.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum14, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 10.0d, (double) 1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (short) -1, (float) (byte) -1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        char[] charArray4 = new char[] { '4', ' ', 'a', '4' };
        char[] charArray11 = new char[] { '4', '#', '4', ' ', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray7);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray15, byteArray19);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray19, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray25);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray40);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray4 = new int[] { 10 };
        java.lang.String[] strArray5 = new java.lang.String[] {};
        int[] intArray9 = new int[] { (short) 1, (byte) 100, (byte) 0 };
        int[] intArray13 = new int[] { ' ', 1, 'a' };
        boolean[] booleanArray22 = new boolean[] { true, true, true, false, false, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray4, strArray5, intArray9, intArray13, (java.lang.Integer) (-1), (java.lang.Integer) 0, booleanArray22, false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1), (double) 1.0f);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray7, byteArray11);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray11, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray29, byteArray33);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray39, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray33, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray17, byteArray33);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray53, byteArray57);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray67);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray63, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray57, byteArray63);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray74, byteArray75);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray78, byteArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray75, byteArray79);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray84, byteArray85);
        byte[] byteArray88 = new byte[] {};
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray88, byteArray89);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray85, byteArray88);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray79, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray63, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray79);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        float[] floatArray1 = null;
        float[] floatArray5 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray9 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100L);
        float[] floatArray15 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray19 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100L);
        float[] floatArray25 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray29 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray25, 1.0f);
        float[] floatArray38 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray42 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100L);
        float[] floatArray48 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray52 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray52, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray48, 1.0f);
        float[] floatArray60 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray64 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray64, (float) 100L);
        float[] floatArray70 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray74 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray74, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray70, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray38, floatArray60, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray38, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray25, (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray5, (float) 1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray3 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray1, baseTokenStreamTestCaseArray2 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, 0, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("tests.weekly", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("tests.awaitsfix", indexReader32, (int) '#', postingsEnum34, postingsEnum35, false);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) baseTokenStreamTestCaseArraySet4, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) baseTokenStreamTestCaseArraySet4);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 1, (double) (short) 1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray6 = new char[] { '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("<unknown>", 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray8, shortArray13);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals("hi!", shortArray8, shortArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray21);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (byte) 100);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray14);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray23 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet24 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet24, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        commonGramsTokenFilterFactoryTests25.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests25);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        int[] intArray5 = new int[] { 'a', (short) 10, (short) -1, ' ' };
        int[] intArray11 = new int[] { 10, 2, (short) -1, 2, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray5, intArray11);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0f, (float) (byte) 10, (-1.0f));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.String str16 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) '#', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { 1, (short) 1, (-1), '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray7);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) (short) 10);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader15, (-1), postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader22, 100, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader20, (-1), postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 2, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 0L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 0L, (float) 'a');
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) '#');
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) ' ', (double) 2);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10L, 1L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray2 = new java.util.Locale[][] { localeArray1 };
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) localeArray2, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule12);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray6, (java.lang.Object) testRule12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, 0, postingsEnum21, postingsEnum22);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("tests.weekly", indexReader26, (int) '#', postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("enwiki.random.lines.txt", indexReader32, fields33, fields34, true);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.monster", postingsEnum42, postingsEnum43, false);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) throttlingArray6, (java.lang.Object) builder47);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 1L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] { localeArray0 };
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet46 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray45);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray1, (java.lang.Object[]) charSequenceArray24);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray10);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray17, byteArray20);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray38);
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray38, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray38);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray54, byteArray58);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray64, byteArray65);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray65, byteArray68);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray75, byteArray76);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray76, byteArray80);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray85, byteArray86);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray89, byteArray90);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray86, byteArray89);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray80, byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray86);
        byte[] byteArray95 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray86, byteArray95);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray54, byteArray86);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray38, byteArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        int[] intArray4 = new int[] { 4, (byte) 0, (short) -1 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray6);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 10, (float) (-1L), (float) 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        char[] charArray5 = new char[] { 'a', 'a', ' ', ' ', ' ' };
        char[] charArray9 = new char[] { '#', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        int[] intArray5 = new int[] { (byte) 0, 2, (short) 10, '#', (short) 1 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) (byte) 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray57);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures61 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures62 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures61);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures63 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures64 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures63);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures65);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray67 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures61, testRuleIgnoreAfterMaxFailures64, testRuleIgnoreAfterMaxFailures66 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet68 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray67);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        char[] charArray3 = new char[] { ' ', 'a', 'a' };
        char[] charArray7 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray18);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray26, byteArray30);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray36, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray30, byteArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArray18, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", 3, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, 0.0d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '4', 10.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        double[] doubleArray5 = new double[] { ' ', (-1) };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 100L);
        double[] doubleArray14 = new double[] { ' ', (-1) };
        double[] doubleArray17 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray17, (double) 100L);
        double[] doubleArray22 = new double[] { ' ', (-1) };
        double[] doubleArray25 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray17, doubleArray22, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray22, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray22);
        double[] doubleArray35 = new double[] { ' ', (-1) };
        double[] doubleArray38 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray38, (double) 100L);
        double[] doubleArray44 = new double[] { ' ', (-1) };
        double[] doubleArray47 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 100L);
        double[] doubleArray52 = new double[] { ' ', (-1) };
        double[] doubleArray55 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray47, doubleArray52, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray52, (double) 1);
        double[] doubleArray64 = new double[] { ' ', (-1) };
        double[] doubleArray67 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray67, (double) 100L);
        double[] doubleArray73 = new double[] { ' ', (-1) };
        double[] doubleArray76 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray76, (double) 100L);
        double[] doubleArray81 = new double[] { ' ', (-1) };
        double[] doubleArray84 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray84, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray76, doubleArray81, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray81, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray81, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray52, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) (short) 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (-1), (float) (byte) 1, (float) 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) (-1), (double) 3);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray42);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) charSequenceArray42);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray11 = new int[] { 'a', (byte) 1, (byte) 100, 1, (short) 100 };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray16);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray16);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        int[] intArray27 = new int[] { (byte) 100, 2, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray11, strArray16, intArray21, intArray27, (java.lang.Integer) 3, true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        short[] shortArray4 = new short[] { (byte) 10, (short) -1, (short) 10, (short) 10 };
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray16);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray16, shortArray23);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray42);
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray40, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("", shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (short) 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        double[] doubleArray6 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[] doubleArray12 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
        java.util.Collection[] collectionArray16 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray17 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray16;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) doubleArray13, (java.lang.Object[]) collectionArray16);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass3 = queryCachingPolicy2.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass5 = queryCachingPolicy4.getClass();
        java.lang.Class[] classArray7 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        wildcardClassArray8[0] = wildcardClass3;
        wildcardClassArray8[1] = wildcardClass5;
        java.util.Set<java.lang.Class<?>> wildcardClassSet13 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray8);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray8);
        double[] doubleArray20 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[] doubleArray26 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[][] doubleArray27 = new double[][] { doubleArray20, doubleArray26 };
        java.util.Set<double[]> doubleArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray27);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) doubleArray27);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray11);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray21, shortArray23);
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray21);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) shortArray33);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray3);
        int[] intArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale1, locale3, locale5 };
        java.util.Set<java.util.Locale> localeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray6);
        java.lang.Class<?> wildcardClass8 = localeArray6.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.badapples", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum14, (java.lang.Object) "random");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 4);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0L, (double) 4, 0.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (-1), (double) (byte) 100);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray24);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray24, shortArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) shortArray29);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, 0, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.weekly", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("enwiki.random.lines.txt", indexReader21, fields22, fields23, true);
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests6.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) fields31);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray2, longArray5);
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass2 = queryCachingPolicy1.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass4 = queryCachingPolicy3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass2;
        wildcardClassArray7[1] = wildcardClass4;
        java.util.Set<java.lang.Class<?>> wildcardClassSet12 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray7);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) 10L, (java.lang.Object) charSequenceSet19);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray57, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray74, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSet19, (java.lang.Object) 0);
        java.util.Set[] setArray87 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[] charSequenceSetArray88 = (java.util.Set<java.lang.CharSequence>[]) setArray87;
        charSequenceSetArray88[0] = charSequenceSet19;
        java.util.Set<java.util.Set<java.lang.CharSequence>> charSequenceSetSet91 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceSetArray88);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("", indexReader5, terms6, terms7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String str12 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.tearDown();
        double[] doubleArray18 = new double[] { ' ', (-1) };
        double[] doubleArray21 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray21, (double) 100L);
        double[] doubleArray27 = new double[] { ' ', (-1) };
        double[] doubleArray30 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray30, (double) 100L);
        double[] doubleArray35 = new double[] { ' ', (-1) };
        double[] doubleArray38 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray38, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray30, doubleArray35, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray35, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray35);
        double[] doubleArray48 = new double[] { ' ', (-1) };
        double[] doubleArray51 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray51, (double) 100L);
        double[] doubleArray57 = new double[] { ' ', (-1) };
        double[] doubleArray60 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray60, (double) 100L);
        double[] doubleArray65 = new double[] { ' ', (-1) };
        double[] doubleArray68 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray68, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray60, doubleArray65, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray65, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray65, (double) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) doubleArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray0, (java.lang.Object) doubleArray65);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass2 = queryCachingPolicy1.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass4 = queryCachingPolicy3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass2;
        wildcardClassArray7[1] = wildcardClass4;
        java.util.Set<java.lang.Class<?>> wildcardClassSet12 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray7);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass14 = queryCachingPolicy13.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass16 = queryCachingPolicy15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass14;
        wildcardClassArray19[1] = wildcardClass16;
        java.util.Set<java.lang.Class<?>> wildcardClassSet24 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) wildcardClassArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) wildcardClassArray7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) '#', 0.0f);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray57, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet82 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray81);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray81, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) shortArray1, (java.lang.Object[]) charSequenceArray88);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, 0L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10.0f, (double) (-1), (double) 2);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray18);
        int[] intArray27 = new int[] { 3, (byte) 0, 4, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8, intArray14, intArray27);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (short) 10, (float) (byte) 100, (float) '4');
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 1, (double) 0.0f);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, (double) (byte) 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100, (double) 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray14);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray27, byteArray31);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray36, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray31, byteArray37);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray48, byteArray49);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray49, byteArray53);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray58, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray59, byteArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray53, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray37, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray53);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray71, byteArray72);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray72, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray72);
        byte[] byteArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray80);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray26);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray31);
        int[] intArray34 = new int[] { ' ' };
        boolean[] booleanArray42 = new boolean[] { true, true, false, false, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray14, strArray26, intArray30, intArray34, (java.lang.Integer) 10, (java.lang.Integer) 3, booleanArray42, true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        int[] intArray4 = new int[] { (short) -1, (short) 0, 10 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray4, intArray7);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) locale8);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 2, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray7);
        int[] intArray16 = new int[] { 0, 1, (short) 10, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray16);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray6);
        int[] intArray14 = new int[] { 'a', ' ', 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray14);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("tests.weekly", indexReader25, (int) '#', postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader37, (int) (short) -1, postingsEnum39, postingsEnum40, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) builder15, (java.lang.Object) true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) 4);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray14, 1.0f);
        java.lang.Object obj23 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray14, obj23);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray31, byteArray35);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray41, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray35, byteArray41);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray53, byteArray57);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray67);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray63, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray57, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray41, byteArray57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests72.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests72.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray41, (java.lang.Object) commonGramsTokenFilterFactoryTests72);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests72.assertDocsSkippingEquals("tests.slow", indexReader77, (int) (byte) -1, postingsEnum79, postingsEnum80, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) floatArray14, (java.lang.Object) indexReader77);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        int[] intArray4 = new int[] { '4', (short) 10, (short) 100, (short) -1 };
        int[] intArray10 = new int[] { (-1), (byte) 1, (byte) 10, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 1.0f);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, 0, postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("tests.weekly", indexReader24, (int) '#', postingsEnum26, postingsEnum27);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) indexReader10, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) builder33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader10, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.rules.TestRule[] testRuleArray37 = new org.junit.rules.TestRule[] { testRule9, testRule18, testRule27, testRule36 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray37);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleSet38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests41.setUp();
        java.lang.String str44 = commonGramsTokenFilterFactoryTests41.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        commonGramsTokenFilterFactoryTests41.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet38, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests41);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 100.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray8, intArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray23, intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3, intArray12, strArray20, intArray24);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader22, 100, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) '4', numericDocValues29, numericDocValues30);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10.0d, (double) (-1), (double) (-1L));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10.0d, (double) (byte) 10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) (byte) 10, 0.0d, (double) 100.0f);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray52);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests62.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests62.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests62, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests62.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests62.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests62.setUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests62.assertPositionsSkippingEquals("tests.failfast", indexReader71, 10, postingsEnum73, postingsEnum74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests62.assertPositionsSkippingEquals("tests.slow", indexReader77, (int) ' ', postingsEnum79, postingsEnum80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) charSequenceArray21, (java.lang.Object) commonGramsTokenFilterFactoryTests62);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet1 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicyArray0, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray10, longArray11);
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray10, longArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray17, longArray20);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray10, longArray20);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray30, longArray33);
        org.junit.Assert.assertArrayEquals("", longArray20, longArray30);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) longArray20);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1L, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (long) 2);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray26);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray26, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        commonGramsTokenFilterFactoryTests39.assertTermsEquals("", indexReader41, terms42, terms43, false);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.weekly", postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.maxfailures", postingsEnum52, postingsEnum53, true);
        commonGramsTokenFilterFactoryTests39.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1.0f), (java.lang.Object) commonGramsTokenFilterFactoryTests39);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10.0d, (double) 0);
    }
}

