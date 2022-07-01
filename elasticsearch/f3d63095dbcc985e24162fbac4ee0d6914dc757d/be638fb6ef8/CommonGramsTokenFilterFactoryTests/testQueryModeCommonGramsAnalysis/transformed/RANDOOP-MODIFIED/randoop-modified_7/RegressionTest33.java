import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36, false);
        org.elasticsearch.common.settings.Settings.Builder builder39 = null; // flaky: commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader41, (-1), postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("tests.badapples", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("tests.weekly", indexReader54, fields55, fields56, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) indexReader54);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("tests.badapples", indexReader61, 0, postingsEnum63, postingsEnum64);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) postingsEnum26, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("hi!", indexReader70, (int) (short) 10, postingsEnum72, postingsEnum73);
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests30.ruleChain;
// flaky:         org.junit.Assert.assertNotNull(builder9);
// flaky:         org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(testRule67);
        org.junit.Assert.assertNotNull(testRule68);
        org.junit.Assert.assertNotNull(testRule75);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader14, 100, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader20, (-1), postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (short) -1, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertReaderEquals("enwiki.random.lines.txt", indexReader36, indexReader37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(testRule27);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.apache.lucene.analysis.Analyzer analyzer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray14);
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray14, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertAnalyzesTo(analyzer0, "tests.badapples", strArray6, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSet7);
        org.junit.Assert.assertNotNull(charSequenceSet8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strComparableSet15);
        org.junit.Assert.assertNotNull(charSequenceSet16);
        org.junit.Assert.assertNotNull(charSequenceSet17);
        org.junit.Assert.assertNotNull(charSequenceSet22);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests2.assertFieldStatisticsEquals("tests.maxfailures", fields11, fields12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryCachingPolicy1);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.lang.Iterable[] iterableArray3 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray4 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray3;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray15, intArray18);
        org.junit.Assert.assertArrayEquals(intArray11, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray18, intArray22);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 1L);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) 1L);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray33, floatArray36, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray33, (float) (byte) 100);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) 1L);
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray47, floatArray50, (float) 0L);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray50, floatArray53, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, (float) ' ');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsSkippingEquals("", indexReader63, (int) (short) 100, postingsEnum65, postingsEnum66, false);
        org.elasticsearch.common.settings.Settings.Builder builder69 = null; // flaky: commonGramsTokenFilterFactoryTests61.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) floatArray50, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray22, (java.lang.Object) floatArray50);
        org.junit.Assert.assertNotEquals((java.lang.Object) iterableArray3, (java.lang.Object) floatArray50);
        int[][][][] intArray73 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(intArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) iterableArray3, (java.lang.Object[]) intArray73);
        java.io.PrintStream printStream76 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("", (java.lang.Object[]) iterableArray3, printStream76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray3);
        org.junit.Assert.assertNotNull(annotatedElementIterableArray4);
        org.junit.Assert.assertNotNull(annotatedElementIterableSet5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
// flaky:         org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertNotNull(intArraySet74);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, false);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.testWithoutCommonWordsMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.apache.lucene.analysis.Analyzer analyzer0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.badapples", "tests.failfast", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertAnalyzesTo(analyzer0, "tests.nightly", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures5 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray7);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.monster", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray7, printStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(testRuleIgnoreAfterMaxFailures2);
        org.junit.Assert.assertNull(testRuleIgnoreAfterMaxFailures4);
        org.junit.Assert.assertNull(testRuleIgnoreAfterMaxFailures6);
        org.junit.Assert.assertNotNull(testRuleIgnoreAfterMaxFailuresArray7);
        org.junit.Assert.assertNotNull(testRuleIgnoreAfterMaxFailuresSet8);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.junit.Assert.assertNotEquals((long) 2, 10L);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals(intArray14, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals(intArray26, intArray29);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray29, intArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        java.lang.Iterable[] iterableArray42 = new java.lang.Iterable[] {};
        java.lang.Iterable[] iterableArray43 = new java.lang.Iterable[] {};
        java.lang.Iterable[][] iterableArray44 = new java.lang.Iterable[][] { iterableArray42, iterableArray43 };
        java.util.Set<java.lang.Iterable[]> iterableArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(iterableArray44);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray39, (java.lang.Object) iterableArraySet45);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray51, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray58, intArray61);
        org.junit.Assert.assertArrayEquals(intArray54, intArray61);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals(intArray66, intArray69);
        org.junit.Assert.assertArrayEquals("random", intArray61, intArray69);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray61, intArray74);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray78);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray83);
        org.junit.Assert.assertArrayEquals(intArray78, intArray83);
        org.junit.Assert.assertArrayEquals(intArray61, intArray78);
        int[] intArray89 = new int[] {};
        int[] intArray90 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray89, intArray90);
        int[] intArray92 = new int[] {};
        int[] intArray93 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray92, intArray93);
        org.junit.Assert.assertArrayEquals(intArray90, intArray93);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray78, intArray93);
        org.junit.Assert.assertArrayEquals(intArray39, intArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray5, intArray34, intArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableSet6);
        org.junit.Assert.assertNotNull(charSequenceSet7);
        org.junit.Assert.assertNotNull(charSequenceSet8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(iterableArray42);
        org.junit.Assert.assertNotNull(iterableArray43);
        org.junit.Assert.assertNotNull(iterableArray44);
        org.junit.Assert.assertNotNull(iterableArraySet45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader19, fields20, fields21, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader34, terms35, terms36, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45);
// flaky:         org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        java.lang.String str30 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader32, (int) (byte) 10, postingsEnum34, postingsEnum35, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader40, 0, postingsEnum42, postingsEnum43);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests0.ruleChain;
// flaky:         org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<unknown>" + "'", str30, "<unknown>");
        org.junit.Assert.assertNotNull(testRule45);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader23, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests28);
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.nightly", indexReader34, (int) (short) -1, postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("tests.awaitsfix", indexReader40, (int) (short) 10, postingsEnum42, postingsEnum43, true);
// flaky:         org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, false);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(testRule12);
        org.junit.Assert.assertNotNull(testRule14);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader23, (int) (short) 100, postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule28;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule28;
// flaky:         org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(testRule28);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null; // flaky: commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader25);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum38, postingsEnum39, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder43 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [org/elasticsearch/index/analysis/commongrams/commongrams.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(builder10);
// flaky:         org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(10);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 1L);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 1L);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray46, floatArray49, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) (byte) 100);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 1L);
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray60, floatArray63, (float) 0L);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray63, floatArray66, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray63, (float) ' ');
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) floatArray63);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testQueryModeCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [org/elasticsearch/index/analysis/commongrams/commongrams_query_mode.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[]");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, true);
        org.elasticsearch.common.settings.Settings.Builder builder9 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader11, fields12, fields13, false);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader18, fields19, fields20, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader26, (int) (short) 10, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermVectorsEquals("tests.maxfailures", indexReader38, indexReader39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(testRule16);
    }
}
