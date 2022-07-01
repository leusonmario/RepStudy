import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6001");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray4);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray9);
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray15, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals(intArray18, intArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray25);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray9, intArray25);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray36, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray43, intArray47);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsSkippingEquals("", indexReader59, (int) (short) 100, postingsEnum61, postingsEnum62, false);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests57.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsSkippingEquals("", indexReader67, (-1), postingsEnum69, postingsEnum70, true);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("tests.badapples", indexReader74, (int) (byte) -1, postingsEnum76, postingsEnum77);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        commonGramsTokenFilterFactoryTests57.assertFieldsEquals("tests.weekly", indexReader80, fields81, fields82, false);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        commonGramsTokenFilterFactoryTests57.assertTermsEquals("tests.weekly", indexReader86, terms87, terms88, false);
        commonGramsTokenFilterFactoryTests57.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) intArray53, (java.lang.Object) commonGramsTokenFilterFactoryTests57);
        org.junit.Assert.assertArrayEquals(intArray43, intArray53);
        java.lang.Object obj94 = null;
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) intArray53, obj94);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray9, intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray53);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6002");
        int[][][][] intArray2 = new int[][][][] {};
        int[][][][] intArray3 = new int[][][][] {};
        int[][][][] intArray4 = new int[][][][] {};
        int[][][][] intArray5 = new int[][][][] {};
        int[][][][][] intArray6 = new int[][][][][] { intArray2, intArray3, intArray4, intArray5 };
        java.util.Set<int[][][][]> intArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(intArray6);
        java.util.Set<int[][][][]> intArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(intArray6);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("", indexReader17, (int) (short) 100, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling13, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13, throttling29 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("hi!", postingsEnum45, postingsEnum46, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling34, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34, throttling50 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling54);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("", indexReader58, (int) (short) 100, postingsEnum60, postingsEnum61, false);
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsEnumEquals("hi!", postingsEnum65, postingsEnum66, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling54, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray71 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53, throttling54, throttling70 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray71);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray51, (java.lang.Object[]) throttlingArray71);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray30, (java.lang.Object[]) throttlingArray71);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling76);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests78.assertDocsSkippingEquals("", indexReader80, (int) (short) 100, postingsEnum82, postingsEnum83, false);
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests78.assertDocsEnumEquals("hi!", postingsEnum87, postingsEnum88, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling76, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling92 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray93 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling75, throttling76, throttling92 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet94 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray93);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet95 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray93);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray71, (java.lang.Object[]) throttlingArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) intArray6, (java.lang.Object[]) throttlingArray93);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 10, (float) (short) 100, 10.0f);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6004");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray30 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray14, doubleArray23, 100.0d);
        java.lang.Object obj35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray14, obj35);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 1.0d);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6006");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader16, (-1), postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests6.assertTermsEquals("tests.monster", indexReader23, terms24, terms25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("tests.nightly", indexReader32, (int) (short) -1, postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, true);
        commonGramsTokenFilterFactoryTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("tests.monster", indexReader46, fields47, fields48, false);
        commonGramsTokenFilterFactoryTests6.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsSkippingEquals("", indexReader55, (int) (short) 100, postingsEnum57, postingsEnum58, false);
        org.elasticsearch.common.settings.Settings.Builder builder61 = commonGramsTokenFilterFactoryTests53.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsSkippingEquals("", indexReader63, (-1), postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("tests.badapples", indexReader70, (int) (byte) -1, postingsEnum72, postingsEnum73);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("tests.awaitsfix", indexReader76, (int) (short) 100, postingsEnum78, postingsEnum79);
        commonGramsTokenFilterFactoryTests53.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("hi!", indexReader84, 0, postingsEnum86, postingsEnum87);
        commonGramsTokenFilterFactoryTests53.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsEnumEquals("hi!", postingsEnum91, postingsEnum92, true);
        commonGramsTokenFilterFactoryTests53.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6007");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet1 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.failfast", "", "random" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.failfast", "", "random" };
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray13 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray0, (java.lang.Object[]) charSequenceArray7);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6008");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("hi!", indexReader32, terms33, terms34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader38, fields39, fields40, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6009");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, true);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) builder42);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6010");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader15, (int) (short) 0, postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, true);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("", indexReader37, fields38, fields39, false);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum23, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((-1));
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.badapples", indexReader48, (int) '#', postingsEnum50, postingsEnum51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) indexReader48);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6011");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling4, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4, throttling20 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet23 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling26, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26, throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("", indexReader50, (int) (short) 100, postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsEnumEquals("hi!", postingsEnum57, postingsEnum58, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling46, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45, throttling46, throttling62 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray43, (java.lang.Object[]) throttlingArray63);
        java.util.Set<java.lang.Object> objSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsSkippingEquals("", indexReader73, (int) (short) 100, postingsEnum75, postingsEnum76, false);
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("hi!", postingsEnum80, postingsEnum81, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling69, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling68, throttling69, throttling85 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray21, (java.lang.Object[]) throttlingArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", objArray1, (java.lang.Object[]) throttlingArray86);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6012");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, true);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests20.ruleChain;
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests20.getClass();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 1L);
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray41, floatArray44, (float) 0L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotSame((java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) str15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader51, 100, postingsEnum53, postingsEnum54, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6013");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("hi!", postingsEnum35, postingsEnum36, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling24, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24, throttling40 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray61);
        long[][][][][] longArray66 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(longArray66);
        java.util.Set<long[][][][]> longArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(longArray66);
        byte[][][][] byteArray69 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) longArray66, (java.lang.Object[]) byteArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) byteArray69);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) '#', 10.0d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0d, 0.0d);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6016");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader21, fields22, fields23, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader31, (int) (short) 100, postingsEnum33, postingsEnum34, false);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader39, (-1), postingsEnum41, postingsEnum42, true);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        java.lang.String str47 = commonGramsTokenFilterFactoryTests29.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) -1, (java.lang.Object) str47);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) 100.0f);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (-1L), 1.0d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6019");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader16, (-1), postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.badapples", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("tests.weekly", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests6.assertTermsEquals("tests.weekly", indexReader35, terms36, terms37, false);
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46, false);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests6.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6020");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray48 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray32, doubleArray41, 100.0d);
        double[] doubleArray59 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray66 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray66, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray7, doubleArray66, (double) 100L);
        double[] doubleArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray73, (double) 1);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 0.0d, 100.0d, (double) (byte) 100);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6022");
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray10);
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) annotatedElementArray4, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6023");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum31, postingsEnum32, false);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests37.assertTermsEquals("", indexReader46, terms47, terms48, false);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("random", postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("tests.badapples", postingsEnum57, postingsEnum58, false);
        org.elasticsearch.common.settings.Settings.Builder builder61 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) builder61);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder61);
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum65, postingsEnum66);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6024");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray24);
        byte[] byteArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray28);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6025");
        short[] shortArray5 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[] shortArray17 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[][] shortArray18 = new short[][] { shortArray5, shortArray11, shortArray17 };
        short[] shortArray24 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[] shortArray30 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[] shortArray36 = new short[] { (short) 0, (byte) 1, (short) 100, (byte) 0, (short) -1 };
        short[][] shortArray37 = new short[][] { shortArray24, shortArray30, shortArray36 };
        short[][][] shortArray38 = new short[][][] { shortArray18, shortArray37 };
        java.util.Set<short[][]> shortArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray38);
        java.util.Set<short[][]> shortArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray38);
        java.util.Locale[][][][] localeArray41 = new java.util.Locale[][][][] {};
        java.util.Set<java.util.Locale[][][]> localeArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.Set<java.util.Locale[][][]> localeArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        int[][] intArray47 = new int[][] {};
        java.util.Set<int[]> intArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(intArray47);
        int[][][][] intArray49 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(intArray49);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray47, (java.lang.Object[]) intArray49);
        byte[][][][] byteArray52 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray47, (java.lang.Object[]) byteArray52);
        int[][] intArray56 = new int[][] {};
        java.util.Set<int[]> intArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(intArray56);
        int[][][][] intArray58 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(intArray58);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray56, (java.lang.Object[]) intArray58);
        java.util.Set<int[][][]> intArraySet61 = org.apache.lucene.util.LuceneTestCase.asSet(intArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray47, (java.lang.Object[]) intArray58);
        char[][] charArray63 = new char[][] {};
        java.util.Set<char[]> charArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(charArray63);
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray63);
        java.util.Set<char[]> charArraySet66 = org.apache.lucene.util.LuceneTestCase.asSet(charArray63);
        java.lang.Object obj67 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray63, obj67);
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray47, (java.lang.Object[]) charArray63);
        long[][][][][] longArray71 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(longArray71);
        java.util.Set<long[][][][]> longArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(longArray71);
        byte[][][][] byteArray74 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) longArray71, (java.lang.Object[]) byteArray74);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) intArray47, (java.lang.Object[]) longArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray41, (java.lang.Object[]) longArray71);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray79 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet80 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray71, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray38, (java.lang.Object[]) longArray71);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 0.0d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) (-1));
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6028");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28);
        double[] doubleArray36 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray43 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray43, (double) 100.0f);
        double[] doubleArray53 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray60 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray60, (double) 100.0f);
        double[] doubleArray69 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray76 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray76, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray60, doubleArray69, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray60, (double) (short) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 0, (java.lang.Object) doubleArray60);
        double[] doubleArray88 = new double[] { (-1), 10L, 2, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray88, (double) 2);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (short) 1);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 10.0f, 100.0f, (float) ' ');
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6031");
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray48 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray32, doubleArray41, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray32, (double) 0.0f);
        double[] doubleArray61 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray68 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray68, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray32, doubleArray68, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) doubleArray68);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (short) 10, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 0, (double) (byte) -1);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6034");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, false);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader40, (int) (short) 10, postingsEnum42, postingsEnum43, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6035");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        double[] doubleArray41 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray48 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        double[] doubleArray57 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray64 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray64, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray48, doubleArray57, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray48, (double) 0.0f);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray48, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray1, doubleArray15, (double) (short) 0);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6036");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader36, (-1), postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader20, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.tearDown();
        commonGramsTokenFilterFactoryTests26.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocsAndPositionsEnumEquals("", postingsEnum53, postingsEnum54);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) '4', (float) (byte) 10);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 1.0f, (double) 1.0f);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6039");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        long[][][][][] longArray6 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(longArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) longArray6);
        int[][] intArray11 = new int[][] {};
        java.util.Set<int[]> intArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(intArray11);
        java.lang.Iterable[] iterableArray14 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray15 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray14;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) intArray11, (java.lang.Object[]) iterableArray14);
        int[][] intArray19 = new int[][] {};
        java.util.Set<int[]> intArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(intArray19);
        int[][][][] intArray21 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(intArray21);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray19, (java.lang.Object[]) intArray21);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) iterableArray14, (java.lang.Object[]) intArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) iterableArray14);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) iterableArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) queryCachingPolicyArray2);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0L, 0.0d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6041");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.lang.Iterable[] iterableArray5 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray6 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray5;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertArrayEquals(intArray13, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray20, intArray24);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 1L);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) 1L);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray35, floatArray38, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) 1L);
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray49, floatArray52, (float) 0L);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray52, floatArray55, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray52, (float) ' ');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsSkippingEquals("", indexReader65, (int) (short) 100, postingsEnum67, postingsEnum68, false);
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) floatArray52, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray24, (java.lang.Object) floatArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) iterableArray5, (java.lang.Object) floatArray52);
        int[][][][] intArray75 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(intArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) iterableArray5, (java.lang.Object[]) intArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) iterableArray5);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet79 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        long[][][][][] longArray80 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(longArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) longArray80);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet83 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.lang.reflect.Type[] typeArray84 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet85 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) typeArray84);
        int[][][][][][] intArray87 = new int[][][][][][] {};
        int[][][][][][][] intArray88 = new int[][][][][][][] { intArray87 };
        java.util.Set<int[][][][][][]> intArraySet89 = org.apache.lucene.util.LuceneTestCase.asSet(intArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) intArray88);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1, (double) (byte) 100);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) -1);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6044");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray1, commonGramsTokenFilterFactoryTestsArray2, commonGramsTokenFilterFactoryTestsArray3, commonGramsTokenFilterFactoryTestsArray4, commonGramsTokenFilterFactoryTestsArray5, commonGramsTokenFilterFactoryTestsArray6 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray7);
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray7);
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray7);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray11 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray11, annotatedElementArray12, annotatedElementArray13, annotatedElementArray14, annotatedElementArray15 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray7, (java.lang.Object[]) annotatedElementArray16);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6045");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray12, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray12);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray33, shortArray44);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray33);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray66);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray73);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray77);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray82);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray77, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray62);
        short[] shortArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray91);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, 0L);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6047");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray12, longArray13);
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray12, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray19);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray5, longArray19);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray25);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray30, longArray31);
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray30, longArray33);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray36, longArray37);
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray36);
        org.junit.Assert.assertArrayEquals(longArray25, longArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray19, longArray25);
        java.lang.Object obj42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) longArray25, obj42);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) 10, 100.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6049");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray3);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray6, annotatedElementArray7, annotatedElementArray8 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray9);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray9);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray3, (java.lang.Object[]) annotatedElementArray9);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] commonGramsTokenFilterFactoryTestsArray16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] { commonGramsTokenFilterFactoryTestsArray15 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray16);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[][]> eSTokenStreamTestCaseArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[][][]) commonGramsTokenFilterFactoryTestsArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray9, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray16);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 0.0f, (double) 2);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6051");
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray0 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray0);
        char[][] charArray2 = new char[][] {};
        java.util.Set<char[]> charArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray2);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray0, (java.lang.Object[]) charArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray11);
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray11);
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray11, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray0, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6052");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray1);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray6);
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray13);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray18);
        org.junit.Assert.assertArrayEquals(intArray13, intArray18);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray24);
        org.junit.Assert.assertArrayEquals(intArray13, intArray24);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertArrayEquals(intArray34, intArray41);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray46, intArray49);
        org.junit.Assert.assertArrayEquals("random", intArray41, intArray49);
        org.junit.Assert.assertArrayEquals("", intArray24, intArray41);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", intArray56, intArray58);
        org.junit.Assert.assertArrayEquals(intArray24, intArray58);
        org.junit.Assert.assertArrayEquals(intArray6, intArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("", indexReader64, (int) (short) 100, postingsEnum66, postingsEnum67, false);
        org.elasticsearch.common.settings.Settings.Builder builder70 = commonGramsTokenFilterFactoryTests62.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("", indexReader72, (-1), postingsEnum74, postingsEnum75, true);
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests62.ruleChain;
        commonGramsTokenFilterFactoryTests62.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests62.tearDown();
        java.lang.String str81 = commonGramsTokenFilterFactoryTests62.getTestName();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        commonGramsTokenFilterFactoryTests62.assertPositionsSkippingEquals("tests.nightly", indexReader83, (int) (byte) 10, postingsEnum85, postingsEnum86);
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("tests.slow", indexReader89, (int) (short) 0, postingsEnum91, postingsEnum92, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray58, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6053");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("hi!", indexReader26, fields27, fields28, false);
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) wildcardClass31);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6054");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray1 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet2 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray1);
        long[][][][][] longArray3 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(longArray3);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray1, (java.lang.Object[]) longArray3);
        short[][] shortArray6 = new short[][] {};
        java.util.Set<short[]> shortArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray6);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray1, (java.lang.Object[]) shortArray6);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray11 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray9, annotatedElementArray10, annotatedElementArray11, annotatedElementArray12, annotatedElementArray13 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray14);
        java.lang.Iterable[] iterableArray16 = new java.lang.Iterable[] { annotatedElementArraySet15 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray17 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray18 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray19 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray22 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray17, annotatedElementArray18, annotatedElementArray19, annotatedElementArray20, annotatedElementArray21 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray22);
        java.lang.Iterable[] iterableArray24 = new java.lang.Iterable[] { annotatedElementArraySet23 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray25 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray26 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray27 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray29 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray30 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray25, annotatedElementArray26, annotatedElementArray27, annotatedElementArray28, annotatedElementArray29 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray30);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[] { annotatedElementArraySet31 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray33 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray34 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray35 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray36 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray37 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray38 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray33, annotatedElementArray34, annotatedElementArray35, annotatedElementArray36, annotatedElementArray37 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray38);
        java.lang.Iterable[] iterableArray40 = new java.lang.Iterable[] { annotatedElementArraySet39 };
        java.lang.Iterable[][] iterableArray41 = new java.lang.Iterable[][] { iterableArray16, iterableArray24, iterableArray32, iterableArray40 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray42 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray43 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray45 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray46 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray47 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray42, annotatedElementArray43, annotatedElementArray44, annotatedElementArray45, annotatedElementArray46 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray47);
        java.lang.Iterable[] iterableArray49 = new java.lang.Iterable[] { annotatedElementArraySet48 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray50 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray51 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray52 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray53 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray50, annotatedElementArray51, annotatedElementArray52, annotatedElementArray53, annotatedElementArray54 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray55);
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[] { annotatedElementArraySet56 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray58 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray59 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray60 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray61 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray62 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray63 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray58, annotatedElementArray59, annotatedElementArray60, annotatedElementArray61, annotatedElementArray62 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray63);
        java.lang.Iterable[] iterableArray65 = new java.lang.Iterable[] { annotatedElementArraySet64 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray66 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray67 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray68 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray69 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray70 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray71 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray66, annotatedElementArray67, annotatedElementArray68, annotatedElementArray69, annotatedElementArray70 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray71);
        java.lang.Iterable[] iterableArray73 = new java.lang.Iterable[] { annotatedElementArraySet72 };
        java.lang.Iterable[][] iterableArray74 = new java.lang.Iterable[][] { iterableArray49, iterableArray57, iterableArray65, iterableArray73 };
        java.lang.Iterable[][][] iterableArray75 = new java.lang.Iterable[][][] { iterableArray41, iterableArray74 };
        java.util.Set<java.lang.Iterable[][]> iterableArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(iterableArray75);
        java.util.Set<java.lang.Iterable[][]> iterableArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(iterableArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray1, (java.lang.Object[]) iterableArray75);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 100);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6056");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str32 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, false);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        long[][] longArray40 = new long[][] { longArray38, longArray39 };
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        long[][] longArray43 = new long[][] { longArray41, longArray42 };
        long[][][] longArray44 = new long[][][] { longArray40, longArray43 };
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        long[][] longArray47 = new long[][] { longArray45, longArray46 };
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        long[][] longArray50 = new long[][] { longArray48, longArray49 };
        long[][][] longArray51 = new long[][][] { longArray47, longArray50 };
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        long[][] longArray54 = new long[][] { longArray52, longArray53 };
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        long[][] longArray57 = new long[][] { longArray55, longArray56 };
        long[][][] longArray58 = new long[][][] { longArray54, longArray57 };
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        long[][] longArray61 = new long[][] { longArray59, longArray60 };
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        long[][] longArray64 = new long[][] { longArray62, longArray63 };
        long[][][] longArray65 = new long[][][] { longArray61, longArray64 };
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        long[][] longArray68 = new long[][] { longArray66, longArray67 };
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        long[][] longArray71 = new long[][] { longArray69, longArray70 };
        long[][][] longArray72 = new long[][][] { longArray68, longArray71 };
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        long[][] longArray75 = new long[][] { longArray73, longArray74 };
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        long[][] longArray78 = new long[][] { longArray76, longArray77 };
        long[][][] longArray79 = new long[][][] { longArray75, longArray78 };
        long[][][][] longArray80 = new long[][][][] { longArray44, longArray51, longArray58, longArray65, longArray72, longArray79 };
        java.util.Set<long[][][]> longArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(longArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray80);
        int[][] intArray84 = new int[][] {};
        java.util.Set<int[]> intArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(intArray84);
        java.lang.reflect.Type[] typeArray86 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray86);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) intArray84, (java.lang.Object[]) typeArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) longArray80, (java.lang.Object[]) typeArray86);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 1);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 2, (long) 1);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1), (double) (short) 10, (double) 2);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6060");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("tests.awaitsfix", indexReader33, fields34, fields35, false);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum40, postingsEnum41);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 2);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 100, (long) (byte) 10);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6063");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0d), (double) 100, (double) 1.0f);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6064");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray22);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray45, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray22, shortArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray30);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 2);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6066");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader39, (int) ' ', postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader46, 10, postingsEnum48, postingsEnum49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("hi!", indexReader53, terms54, terms55, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues63 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) '#', numericDocValues63, numericDocValues64);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6067");
        java.lang.Object[] objArray1 = null;
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray7, intArray11 };
        java.util.Set<int[]> intArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        org.junit.Assert.assertNotNull("", (java.lang.Object) intArray12);
        java.util.Set<int[]> intArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("", indexReader27, (-1), postingsEnum29, postingsEnum30, true);
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) 0);
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) intArray12, (java.lang.Object) testRule39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) intArray12);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) (short) 0);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6070");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("tests.badapples", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("tests.awaitsfix", indexReader60, (int) (short) 100, postingsEnum62, postingsEnum63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader60, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        commonGramsTokenFilterFactoryTests65.assertTermsEquals("hi!", indexReader68, terms69, terms70, false);
        commonGramsTokenFilterFactoryTests65.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder75 = commonGramsTokenFilterFactoryTests65.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        commonGramsTokenFilterFactoryTests65.assertTermsEquals("hi!", indexReader77, terms78, terms79, false);
        commonGramsTokenFilterFactoryTests65.setUp();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("", indexReader84, fields85, fields86, false);
        org.apache.lucene.index.IndexReader indexReader90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        commonGramsTokenFilterFactoryTests65.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader90, (int) (byte) 1, postingsEnum92, postingsEnum93);
        org.junit.rules.TestRule testRule95 = commonGramsTokenFilterFactoryTests65.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6071");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader26, (-1), postingsEnum28, postingsEnum29, true);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests16.tearDown();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests16.getTestName();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("tests.awaitsfix", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("tests.monster", postingsEnum45, postingsEnum46, false);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) postingsEnum46);
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder52 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray57, longArray58);
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray57, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray64);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray69, longArray70);
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray69, longArray72);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray75, longArray76);
        org.junit.Assert.assertArrayEquals(longArray72, longArray76);
        org.junit.Assert.assertArrayEquals(longArray60, longArray76);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) throttling54, (java.lang.Object) longArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) longArray76);
        org.junit.Assert.assertNotEquals((java.lang.Object) terms12, (java.lang.Object) longArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms12);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6072");
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray14 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0d), 100L, '4', 0.0f, (short) 100, (byte) 10 };
        double[] doubleArray31 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray38 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray38, (double) 100.0f);
        double[] doubleArray48 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray55 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray55, (double) 100.0f);
        double[] doubleArray64 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray71 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray71, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray55, doubleArray64, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray55, (double) 0.0f);
        double[] doubleArray84 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray91 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray84, doubleArray91, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray91, (double) (short) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray24, doubleArray91, (double) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray7, doubleArray24, 0.0d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6073");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 2, (long) (short) 10);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6074");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader24, 10, postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader31, (int) (byte) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader37, fields38, fields39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader43, (int) '4', postingsEnum45, postingsEnum46);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("random", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6075");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader19, terms20, terms21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader27, fields28, fields29, false);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.util.Locale[][][][] localeArray33 = new java.util.Locale[][][][] {};
        java.util.Set<java.util.Locale[][][]> localeArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) builder32, (java.lang.Object) localeArraySet34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader46, (-1), postingsEnum48, postingsEnum49, true);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, (int) (short) -1, postingsEnum57, postingsEnum58);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("<unknown>", indexReader61, 1, postingsEnum63, postingsEnum64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) localeArraySet34, (java.lang.Object) indexReader61);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100.0f, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6077");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("tests.weekly", indexReader27, fields28, fields29, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) indexReader27);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader34, 0, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("random", indexReader41, (int) ' ', postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("hi!", indexReader48, 10, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("hi!", indexReader55, terms56, terms57, true);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6078");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests3.ruleChain;
        java.lang.Class<?> wildcardClass20 = commonGramsTokenFilterFactoryTests3.getClass();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) 1L);
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray24, floatArray27, (float) 0L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader32, (int) '4', postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("enwiki.random.lines.txt", indexReader38, terms39, terms40, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6079");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) 0 };
        byte[][] byteArray12 = new byte[][] { byteArray1, byteArray3, byteArray5, byteArray7, byteArray9, byteArray11 };
        byte[] byteArray14 = new byte[] { (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) 0 };
        byte[] byteArray24 = new byte[] { (byte) 0 };
        byte[][] byteArray25 = new byte[][] { byteArray14, byteArray16, byteArray18, byteArray20, byteArray22, byteArray24 };
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) 0 };
        byte[] byteArray31 = new byte[] { (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) 0 };
        byte[] byteArray35 = new byte[] { (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) 0 };
        byte[][] byteArray38 = new byte[][] { byteArray27, byteArray29, byteArray31, byteArray33, byteArray35, byteArray37 };
        byte[][][] byteArray39 = new byte[][][] { byteArray12, byteArray25, byteArray38 };
        java.util.Set<byte[][]> byteArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray39);
        char[][] charArray41 = new char[][] {};
        java.util.Set<char[]> charArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(charArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) byteArray39, (java.lang.Object[]) charArray41);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6080");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) indexReader26);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader33, 0, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("random", indexReader40, (int) ' ', postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("hi!", indexReader47, 10, postingsEnum49, postingsEnum50, false);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.awaitsfix", indexReader55, (int) '#', postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests2 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet62 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray61);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet63 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray61);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet64 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray61);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet65 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) commonGramsTokenFilterFactoryTestsArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) luceneTestCaseSet65);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6081");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader13, (int) (short) 100, postingsEnum15, postingsEnum16, false);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader21, (-1), postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests11.assertTermsEquals("", indexReader28, terms29, terms30, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader45, (-1), postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.badapples", indexReader52, (int) (byte) -1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("tests.weekly", indexReader58, fields59, fields60, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) indexReader58);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("tests.badapples", indexReader65, 0, postingsEnum67, postingsEnum68);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule70;
        org.junit.Assert.assertNotEquals((java.lang.Object) "", (java.lang.Object) testRule70);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6083");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("hi!", indexReader34, 0, postingsEnum36, postingsEnum37);
        commonGramsTokenFilterFactoryTests3.tearDown();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsSkippingEquals("", indexReader43, (int) (short) 100, postingsEnum45, postingsEnum46, false);
        org.elasticsearch.common.settings.Settings.Builder builder49 = commonGramsTokenFilterFactoryTests41.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsSkippingEquals("", indexReader51, (-1), postingsEnum53, postingsEnum54, true);
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("tests.failfast", indexReader60, fields61, fields62, false);
        commonGramsTokenFilterFactoryTests41.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        java.lang.Object obj69 = null;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj69);
        commonGramsTokenFilterFactoryTests3.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6084");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
        java.lang.Class<?> wildcardClass15 = byteArray1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader26, (-1), postingsEnum28, postingsEnum29, true);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests16.tearDown();
        commonGramsTokenFilterFactoryTests16.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("tests.badapples", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41);
        commonGramsTokenFilterFactoryTests16.setIndexWriterMaxDocs((int) (short) 0);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests16, obj48);
        java.lang.Class<?> wildcardClass50 = commonGramsTokenFilterFactoryTests16.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass50);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100L, (long) (short) 10);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6086");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] { strArray1 };
        java.util.Set<java.lang.String[][]> strArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        short[][] shortArray10 = new short[][] { shortArray4, shortArray5, shortArray6, shortArray7, shortArray8, shortArray9 };
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        short[][] shortArray17 = new short[][] { shortArray11, shortArray12, shortArray13, shortArray14, shortArray15, shortArray16 };
        short[][][] shortArray18 = new short[][][] { shortArray10, shortArray17 };
        java.util.Set<short[][]> shortArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray2, (java.lang.Object[]) shortArray18);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6087");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray18, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (byte) 10, 0.0f);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) '4', (double) 100.0f, (double) '#');
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6091");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 0);
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6092");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass43 = builder42.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsSkippingEquals("", indexReader47, (int) (short) 100, postingsEnum49, postingsEnum50, false);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests45.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsSkippingEquals("", indexReader55, (-1), postingsEnum57, postingsEnum58, true);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests45.ruleChain;
        commonGramsTokenFilterFactoryTests45.tearDown();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests45, (java.lang.Object) 0);
        commonGramsTokenFilterFactoryTests45.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        commonGramsTokenFilterFactoryTests45.assertTermsEquals("", indexReader67, terms68, terms69, false);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsEnumEquals("", postingsEnum73, postingsEnum74, false);
        commonGramsTokenFilterFactoryTests45.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        commonGramsTokenFilterFactoryTests45.assertFieldsEquals("tests.monster", indexReader80, fields81, fields82, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) wildcardClass43, (java.lang.Object) fields82);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 10, 0L);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100L, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) (byte) -1, 0.0d, (double) (short) 10);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6096");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader22, 0, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 10, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6097");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader35, (int) (byte) 10, postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.monster", indexReader41, fields42, fields43, true);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum48, postingsEnum49, false);
        java.lang.String str52 = commonGramsTokenFilterFactoryTests0.getTestName();
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray56, longArray57);
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray56, longArray59);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray62, longArray63);
        org.junit.Assert.assertArrayEquals("hi!", longArray59, longArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 2, (double) 10.0f);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (-1.0d), (double) '#');
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (-1L), (double) 'a');
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6101");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("hi!", indexReader32, terms33, terms34, false);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests29.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum40, postingsEnum41);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6102");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.failfast", "", "random" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.Set<java.lang.Object[]> objArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) charSequenceArray5);
        int[][] intArray13 = new int[][] {};
        java.util.Set<int[]> intArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(intArray13);
        int[][][][] intArray15 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(intArray15);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray13, (java.lang.Object[]) intArray15);
        byte[][][][] byteArray18 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray13, (java.lang.Object[]) byteArray18);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) intArray13, (java.lang.Object[]) queryCachingPolicyArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) intArray13);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6103");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum33, postingsEnum34, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader50, (-1), postingsEnum52, postingsEnum53, true);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("tests.awaitsfix", indexReader63, (int) (short) 100, postingsEnum65, postingsEnum66);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("", indexReader69, (int) (byte) 0, postingsEnum71, postingsEnum72);
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("tests.badapples", postingsEnum75, postingsEnum76, true);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        commonGramsTokenFilterFactoryTests40.assertTermsEquals("tests.awaitsfix", indexReader80, terms81, terms82, false);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        commonGramsTokenFilterFactoryTests40.assertTermsEquals("", indexReader86, terms87, terms88, true);
        org.elasticsearch.common.settings.Settings.Builder builder91 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule92 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6104");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader26, fields27, fields28, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6105");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule15);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10.0d, (double) (-1.0f), (double) 1.0f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6107");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.util.Set<java.lang.Class<?>> wildcardClassSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray2);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) classArray2);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) classArray2, (java.lang.Object[]) typeArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) typeArray6);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6108");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 3);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals(intArray43, intArray46);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        org.junit.Assert.assertArrayEquals(intArray46, intArray53);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray58, intArray61);
        org.junit.Assert.assertArrayEquals("random", intArray53, intArray61);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray53, intArray66);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray70);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray75);
        org.junit.Assert.assertArrayEquals(intArray70, intArray75);
        org.junit.Assert.assertArrayEquals(intArray53, intArray70);
        java.lang.Class<?> wildcardClass81 = intArray53.getClass();
        java.lang.Class[] classArray83 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        wildcardClassArray84[0] = wildcardClass81;
        java.util.Set<java.lang.Class<?>> wildcardClassSet87 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray84);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray84);
        java.util.Set<java.lang.Class<?>> wildcardClassSet89 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray84);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) 3, (java.lang.Object) wildcardClassArray84);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', (long) (byte) 1);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6110");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.util.Set<java.lang.Class<?>> wildcardClassSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray2);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) classArray2);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) classArray2, (java.lang.Object[]) typeArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader13, (int) (short) 100, postingsEnum15, postingsEnum16, false);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader21, (-1), postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.badapples", indexReader28, (int) (byte) -1, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("tests.weekly", indexReader34, fields35, fields36, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) indexReader34);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.badapples", indexReader41, 0, postingsEnum43, postingsEnum44);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("random", indexReader48, (int) ' ', postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("hi!", indexReader55, 10, postingsEnum57, postingsEnum58, false);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("tests.awaitsfix", indexReader63, (int) '#', postingsEnum65, postingsEnum66, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests10 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet70 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray69);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray69);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet72 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) classArray2, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray69);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 100, (long) (byte) 0);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6112");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 0);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.monster", indexReader36, fields37, fields38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader42, (int) (short) 10, postingsEnum44, postingsEnum45);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder49 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6113");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray2, charArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests12.ruleChain;
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray30, charArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, true);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("", indexReader49, fields50, fields51, false);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests38.ruleChain;
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray56, charArray60);
        org.junit.Assert.assertArrayEquals("hi!", charArray30, charArray56);
        int[][] intArray66 = new int[][] {};
        java.util.Set<int[]> intArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(intArray66);
        java.lang.Iterable[] iterableArray69 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray70 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray69;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) intArray66, (java.lang.Object[]) iterableArray69);
        int[][] intArray74 = new int[][] {};
        java.util.Set<int[]> intArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(intArray74);
        int[][][][] intArray76 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(intArray76);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray74, (java.lang.Object[]) intArray76);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) iterableArray69, (java.lang.Object[]) intArray76);
        org.junit.Assert.assertNotSame("", (java.lang.Object) charArray30, (java.lang.Object) "tests.maxfailures");
        org.junit.Assert.assertArrayEquals(charArray2, charArray30);
        char[] charArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray30, charArray82);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6114");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6115");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, 0, postingsEnum41, postingsEnum42);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 1);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6117");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling3, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("hi!", postingsEnum35, postingsEnum36, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling24, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24, throttling40 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray61);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures65);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures68 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures67);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures69 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures70 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures69);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures71 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures72 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures71);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures73 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures74 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures73);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures75 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures76 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures75);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray77 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures66, testRuleIgnoreAfterMaxFailures67, testRuleIgnoreAfterMaxFailures69, testRuleIgnoreAfterMaxFailures71, testRuleIgnoreAfterMaxFailures74, testRuleIgnoreAfterMaxFailures76 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet78 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray77);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6119");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("", indexReader35, (int) (short) 100, postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("hi!", postingsEnum42, postingsEnum43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.monster", indexReader47, 100, postingsEnum49, postingsEnum50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("hi!", indexReader53, (-1), postingsEnum55, postingsEnum56, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader61, (int) (short) 100, postingsEnum63, postingsEnum64, false);
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests59.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader69, (-1), postingsEnum71, postingsEnum72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests59.assertTermsEquals("tests.monster", indexReader76, terms77, terms78, false);
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader53, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        java.lang.String str83 = commonGramsTokenFilterFactoryTests59.getTestName();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        commonGramsTokenFilterFactoryTests59.assertTermsEquals("tests.monster", indexReader85, terms86, terms87, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) 10, (float) (short) 1);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6121");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, true);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests20.ruleChain;
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests20.getClass();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 1L);
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray41, floatArray44, (float) 0L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotSame((java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) str15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6122");
        int[][] intArray3 = new int[][] {};
        java.util.Set<int[]> intArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(intArray3);
        int[][][][] intArray5 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(intArray5);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray3, (java.lang.Object[]) intArray5);
        byte[][][][] byteArray8 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray3, (java.lang.Object[]) byteArray8);
        int[][] intArray13 = new int[][] {};
        java.util.Set<int[]> intArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(intArray13);
        int[][][][] intArray15 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(intArray15);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray13, (java.lang.Object[]) intArray15);
        byte[][][][] byteArray18 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray13, (java.lang.Object[]) byteArray18);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) intArray3, (java.lang.Object) byteArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        java.lang.Class<?> wildcardClass25 = intArray23.getClass();
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        long[][] longArray28 = new long[][] { longArray26, longArray27 };
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        long[][] longArray31 = new long[][] { longArray29, longArray30 };
        long[][][] longArray32 = new long[][][] { longArray28, longArray31 };
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        long[][] longArray35 = new long[][] { longArray33, longArray34 };
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        long[][] longArray38 = new long[][] { longArray36, longArray37 };
        long[][][] longArray39 = new long[][][] { longArray35, longArray38 };
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        long[][] longArray42 = new long[][] { longArray40, longArray41 };
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        long[][] longArray45 = new long[][] { longArray43, longArray44 };
        long[][][] longArray46 = new long[][][] { longArray42, longArray45 };
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        long[][] longArray49 = new long[][] { longArray47, longArray48 };
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        long[][] longArray52 = new long[][] { longArray50, longArray51 };
        long[][][] longArray53 = new long[][][] { longArray49, longArray52 };
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        long[][] longArray56 = new long[][] { longArray54, longArray55 };
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        long[][] longArray59 = new long[][] { longArray57, longArray58 };
        long[][][] longArray60 = new long[][][] { longArray56, longArray59 };
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        long[][] longArray63 = new long[][] { longArray61, longArray62 };
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        long[][] longArray66 = new long[][] { longArray64, longArray65 };
        long[][][] longArray67 = new long[][][] { longArray63, longArray66 };
        long[][][][] longArray68 = new long[][][][] { longArray32, longArray39, longArray46, longArray53, longArray60, longArray67 };
        java.util.Set<long[][][]> longArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(longArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray23, (java.lang.Object) longArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) byteArray18, (java.lang.Object[]) longArray68);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) (byte) 1, (float) 'a', (float) 10);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6124");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, true);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("", indexReader38, fields39, fields40, false);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests27.ruleChain;
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) charArray45);
        org.junit.Assert.assertArrayEquals(charArray20, charArray45);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray51, charArray55);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charArray55);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray20, charArray55);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, true);
        org.elasticsearch.common.settings.Settings.Builder builder75 = commonGramsTokenFilterFactoryTests66.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("", indexReader77, fields78, fields79, false);
        org.junit.rules.TestRule testRule82 = commonGramsTokenFilterFactoryTests66.ruleChain;
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests66, (java.lang.Object) charArray84);
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray87, charArray88);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray84, charArray88);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray91, charArray92);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray88, charArray92);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray61, charArray92);
        org.junit.Assert.assertArrayEquals(charArray20, charArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray20);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6125");
        double[] doubleArray0 = null;
        double[] doubleArray9 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray16 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray16, (double) 100.0f);
        double[] doubleArray25 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray32 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray16, doubleArray25, 100.0d);
        double[] doubleArray45 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray52 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray52, (double) 100.0f);
        double[] doubleArray61 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray68 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray68, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray52, doubleArray61, 100.0d);
        double[] doubleArray79 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray86 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray86, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray86, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray16, doubleArray86, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray16, (double) (short) -1);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6126");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader35, (int) (byte) 10, postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.monster", indexReader41, fields42, fields43, true);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum48, postingsEnum49, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum54, postingsEnum55);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1L, (double) 3, 0.0d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6128");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum26, postingsEnum27, true);
        java.lang.String str30 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("tests.awaitsfix", indexReader34, fields35, fields36, false);
        commonGramsTokenFilterFactoryTests32.setUp();
        commonGramsTokenFilterFactoryTests32.setUp();
        java.lang.String str41 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray42 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray42);
        char[][] charArray44 = new char[][] {};
        java.util.Set<char[]> charArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(charArray44);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray42, (java.lang.Object[]) charArray44);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray42);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) eSTokenStreamTestCaseArraySet48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) '#', (float) (short) 10, (float) 1L);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 1, (long) (byte) -1);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 1, (float) (short) 100, (float) ' ');
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 0, (double) '4', (double) 0);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) '#', (float) (-1L));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6134");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray17, shortArray28);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray10);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0f, (-1.0f), (float) (short) 0);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) 1, (float) (-1L));
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6137");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader36, (-1), postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader20, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.weekly", indexReader51, (int) (byte) 1, postingsEnum53, postingsEnum54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.nightly", indexReader57, (int) (short) 0, postingsEnum59, postingsEnum60);
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocValuesEquals("<unknown>", (-1), numericDocValues64, numericDocValues65);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6138");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.monster", indexReader20, terms21, terms22, false);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) ' ');
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6139");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures12);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures20);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray22 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures13, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures16, testRuleIgnoreAfterMaxFailures19, testRuleIgnoreAfterMaxFailures20 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray33 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures30, testRuleIgnoreAfterMaxFailures31 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures34);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray44 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures35, testRuleIgnoreAfterMaxFailures36, testRuleIgnoreAfterMaxFailures38, testRuleIgnoreAfterMaxFailures41, testRuleIgnoreAfterMaxFailures42 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray45 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray11, testRuleIgnoreAfterMaxFailuresArray22, testRuleIgnoreAfterMaxFailuresArray33, testRuleIgnoreAfterMaxFailuresArray44 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray45);
        java.util.Locale[][][][] localeArray48 = new java.util.Locale[][][][] {};
        java.util.Set<java.util.Locale[][][]> localeArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        java.lang.Object obj51 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader54, (int) (short) 100, postingsEnum56, postingsEnum57, false);
        org.elasticsearch.common.settings.Settings.Builder builder60 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader62, (-1), postingsEnum64, postingsEnum65, true);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        commonGramsTokenFilterFactoryTests52.assertTermsEquals("", indexReader69, terms70, terms71, false);
        org.elasticsearch.common.settings.Settings.Builder builder74 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("random", obj51, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        commonGramsTokenFilterFactoryTests52.setUp();
        java.lang.String str77 = commonGramsTokenFilterFactoryTests52.getTestName();
        java.lang.Class[] classArray79 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        java.util.Set<java.lang.Class<?>> wildcardClassSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) str77, (java.lang.Object) classArray79);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) localeArray48, (java.lang.Object[]) classArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray45, (java.lang.Object[]) localeArray48);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6140");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, false);
        java.lang.String str34 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str37 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.String str39 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (short) 10, numericDocValues43, numericDocValues44);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6142");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader21, fields22, fields23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray49);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray49, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray49);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray65);
        org.junit.Assert.assertArrayEquals("random", shortArray29, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder26, (java.lang.Object) shortArray34);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6143");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray15);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray15, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray15);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray47);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray62);
        short[] shortArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray68);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 'a', (long) 'a');
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6145");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader32, terms33, terms34, true);
        java.lang.Object obj38 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("", indexReader41, (int) (short) 100, postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        commonGramsTokenFilterFactoryTests39.assertTermsEquals("", indexReader48, terms49, terms50, false);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("random", postingsEnum54, postingsEnum55, false);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.badapples", postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("random", indexReader64, (int) (short) 100, postingsEnum66, postingsEnum67);
        java.lang.String str69 = commonGramsTokenFilterFactoryTests39.getTestName();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("hi!", indexReader71, (int) (byte) 10, postingsEnum73, postingsEnum74, false);
        org.junit.Assert.assertNotSame("tests.weekly", obj38, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6146");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 1L);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray8, floatArray11, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) (byte) 100);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) 1L);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) 1L);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray26, floatArray29, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray26, (float) (byte) 100);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 1L);
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray40, floatArray43, (float) 0L);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray43, floatArray46, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray43, (float) ' ');
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 1L);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 1L);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray60, floatArray63, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray60, (float) (byte) 100);
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) 1L);
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray74, floatArray77, (float) 0L);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray77, floatArray80, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray77, (float) ' ');
        org.junit.Assert.assertArrayEquals("", floatArray43, floatArray60, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray3, floatArray60, (float) (byte) 100);
        float[] floatArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray60, floatArray92, (float) 0);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0, 0.0d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6148");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        long[][][][][] longArray4 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(longArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) longArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray11);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) longArray4, (java.lang.Object) byteArray11);
        int[][] intArray17 = new int[][] {};
        java.util.Set<int[]> intArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(intArray17);
        int[][][][] intArray19 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(intArray19);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray17, (java.lang.Object[]) intArray19);
        byte[][][][] byteArray22 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray17, (java.lang.Object[]) byteArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray4, (java.lang.Object[]) byteArray22);
        java.lang.Object[] objArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) longArray4, objArray26);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6149");
        long[][][][][] longArray2 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(longArray2);
        java.util.Set<long[][][][]> longArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(longArray2);
        byte[][][][] byteArray5 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray5);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) longArray2, (java.lang.Object[]) byteArray5);
        long[][][][][] longArray9 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(longArray9);
        java.util.Set<long[][][][]> longArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(longArray9);
        byte[][][][] byteArray12 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) longArray9, (java.lang.Object[]) byteArray12);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) longArray2, (java.lang.Object[]) byteArray12);
        java.util.Set<byte[][][]> byteArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("tests.awaitsfix", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.monster", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("tests.monster", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("tests.maxfailures", indexReader37, (int) 'a', postingsEnum39, postingsEnum40, true);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling64);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsSkippingEquals("", indexReader68, (int) (short) 100, postingsEnum70, postingsEnum71, false);
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsEnumEquals("hi!", postingsEnum75, postingsEnum76, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling64, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling63, throttling64, throttling80 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray61, (java.lang.Object[]) throttlingArray81);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) 'a', (java.lang.Object) throttlingArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) byteArray12, (java.lang.Object[]) throttlingArray61);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6150");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 0.0f);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6151");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6152");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) charArray1);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6153");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader6, (int) (byte) 1, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader13, (int) 'a', postingsEnum15, postingsEnum16);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str19 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("tests.monster", indexReader34, 100, postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("hi!", indexReader40, (-1), postingsEnum42, postingsEnum43, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests46.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader56, (-1), postingsEnum58, postingsEnum59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        commonGramsTokenFilterFactoryTests46.assertTermsEquals("tests.monster", indexReader63, terms64, terms65, false);
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader40, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        commonGramsTokenFilterFactoryTests46.tearDown();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("", indexReader72, (int) '#', postingsEnum74, postingsEnum75);
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str19, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6154");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str40 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1), (double) (-1.0f));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6156");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, true);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader36, (-1), postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("tests.monster", indexReader43, terms44, terms45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum53, postingsEnum54);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 0, (double) 0.0f, 1.0d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 100.0d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6160");
        short[] shortArray1 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray13, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray2);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) '4');
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1), (double) 10L);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) '4', (double) (-1), (double) 100);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) '4', (long) '#');
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (short) 10, (double) 'a', (double) (short) 100);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6166");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray11);
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray10, longArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray10);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray18, longArray19);
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray18, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray25);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray32, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals("hi!", longArray35, longArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray10, longArray38);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray44, longArray45);
        org.junit.Assert.assertArrayEquals(longArray10, longArray45);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray50, longArray51);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray55, longArray56);
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray55, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray61, longArray62);
        org.junit.Assert.assertArrayEquals(longArray58, longArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray50, longArray62);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray45, longArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) longArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray45);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6167");
        float[] floatArray6 = new float[] { 10, '4', (short) -1, 'a', 1, (byte) 100 };
        float[] floatArray13 = new float[] { 10, '4', (short) -1, 'a', 1, (byte) 100 };
        float[] floatArray20 = new float[] { 10, '4', (short) -1, 'a', 1, (byte) 100 };
        float[] floatArray27 = new float[] { 10, '4', (short) -1, 'a', 1, (byte) 100 };
        float[] floatArray34 = new float[] { 10, '4', (short) -1, 'a', 1, (byte) 100 };
        float[][] floatArray35 = new float[][] { floatArray6, floatArray13, floatArray20, floatArray27, floatArray34 };
        java.util.Set<float[]> floatArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("hi!", postingsEnum49, postingsEnum50, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling38, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38, throttling54 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("", indexReader62, (int) (short) 100, postingsEnum64, postingsEnum65, false);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("hi!", postingsEnum69, postingsEnum70, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling58, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57, throttling58, throttling74 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray55, (java.lang.Object[]) throttlingArray75);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet78 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray75);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet79 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) floatArray35, (java.lang.Object[]) throttlingArray75);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6168");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) testRule39);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6169");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, true);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader11, fields12, fields13, false);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader18, fields19, fields20, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28, false);
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader33, (-1), postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.monster", indexReader40, terms41, terms42, false);
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("", indexReader49, 100, postingsEnum51, postingsEnum52);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "");
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum56, postingsEnum57);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6170");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        byte[][][][] byteArray3 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray3);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) byteArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader12, (int) (short) 100, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling8, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8, throttling24 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader32, (int) (short) 100, postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("hi!", postingsEnum39, postingsEnum40, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling28, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28, throttling44 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray45);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) throttlingArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) throttlingArray25);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6171");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, false);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", obj25);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) (-1), (double) ' ');
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 10);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6174");
        java.lang.Iterable[][] iterableArray0 = new java.lang.Iterable[][] {};
        java.lang.Iterable[][][] iterableArray1 = new java.lang.Iterable[][][] { iterableArray0 };
        java.lang.Iterable[][] iterableArray2 = new java.lang.Iterable[][] {};
        java.lang.Iterable[][][] iterableArray3 = new java.lang.Iterable[][][] { iterableArray2 };
        java.lang.Iterable[][] iterableArray4 = new java.lang.Iterable[][] {};
        java.lang.Iterable[][][] iterableArray5 = new java.lang.Iterable[][][] { iterableArray4 };
        java.lang.Iterable[][] iterableArray6 = new java.lang.Iterable[][] {};
        java.lang.Iterable[][][] iterableArray7 = new java.lang.Iterable[][][] { iterableArray6 };
        java.lang.Iterable[][] iterableArray8 = new java.lang.Iterable[][] {};
        java.lang.Iterable[][][] iterableArray9 = new java.lang.Iterable[][][] { iterableArray8 };
        java.lang.Iterable[][][][] iterableArray10 = new java.lang.Iterable[][][][] { iterableArray1, iterableArray3, iterableArray5, iterableArray7, iterableArray9 };
        java.util.Set<java.lang.Iterable[][][]> iterableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(iterableArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray17);
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray17, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray17);
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray17);
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) iterableArray10, (java.lang.Object[]) strArray17);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 10, 0L);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (short) 1, 10.0d, (double) 100);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6177");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12, false);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader19, fields20, fields21, true);
        java.lang.Object obj24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", obj24);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 10.0d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6179");
        int[][][][][][] intArray1 = new int[][][][][][] {};
        java.util.Set<int[][][][][]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        java.util.Set<int[][][][][]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) intArraySet3);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6180");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("hi!", indexReader32, terms33, terms34, false);
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule40;
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) testRule40);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.maxfailures", indexReader44, terms45, terms46, true);
        int[][] intArray50 = new int[][] {};
        java.util.Set<int[]> intArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(intArray50);
        int[][][][] intArray52 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(intArray52);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray50, (java.lang.Object[]) intArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) true, (java.lang.Object) intArray50);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray61);
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray61);
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray61);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray61, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray50, (java.lang.Object[]) strArray61);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) (short) 0);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6182");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("<unknown>", indexReader47, fields48, fields49, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader57, (int) (short) 100, postingsEnum59, postingsEnum60, false);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader65, (-1), postingsEnum67, postingsEnum68, true);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.badapples", indexReader72, (int) (byte) -1, postingsEnum74, postingsEnum75);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.awaitsfix", indexReader78, (int) (short) 100, postingsEnum80, postingsEnum81);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("", indexReader84, (int) (byte) 0, postingsEnum86, postingsEnum87);
        commonGramsTokenFilterFactoryTests55.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests55.setUp();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Terms terms93 = null;
        org.apache.lucene.index.Terms terms94 = null;
        commonGramsTokenFilterFactoryTests55.assertTermsEquals("tests.monster", indexReader92, terms93, terms94, true);
        org.elasticsearch.common.settings.Settings.Builder builder97 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder97);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6183");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray26);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray33, shortArray44);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray56);
        org.junit.Assert.assertArrayEquals("random", shortArray17, shortArray26);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray65);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 3);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 100, (long) 10);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 100, (double) '4');
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6187");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader35, terms36, terms37, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (byte) 10, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 10, (long) 3);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6190");
        int[][] intArray1 = new int[][] {};
        java.util.Set<int[]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray1, (java.lang.Object[]) queryCachingPolicyArray3);
        long[] longArray10 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray15 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray20 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray25 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[][] longArray26 = new long[][] { longArray10, longArray15, longArray20, longArray25 };
        long[] longArray31 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray36 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray41 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray46 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[][] longArray47 = new long[][] { longArray31, longArray36, longArray41, longArray46 };
        long[] longArray52 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray57 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray62 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[] longArray67 = new long[] { 0L, 0, (byte) 10, (-1) };
        long[][] longArray68 = new long[][] { longArray52, longArray57, longArray62, longArray67 };
        long[][][] longArray69 = new long[][][] { longArray26, longArray47, longArray68 };
        java.util.Set<long[][]> longArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(longArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) longArray69);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6191");
        long[] longArray1 = null;
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray17, longArray18);
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray17, longArray20);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray23, longArray24);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals(longArray8, longArray24);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray31, longArray32);
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray31, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray37, longArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray34, longArray37);
        org.junit.Assert.assertArrayEquals(longArray8, longArray37);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray43);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray48);
        org.junit.Assert.assertArrayEquals(intArray43, intArray48);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray54);
        org.junit.Assert.assertArrayEquals(intArray43, intArray54);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray60, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        org.junit.Assert.assertArrayEquals(intArray67, intArray70);
        org.junit.Assert.assertArrayEquals(intArray63, intArray70);
        org.junit.Assert.assertArrayEquals(intArray43, intArray70);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) longArray8, (java.lang.Object) intArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) longArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray8);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 2, (double) 100);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6193");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0d), 1.0d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6195");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader23, fields24, fields25, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader31, 3, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader37, (int) (byte) 10, postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum40);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6196");
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray24 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray15, doubleArray24, 100.0d);
        double[] doubleArray44 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray51 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray51, (double) 100.0f);
        double[] doubleArray60 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray67 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray51, doubleArray60, 100.0d);
        double[] doubleArray78 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray85 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray85, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray85, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray15, doubleArray85, (double) (byte) 10);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray85, doubleArray92, (double) 10);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) -1);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 2, (double) 1);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6199");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (short) -1, (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6201");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0f, 100.0f, (float) 1);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), 0.0f, (float) (short) 0);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 1.0d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6207");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests7.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, true);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests7.ruleChain;
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray25, charArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, true);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("", indexReader44, fields45, fields46, false);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests33.ruleChain;
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals("hi!", charArray25, charArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        commonGramsTokenFilterFactoryTests60.assertFieldsEquals("europarl.lines.txt.gz", indexReader64, fields65, fields66, true);
        org.elasticsearch.common.settings.Settings.Builder builder69 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        commonGramsTokenFilterFactoryTests60.assertFieldsEquals("", indexReader71, fields72, fields73, false);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests60.ruleChain;
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests60, (java.lang.Object) charArray78);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray78, charArray82);
        org.junit.Assert.assertArrayEquals(charArray51, charArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) charArray82);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6208");
        int[][][][][][][][] intArray0 = new int[][][][][][][][] {};
        java.util.Set<int[][][][][][][]> intArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        java.util.Set<int[][][][][][][]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        java.util.Set<int[][][][][][][]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray0, objArray4);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 'a');
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6210");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum29, postingsEnum30, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader45, (-1), postingsEnum47, postingsEnum48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.badapples", indexReader52, (int) (byte) -1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("tests.weekly", indexReader58, fields59, fields60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        commonGramsTokenFilterFactoryTests35.assertTermsEquals("tests.weekly", indexReader64, terms65, terms66, false);
        java.lang.String str69 = commonGramsTokenFilterFactoryTests35.getTestName();
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        commonGramsTokenFilterFactoryTests35.assertTermsEquals("", indexReader73, terms74, terms75, true);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("random", indexReader79, 100, postingsEnum81, postingsEnum82);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("<unknown>", indexReader85, (int) ' ', postingsEnum87, postingsEnum88, false);
        commonGramsTokenFilterFactoryTests35.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder92 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder93 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder93);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6211");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[] {};
        java.lang.Iterable[] iterableArray2 = new java.lang.Iterable[] {};
        java.lang.Iterable[][] iterableArray3 = new java.lang.Iterable[][] { iterableArray1, iterableArray2 };
        java.util.Set<java.lang.Iterable[]> iterableArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(iterableArray3);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) iterableArray3);
        int[][] intArray6 = new int[][] {};
        java.util.Set<int[]> intArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(intArray6);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray6, (java.lang.Object[]) queryCachingPolicyArray8);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray12 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet13 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray12);
        byte[][][][] byteArray14 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) queryCachingPolicyArray12, (java.lang.Object[]) byteArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray6, (java.lang.Object[]) byteArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) iterableArray3, (java.lang.Object[]) intArray6);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6213");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals("random", intArray13, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray13, intArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray35);
        org.junit.Assert.assertArrayEquals(intArray30, intArray35);
        org.junit.Assert.assertArrayEquals(intArray13, intArray30);
        int[] intArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray30, intArray41);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6214");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.lang.Iterable[] iterableArray5 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray6 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray5;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertArrayEquals(intArray13, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray20, intArray24);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 1L);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) 1L);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray35, floatArray38, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) 1L);
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray49, floatArray52, (float) 0L);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray52, floatArray55, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray52, (float) ' ');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsSkippingEquals("", indexReader65, (int) (short) 100, postingsEnum67, postingsEnum68, false);
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) floatArray52, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray24, (java.lang.Object) floatArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) iterableArray5, (java.lang.Object) floatArray52);
        int[][][][] intArray75 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(intArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) iterableArray5, (java.lang.Object[]) intArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) iterableArray5);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet79 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        long[][][][][] longArray80 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(longArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) longArray80);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet83 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray84 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray85 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray86 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray87 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray84, annotatedElementArray85, annotatedElementArray86 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet88 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) annotatedElementArray87);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6215");
        java.lang.Object obj3 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("", indexReader21, terms22, terms23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("random", obj3, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests4.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("hi!", postingsEnum40, postingsEnum41, true);
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("tests.maxfailures", indexReader47, (int) (short) 1, postingsEnum49, postingsEnum50, true);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader57, (int) (short) 100, postingsEnum59, postingsEnum60, false);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader65, (-1), postingsEnum67, postingsEnum68, true);
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) 0);
        commonGramsTokenFilterFactoryTests55.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        commonGramsTokenFilterFactoryTests55.assertTermsEquals("", indexReader77, terms78, terms79, false);
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsEnumEquals("", postingsEnum83, postingsEnum84, false);
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs(3);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "<unknown>");
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6216");
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray1 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet4 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray3);
        long[][][][][] longArray5 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(longArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray3, (java.lang.Object[]) longArray5);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) eSTokenStreamTestCaseArray1, (java.lang.Object[]) longArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("hi!", postingsEnum22, postingsEnum23, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling11, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10, throttling11, throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("", indexReader35, (int) (short) 100, postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("hi!", postingsEnum42, postingsEnum43, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling31, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30, throttling31, throttling47 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray28, (java.lang.Object[]) throttlingArray48);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader57, (int) (short) 100, postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsEnumEquals("hi!", postingsEnum64, postingsEnum65, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling53, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray70 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53, throttling69 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling73);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests75.assertDocsSkippingEquals("", indexReader77, (int) (short) 100, postingsEnum79, postingsEnum80, false);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests75.assertDocsEnumEquals("hi!", postingsEnum84, postingsEnum85, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling73, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray90 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling72, throttling73, throttling89 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray90);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray70, (java.lang.Object[]) throttlingArray90);
        java.util.Set<java.lang.Object> objSet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray90);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) throttlingArray48, (java.lang.Object[]) throttlingArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray1, (java.lang.Object[]) throttlingArray90);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6217");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, false);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6218");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling2, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling18 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet21 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("hi!", postingsEnum35, postingsEnum36, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling24, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24, throttling40 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling44, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingArray61);
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray19, (java.lang.Object[]) throttlingArray61);
        int[][] intArray68 = new int[][] {};
        java.util.Set<int[]> intArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(intArray68);
        int[][][][] intArray70 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(intArray70);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray68, (java.lang.Object[]) intArray70);
        byte[][][][] byteArray73 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray68, (java.lang.Object[]) byteArray73);
        int[][] intArray77 = new int[][] {};
        java.util.Set<int[]> intArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(intArray77);
        int[][][][] intArray79 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(intArray79);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray77, (java.lang.Object[]) intArray79);
        java.util.Set<int[][][]> intArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(intArray79);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray68, (java.lang.Object[]) intArray79);
        char[][] charArray84 = new char[][] {};
        java.util.Set<char[]> charArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(charArray84);
        java.util.Set<java.lang.Object> objSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray84);
        java.util.Set<char[]> charArraySet87 = org.apache.lucene.util.LuceneTestCase.asSet(charArray84);
        java.lang.Object obj88 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray84, obj88);
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray68, (java.lang.Object[]) charArray84);
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray91 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray91);
        char[][] charArray93 = new char[][] {};
        java.util.Set<char[]> charArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(charArray93);
        java.util.Set<java.lang.Object> objSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray93);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray91, (java.lang.Object[]) charArray93);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet97 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray84, (java.lang.Object[]) eSTokenStreamTestCaseArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) throttlingArray61, (java.lang.Object[]) charArray84);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6219");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray14, intArray27);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray36);
        org.junit.Assert.assertArrayEquals(intArray31, intArray36);
        org.junit.Assert.assertArrayEquals(intArray14, intArray31);
        java.lang.Class<?> wildcardClass42 = intArray14.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.util.Set<java.lang.Class<?>> wildcardClassSet48 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray45);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray45);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        java.util.Set<java.lang.Class<?>> wildcardClassSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray51);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) classArray51);
        java.util.Set[] setArray56 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.reflect.AnnotatedElement>[] annotatedElementSetArray57 = (java.util.Set<java.lang.reflect.AnnotatedElement>[]) setArray56;
        annotatedElementSetArray57[0] = annotatedElementSet49;
        annotatedElementSetArray57[1] = annotatedElementSet54;
        java.util.Set[][] setArray63 = new java.util.Set[1][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.reflect.AnnotatedElement>[][] annotatedElementSetArray64 = (java.util.Set<java.lang.reflect.AnnotatedElement>[][]) setArray63;
        annotatedElementSetArray64[0] = annotatedElementSetArray57;
        java.util.Set<java.util.Set<java.lang.reflect.AnnotatedElement>[]> annotatedElementSetArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementSetArray64);
        java.util.Set<java.util.Set<java.lang.reflect.AnnotatedElement>[]> annotatedElementSetArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementSetArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) annotatedElementSetArraySet68);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0f, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6221");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader24, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests29.tearDown();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertArrayEquals(intArray43, intArray50);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray50, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray50, intArray63);
        java.lang.Class<?> wildcardClass66 = intArray50.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) intArray50);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (short) 1);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1L, (double) 100, (double) 10L);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6224");
        int[][][][] intArray1 = new int[][][][] {};
        int[][][][] intArray2 = new int[][][][] {};
        int[][][][] intArray3 = new int[][][][] {};
        int[][][][] intArray4 = new int[][][][] {};
        int[][][][][] intArray5 = new int[][][][][] { intArray1, intArray2, intArray3, intArray4 };
        java.util.Set<int[][][][]> intArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(intArray5);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray11, longArray12);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray16, longArray17);
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray16, longArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray11, longArray16);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray25);
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray24, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray16, longArray31);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray38, longArray39);
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray38, longArray41);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray44, longArray45);
        org.junit.Assert.assertArrayEquals("hi!", longArray41, longArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray16, longArray44);
        long[] longArray55 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[] longArray62 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[] longArray69 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[] longArray76 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[] longArray83 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[] longArray90 = new long[] { (short) -1, (-1), 1L, 1L, 10, 1 };
        long[][] longArray91 = new long[][] { longArray55, longArray62, longArray69, longArray76, longArray83, longArray90 };
        java.util.Set<long[]> longArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(longArray91);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray16, (java.lang.Object) longArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) intArray5, (java.lang.Object[]) longArray91);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (short) 100, (double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0L, 0.0d);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6227");
        int[][][][][][] intArray1 = new int[][][][][][] {};
        java.util.Set<int[][][][][]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.monster", indexReader20, terms21, terms22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy28 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicy28);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray31 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy28, queryCachingPolicy30 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet32 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet33 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) queryCachingPolicyArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) intArray1, (java.lang.Object[]) queryCachingPolicyArray31);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) 0, (double) (short) 100);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6229");
        double[] doubleArray8 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray26 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray33 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray33, (double) 100.0f);
        double[] doubleArray42 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray49 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray49, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray33, doubleArray42, 100.0d);
        double[] doubleArray60 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray67 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray67, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray67, (double) 100L);
        double[] doubleArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray67, doubleArray74, (double) 100L);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6230");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray6);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) (-1));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6233");
        char[] charArray0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, true);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("", indexReader15, fields16, fields17, false);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests4.ruleChain;
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) charArray22);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray22, charArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields35, fields36, true);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("", indexReader41, fields42, fields43, false);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests30.ruleChain;
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals("hi!", charArray22, charArray48);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals("random", charArray48, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray56, charArray61);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader69, fields70, fields71, true);
        org.elasticsearch.common.settings.Settings.Builder builder74 = commonGramsTokenFilterFactoryTests65.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("", indexReader76, fields77, fields78, false);
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests65.ruleChain;
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) charArray83);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray86, charArray87);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray83, charArray87);
        char[] charArray90 = new char[] {};
        char[] charArray91 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray90, charArray91);
        org.junit.Assert.assertArrayEquals(charArray83, charArray91);
        org.junit.Assert.assertArrayEquals(charArray61, charArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray83);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6234");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader23, (int) (byte) 10, postingsEnum25, postingsEnum26, false);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6235");
        long[][][][][][][] longArray1 = new long[][][][][][][] {};
        java.util.Set<long[][][][][][]> longArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(longArray1);
        java.util.Set<long[][][][][][]> longArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(longArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("", indexReader33, (int) (byte) 0, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.badapples", postingsEnum39, postingsEnum40, true);
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs((int) (byte) 1);
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("<unknown>", indexReader50, fields51, fields52, false);
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs((-1));
        org.elasticsearch.common.settings.Settings.Builder builder57 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) longArray1, (java.lang.Object) builder57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader61, (int) (short) 100, postingsEnum63, postingsEnum64, false);
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests59.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader69, (-1), postingsEnum71, postingsEnum72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests59.assertTermsEquals("", indexReader76, terms77, terms78, false);
        org.elasticsearch.common.settings.Settings.Builder builder81 = commonGramsTokenFilterFactoryTests59.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule82 = commonGramsTokenFilterFactoryTests59.ruleChain;
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("<unknown>", indexReader84, (int) (byte) 0, postingsEnum86, postingsEnum87, false);
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests59);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6236");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray11);
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray10, longArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray10);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray18, longArray19);
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray18, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray10, longArray25);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray32, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals("hi!", longArray35, longArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray10, longArray38);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray44, longArray45);
        org.junit.Assert.assertArrayEquals(longArray38, longArray44);
        long[] longArray48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray44, longArray48);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6237");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader39, (int) ' ', postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader46, 10, postingsEnum48, postingsEnum49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader53, (int) (short) 0, postingsEnum55, postingsEnum56);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum60, postingsEnum61);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6238");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("hi!", indexReader8, terms9, terms10, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests13.assertTermsEquals("tests.awaitsfix", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.failfast", indexReader36, (int) (byte) 100, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("<unknown>", postingsEnum42, postingsEnum43, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) terms9, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (-1.0f), (float) 1L, 1.0f);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 3, (double) (short) 1);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 10L, (float) 100, 0.0f);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6242");
        java.lang.Object obj1 = null;
        java.lang.Object obj3 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.monster", indexReader18, 100, postingsEnum20, postingsEnum21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strComparableSet30);
        org.junit.Assert.assertNotEquals(obj3, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (short) -1, (float) (short) 100, (float) 100L);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6244");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader40, 0, postingsEnum42, postingsEnum43);
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) (short) -1, numericDocValues47, numericDocValues48);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6245");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6246");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "", "tests.slow", "tests.badapples" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray6);
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        commonGramsTokenFilterFactoryTests10.setUp();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.badapples", obj16);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) (byte) 0, (float) 2);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10L, (long) (short) 1);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6249");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, true);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("", indexReader43, fields44, fields45, false);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("tests.maxfailures", postingsEnum50, postingsEnum51, true);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.badapples", indexReader55, 10, postingsEnum57, postingsEnum58, false);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.maxfailures", indexReader63, (int) (byte) 10, postingsEnum65, postingsEnum66, false);
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (byte) 10);
        java.lang.Object obj71 = null;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, obj71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj71);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 100, (long) (byte) 1);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (short) 100, (double) 1.0f, 100.0d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6252");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 1L);
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray4, floatArray7, (float) 0L);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray10, (float) 0L);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("random", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("random", indexReader41, (int) (short) 100, postingsEnum43, postingsEnum44);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests16.getTestName();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("tests.badapples", indexReader48, terms49, terms50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader54, (int) (short) 100, postingsEnum56, postingsEnum57);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("tests.failfast", indexReader60, fields61, fields62, false);
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("tests.monster", indexReader68, fields69, fields70, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) floatArray7, (java.lang.Object) indexReader68);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6253");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13, false);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("", indexReader29, (-1), postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.badapples", indexReader36, (int) (byte) -1, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("tests.weekly", indexReader42, fields43, fields44, false);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) builder18, (java.lang.Object) fields44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "<unknown>");
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6254");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 100, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6255");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 0);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.awaitsfix", (int) '4', numericDocValues26, numericDocValues27);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6256");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader3, fields4, fields5, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) fields4);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) 1L, (double) 10);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 100, 1.0f);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 0, 0.0d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6260");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray24);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray17);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray41);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray46);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray53);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray53, byteArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray34, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray17, byteArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) byteArray17);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6261");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 1L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray4, floatArray7, (float) 10L);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 1L);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray15, floatArray18, (float) 10L);
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray15, (float) (byte) 0);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) 1L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 1L);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray32, floatArray35, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray32, (float) (byte) 100);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 1L);
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray46, floatArray49, (float) 0L);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray49, floatArray52, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray49, (float) ' ');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray32, (float) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) 0L);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6262");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("tests.weekly", indexReader27, fields28, fields29, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) indexReader27);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader34, 0, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("random", indexReader41, (int) ' ', postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("", indexReader48, fields49, fields50, true);
        java.lang.String str53 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsSkippingEquals("", indexReader56, (int) (short) 100, postingsEnum58, postingsEnum59, false);
        org.elasticsearch.common.settings.Settings.Builder builder62 = commonGramsTokenFilterFactoryTests54.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsSkippingEquals("", indexReader64, (-1), postingsEnum66, postingsEnum67, true);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests54.ruleChain;
        commonGramsTokenFilterFactoryTests54.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) str53, (java.lang.Object) commonGramsTokenFilterFactoryTests54);
        java.lang.Class<?> wildcardClass73 = commonGramsTokenFilterFactoryTests54.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests74.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        commonGramsTokenFilterFactoryTests74.assertFieldsEquals("europarl.lines.txt.gz", indexReader78, fields79, fields80, true);
        org.elasticsearch.common.settings.Settings.Builder builder83 = commonGramsTokenFilterFactoryTests74.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests74.setIndexWriterMaxDocs(1);
        commonGramsTokenFilterFactoryTests74.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Fields fields89 = null;
        org.apache.lucene.index.Fields fields90 = null;
        commonGramsTokenFilterFactoryTests74.assertFieldsEquals("tests.slow", indexReader88, fields89, fields90, false);
        org.elasticsearch.common.settings.Settings.Builder builder93 = commonGramsTokenFilterFactoryTests74.newAnalysisSettingsBuilder();
        java.lang.String str94 = commonGramsTokenFilterFactoryTests74.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder95 = commonGramsTokenFilterFactoryTests74.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) wildcardClass73, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6263");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6264");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum29, postingsEnum30, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling18, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18, throttling34 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45, false);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("hi!", postingsEnum49, postingsEnum50, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling38, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38, throttling54 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray55);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray35, (java.lang.Object[]) throttlingArray55);
        double[] doubleArray64 = new double[] { (-1.0f), (short) 10, 1.0d, ' ', (byte) 10, 10.0f };
        double[] doubleArray71 = new double[] { '#', 100.0d, (short) 100, 10.0f, 10, (short) 10 };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray71, (double) 100.0f);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray35, (java.lang.Object) doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray71, (double) (-1));
        double[] doubleArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray77, (double) 10.0f);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6265");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        long[][][][][] longArray4 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(longArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) longArray4);
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray7 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) eSTokenStreamTestCaseArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsSkippingEquals("", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling12, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11, throttling12, throttling28 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling32);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("", indexReader36, (int) (short) 100, postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsEnumEquals("hi!", postingsEnum43, postingsEnum44, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling32, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32, throttling48 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("", indexReader57, (int) (short) 100, postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsEnumEquals("hi!", postingsEnum64, postingsEnum65, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling53, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling69 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray70 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53, throttling69 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray70);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet72 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray70);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling75);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests77.assertDocsSkippingEquals("", indexReader79, (int) (short) 100, postingsEnum81, postingsEnum82, false);
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests77.assertDocsEnumEquals("hi!", postingsEnum86, postingsEnum87, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling75, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling91 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray92 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling74, throttling75, throttling91 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray92);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet94 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray92);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) throttlingArray29, (java.lang.Object[]) throttlingArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) throttlingArray29);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) ' ', (float) (short) 1);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) '4', 0.0f, (float) (byte) 1);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6268");
        short[] shortArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests4.ruleChain;
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray25);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) testRule20, (java.lang.Object) shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray47);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray40, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray40);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray61, shortArray72);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray77);
        org.junit.Assert.assertArrayEquals("hi!", shortArray25, shortArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray25);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6269");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, true);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader24, 10, postingsEnum26, postingsEnum27, false);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (short) 100);
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("tests.slow", indexReader37, fields38, fields39, true);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) testRule30, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        int[] intArray51 = new int[] { (byte) 0, (byte) 100, (short) 1, 1, (short) 100 };
        int[][] intArray52 = new int[][] { intArray51 };
        int[][][] intArray53 = new int[][][] { intArray52 };
        java.util.Set<int[][]> intArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(intArray53);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray58);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) intArray53, (java.lang.Object) byteArray55);
        java.util.Set<java.lang.Cloneable> cloneableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) intArray53);
        java.util.Set<int[][]> intArraySet64 = org.apache.lucene.util.LuceneTestCase.asSet(intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule30, (java.lang.Object) intArray53);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6270");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray13);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray37);
        org.junit.Assert.assertArrayEquals("hi!", byteArray13, byteArray37);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.util.Set<java.lang.Class<?>> wildcardClassSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray42);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) byteArray37, (java.lang.Object) classArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) classArray42);
        int[] intArray52 = new int[] { (byte) 0, (byte) 100, (short) 1, 1, (short) 100 };
        int[][] intArray53 = new int[][] { intArray52 };
        int[][][] intArray54 = new int[][][] { intArray53 };
        java.util.Set<int[][]> intArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(intArray54);
        java.util.Set<int[][]> intArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(intArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) classArray42, (java.lang.Object[]) intArray54);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6271");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder43);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6272");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("hi!", indexReader31, terms32, terms33, false);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("tests.weekly", indexReader41, (int) 'a', postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("tests.failfast", indexReader48, fields49, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("tests.maxfailures", indexReader54, (int) (short) 1, postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests28.assertDocsAndPositionsEnumEquals("random", postingsEnum61, postingsEnum62);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6273");
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray0 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray0);
        char[][] charArray2 = new char[][] {};
        java.util.Set<char[]> charArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray2);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray0, (java.lang.Object[]) charArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader8, (int) (short) 100, postingsEnum10, postingsEnum11, false);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("", indexReader16, (-1), postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.badapples", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.awaitsfix", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("tests.monster", indexReader43, (int) (short) 100, postingsEnum45, postingsEnum46, false);
        commonGramsTokenFilterFactoryTests6.tearDown();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray51 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests6 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet52 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray51);
        java.util.Set<org.junit.Assert> assertSet53 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) eSTokenStreamTestCaseArray51);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) eSTokenStreamTestCaseArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray2, (java.lang.Object[]) eSTokenStreamTestCaseArray51);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6274");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray1 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) eSTokenStreamTestCaseArray1);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (-1.0d));
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6276");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("", indexReader14, fields15, fields16, false);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests3.ruleChain;
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) charArray21);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray21, charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray25, charArray29);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, true);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("", indexReader49, fields50, fields51, false);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests38.ruleChain;
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray56, charArray60);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray60, charArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray34, charArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray29, charArray60);
        char[] charArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray29, charArray69);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6277");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray3);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray8);
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray14);
        org.junit.Assert.assertArrayEquals(intArray3, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray20, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray27, intArray30);
        org.junit.Assert.assertArrayEquals(intArray23, intArray30);
        org.junit.Assert.assertArrayEquals(intArray3, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray37);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) intArray37);
        org.junit.Assert.assertArrayEquals(intArray3, intArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 2, 1L);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6279");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("", indexReader31, (int) (byte) 100, postingsEnum33, postingsEnum34);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests28.assertDocValuesEquals("hi!", (int) (short) 10, numericDocValues40, numericDocValues41);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 0.0f, (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6281");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray19);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray34);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray51);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray45, byteArray48);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray61);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray63);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray60);
        org.junit.Assert.assertArrayEquals("hi!", byteArray45, byteArray58);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) byteArray4);
        byte[] byteArray76 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray76);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 1, (long) (byte) 0);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6283");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        java.util.Set<int[]> intArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        java.util.Set<int[]> intArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.failfast", "", "random" };
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] { charSequenceArray15 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "tests.failfast", "", "random" };
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] { charSequenceArray22 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray8, (java.lang.Object[]) charSequenceArray16);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, 0.0f, (float) (-1L));
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6285");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet1 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        java.lang.Iterable[] iterableArray4 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray5 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray4;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray16, intArray19);
        org.junit.Assert.assertArrayEquals(intArray12, intArray19);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray19, intArray23);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 1L);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 1L);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray34, floatArray37, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) (byte) 100);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 1L);
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray48, floatArray51, (float) 0L);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 1L);
        org.junit.Assert.assertArrayEquals("hi!", floatArray51, floatArray54, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray51, (float) ' ');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("", indexReader64, (int) (short) 100, postingsEnum66, postingsEnum67, false);
        org.elasticsearch.common.settings.Settings.Builder builder70 = commonGramsTokenFilterFactoryTests62.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) floatArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests62);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) intArray23, (java.lang.Object) floatArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) iterableArray4, (java.lang.Object) floatArray51);
        int[][][][] intArray74 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(intArray74);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) iterableArray4, (java.lang.Object[]) intArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray0, (java.lang.Object[]) iterableArray4);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet78 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        long[][][][][] longArray79 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(longArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray0, (java.lang.Object[]) longArray79);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet82 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        java.lang.Object[] objArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray0, objArray83);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) (short) 1, 1.0f);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6287");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader15, terms16, terms17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) '#', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (byte) 100, (float) 0);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6290");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals(intArray5, intArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader30, (-1), postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests20.tearDown();
        java.lang.String str39 = commonGramsTokenFilterFactoryTests20.getTestName();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader41, (int) ' ', postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.failfast", indexReader48, (int) (short) 10, postingsEnum50, postingsEnum51, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) intArray16, (java.lang.Object) indexReader48);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6291");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.monster", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader45, (int) (short) 0, postingsEnum47, postingsEnum48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests50.assertDocsSkippingEquals("", indexReader52, (int) (short) 100, postingsEnum54, postingsEnum55, false);
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests50.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests50.assertDocsSkippingEquals("", indexReader60, (-1), postingsEnum62, postingsEnum63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("tests.badapples", indexReader67, (int) (byte) -1, postingsEnum69, postingsEnum70);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("tests.awaitsfix", indexReader73, (int) (short) 100, postingsEnum75, postingsEnum76);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("", indexReader79, (int) (byte) 0, postingsEnum81, postingsEnum82);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        commonGramsTokenFilterFactoryTests50.assertTermsEquals("tests.badapples", indexReader85, terms86, terms87, false);
        java.lang.String str90 = commonGramsTokenFilterFactoryTests50.getTestName();
        float[] floatArray91 = new float[] {};
        float[] floatArray92 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray91, floatArray92, (float) 1L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests50, (java.lang.Object) floatArray91);
        commonGramsTokenFilterFactoryTests50.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) postingsEnum47, (java.lang.Object) commonGramsTokenFilterFactoryTests50);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6292");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, obj23);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader27, terms28, terms29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader33, (int) '#', postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 10, numericDocValues41, numericDocValues42);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (byte) 10, 0.0f);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (byte) 1, (double) 10L, (double) 'a');
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6295");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, true);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) testRule17, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        commonGramsTokenFilterFactoryTests18.setUp();
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) locale39);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests18.assertDocValuesEquals("", 2, numericDocValues44, numericDocValues45);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6296");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray14, intArray27);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray36);
        org.junit.Assert.assertArrayEquals(intArray31, intArray36);
        org.junit.Assert.assertArrayEquals(intArray14, intArray31);
        java.lang.Class<?> wildcardClass42 = intArray14.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.util.Set<java.lang.Class<?>> wildcardClassSet48 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray45);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) annotatedElementSet49);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6297");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0L, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6298");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28, false);
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader33, (-1), postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.monster", indexReader40, terms41, terms42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("tests.maxfailures", indexReader46, fields47, fields48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) ' ', postingsEnum54, postingsEnum55, false);
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 2, 0.0d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6300");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28);
        java.lang.String str30 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader32, (int) (byte) 10, postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader39, (int) (short) 100, postingsEnum41, postingsEnum42, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum47, postingsEnum48, true);
        java.lang.String str51 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, 10.0d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 0.0d, (double) (short) -1, (double) '4');
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6303");
        java.lang.Object obj0 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("<unknown>", (int) '#', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6304");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 0);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (short) 10, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6305");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray10 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray10);
        char[][] charArray12 = new char[][] {};
        java.util.Set<char[]> charArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(charArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray10, (java.lang.Object[]) charArray12);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray10);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) eSTokenStreamTestCaseArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) annotatedElementArray4, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6306");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray21, longArray22);
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray21, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray28);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray33, longArray34);
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray33, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray40);
        org.junit.Assert.assertArrayEquals(longArray24, longArray40);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray47, longArray48);
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray47, longArray50);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray53, longArray54);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray50, longArray53);
        org.junit.Assert.assertArrayEquals(longArray24, longArray53);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray60, longArray61);
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", longArray60, longArray63);
        org.junit.Assert.assertArrayEquals(longArray53, longArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray63);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6307");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader26, 100, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 2, (double) 100, (double) 3);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6309");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("tests.maxfailures", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.util.Set<java.lang.Class<?>> wildcardClassSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray27);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) wildcardClassSet29);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests3.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) str31);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), 10.0f, 0.0f);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6311");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, true);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("", indexReader36, (int) (short) 100, postingsEnum38, postingsEnum39, false);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("", indexReader44, (-1), postingsEnum46, postingsEnum47, true);
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests34.ruleChain;
        commonGramsTokenFilterFactoryTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        commonGramsTokenFilterFactoryTests34.assertTermsEquals("tests.nightly", indexReader53, terms54, terms55, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader53);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 10L, (double) 100L);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6313");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader29, 1, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum35, postingsEnum36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) postingsEnum35);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 0L, (float) (-1));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6315");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals(intArray13, intArray16);
        org.junit.Assert.assertArrayEquals(intArray9, intArray16);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        org.junit.Assert.assertArrayEquals("random", intArray16, intArray24);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray16, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray33);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray38);
        org.junit.Assert.assertArrayEquals(intArray33, intArray38);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray44);
        org.junit.Assert.assertArrayEquals(intArray33, intArray44);
        org.junit.Assert.assertArrayEquals(intArray16, intArray33);
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
        org.junit.Assert.assertArrayEquals("", intArray16, intArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray54);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1.0f), (double) 2);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6317");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.slow", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, true);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("tests.awaitsfix", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.monster", postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("tests.monster", indexReader42, fields43, fields44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("tests.monster", indexReader48, (-1), postingsEnum50, postingsEnum51);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str28, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6318");
        int[][] intArray0 = new int[][] {};
        java.util.Set<int[]> intArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(intArray0);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray0, (java.lang.Object[]) queryCachingPolicyArray2);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        byte[][][][] byteArray8 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) queryCachingPolicyArray6, (java.lang.Object[]) byteArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray0, (java.lang.Object[]) byteArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("", indexReader14, (int) (short) 100, postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("random", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("random", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40);
        java.lang.String str42 = commonGramsTokenFilterFactoryTests12.getTestName();
        java.lang.String str43 = commonGramsTokenFilterFactoryTests12.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("hi!", postingsEnum45, postingsEnum46, false);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        long[][] longArray51 = new long[][] { longArray49, longArray50 };
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        long[][] longArray54 = new long[][] { longArray52, longArray53 };
        long[][][] longArray55 = new long[][][] { longArray51, longArray54 };
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        long[][] longArray58 = new long[][] { longArray56, longArray57 };
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        long[][] longArray61 = new long[][] { longArray59, longArray60 };
        long[][][] longArray62 = new long[][][] { longArray58, longArray61 };
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        long[][] longArray65 = new long[][] { longArray63, longArray64 };
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        long[][] longArray68 = new long[][] { longArray66, longArray67 };
        long[][][] longArray69 = new long[][][] { longArray65, longArray68 };
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        long[][] longArray72 = new long[][] { longArray70, longArray71 };
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        long[][] longArray75 = new long[][] { longArray73, longArray74 };
        long[][][] longArray76 = new long[][][] { longArray72, longArray75 };
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        long[][] longArray79 = new long[][] { longArray77, longArray78 };
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        long[][] longArray82 = new long[][] { longArray80, longArray81 };
        long[][][] longArray83 = new long[][][] { longArray79, longArray82 };
        long[] longArray84 = new long[] {};
        long[] longArray85 = new long[] {};
        long[][] longArray86 = new long[][] { longArray84, longArray85 };
        long[] longArray87 = new long[] {};
        long[] longArray88 = new long[] {};
        long[][] longArray89 = new long[][] { longArray87, longArray88 };
        long[][][] longArray90 = new long[][][] { longArray86, longArray89 };
        long[][][][] longArray91 = new long[][][][] { longArray55, longArray62, longArray69, longArray76, longArray83, longArray90 };
        java.util.Set<long[][][]> longArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(longArray91);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) longArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) byteArray8, (java.lang.Object[]) longArray91);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (-1), (double) 10);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6320");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) indexReader26);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader33, 0, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("random", indexReader40, (int) ' ', postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("hi!", indexReader47, 10, postingsEnum49, postingsEnum50, false);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.rules.TestRule[] testRuleArray54 = new org.junit.rules.TestRule[] { testRule53 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet55 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray54);
        int[][][][] intArray57 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(intArray57);
        int[][] intArray60 = new int[][] {};
        java.util.Set<int[]> intArraySet61 = org.apache.lucene.util.LuceneTestCase.asSet(intArray60);
        int[][][][] intArray62 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(intArray62);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray60, (java.lang.Object[]) intArray62);
        java.util.Set<int[][][]> intArraySet65 = org.apache.lucene.util.LuceneTestCase.asSet(intArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray57, (java.lang.Object[]) intArray62);
        java.util.Set<int[][][]> intArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(intArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) testRuleArray54, (java.lang.Object[]) intArray62);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 100, 0L);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6322");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicy1);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy3 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale8 };
        java.util.Set<java.util.Locale> localeSet10 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18, false);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader23, (-1), postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("tests.weekly", indexReader36, fields37, fields38, false);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) indexReader36);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("tests.badapples", indexReader43, 0, postingsEnum45, postingsEnum46);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("random", indexReader50, (int) ' ', postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("hi!", indexReader57, 10, postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("hi!", indexReader64, (int) (short) 0, postingsEnum66, postingsEnum67);
        org.elasticsearch.common.settings.Settings.Builder builder69 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray9, (java.lang.Object) builder69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests71.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        commonGramsTokenFilterFactoryTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader75, fields76, fields77, true);
        commonGramsTokenFilterFactoryTests71.setIndexWriterMaxDocs((int) (byte) -1);
        org.junit.Assert.assertNotSame((java.lang.Object) localeArray9, (java.lang.Object) commonGramsTokenFilterFactoryTests71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) localeArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) localeArray9);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6323");
        int[][][][][][][][] intArray1 = new int[][][][][][][][] {};
        java.util.Set<int[][][][][][][]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        java.util.Set<int[][][][][][][]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        java.util.Set<int[][][][][][][]> intArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray5, annotatedElementArray6, annotatedElementArray7, annotatedElementArray8, annotatedElementArray9 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray10);
        java.util.Set<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) intArray1, (java.lang.Object[]) annotatedElementArray10);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1.0d, (double) 100, (double) 1.0f);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6325");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35);
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass40 = commonGramsTokenFilterFactoryTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 100, 1.0f, (float) (short) -1);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 100, 0.0d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6328");
        java.lang.Class[] classArray3 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        java.util.Set<java.lang.Class<?>> wildcardClassSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Class<?>[]) classArray3);
        int[][] intArray8 = new int[][] {};
        java.util.Set<int[]> intArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(intArray8);
        int[][][][] intArray10 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray10);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray8, (java.lang.Object[]) intArray10);
        byte[][][][] byteArray13 = new byte[][][][] {};
        java.util.Set<byte[][][]> byteArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) intArray8, (java.lang.Object[]) byteArray13);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray30);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray30, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray30);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals("hi!", shortArray30, shortArray47);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray62);
        org.junit.Assert.assertArrayEquals("hi!", shortArray30, shortArray62);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray75);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) shortArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) shortArray75);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) classArray3, (java.lang.Object[]) intArray8);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) classArray3);
        java.lang.Object[] objArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) classArray3, objArray84);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6329");
        int[][][][][][][][] intArray2 = new int[][][][][][][][] {};
        java.util.Set<int[][][][][][][]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        java.util.Set<int[][][][][][][]> intArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        char[][] charArray5 = new char[][] {};
        java.util.Set<char[]> charArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(charArray5);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charArray5);
        java.util.Set<char[]> charArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charArray5);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) intArray2, (java.lang.Object[]) charArray5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray10);
        long[][][][][] longArray12 = new long[][][][][] {};
        java.util.Set<long[][][][]> longArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(longArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) longArray12);
        int[][] intArray17 = new int[][] {};
        java.util.Set<int[]> intArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(intArray17);
        java.lang.Iterable[] iterableArray20 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.reflect.AnnotatedElement>[] annotatedElementIterableArray21 = (java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray20;
        java.util.Set<java.lang.Iterable<java.lang.reflect.AnnotatedElement>> annotatedElementIterableSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.reflect.AnnotatedElement>[]) iterableArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) intArray17, (java.lang.Object[]) iterableArray20);
        int[][] intArray25 = new int[][] {};
        java.util.Set<int[]> intArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(intArray25);
        int[][][][] intArray27 = new int[][][][] {};
        java.util.Set<int[][][]> intArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(intArray27);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) intArray25, (java.lang.Object[]) intArray27);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) iterableArray20, (java.lang.Object[]) intArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) iterableArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray2, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("hi!", postingsEnum45, postingsEnum46, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling34, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34, throttling50 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull((java.lang.Object) throttling54);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("", indexReader58, (int) (short) 100, postingsEnum60, postingsEnum61, false);
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsEnumEquals("hi!", postingsEnum65, postingsEnum66, true);
        org.junit.Assert.assertNotSame((java.lang.Object) throttling54, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray71 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling53, throttling54, throttling70 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray51, (java.lang.Object[]) throttlingArray71);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet74 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray71);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) throttlingArray71);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6331");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        java.lang.Object obj7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) annotatedElementArray4, obj7);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6332");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray4 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 0 };
        byte[][] byteArray13 = new byte[][] { byteArray2, byteArray4, byteArray6, byteArray8, byteArray10, byteArray12 };
        byte[] byteArray15 = new byte[] { (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) 0 };
        byte[] byteArray25 = new byte[] { (byte) 0 };
        byte[][] byteArray26 = new byte[][] { byteArray15, byteArray17, byteArray19, byteArray21, byteArray23, byteArray25 };
        byte[] byteArray28 = new byte[] { (byte) 0 };
        byte[] byteArray30 = new byte[] { (byte) 0 };
        byte[] byteArray32 = new byte[] { (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) 0 };
        byte[] byteArray36 = new byte[] { (byte) 0 };
        byte[] byteArray38 = new byte[] { (byte) 0 };
        byte[][] byteArray39 = new byte[][] { byteArray28, byteArray30, byteArray32, byteArray34, byteArray36, byteArray38 };
        byte[][][] byteArray40 = new byte[][][] { byteArray13, byteArray26, byteArray39 };
        java.util.Set<byte[][]> byteArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray40);
        java.util.Set<java.lang.Object[]> objArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) byteArray40);
        long[] longArray46 = new long[] { 100, 1L, 100 };
        long[] longArray50 = new long[] { 100, 1L, 100 };
        long[] longArray54 = new long[] { 100, 1L, 100 };
        long[] longArray58 = new long[] { 100, 1L, 100 };
        long[] longArray62 = new long[] { 100, 1L, 100 };
        long[] longArray66 = new long[] { 100, 1L, 100 };
        long[][] longArray67 = new long[][] { longArray46, longArray50, longArray54, longArray58, longArray62, longArray66 };
        java.util.Set<long[]> longArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(longArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) byteArray40, (java.lang.Object[]) longArray67);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', (long) 0);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) 10, 0.0f);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6335");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0d, 100.0d, 1.0d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) (short) 0);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6340");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, true);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.failfast", indexReader24, (int) (byte) 100, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader31, (int) (short) 100, postingsEnum33, postingsEnum34, false);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader39, (-1), postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.monster", indexReader46, terms47, terms48, false);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader53, (int) (short) 10, postingsEnum55, postingsEnum56);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.nightly", postingsEnum59, postingsEnum60, false);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests29.setUp();
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests29.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) (byte) 100, (java.lang.Object) testRule65);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6341");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("", indexReader27, (-1), postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("tests.badapples", indexReader34, (int) (byte) -1, postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("tests.awaitsfix", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader40, (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        commonGramsTokenFilterFactoryTests45.assertTermsEquals("hi!", indexReader48, terms49, terms50, false);
        commonGramsTokenFilterFactoryTests45.setIndexWriterMaxDocs((int) (short) 10);
        java.lang.String str55 = commonGramsTokenFilterFactoryTests45.getTestName();
        commonGramsTokenFilterFactoryTests45.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests45.assertFieldsEquals("tests.nightly", indexReader59, fields60, fields61, false);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) fields61);
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum66, postingsEnum67);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6342");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("hi!", indexReader9, fields10, fields11, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals(intArray29, intArray32);
        org.junit.Assert.assertArrayEquals(intArray25, intArray32);
        org.junit.Assert.assertArrayEquals(intArray17, intArray25);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertArrayEquals(intArray43, intArray50);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray50, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray50, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        org.junit.Assert.assertArrayEquals(intArray67, intArray70);
        org.junit.Assert.assertArrayEquals(intArray63, intArray67);
        org.junit.Assert.assertArrayEquals(intArray25, intArray67);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals(intArray76, intArray79);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray85, intArray86);
        org.junit.Assert.assertArrayEquals(intArray83, intArray86);
        org.junit.Assert.assertArrayEquals(intArray79, intArray86);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray86);
        org.junit.Assert.assertArrayEquals(intArray67, intArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) intArray67);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6343");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
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
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader39, (int) ' ', postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader46, fields47, fields48, true);
        java.lang.String str51 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader54, terms55, terms56, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader61, (int) (short) 100, postingsEnum63, postingsEnum64, false);
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests59.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsSkippingEquals("", indexReader69, (-1), postingsEnum71, postingsEnum72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests59.assertPositionsSkippingEquals("tests.badapples", indexReader76, (int) (byte) -1, postingsEnum78, postingsEnum79);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("tests.weekly", indexReader82, fields83, fields84, false);
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        commonGramsTokenFilterFactoryTests59.assertTermsEquals("tests.weekly", indexReader88, terms89, terms90, false);
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader54, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6344");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader30, terms31, terms32, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader38, (int) (short) 100, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("", indexReader46, (-1), postingsEnum48, postingsEnum49, true);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests36.tearDown();
        java.lang.String str55 = commonGramsTokenFilterFactoryTests36.getTestName();
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        java.lang.Class<?> wildcardClass58 = commonGramsTokenFilterFactoryTests36.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("", indexReader62, (int) (short) 100, postingsEnum64, postingsEnum65, false);
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("", indexReader70, (-1), postingsEnum72, postingsEnum73, true);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests60.setUp();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests60.assertPositionsSkippingEquals("tests.failfast", indexReader81, (int) (short) 10, postingsEnum83, postingsEnum84);
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader88, (int) (byte) 0, postingsEnum90, postingsEnum91, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests94 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule95 = commonGramsTokenFilterFactoryTests94.ruleChain;
        commonGramsTokenFilterFactoryTests94.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder97 = commonGramsTokenFilterFactoryTests94.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum91, (java.lang.Object) commonGramsTokenFilterFactoryTests94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests36, (java.lang.Object) commonGramsTokenFilterFactoryTests94);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1, (double) 10L);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1), 0.0d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6347");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader13, (int) (short) 100, postingsEnum15, postingsEnum16, false);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("", indexReader21, (-1), postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.badapples", indexReader28, (int) (byte) -1, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.awaitsfix", indexReader34, (int) (short) 100, postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("", indexReader40, (int) (byte) 0, postingsEnum42, postingsEnum43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests11.assertTermsEquals("tests.badapples", indexReader46, terms47, terms48, false);
        java.lang.String str51 = commonGramsTokenFilterFactoryTests11.getTestName();
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 1L);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) floatArray52);
        org.elasticsearch.common.settings.Settings.Builder builder57 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("tests.awaitsfix", indexReader59, (int) (short) 1, postingsEnum61, postingsEnum62, false);
        commonGramsTokenFilterFactoryTests11.setUp();
        java.lang.String str66 = commonGramsTokenFilterFactoryTests11.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray0, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1L, (long) (byte) 1);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6349");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum29, postingsEnum30, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6350");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.monster", indexReader15, 100, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader21, (-1), postingsEnum23, postingsEnum24, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32, false);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader37, (-1), postingsEnum39, postingsEnum40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        commonGramsTokenFilterFactoryTests27.assertTermsEquals("tests.monster", indexReader44, terms45, terms46, false);
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader21, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("", postingsEnum52, postingsEnum53, true);
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder57 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 1L);
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray61, floatArray64, (float) 0L);
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray69, (float) 1L);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray69, floatArray72, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray72, (float) (byte) 1);
        float[] floatArray81 = new float[] {};
        float[] floatArray82 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray81, floatArray82, (float) 1L);
        float[] floatArray85 = new float[] {};
        float[] floatArray86 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray85, floatArray86, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray82, floatArray85, (float) 10L);
        org.junit.Assert.assertNotNull((java.lang.Object) floatArray85);
        org.junit.Assert.assertArrayEquals("", floatArray72, floatArray85, 1.0f);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) floatArray72);
        org.apache.lucene.index.PostingsEnum postingsEnum96 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests27.assertDocsAndPositionsEnumEquals("random", postingsEnum96, postingsEnum97);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 100);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6352");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray12);
        org.junit.Assert.assertArrayEquals(intArray7, intArray12);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray18);
        org.junit.Assert.assertArrayEquals(intArray7, intArray18);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals(intArray24, intArray27);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        org.junit.Assert.assertArrayEquals(intArray27, intArray34);
        org.junit.Assert.assertArrayEquals(intArray7, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) intArray41);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) intArray41);
        org.junit.Assert.assertArrayEquals(intArray7, intArray41);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray41);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals(intArray57, intArray60);
        org.junit.Assert.assertArrayEquals(intArray53, intArray60);
        org.junit.Assert.assertArrayEquals("", intArray4, intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6353");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 10L, (float) (-1L));
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6354");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader31, fields32, fields33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum39, postingsEnum40, true);
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) (short) 1, numericDocValues45, numericDocValues46);
    }
}

