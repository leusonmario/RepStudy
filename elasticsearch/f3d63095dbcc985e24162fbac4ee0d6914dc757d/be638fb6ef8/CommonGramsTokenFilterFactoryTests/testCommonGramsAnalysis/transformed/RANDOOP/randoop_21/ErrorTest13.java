import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6501");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("<unknown>", indexReader16, fields17, fields18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader22, terms23, terms24, true);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6502");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.Set<java.lang.Class<?>[][]> wildcardClassArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests9.getTestName();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("<unknown>", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray7, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("tests.badapples", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader38, 1, postingsEnum40, postingsEnum41, false);
        commonGramsTokenFilterFactoryTests9.setIndexWriterMaxDocs(0);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        char[][] charArray48 = new char[][] { charArray46, charArray47 };
        java.util.Set<char[]> charArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        char[][] charArray52 = new char[][] { charArray50, charArray51 };
        java.util.Set<char[]> charArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(charArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray48, (java.lang.Object[]) charArray52);
        java.util.Set<char[]> charArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(charArray52);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) 0, (java.lang.Object) charArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray2, (java.lang.Object[]) charArray52);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6503");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        char[][] charArray2 = new char[][] { charArray0, charArray1 };
        java.util.Set<char[]> charArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        char[][] charArray6 = new char[][] { charArray4, charArray5 };
        java.util.Set<char[]> charArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray2, (java.lang.Object[]) charArray6);
        java.util.Set<char[]> charArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("tests.nightly", indexReader18, terms19, terms20, false);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) builder28);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray32 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy30, queryCachingPolicy31 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet33 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray32);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy35 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray36 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy34, queryCachingPolicy35 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray36);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet38 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray32, (java.lang.Object[]) queryCachingPolicyArray36);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet40 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray32);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy42 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy43 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray44 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy42, queryCachingPolicy43 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet45 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray44);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy46 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy47 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray48 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy46, queryCachingPolicy47 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet49 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray48);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet50 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray44, (java.lang.Object[]) queryCachingPolicyArray48);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet52 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray44);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy55 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray56 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy54, queryCachingPolicy55 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet57 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray56);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet58 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray56);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy59 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy60 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray61 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy59, queryCachingPolicy60 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet62 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray61);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy63 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray65 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy63, queryCachingPolicy64 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet66 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray65);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet67 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray61, (java.lang.Object[]) queryCachingPolicyArray65);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet69 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray61);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray56, (java.lang.Object[]) queryCachingPolicyArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray44, (java.lang.Object[]) queryCachingPolicyArray61);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy74 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy75 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray76 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy74, queryCachingPolicy75 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet77 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray76);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet78 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray76);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy79 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy80 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray81 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy79, queryCachingPolicy80 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet82 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray81);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy83 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy84 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray85 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy83, queryCachingPolicy84 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet86 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray85);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet87 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray81, (java.lang.Object[]) queryCachingPolicyArray85);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet89 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray81);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray76, (java.lang.Object[]) queryCachingPolicyArray81);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy91 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy92 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray93 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy91, queryCachingPolicy92 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet94 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray93);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet95 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray93);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray76, (java.lang.Object[]) queryCachingPolicyArray93);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) queryCachingPolicyArray61, (java.lang.Object[]) queryCachingPolicyArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray32, (java.lang.Object[]) queryCachingPolicyArray76);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charArray2, (java.lang.Object[]) queryCachingPolicyArray76);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 100);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6505");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.maxfailures" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray2);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (byte) 10, postingsEnum22, postingsEnum23);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        java.lang.String str40 = commonGramsTokenFilterFactoryTests33.getTestName();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("<unknown>", indexReader43, (int) (byte) 10, postingsEnum45, postingsEnum46);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray31);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray52, intArray53);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray56);
        org.junit.Assert.assertArrayEquals(intArray31, intArray56);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray68, intArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray63, intArray72);
        org.junit.Assert.assertArrayEquals("", intArray31, intArray63);
        org.junit.Assert.assertArrayEquals(intArray8, intArray31);
        java.lang.Class<?> wildcardClass79 = intArray8.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray82 = (java.lang.Class<?>[]) classArray81;
        wildcardClassArray82[0] = wildcardClass79;
        java.util.Set<java.lang.Class<?>> wildcardClassSet85 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray82);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray82);
        java.util.Set<java.lang.reflect.Type> typeSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray82);
        java.util.Set<java.lang.Object> objSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) wildcardClassArray82);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray82);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) wildcardClassArray82);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray2, (java.lang.Object[]) wildcardClassArray82);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6506");
        int[][] intArray1 = new int[][] {};
        int[][][] intArray2 = new int[][][] { intArray1 };
        int[][] intArray3 = new int[][] {};
        int[][][] intArray4 = new int[][][] { intArray3 };
        int[][] intArray5 = new int[][] {};
        int[][][] intArray6 = new int[][][] { intArray5 };
        int[][] intArray7 = new int[][] {};
        int[][][] intArray8 = new int[][][] { intArray7 };
        int[][][][] intArray9 = new int[][][][] { intArray2, intArray4, intArray6, intArray8 };
        java.util.Set<int[][][]> intArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(intArray9);
        java.util.Set<int[][][]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray9);
        java.util.Set<int[][][]> intArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(intArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) "tests.slow");
        java.lang.String str21 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.tearDown();
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        org.junit.Assert.assertArrayEquals(charArray35, charArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray28, charArray35);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray53, charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray60, charArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray56, charArray63);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals(charArray68, charArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray63, charArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray35, charArray63);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) charArray63);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        char[][] charArray79 = new char[][] { charArray77, charArray78 };
        java.util.Set<char[]> charArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(charArray79);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        char[][] charArray83 = new char[][] { charArray81, charArray82 };
        java.util.Set<char[]> charArraySet84 = org.apache.lucene.util.LuceneTestCase.asSet(charArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray79, (java.lang.Object[]) charArray83);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) charArray79);
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.failfast", postingsEnum88, postingsEnum89, false);
        org.elasticsearch.common.settings.Settings.Builder builder92 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass93 = builder92.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) intArray9, (java.lang.Object) builder92);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6507");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6508");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("tests.failfast", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("tests.slow", indexReader28, (int) '#', postingsEnum30, postingsEnum31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule11, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("", indexReader37, 100, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests13.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6509");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("random", indexReader4, terms5, terms6, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader13, fields14, fields15, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6510");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.weekly", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("random", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("hi!", indexReader43, (int) '#', postingsEnum45, postingsEnum46);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum46);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum52, postingsEnum53);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100, (double) (short) 100);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0.0f, (double) 10);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6513");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        java.lang.String str8 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("random", indexReader16, terms17, terms18, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (int) (short) 100, postingsEnum27, postingsEnum28);
        commonGramsTokenFilterFactoryTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6514");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy5, queryCachingPolicy6 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray7);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray7);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet11 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray15 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy13, queryCachingPolicy14 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet16 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray15);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet17 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray15);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray20 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy18, queryCachingPolicy19 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet21 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray20);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy23 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray24 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy22, queryCachingPolicy23 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet25 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray24);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet26 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray20, (java.lang.Object[]) queryCachingPolicyArray24);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet28 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray20);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray15, (java.lang.Object[]) queryCachingPolicyArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray20);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy33 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray35 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy33, queryCachingPolicy34 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet36 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy38 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy39 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray40 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy38, queryCachingPolicy39 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet41 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray40);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy42 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy43 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray44 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy42, queryCachingPolicy43 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet45 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray44);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet46 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray40, (java.lang.Object[]) queryCachingPolicyArray44);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet48 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray40);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray35, (java.lang.Object[]) queryCachingPolicyArray40);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy50 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy51 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray52 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy50, queryCachingPolicy51 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet53 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray52);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet54 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray35, (java.lang.Object[]) queryCachingPolicyArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests57.assertFieldsEquals("random", indexReader59, fields60, fields61, false);
        java.lang.String str64 = commonGramsTokenFilterFactoryTests57.getTestName();
        commonGramsTokenFilterFactoryTests57.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("random", indexReader68, fields69, fields70, false);
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests66.ruleChain;
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests66.assertPositionsSkippingEquals("", indexReader75, (int) (short) 10, postingsEnum77, postingsEnum78);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray80 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests57, commonGramsTokenFilterFactoryTests66 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet81 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray80);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet82 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) baseTokenStreamTestCaseArray80);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) queryCachingPolicyArray35, (java.lang.Object[]) baseTokenStreamTestCaseArray80);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 1, (double) '#');
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6516");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray8);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray15, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray24);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray41);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray47, byteArray51);
        org.junit.Assert.assertArrayEquals("hi!", byteArray32, byteArray47);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray57, byteArray58);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals("", byteArray58, byteArray61);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray67, byteArray68);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray68, byteArray72);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray76, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray77);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 1);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6518");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder3, (java.lang.Object) 100.0f);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (byte) 10, postingsEnum22, postingsEnum23);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder3, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.maxfailures", postingsEnum29, postingsEnum30, false);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("tests.awaitsfix", postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.maxfailures", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("<unknown>", postingsEnum49, postingsEnum50, false);
        java.lang.String str53 = commonGramsTokenFilterFactoryTests35.getTestName();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("random", indexReader57, fields58, fields59, false);
        java.lang.String str62 = commonGramsTokenFilterFactoryTests55.getTestName();
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        java.lang.String str64 = commonGramsTokenFilterFactoryTests55.getTestName();
        commonGramsTokenFilterFactoryTests55.tearDown();
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) testRule54, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        commonGramsTokenFilterFactoryTests55.setUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) builder33, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests55.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum71, postingsEnum72);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 100L, (float) (-1), (float) 100);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), 100.0f, (float) 0);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 10L);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 0);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6523");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        java.lang.String str13 = commonGramsTokenFilterFactoryTests6.getTestName();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray4, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum23, postingsEnum24, true);
        commonGramsTokenFilterFactoryTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("tests.badapples", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader35, 1, postingsEnum37, postingsEnum38, false);
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs(0);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        char[][] charArray45 = new char[][] { charArray43, charArray44 };
        java.util.Set<char[]> charArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        char[][] charArray49 = new char[][] { charArray47, charArray48 };
        java.util.Set<char[]> charArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(charArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray45, (java.lang.Object[]) charArray49);
        java.util.Set<char[]> charArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(charArray49);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) 0, (java.lang.Object) charArray49);
        java.lang.Object[] objArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) charArray49, objArray54);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) '4', (double) ' ');
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 10, (long) 100);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (-1), (float) '4');
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6527");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsEnumEquals("tests.awaitsfix", postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (int) (byte) 0, postingsEnum21, postingsEnum22);
        commonGramsTokenFilterFactoryTests11.tearDown();
        java.lang.String str25 = commonGramsTokenFilterFactoryTests11.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) str25);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6528");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray7, (java.lang.Object) 2);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray15, intArray16);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray19);
        org.junit.Assert.assertArrayEquals(intArray7, intArray19);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        java.lang.String str37 = commonGramsTokenFilterFactoryTests30.getTestName();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("<unknown>", indexReader40, (int) (byte) 10, postingsEnum42, postingsEnum43);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray28, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray28);
        org.junit.Assert.assertArrayEquals(intArray7, intArray28);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray7, (java.lang.Object) charSequenceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) intArray7);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6529");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader21, 10, postingsEnum23, postingsEnum24);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        java.lang.String str40 = commonGramsTokenFilterFactoryTests33.getTestName();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("<unknown>", indexReader43, (int) (byte) 10, postingsEnum45, postingsEnum46);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum50, postingsEnum51, true);
        commonGramsTokenFilterFactoryTests33.tearDown();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("", indexReader57, terms58, terms59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("enwiki.random.lines.txt", indexReader63, terms64, terms65, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) terms64);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6530");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray8, intArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25, throttling26, throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray28);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) intArray14, (java.lang.Object) throttlingArray28);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray34, strArray36 };
        java.util.Set<java.lang.String[]> strArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray28, (java.lang.Object[]) strArray37);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 100, (long) 0);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6532");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) (short) 10, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6533");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.awaitsfix", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.nightly", indexReader31, terms32, terms33, false);
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(1);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("random", indexReader51, fields52, fields53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests49.assertPositionsSkippingEquals("random", indexReader57, (int) '#', postingsEnum59, postingsEnum60);
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests49.ruleChain;
        commonGramsTokenFilterFactoryTests49.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests49.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("random", indexReader68, fields69, fields70, false);
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder65, (java.lang.Object) commonGramsTokenFilterFactoryTests66);
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        commonGramsTokenFilterFactoryTests66.assertTermsEquals("enwiki.random.lines.txt", indexReader80, terms81, terms82, true);
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsEnumEquals("", postingsEnum86, postingsEnum87, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str48, (java.lang.Object) false);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6534");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) '4', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6535");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray13);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        org.junit.Assert.assertArrayEquals(charArray19, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray32, charArray35);
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray29);
        org.junit.Assert.assertArrayEquals(charArray6, charArray19);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray51, charArray58);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals(charArray63, charArray66);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray58, charArray66);
        org.junit.Assert.assertArrayEquals(charArray19, charArray58);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals(charArray73, charArray76);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals(charArray80, charArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray76, charArray83);
        org.junit.Assert.assertArrayEquals(charArray58, charArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) charArray58);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6536");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader8, fields9, fields10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 0, (double) '#');
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6538");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.weekly", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) -1, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '4', (double) '4', (double) (byte) 1);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6540");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100.0f, (double) (-1), (-1.0d));
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6542");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests34.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests34.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) "tests.slow");
        java.lang.String str40 = commonGramsTokenFilterFactoryTests34.getTestName();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests34.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsEnumEquals("tests.slow", postingsEnum50, postingsEnum51, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum50);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6543");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.monster", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader29, 10, postingsEnum31, postingsEnum32);
        java.lang.String str34 = commonGramsTokenFilterFactoryTests2.getTestName();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6544");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 'a', (float) 100L, (float) (byte) 1);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6545");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray13);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray44);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray59);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray13, shortArray68);
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray13);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6546");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23, true);
        commonGramsTokenFilterFactoryTests5.tearDown();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests5.ruleChain;
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray29, intArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        java.lang.String str39 = commonGramsTokenFilterFactoryTests32.getTestName();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("<unknown>", indexReader42, (int) (byte) 10, postingsEnum44, postingsEnum45);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray30, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum49, postingsEnum50, true);
        commonGramsTokenFilterFactoryTests32.tearDown();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) testRule27, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.junit.Assert.assertNotEquals((java.lang.Object) 0.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.elasticsearch.common.settings.Settings.Builder builder57 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.weekly", indexReader60, (int) ' ', postingsEnum62, postingsEnum63, false);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("tests.nightly", indexReader67, fields68, fields69, true);
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.NumericDocValues numericDocValues76 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests32.assertDocValuesEquals("tests.badapples", 0, numericDocValues76, numericDocValues77);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6547");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader11, (int) '4', postingsEnum13, postingsEnum14, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests0.ruleChain;
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray21, intArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray25, (java.lang.Object) 2);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray33, intArray37);
        org.junit.Assert.assertArrayEquals(intArray25, intArray37);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray48, (java.lang.Object) 2);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray56, intArray57);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray56, intArray60);
        org.junit.Assert.assertArrayEquals(intArray48, intArray60);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        commonGramsTokenFilterFactoryTests71.assertFieldsEquals("random", indexReader73, fields74, fields75, false);
        java.lang.String str78 = commonGramsTokenFilterFactoryTests71.getTestName();
        commonGramsTokenFilterFactoryTests71.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests71.assertPositionsSkippingEquals("<unknown>", indexReader81, (int) (byte) 10, postingsEnum83, postingsEnum84);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray69, (java.lang.Object) commonGramsTokenFilterFactoryTests71);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray69);
        org.junit.Assert.assertArrayEquals(intArray48, intArray69);
        org.junit.Assert.assertArrayEquals(intArray37, intArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule18, (java.lang.Object) intArray37);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) '4', (double) 10.0f);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 100.0f, (float) (-1L));
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) 0);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 1, (double) 1L);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6552");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.slow", indexReader14, terms15, terms16, false);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22, false);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.slow", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("hi!", indexReader34, fields35, fields36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) indexReader34);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6553");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray2, strArray4 };
        java.util.Set<java.lang.String[]> strArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String[]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String[]> strArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String[]> strArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsEnumEquals("tests.awaitsfix", postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (int) (byte) 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsEnumEquals("<unknown>", postingsEnum25, postingsEnum26, false);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests11.getTestName();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests31.getTestName();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        java.lang.String str40 = commonGramsTokenFilterFactoryTests31.getTestName();
        commonGramsTokenFilterFactoryTests31.tearDown();
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) testRule30, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) strArray5, (java.lang.Object) testRule30);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6554");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.slow", indexReader27, (int) '4', postingsEnum29, postingsEnum30);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests18.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6555");
        java.lang.Class[][] classArray3 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray4 = (java.lang.Class<?>[][]) classArray3;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray4);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray4);
        java.util.Set[][] setArray7 = new java.util.Set[][] {};
        java.util.Set<java.util.Set[]> setArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(setArray7);
        java.util.Set<java.util.Set[]> setArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(setArray7);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) wildcardClassArray4, (java.lang.Object[]) setArray7);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy12, queryCachingPolicy13 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet15 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray18 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy16, queryCachingPolicy17 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet19 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray18);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet20 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray14, (java.lang.Object[]) queryCachingPolicyArray18);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy24 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray26 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy24, queryCachingPolicy25 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet27 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray26);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet28 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray26);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray31 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy29, queryCachingPolicy30 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet32 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy33 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray35 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy33, queryCachingPolicy34 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet36 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray31, (java.lang.Object[]) queryCachingPolicyArray35);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet39 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray26, (java.lang.Object[]) queryCachingPolicyArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray14, (java.lang.Object[]) queryCachingPolicyArray31);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy44 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy45 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray46 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy44, queryCachingPolicy45 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet47 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray46);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet48 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray46);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy49 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy50 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray51 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy49, queryCachingPolicy50 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet52 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray51);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy53 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray55 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy53, queryCachingPolicy54 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet56 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray55);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet57 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray51, (java.lang.Object[]) queryCachingPolicyArray55);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet59 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray51);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray46, (java.lang.Object[]) queryCachingPolicyArray51);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy61 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy62 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray63 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy61, queryCachingPolicy62 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet64 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray63);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet65 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray46, (java.lang.Object[]) queryCachingPolicyArray63);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) queryCachingPolicyArray31, (java.lang.Object[]) queryCachingPolicyArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) wildcardClassArray4, (java.lang.Object[]) queryCachingPolicyArray31);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6556");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.slow", indexReader28, (int) '4', postingsEnum30, postingsEnum31);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray38, charArray43);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) charArray38);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("random", indexReader51, fields52, fields53, false);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests49.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests49.ruleChain;
        commonGramsTokenFilterFactoryTests49.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests49.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6557");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("tests.failfast", indexReader27, fields28, fields29, true);
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.awaitsfix", postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) (byte) 0, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("<unknown>", postingsEnum47, postingsEnum48, false);
        java.lang.String str51 = commonGramsTokenFilterFactoryTests33.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) str51);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests4.ruleChain;
        java.lang.Object obj56 = null;
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray60, byteArray64);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray71, byteArray75);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray80);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray85, byteArray86);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray89, byteArray90);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray86, byteArray90);
        org.junit.Assert.assertArrayEquals("hi!", byteArray71, byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray86);
        org.junit.Assert.assertNotSame("tests.slow", obj56, (java.lang.Object) byteArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule54, (java.lang.Object) byteArray60);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (byte) 100, (double) (short) 100, (double) 10);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6559");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder16, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("enwiki.random.lines.txt", indexReader31, fields32, fields33, false);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs(100);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader42, (int) (short) -1, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("tests.failfast", indexReader48, fields49, fields50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("tests.slow", indexReader54, (int) '#', postingsEnum56, postingsEnum57, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("tests.awaitsfix", postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        commonGramsTokenFilterFactoryTests60.assertTermsEquals("tests.nightly", indexReader68, terms69, terms70, false);
        commonGramsTokenFilterFactoryTests60.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum56, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        org.elasticsearch.common.settings.Settings.Builder builder76 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) builder76);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6560");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, objArray9);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6561");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 100L, (long) 100);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 0, (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6563");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str18 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader26, (int) (short) 0, postingsEnum28, postingsEnum29, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests35.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsEnumEquals("tests.awaitsfix", postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("tests.nightly", indexReader56, terms57, terms58, false);
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        java.lang.Object obj65 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("random", indexReader68, fields69, fields70, false);
        java.lang.String str73 = commonGramsTokenFilterFactoryTests66.getTestName();
        commonGramsTokenFilterFactoryTests66.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests66.assertPositionsSkippingEquals("<unknown>", indexReader76, (int) (byte) 10, postingsEnum78, postingsEnum79);
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests66.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj65, (java.lang.Object) commonGramsTokenFilterFactoryTests66);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("hi!", indexReader84, fields85, fields86, false);
        org.junit.rules.TestRule testRule89 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs(0);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) commonGramsTokenFilterFactoryTests66);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests66);
        org.apache.lucene.index.NumericDocValues numericDocValues96 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.failfast", (int) (byte) 100, numericDocValues96, numericDocValues97);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6564");
        double[] doubleArray3 = new double[] { 1L, 1L };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray3, doubleArray4, (double) (-1));
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6565");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][] doubleArray5 = new double[][] {};
        double[][] doubleArray6 = new double[][] {};
        double[][][] doubleArray7 = new double[][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5, doubleArray6 };
        java.util.Set<double[][]> doubleArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray7);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray13 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy11, queryCachingPolicy12 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray17 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy15, queryCachingPolicy16 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet18 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray17);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet19 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray13, (java.lang.Object[]) queryCachingPolicyArray17);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet21 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale10, (java.lang.Object) queryCachingPolicyArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) doubleArray7, (java.lang.Object[]) queryCachingPolicyArray13);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6566");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder11);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6567");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (byte) 10, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("<unknown>", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.slow", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) 1, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests3.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6568");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.maxfailures" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray1);
        int[][] intArray4 = new int[][] {};
        int[][][] intArray5 = new int[][][] { intArray4 };
        int[][] intArray6 = new int[][] {};
        int[][][] intArray7 = new int[][][] { intArray6 };
        int[][] intArray8 = new int[][] {};
        int[][][] intArray9 = new int[][][] { intArray8 };
        int[][] intArray10 = new int[][] {};
        int[][][] intArray11 = new int[][][] { intArray10 };
        int[][][][] intArray12 = new int[][][][] { intArray5, intArray7, intArray9, intArray11 };
        java.util.Set<int[][][]> intArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray29 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests14, commonGramsTokenFilterFactoryTests21, commonGramsTokenFilterFactoryTests28 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet30 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("random", indexReader40, fields41, fields42, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray46 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests31, commonGramsTokenFilterFactoryTests38, commonGramsTokenFilterFactoryTests45 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet47 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray46);
        java.util.Collection[] collectionArray49 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray50 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray49;
        baseTokenStreamTestCaseCollectionArray50[0] = baseTokenStreamTestCaseSet30;
        baseTokenStreamTestCaseCollectionArray50[1] = baseTokenStreamTestCaseSet47;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet55 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) intArraySet13, (java.lang.Object) baseTokenStreamTestCaseCollectionArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray50);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 1, (double) 10L);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6570");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.weekly", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("random", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("hi!", indexReader43, (int) '#', postingsEnum45, postingsEnum46);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum46);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum52, postingsEnum53, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6571");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6572");
        float[] floatArray5 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray11 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("<unknown>", indexReader29, (int) (byte) 10, postingsEnum31, postingsEnum32);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray17, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum36, postingsEnum37, true);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) 'a');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("random", indexReader45, fields46, fields47, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests50.assertFieldsEquals("random", indexReader52, fields53, fields54, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray58 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests43, commonGramsTokenFilterFactoryTests50, commonGramsTokenFilterFactoryTests57 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet59 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray58);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) baseTokenStreamTestCaseSet59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.awaitsfix", indexReader62, 1, postingsEnum64, postingsEnum65);
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray11, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        float[] floatArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray69, (float) 10L);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 100L);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 10.0f);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6575");
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
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray18);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray18);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 100.0d, (-1.0d));
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 10L, (double) 3);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1, (double) 1.0f, (double) 100);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) -1, (long) 4);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6581");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader9, (int) '#', postingsEnum11, postingsEnum12);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.slow", postingsEnum16, postingsEnum17, false);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader24, fields25, fields26, true);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) builder30);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6582");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray18);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray45, (java.lang.Object) 2);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray57);
        org.junit.Assert.assertArrayEquals(intArray45, intArray57);
        org.junit.Assert.assertArrayEquals(intArray34, intArray57);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray66, intArray67);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray66, intArray70);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray76, intArray80);
        org.junit.Assert.assertArrayEquals("", intArray70, intArray80);
        org.junit.Assert.assertArrayEquals(intArray34, intArray80);
        org.junit.Assert.assertArrayEquals(intArray18, intArray34);
        int[] intArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray18, intArray87);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6583");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.slow", indexReader28, (int) '4', postingsEnum30, postingsEnum31);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        commonGramsTokenFilterFactoryTests19.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) builder35);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6584");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum14, postingsEnum15, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] { charSequenceArray29, charSequenceArray36 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray54 = new java.lang.CharSequence[][] { charSequenceArray46, charSequenceArray53 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests56.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsEnumEquals("tests.awaitsfix", postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        commonGramsTokenFilterFactoryTests56.assertTermsEquals("tests.nightly", indexReader64, terms65, terms66, false);
        commonGramsTokenFilterFactoryTests56.setUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("tests.slow", indexReader71, (int) (short) 10, postingsEnum73, postingsEnum74, true);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        commonGramsTokenFilterFactoryTests56.assertTermsEquals("", indexReader78, terms79, terms80, true);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("hi!", indexReader84, (int) (byte) -1, postingsEnum86, postingsEnum87, true);
        commonGramsTokenFilterFactoryTests56.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray54, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray20, (java.lang.Object) charSequenceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder19, (java.lang.Object) shortArray20);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 10, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) '#');
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) -1, (long) (short) 1);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6588");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6589");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray17 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests16 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray17);
        java.util.Set<org.junit.Assert> assertSet19 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray17);
        org.junit.Assert.assertNotEquals("tests.failfast", obj1, (java.lang.Object) baseTokenStreamTestCaseArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("tests.monster", indexReader26, terms27, terms28, false);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("tests.nightly", indexReader34, fields35, fields36, true);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray54);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray70);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray70, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) builder39, (java.lang.Object) charSequenceArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseTokenStreamTestCaseArray17, (java.lang.Object[]) charSequenceArray70);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6590");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray15 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests14 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray32 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests31 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray32);
        java.util.Collection[] collectionArray35 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray36 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray35;
        baseTokenStreamTestCaseCollectionArray36[0] = baseTokenStreamTestCaseSet16;
        baseTokenStreamTestCaseCollectionArray36[1] = baseTokenStreamTestCaseSet33;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet41 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray36);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray45, intArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests48.assertFieldsEquals("random", indexReader50, fields51, fields52, false);
        java.lang.String str55 = commonGramsTokenFilterFactoryTests48.getTestName();
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("<unknown>", indexReader58, (int) (byte) 10, postingsEnum60, postingsEnum61);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray46, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray46);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray67, intArray71);
        org.junit.Assert.assertArrayEquals(intArray46, intArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object) intArray71);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        byte[] byteArray91 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        byte[][] byteArray92 = new byte[][] { byteArray81, byteArray86, byteArray91 };
        java.util.Set<byte[]> byteArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object[]) byteArray92);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6591");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader9, fields10, fields11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader15, (int) '#', postingsEnum17, postingsEnum18, false);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24, false);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6592");
        short[] shortArray0 = null;
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray24, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray47);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray58, shortArray61);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray69);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray69);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6593");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray8, intArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24, throttling25, throttling26, throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray28);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) intArray14, (java.lang.Object) throttlingArray28);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray37, intArray41);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals(intArray41, intArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling57, throttling58, throttling59, throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray61);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) intArray47, (java.lang.Object) throttlingArray61);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray68, intArray72);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray47, intArray68);
        org.junit.Assert.assertArrayEquals(intArray14, intArray68);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) intArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray14);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6594");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests7.ruleChain;
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests7.tearDown();
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests7.getClass();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray65);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray65);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray82 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet83 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray82);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray82);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray82);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray94 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet95 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray94);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) charSequenceArray94);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 1, 0.0d);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6596");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests20.getTestName();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("<unknown>", indexReader30, (int) (byte) 10, postingsEnum32, postingsEnum33);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray18, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader43, fields44, fields45, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray57, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray73, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray64);
        org.apache.lucene.index.NumericDocValues numericDocValues87 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (-1), numericDocValues87, numericDocValues88);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, 0.0d, (double) 1.0f);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6598");
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray4 = new java.lang.CharSequence[][][] { charSequenceArray1, charSequenceArray2, charSequenceArray3 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray8, intArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray12, (java.lang.Object) 2);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray20, intArray24);
        org.junit.Assert.assertArrayEquals(intArray12, intArray24);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        java.lang.String str42 = commonGramsTokenFilterFactoryTests35.getTestName();
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("<unknown>", indexReader45, (int) (byte) 10, postingsEnum47, postingsEnum48);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray33, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray33);
        org.junit.Assert.assertArrayEquals(intArray12, intArray33);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray65);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray12, (java.lang.Object) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray76, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) charSequenceArray4, (java.lang.Object[]) charSequenceArray83);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6599");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray1, commonGramsTokenFilterFactoryTestsArray2, commonGramsTokenFilterFactoryTestsArray3, commonGramsTokenFilterFactoryTestsArray4, commonGramsTokenFilterFactoryTestsArray5, commonGramsTokenFilterFactoryTestsArray6 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray8, commonGramsTokenFilterFactoryTestsArray9, commonGramsTokenFilterFactoryTestsArray10, commonGramsTokenFilterFactoryTestsArray11, commonGramsTokenFilterFactoryTestsArray12, commonGramsTokenFilterFactoryTestsArray13 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] commonGramsTokenFilterFactoryTestsArray15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] { commonGramsTokenFilterFactoryTestsArray7, commonGramsTokenFilterFactoryTestsArray14 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray15);
        java.lang.Object[] objArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray15, objArray17);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) 0L, (double) '4');
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6601");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (byte) 10, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(0);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule22;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("random", indexReader33, (int) '#', postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        commonGramsTokenFilterFactoryTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("tests.slow", indexReader51, (int) '4', postingsEnum53, postingsEnum54);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests42.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum62, postingsEnum63, false);
        commonGramsTokenFilterFactoryTests59.tearDown();
        commonGramsTokenFilterFactoryTests59.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule58, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsEnumEquals("", postingsEnum70, postingsEnum71, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) testRule22, (java.lang.Object) postingsEnum70);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6602");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader9, (int) (short) 10, postingsEnum11, postingsEnum12);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader17, fields18, fields19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6603");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) ' ', 0.0f);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6604");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.slow", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.weekly", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader21, fields22, fields23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray37 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures29, testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures33, testRuleIgnoreAfterMaxFailures35 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray37);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) testRule26, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests41.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy43 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy44 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy45 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray46 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy43, queryCachingPolicy44, queryCachingPolicy45 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy47 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy48 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy49 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray50 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy47, queryCachingPolicy48, queryCachingPolicy49 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray51 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray46, queryCachingPolicyArray50 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray51);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder42, (java.lang.Object) queryCachingPolicyArray51);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("random", indexReader60, 10, postingsEnum62, postingsEnum63);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.monster", indexReader66, 0, postingsEnum68, postingsEnum69);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) "tests.failfast");
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("random", indexReader76, fields77, fields78, true);
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) queryCachingPolicyArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray37, (java.lang.Object[]) queryCachingPolicyArray51);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6605");
        double[] doubleArray4 = new double[] { (byte) 1, '#' };
        double[] doubleArray7 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { (byte) 1, '#' };
        double[] doubleArray15 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) 100.0f);
        double[] doubleArray22 = new double[] { (byte) 1, '#' };
        double[] doubleArray25 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray7, doubleArray25, 100.0d);
        double[] doubleArray32 = new double[] { (byte) 1, '#' };
        double[] doubleArray35 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        double[] doubleArray40 = new double[] { (byte) 1, '#' };
        double[] doubleArray43 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray43, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray43, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray35, (double) (byte) 100);
        double[] doubleArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray35, doubleArray50, (double) 100);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6606");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        java.lang.String str8 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.tearDown();
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        org.junit.Assert.assertArrayEquals(charArray22, charArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray15, charArray22);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray43, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray22, charArray50);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray50);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        char[][] charArray66 = new char[][] { charArray64, charArray65 };
        java.util.Set<char[]> charArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        char[][] charArray70 = new char[][] { charArray68, charArray69 };
        java.util.Set<char[]> charArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(charArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray66, (java.lang.Object[]) charArray70);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charArray66);
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader75, (int) (short) 100, postingsEnum77, postingsEnum78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 100);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6607");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("", indexReader27, fields28, fields29, true);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6608");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", 1.0d, (double) (short) 0, 10.0d);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6609");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader20, (int) '#', postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6610");
        java.lang.Object obj3 = null;
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray7, charArray10);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray20);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray7, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray7, charArray24);
        org.junit.Assert.assertNotSame("", obj3, (java.lang.Object) charArray7);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals(charArray34, charArray39);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray47, charArray50);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("", charArray44, charArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray34, charArray44);
        org.junit.Assert.assertArrayEquals("hi!", charArray7, charArray34);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        long[][] longArray64 = new long[][] { longArray60, longArray61, longArray62, longArray63 };
        long[][][] longArray65 = new long[][][] { longArray64 };
        long[][][][] longArray66 = new long[][][][] { longArray65 };
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        long[][] longArray71 = new long[][] { longArray67, longArray68, longArray69, longArray70 };
        long[][][] longArray72 = new long[][][] { longArray71 };
        long[][][][] longArray73 = new long[][][][] { longArray72 };
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        long[][] longArray78 = new long[][] { longArray74, longArray75, longArray76, longArray77 };
        long[][][] longArray79 = new long[][][] { longArray78 };
        long[][][][] longArray80 = new long[][][][] { longArray79 };
        long[][][][][] longArray81 = new long[][][][][] { longArray66, longArray73, longArray80 };
        java.util.Set<long[][][][]> longArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(longArray81);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) charArray7, (java.lang.Object) longArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) '4');
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) ' ');
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 3, (double) (-1L), 0.0d);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6614");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        char[][] charArray2 = new char[][] { charArray0, charArray1 };
        java.util.Set<char[]> charArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        char[][] charArray6 = new char[][] { charArray4, charArray5 };
        java.util.Set<char[]> charArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray2, (java.lang.Object[]) charArray6);
        java.util.Set<char[]> charArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(charArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("tests.nightly", indexReader18, terms19, terms20, false);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) builder28);
        long[] longArray36 = new long[] { (-1), (byte) -1, 'a', '4', (short) 0 };
        long[][] longArray37 = new long[][] { longArray36 };
        java.util.Set<long[]> longArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(longArray37);
        java.lang.Object obj39 = null;
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) longArray37, obj39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charArray2, (java.lang.Object[]) longArray37);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (long) 2);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6616");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        java.lang.String str21 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        java.lang.Class<?> wildcardClass23 = commonGramsTokenFilterFactoryTests5.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) wildcardClass23);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6617");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        commonGramsTokenFilterFactoryTests8.tearDown();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests8.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6618");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] { charSequenceArray8, charSequenceArray15 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.awaitsfix", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("tests.nightly", indexReader26, terms27, terms28, false);
        commonGramsTokenFilterFactoryTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("tests.slow", indexReader33, (int) (short) 10, postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("", indexReader40, terms41, terms42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("hi!", indexReader46, (int) (byte) -1, postingsEnum48, postingsEnum49, true);
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        java.util.Set<java.lang.Cloneable> cloneableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) charSequenceArray16);
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) charSequenceArray16);
        java.lang.Class[][] classArray58 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray59 = (java.lang.Class<?>[][]) classArray58;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet60 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray59);
        java.util.Set[] setArray63 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray64 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray63;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray63);
        java.lang.Object obj66 = null;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) setArray63, obj66);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray59, (java.lang.Object[]) setArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) setArray63);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) 3, (float) (short) -1);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) -1);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6621");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) "tests.slow");
        java.lang.String str25 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) testRuleIgnoreAfterMaxFailures17, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "random");
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader31, 100, postingsEnum33, postingsEnum34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6622");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "tests.slow");
        java.lang.String str10 = commonGramsTokenFilterFactoryTests4.getTestName();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) false);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1.0f, 0.0d);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6624");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) 2);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray20);
        org.junit.Assert.assertArrayEquals(intArray8, intArray20);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray28, intArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests31.getTestName();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("<unknown>", indexReader41, (int) (byte) 10, postingsEnum43, postingsEnum44);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray29, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray29);
        org.junit.Assert.assertArrayEquals(intArray8, intArray29);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray51, intArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray55, (java.lang.Object) 2);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray67);
        org.junit.Assert.assertArrayEquals(intArray55, intArray67);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray75, intArray76);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        commonGramsTokenFilterFactoryTests78.assertFieldsEquals("random", indexReader80, fields81, fields82, false);
        java.lang.String str85 = commonGramsTokenFilterFactoryTests78.getTestName();
        commonGramsTokenFilterFactoryTests78.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        commonGramsTokenFilterFactoryTests78.assertPositionsSkippingEquals("<unknown>", indexReader88, (int) (byte) 10, postingsEnum90, postingsEnum91);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray76, (java.lang.Object) commonGramsTokenFilterFactoryTests78);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray76);
        org.junit.Assert.assertArrayEquals(intArray55, intArray76);
        org.junit.Assert.assertArrayEquals(intArray29, intArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray29);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6625");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy5, queryCachingPolicy6 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray7);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray7);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray7);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet11 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.badapples", indexReader16, terms17, terms18, false);
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests24.ruleChain;
        commonGramsTokenFilterFactoryTests24.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) 0);
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("tests.nightly", indexReader39, fields40, fields41, false);
        commonGramsTokenFilterFactoryTests24.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, false);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) testRule22, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        java.lang.Object obj52 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        commonGramsTokenFilterFactoryTests53.assertFieldsEquals("random", indexReader55, fields56, fields57, false);
        java.lang.String str60 = commonGramsTokenFilterFactoryTests53.getTestName();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("<unknown>", indexReader63, (int) (byte) 10, postingsEnum65, postingsEnum66);
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj52, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests53.ruleChain;
        commonGramsTokenFilterFactoryTests53.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) testRule22, (java.lang.Object) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) queryCachingPolicyArray3, (java.lang.Object) testRule22);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6626");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        java.lang.String str16 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader18, terms19, terms20, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests24.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) terms19, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        commonGramsTokenFilterFactoryTests24.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader38, (int) (short) -1, postingsEnum40, postingsEnum41);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.monster", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests49.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader52, (int) (short) -1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("tests.failfast", indexReader58, fields59, fields60, true);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsSkippingEquals("tests.slow", indexReader64, (int) '#', postingsEnum66, postingsEnum67, false);
        org.elasticsearch.common.settings.Settings.Builder builder70 = commonGramsTokenFilterFactoryTests49.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsEnumEquals("tests.weekly", postingsEnum72, postingsEnum73, false);
        commonGramsTokenFilterFactoryTests49.setUp();
        commonGramsTokenFilterFactoryTests49.setIndexWriterMaxDocs(0);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) postingsEnum47, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        java.lang.Object obj80 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests49, obj80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (short) -1, (float) 0L);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 4, (-1.0d));
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 1);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6630");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) (byte) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6632");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[][] charArray3 = new char[][] { charArray1, charArray2 };
        java.util.Set<char[]> charArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        java.util.Set<char[]> charArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        java.lang.Class[][] classArray7 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray8 = (java.lang.Class<?>[][]) classArray7;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray8);
        java.util.Set<java.lang.reflect.Type[]> typeArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[][]) wildcardClassArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charArray3, (java.lang.Object[]) wildcardClassArray8);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6633");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("random", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("<unknown>", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.nightly", indexReader27, 5, postingsEnum29, postingsEnum30, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100L, 1.0d);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6635");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader9, fields10, fields11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader15, (int) '#', postingsEnum17, postingsEnum18, false);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6636");
        short[] shortArray5 = new short[] { (short) 1, (byte) -1, (byte) 1, (short) 100 };
        short[] shortArray10 = new short[] { (short) 1, (byte) -1, (byte) 1, (short) 100 };
        short[] shortArray15 = new short[] { (short) 1, (byte) -1, (byte) 1, (short) 100 };
        short[] shortArray20 = new short[] { (short) 1, (byte) -1, (byte) 1, (short) 100 };
        short[][] shortArray21 = new short[][] { shortArray5, shortArray10, shortArray15, shortArray20 };
        short[][][] shortArray22 = new short[][][] { shortArray21 };
        java.util.Set<short[][]> shortArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) shortArraySet23);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6637");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.weekly", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum32, postingsEnum33, false);
        java.lang.String str36 = commonGramsTokenFilterFactoryTests29.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.awaitsfix", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.badapples", indexReader43, terms44, terms45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.failfast", indexReader49, terms50, terms51, false);
        java.lang.String str54 = commonGramsTokenFilterFactoryTests29.getTestName();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader56, (int) (short) 10, postingsEnum58, postingsEnum59);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader56);
        java.lang.String str62 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        commonGramsTokenFilterFactoryTests66.assertFieldsEquals("random", indexReader68, fields69, fields70, false);
        java.lang.String str73 = commonGramsTokenFilterFactoryTests66.getTestName();
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests66);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests66.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests63, (java.lang.Object) testRule76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str62, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6638");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.String str24 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) ' ', numericDocValues27, numericDocValues28);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6639");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests16.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("", indexReader32, fields33, fields34, false);
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("random", indexReader40, fields41, fields42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) 'a');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests48.assertFieldsEquals("random", indexReader50, fields51, fields52, false);
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests48.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        java.lang.String str61 = commonGramsTokenFilterFactoryTests48.getTestName();
        java.lang.Object obj63 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests64.assertFieldsEquals("random", indexReader66, fields67, fields68, false);
        java.lang.String str71 = commonGramsTokenFilterFactoryTests64.getTestName();
        commonGramsTokenFilterFactoryTests64.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("<unknown>", indexReader74, (int) (byte) 10, postingsEnum76, postingsEnum77);
        org.junit.rules.TestRule testRule79 = commonGramsTokenFilterFactoryTests64.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj63, (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests64.assertFieldsEquals("tests.badapples", indexReader82, fields83, fields84, true);
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("", indexReader88, 100, postingsEnum90, postingsEnum91);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray93 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests16, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests38, commonGramsTokenFilterFactoryTests48, commonGramsTokenFilterFactoryTests64 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet94 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray93);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet95 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray93);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet96 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray93);
        java.util.Locale[][][] localeArray97 = new java.util.Locale[][][] {};
        java.util.Set<java.util.Locale[][]> localeArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray93, (java.lang.Object[]) localeArray97);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6640");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader14, fields15, fields16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields16);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 100);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6642");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5, throttling6 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11, throttling12 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling14, throttling15 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray4, throttlingArray7, throttlingArray10, throttlingArray13, throttlingArray16 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.awaitsfix", postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("tests.nightly", indexReader41, terms42, terms43, false);
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule48;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule48;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) throttlingArray17, (java.lang.Object) testRule48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests52.tearDown();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        commonGramsTokenFilterFactoryTests52.assertTermsEquals("tests.monster", indexReader57, terms58, terms59, false);
        commonGramsTokenFilterFactoryTests52.setIndexWriterMaxDocs(100);
        java.lang.String str64 = commonGramsTokenFilterFactoryTests52.getTestName();
        commonGramsTokenFilterFactoryTests52.tearDown();
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures66);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures68 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures69 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures68);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures70 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures71 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures70);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures72 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures73 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures72);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures74 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures75 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures74);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray76 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures67, testRuleIgnoreAfterMaxFailures68, testRuleIgnoreAfterMaxFailures70, testRuleIgnoreAfterMaxFailures72, testRuleIgnoreAfterMaxFailures74 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet77 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray76);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet78 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray76);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests52, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray76);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) throttlingArray17, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray76);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6643");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests1.getClass();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray76);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray76);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray28);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) charSequenceArray18);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy84 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass85 = queryCachingPolicy84.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy86 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass87 = queryCachingPolicy86.getClass();
        java.lang.reflect.Type[] typeArray88 = new java.lang.reflect.Type[] { wildcardClass85, wildcardClass87 };
        java.util.Set<java.lang.reflect.Type> typeSet89 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) typeArray88);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6644");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray10, byteArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray24);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray31, byteArray35);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray40);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals("hi!", byteArray31, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray46);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray58, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray59, byteArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray46, byteArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicyArray3, (java.lang.Object) byteArray63);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy68 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy69 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray70 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy68, queryCachingPolicy69 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet71 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray70);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy72 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy73 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray74 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy72, queryCachingPolicy73 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet75 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray74);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet76 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray70, (java.lang.Object[]) queryCachingPolicyArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray70);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray79 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray80 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray81 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray82 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray83 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray84 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray85 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray79, commonGramsTokenFilterFactoryTestsArray80, commonGramsTokenFilterFactoryTestsArray81, commonGramsTokenFilterFactoryTestsArray82, commonGramsTokenFilterFactoryTestsArray83, commonGramsTokenFilterFactoryTestsArray84 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray86 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray87 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray88 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray89 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray90 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray91 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray92 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray86, commonGramsTokenFilterFactoryTestsArray87, commonGramsTokenFilterFactoryTestsArray88, commonGramsTokenFilterFactoryTestsArray89, commonGramsTokenFilterFactoryTestsArray90, commonGramsTokenFilterFactoryTestsArray91 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] commonGramsTokenFilterFactoryTestsArray93 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] { commonGramsTokenFilterFactoryTestsArray85, commonGramsTokenFilterFactoryTestsArray92 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray93);
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet95 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray93);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray93);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6645");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule19;
        double[] doubleArray23 = new double[] { (byte) 1, '#' };
        double[] doubleArray26 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray31, (java.lang.Object) 1L);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule19, (java.lang.Object) doubleArray31);
        double[] doubleArray46 = new double[] { (byte) 1, '#' };
        double[] doubleArray49 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 100L);
        double[] doubleArray54 = new double[] { (byte) 1, '#' };
        double[] doubleArray57 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray57, (double) 100L);
        double[] doubleArray62 = new double[] { (byte) 1, '#' };
        double[] doubleArray65 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray65, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray65, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray49, doubleArray57, (double) 100.0f);
        double[] doubleArray74 = new double[] { (byte) 1, '#' };
        double[] doubleArray77 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray57, doubleArray77, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray31, doubleArray57, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray31, (double) 1.0f);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6646");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        java.lang.String str13 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum15, postingsEnum16, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1), 0.0d);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6648");
        java.util.Set[][] setArray1 = new java.util.Set[][] {};
        java.util.Set<java.util.Set[]> setArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(setArray1);
        java.util.Set<java.util.Set[]> setArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(setArray1);
        java.lang.Class[][] classArray5 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray6 = (java.lang.Class<?>[][]) classArray5;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) setArray1, (java.lang.Object[]) wildcardClassArray6);
        java.util.Set[] setArray10 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray11 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray10;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray10);
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) setArray1, (java.lang.Object[]) setArray10);
        byte[][] byteArray15 = new byte[][] {};
        byte[][] byteArray16 = new byte[][] {};
        byte[][] byteArray17 = new byte[][] {};
        byte[][][] byteArray18 = new byte[][][] { byteArray15, byteArray16, byteArray17 };
        byte[][] byteArray19 = new byte[][] {};
        byte[][] byteArray20 = new byte[][] {};
        byte[][] byteArray21 = new byte[][] {};
        byte[][][] byteArray22 = new byte[][][] { byteArray19, byteArray20, byteArray21 };
        byte[][] byteArray23 = new byte[][] {};
        byte[][] byteArray24 = new byte[][] {};
        byte[][] byteArray25 = new byte[][] {};
        byte[][][] byteArray26 = new byte[][][] { byteArray23, byteArray24, byteArray25 };
        byte[][] byteArray27 = new byte[][] {};
        byte[][] byteArray28 = new byte[][] {};
        byte[][] byteArray29 = new byte[][] {};
        byte[][][] byteArray30 = new byte[][][] { byteArray27, byteArray28, byteArray29 };
        byte[][] byteArray31 = new byte[][] {};
        byte[][] byteArray32 = new byte[][] {};
        byte[][] byteArray33 = new byte[][] {};
        byte[][][] byteArray34 = new byte[][][] { byteArray31, byteArray32, byteArray33 };
        byte[][][][] byteArray35 = new byte[][][][] { byteArray18, byteArray22, byteArray26, byteArray30, byteArray34 };
        java.util.Set<byte[][][]> byteArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray35);
        java.util.Set<byte[][][]> byteArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) setArray10, (java.lang.Object[]) byteArray35);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6649");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray11, (java.lang.Object) 1L);
        double[] doubleArray25 = new double[] { (byte) 1, '#' };
        double[] doubleArray28 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray28, (double) 100L);
        double[] doubleArray33 = new double[] { (byte) 1, '#' };
        double[] doubleArray36 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray36, (double) 100.0f);
        double[] doubleArray43 = new double[] { (byte) 1, '#' };
        double[] doubleArray46 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray46, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray28, doubleArray46, 100.0d);
        double[] doubleArray53 = new double[] { (byte) 1, '#' };
        double[] doubleArray56 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        double[] doubleArray61 = new double[] { (byte) 1, '#' };
        double[] doubleArray64 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray64, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray64, (double) (byte) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray11, doubleArray28, 1.0d);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6650");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) 2);
        int[] intArray18 = new int[] { 1, '4', (short) -1, (short) 100, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray18);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6651");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields17);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6652");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        double[] doubleArray14 = new double[] { (byte) 1, '#' };
        double[] doubleArray17 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray17, (double) 100L);
        double[] doubleArray22 = new double[] { (byte) 1, '#' };
        double[] doubleArray25 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray22, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray22, (java.lang.Object) 1L);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule10, (java.lang.Object) doubleArray22);
        double[] doubleArray36 = new double[] { (byte) 1, '#' };
        double[] doubleArray39 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray39, (double) 100L);
        double[] doubleArray44 = new double[] { (byte) 1, '#' };
        double[] doubleArray47 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 100L);
        double[] doubleArray52 = new double[] { (byte) 1, '#' };
        double[] doubleArray55 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray55, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray39, doubleArray47, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray39, (double) '4');
        double[] doubleArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray39, doubleArray64, (double) 0);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6653");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.badapples", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader33, 1, postingsEnum35, postingsEnum36, false);
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.awaitsfix", indexReader42, (int) (byte) 10, postingsEnum44, postingsEnum45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray53);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray56);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray56, shortArray79);
        short[] shortArray88 = new short[] {};
        short[] shortArray89 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray88, shortArray89);
        short[] shortArray91 = new short[] {};
        short[] shortArray92 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray91, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray88, shortArray92);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray79, shortArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum45, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6654");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0L, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1.0f, (float) ' ', (float) 3);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) 'a');
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, 0.0f, (float) 1);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6658");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        java.lang.Class[][][] classArray7 = new java.lang.Class[2][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray8 = (java.lang.Class<?>[][][]) classArray7;
        wildcardClassArray8[0] = wildcardClassArray2;
        wildcardClassArray8[1] = wildcardClassArray5;
        java.lang.Class[][] classArray14 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray15 = (java.lang.Class<?>[][]) classArray14;
        java.lang.Class[][] classArray17 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray18 = (java.lang.Class<?>[][]) classArray17;
        java.lang.Class[][][] classArray20 = new java.lang.Class[2][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray21 = (java.lang.Class<?>[][][]) classArray20;
        wildcardClassArray21[0] = wildcardClassArray15;
        wildcardClassArray21[1] = wildcardClassArray18;
        java.lang.Class[][] classArray27 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray28 = (java.lang.Class<?>[][]) classArray27;
        java.lang.Class[][] classArray30 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray31 = (java.lang.Class<?>[][]) classArray30;
        java.lang.Class[][][] classArray33 = new java.lang.Class[2][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray34 = (java.lang.Class<?>[][][]) classArray33;
        wildcardClassArray34[0] = wildcardClassArray28;
        wildcardClassArray34[1] = wildcardClassArray31;
        java.lang.Class[][] classArray40 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray41 = (java.lang.Class<?>[][]) classArray40;
        java.lang.Class[][] classArray43 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray44 = (java.lang.Class<?>[][]) classArray43;
        java.lang.Class[][][] classArray46 = new java.lang.Class[2][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray47 = (java.lang.Class<?>[][][]) classArray46;
        wildcardClassArray47[0] = wildcardClassArray41;
        wildcardClassArray47[1] = wildcardClassArray44;
        java.lang.Class[][][][] classArray53 = new java.lang.Class[4][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray54 = (java.lang.Class<?>[][][][]) classArray53;
        wildcardClassArray54[0] = wildcardClassArray8;
        wildcardClassArray54[1] = wildcardClassArray21;
        wildcardClassArray54[2] = wildcardClassArray34;
        wildcardClassArray54[3] = wildcardClassArray47;
        java.util.Set<java.lang.Class<?>[][][]> wildcardClassArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray54);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests65.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) "tests.slow");
        java.lang.String str71 = commonGramsTokenFilterFactoryTests65.getTestName();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests65.ruleChain;
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests65.assertPositionsSkippingEquals("tests.badapples", indexReader75, (int) '4', postingsEnum77, postingsEnum78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClassArray54, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6659");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        commonGramsTokenFilterFactoryTests8.tearDown();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.setIndexWriterMaxDocs((int) (short) 100);
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        java.lang.String str23 = commonGramsTokenFilterFactoryTests8.getTestName();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests8.ruleChain;
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
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
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray60);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray72);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray75);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray42, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray28, shortArray42);
        short[] shortArray91 = new short[] {};
        short[] shortArray92 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray91, shortArray92);
        short[] shortArray94 = new short[] {};
        short[] shortArray95 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray94, shortArray95);
        org.junit.Assert.assertArrayEquals(shortArray91, shortArray95);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray28, shortArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule24, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6660");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("<unknown>", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        double[] doubleArray39 = new double[] { (byte) 1, '#' };
        double[] doubleArray42 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray42, (double) 100.0f);
        double[] doubleArray49 = new double[] { (byte) 1, '#' };
        double[] doubleArray52 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray52, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray34, doubleArray52, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) false, (java.lang.Object) doubleArray52);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6662");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 1, (float) (byte) -1, (float) 1);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6664");
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        float[] floatArray9 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray15 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray15, (float) 100L);
        java.lang.Class<?> wildcardClass18 = floatArray9.getClass();
        java.util.Set[][][] setArray19 = new java.util.Set[][][] {};
        java.util.Set<java.util.Set[][]> setArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(setArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass18, (java.lang.Object) setArray19);
        java.util.Set<java.util.Set[][]> setArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(setArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray1, (java.lang.Object[]) setArray19);
        java.util.Set<java.util.Set[][]> setArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(setArray19);
        double[] doubleArray29 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray34 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray35 = new double[][] { doubleArray29, doubleArray34 };
        double[] doubleArray40 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray45 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray46 = new double[][] { doubleArray40, doubleArray45 };
        double[] doubleArray51 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray56 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray57 = new double[][] { doubleArray51, doubleArray56 };
        double[] doubleArray62 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray67 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray68 = new double[][] { doubleArray62, doubleArray67 };
        double[] doubleArray73 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray78 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray79 = new double[][] { doubleArray73, doubleArray78 };
        double[] doubleArray84 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray89 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray90 = new double[][] { doubleArray84, doubleArray89 };
        double[][][] doubleArray91 = new double[][][] { doubleArray35, doubleArray46, doubleArray57, doubleArray68, doubleArray79, doubleArray90 };
        java.util.Set<double[][]> doubleArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) setArray19, (java.lang.Object[]) doubleArray91);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 10, (float) (short) 1, 0.0f);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6666");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.Object obj19 = null;
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests24.getTestName();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("<unknown>", indexReader34, (int) (byte) 10, postingsEnum36, postingsEnum37);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray22, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.junit.Assert.assertNotSame(obj19, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests24.assertTermsEquals("tests.slow", indexReader43, terms44, terms45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        commonGramsTokenFilterFactoryTests24.assertTermsEquals("enwiki.random.lines.txt", indexReader49, terms50, terms51, true);
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("random", indexReader57, fields58, fields59, false);
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.slow", indexReader64, (int) '4', postingsEnum66, postingsEnum67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        commonGramsTokenFilterFactoryTests55.assertTermsEquals("tests.slow", indexReader70, terms71, terms72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.nightly", indexReader76, 10, postingsEnum78, postingsEnum79);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.badapples", indexReader82, (int) (byte) -1, postingsEnum84, postingsEnum85);
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) testRule87);
        java.lang.Object obj89 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests24, obj89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, obj89);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6667");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader25, 1, postingsEnum27, postingsEnum28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests39.getTestName();
        commonGramsTokenFilterFactoryTests39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("<unknown>", indexReader49, (int) (byte) 10, postingsEnum51, postingsEnum52);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("tests.weekly", indexReader58, fields59, fields60, false);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        commonGramsTokenFilterFactoryTests30.assertTermsEquals("europarl.lines.txt.gz", indexReader66, terms67, terms68, true);
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) postingsEnum27, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1L, 0.0d);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6669");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 100.0f);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6670");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("<unknown>", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6671");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6672");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray9);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray25);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray31, byteArray35);
        org.junit.Assert.assertArrayEquals("hi!", byteArray16, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray31);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray42, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray48, byteArray52);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray43, byteArray57);
        org.junit.Assert.assertArrayEquals("hi!", byteArray31, byteArray43);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        commonGramsTokenFilterFactoryTests62.assertFieldsEquals("random", indexReader64, fields65, fields66, false);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests62.assertPositionsSkippingEquals("random", indexReader70, (int) '#', postingsEnum72, postingsEnum73);
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests62.ruleChain;
        commonGramsTokenFilterFactoryTests62.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("", indexReader79, 2, postingsEnum81, postingsEnum82, true);
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        commonGramsTokenFilterFactoryTests62.assertDocsSkippingEquals("<unknown>", indexReader86, (int) (short) 100, postingsEnum88, postingsEnum89, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) "hi!", (java.lang.Object) false);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6673");
        double[] doubleArray5 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray10 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray11 = new double[][] { doubleArray5, doubleArray10 };
        double[] doubleArray16 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray21 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray22 = new double[][] { doubleArray16, doubleArray21 };
        double[] doubleArray27 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray32 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray33 = new double[][] { doubleArray27, doubleArray32 };
        double[] doubleArray38 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray43 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray44 = new double[][] { doubleArray38, doubleArray43 };
        double[] doubleArray49 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray54 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray55 = new double[][] { doubleArray49, doubleArray54 };
        double[] doubleArray60 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[] doubleArray65 = new double[] { 1L, (-1.0d), (short) 100, 0.0d };
        double[][] doubleArray66 = new double[][] { doubleArray60, doubleArray65 };
        double[][][] doubleArray67 = new double[][][] { doubleArray11, doubleArray22, doubleArray33, doubleArray44, doubleArray55, doubleArray66 };
        java.util.Set<double[][]> doubleArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray67);
        java.util.Set<double[][]> doubleArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray67);
        java.util.Set[] setArray73 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray74 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray73;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray73);
        java.lang.Object obj76 = null;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) setArray73, obj76);
        float[][] floatArray78 = new float[][] {};
        java.util.Set<float[]> floatArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray78);
        java.util.Set<float[]> floatArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray78);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) setArray73, (java.lang.Object[]) floatArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) doubleArray67, (java.lang.Object[]) floatArray78);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) -1, (double) 0L);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 1.0f, (double) 0L);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6676");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray28 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests13, commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests27 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet29 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray45 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests30, commonGramsTokenFilterFactoryTests37, commonGramsTokenFilterFactoryTests44 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet46 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray45);
        java.util.Collection[] collectionArray48 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray49 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray48;
        baseTokenStreamTestCaseCollectionArray49[0] = baseTokenStreamTestCaseSet29;
        baseTokenStreamTestCaseCollectionArray49[1] = baseTokenStreamTestCaseSet46;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet54 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray49);
        java.util.Set<java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseIterableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) baseTokenStreamTestCaseCollectionArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) baseTokenStreamTestCaseCollectionArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 100.0d, (java.lang.Object) baseTokenStreamTestCaseCollectionArray49);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6677");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        commonGramsTokenFilterFactoryTests14.tearDown();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests14, obj23);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.nightly", indexReader28, fields29, fields30, true);
        commonGramsTokenFilterFactoryTests14.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass13, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6678");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet12 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray11);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray15, intArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests18.getTestName();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("<unknown>", indexReader28, (int) (byte) 10, postingsEnum30, postingsEnum31);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("random", indexReader43, fields44, fields45, false);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests41.getTestName();
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("<unknown>", indexReader51, (int) (byte) 10, postingsEnum53, postingsEnum54);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray39, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray39);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray60, intArray61);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray60, intArray64);
        org.junit.Assert.assertArrayEquals(intArray39, intArray64);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray71, intArray72);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray76, intArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray71, intArray80);
        org.junit.Assert.assertArrayEquals("", intArray39, intArray71);
        org.junit.Assert.assertArrayEquals(intArray16, intArray39);
        java.lang.Class<?> wildcardClass87 = intArray16.getClass();
        java.lang.Class[] classArray89 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray90 = (java.lang.Class<?>[]) classArray89;
        wildcardClassArray90[0] = wildcardClass87;
        java.util.Set<java.lang.Class<?>> wildcardClassSet93 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray90);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet94 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray90);
        java.util.Set<java.lang.reflect.Type> typeSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray90);
        java.util.Set<java.lang.reflect.Type> typeSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray11, (java.lang.Object[]) wildcardClassArray90);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6679");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray3, strArray5 };
        java.util.Set<java.lang.String[]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray9, strArray11 };
        java.util.Set<java.lang.String[]> strArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][]) strArray12);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray12);
        java.util.Set[][] setArray18 = new java.util.Set[][] {};
        java.util.Set<java.util.Set[]> setArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(setArray18);
        java.util.Set<java.util.Set[]> setArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(setArray18);
        java.lang.Class[][] classArray22 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray23 = (java.lang.Class<?>[][]) classArray22;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) setArray18, (java.lang.Object[]) wildcardClassArray23);
        java.lang.Class[][] classArray27 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray28 = (java.lang.Class<?>[][]) classArray27;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray28);
        java.util.Set<java.lang.reflect.Type[]> typeArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[][]) wildcardClassArray28);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) setArray18, (java.lang.Object[]) wildcardClassArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray6, (java.lang.Object[]) setArray18);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6680");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests15.assertTermsEquals("tests.nightly", indexReader23, terms24, terms25, false);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("tests.nightly", indexReader39, fields40, fields41, true);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("tests.failfast", indexReader45, (int) (byte) 0, postingsEnum47, postingsEnum48, true);
        commonGramsTokenFilterFactoryTests35.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 0, (double) 4);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6682");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.monster", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) "tests.slow");
        java.lang.String str23 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.tearDown();
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        org.junit.Assert.assertArrayEquals(charArray37, charArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray30, charArray37);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray58);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray62, charArray65);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray58, charArray65);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray65, charArray73);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray65);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) charArray65);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        char[][] charArray81 = new char[][] { charArray79, charArray80 };
        java.util.Set<char[]> charArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(charArray81);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        char[][] charArray85 = new char[][] { charArray83, charArray84 };
        java.util.Set<char[]> charArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(charArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray81, (java.lang.Object[]) charArray85);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) charArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder14, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6683");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder3, (java.lang.Object) 100.0f);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (byte) 10, postingsEnum22, postingsEnum23);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder3, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests10.getTestName();
        java.lang.String str28 = commonGramsTokenFilterFactoryTests10.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests10, obj30);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6684");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 0, (long) (-1));
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6685");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray62);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray79);
        java.lang.Object[] objArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray79, objArray84);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) (byte) 100, (double) 100.0f, (double) 3);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6687");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests20.getTestName();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("<unknown>", indexReader30, (int) (byte) 10, postingsEnum32, postingsEnum33);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray18, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader43, fields44, fields45, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (short) 0, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6689");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale1, locale3 };
        java.util.Set<java.util.Locale> localeSet5 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray4);
        java.lang.Class[][] classArray7 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray8 = (java.lang.Class<?>[][]) classArray7;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray8);
        java.util.Set[] setArray12 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray13 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray12;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray12);
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) setArray12, obj15);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) setArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray4, (java.lang.Object[]) wildcardClassArray8);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 100L, 10.0f);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6691");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        commonGramsTokenFilterFactoryTests11.tearDown();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder10, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests21.getTestName();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        java.lang.String str39 = commonGramsTokenFilterFactoryTests32.getTestName();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("<unknown>", indexReader42, (int) (byte) 10, postingsEnum44, postingsEnum45);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests32.ruleChain;
        java.lang.String str48 = commonGramsTokenFilterFactoryTests32.getTestName();
        java.lang.String str49 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) "europarl.lines.txt.gz");
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray58);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) strArray58);
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray58);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 100L);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6693");
        java.lang.Object[] objArray0 = null;
        java.util.Set[] setArray2 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray3 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2);
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2);
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2);
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) setArray2);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6694");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("tests.nightly", indexReader24, terms25, terms26, false);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.badapples", postingsEnum34, postingsEnum35, true);
        commonGramsTokenFilterFactoryTests16.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        commonGramsTokenFilterFactoryTests47.assertFieldsEquals("random", indexReader49, fields50, fields51, false);
        commonGramsTokenFilterFactoryTests47.tearDown();
        commonGramsTokenFilterFactoryTests47.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder46, (java.lang.Object) commonGramsTokenFilterFactoryTests47);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) commonGramsTokenFilterFactoryTests47);
        commonGramsTokenFilterFactoryTests47.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests47.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule60;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        commonGramsTokenFilterFactoryTests62.assertFieldsEquals("random", indexReader64, fields65, fields66, false);
        java.lang.String str69 = commonGramsTokenFilterFactoryTests62.getTestName();
        commonGramsTokenFilterFactoryTests62.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        commonGramsTokenFilterFactoryTests62.assertTermsEquals("europarl.lines.txt.gz", indexReader72, terms73, terms74, false);
        java.lang.String str77 = commonGramsTokenFilterFactoryTests62.getTestName();
        commonGramsTokenFilterFactoryTests62.setIndexWriterMaxDocs((int) ' ');
        org.junit.Assert.assertNotSame("random", (java.lang.Object) testRule60, (java.lang.Object) commonGramsTokenFilterFactoryTests62);
        commonGramsTokenFilterFactoryTests62.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues84 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests62.assertDocValuesEquals("tests.nightly", (int) (short) 10, numericDocValues84, numericDocValues85);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6695");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[][] byteArray6 = new byte[][] { byteArray0, byteArray1, byteArray2, byteArray3, byteArray4, byteArray5 };
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        byte[][] byteArray13 = new byte[][] { byteArray7, byteArray8, byteArray9, byteArray10, byteArray11, byteArray12 };
        byte[][][] byteArray14 = new byte[][][] { byteArray6, byteArray13 };
        java.util.Set<byte[][]> byteArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray14);
        java.util.Locale[][] localeArray17 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.Set<java.util.Locale[]> localeArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        float[] floatArray25 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray31 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray31, (float) 100L);
        java.lang.Class<?> wildcardClass34 = floatArray25.getClass();
        java.util.Set[][][] setArray35 = new java.util.Set[][][] {};
        java.util.Set<java.util.Set[][]> setArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(setArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass34, (java.lang.Object) setArray35);
        java.util.Set<java.util.Set[][]> setArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(setArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray17, (java.lang.Object[]) setArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) byteArray14, (java.lang.Object[]) setArray35);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6696");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("random", indexReader15, terms16, terms17, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader23, fields24, fields25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields25);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6697");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray15);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray49, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray72);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray85);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6698");
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
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray10, shortArray33);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray33, shortArray46);
        short[] shortArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray50);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6699");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] { charSequenceArray39, charSequenceArray46 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsEnumEquals("tests.awaitsfix", postingsEnum52, postingsEnum53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        commonGramsTokenFilterFactoryTests49.assertTermsEquals("tests.nightly", indexReader57, terms58, terms59, false);
        commonGramsTokenFilterFactoryTests49.setUp();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsSkippingEquals("tests.slow", indexReader64, (int) (short) 10, postingsEnum66, postingsEnum67, true);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        commonGramsTokenFilterFactoryTests49.assertTermsEquals("", indexReader71, terms72, terms73, true);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests49.assertDocsSkippingEquals("hi!", indexReader77, (int) (byte) -1, postingsEnum79, postingsEnum80, true);
        commonGramsTokenFilterFactoryTests49.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray47, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray47);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6700");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests8.getTestName();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("<unknown>", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray6);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray31);
        org.junit.Assert.assertArrayEquals(intArray6, intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6701");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray24);
        org.junit.Assert.assertArrayEquals("hi!", byteArray5, byteArray20);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray33, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray42);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray48, byteArray52);
        org.junit.Assert.assertArrayEquals("hi!", byteArray33, byteArray48);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray58, byteArray59);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray64, byteArray68);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray72, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray73);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray59, byteArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray33, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray33);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6702");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray1, strArray3 };
        java.util.Set<java.lang.String[]> strArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String[]> strArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String[]> strArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray11, intArray15);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray21, intArray25);
        org.junit.Assert.assertArrayEquals(intArray11, intArray25);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray33, intArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests36.assertFieldsEquals("random", indexReader38, fields39, fields40, false);
        java.lang.String str43 = commonGramsTokenFilterFactoryTests36.getTestName();
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("<unknown>", indexReader46, (int) (byte) 10, postingsEnum48, postingsEnum49);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray34, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray34);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray55, intArray59);
        org.junit.Assert.assertArrayEquals(intArray34, intArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray25, intArray59);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray66, intArray67);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        commonGramsTokenFilterFactoryTests69.assertFieldsEquals("random", indexReader71, fields72, fields73, false);
        java.lang.String str76 = commonGramsTokenFilterFactoryTests69.getTestName();
        commonGramsTokenFilterFactoryTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests69.assertPositionsSkippingEquals("<unknown>", indexReader79, (int) (byte) 10, postingsEnum81, postingsEnum82);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray67, (java.lang.Object) commonGramsTokenFilterFactoryTests69);
        org.junit.Assert.assertArrayEquals(intArray25, intArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArraySet7, (java.lang.Object) intArray67);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6703");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures44);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures46);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures50);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray52 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures43, testRuleIgnoreAfterMaxFailures44, testRuleIgnoreAfterMaxFailures46, testRuleIgnoreAfterMaxFailures48, testRuleIgnoreAfterMaxFailures50 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray52);
        org.junit.Assert.assertNotNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray52);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray52);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 100, (long) 0);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6705");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests15.assertTermsEquals("random", indexReader18, terms19, terms20, true);
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("random", indexReader28, fields29, fields30, false);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) builder36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("", indexReader39, (int) (short) 1, postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("random", postingsEnum46, postingsEnum47, true);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("tests.failfast", indexReader51, (int) (byte) 10, postingsEnum53, postingsEnum54);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.apache.lucene.index.NumericDocValues numericDocValues59 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests15.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues59, numericDocValues60);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10.0d, 0.0d);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6708");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        java.lang.String str19 = commonGramsTokenFilterFactoryTests12.getTestName();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests12.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 10, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6709");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("<unknown>", postingsEnum15, postingsEnum16, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests31.getTestName();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("<unknown>", indexReader41, (int) (byte) 10, postingsEnum43, postingsEnum44);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests22, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader49, (int) (short) -1, postingsEnum51, postingsEnum52);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("random", indexReader57, fields58, fields59, false);
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests64.assertFieldsEquals("random", indexReader66, fields67, fields68, false);
        java.lang.String str71 = commonGramsTokenFilterFactoryTests64.getTestName();
        commonGramsTokenFilterFactoryTests64.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("<unknown>", indexReader74, (int) (byte) 10, postingsEnum76, postingsEnum77);
        org.junit.rules.TestRule testRule79 = commonGramsTokenFilterFactoryTests64.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader82, (int) (short) -1, postingsEnum84, postingsEnum85);
        org.elasticsearch.common.settings.Settings.Builder builder87 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests22, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 1, (java.lang.Object) "");
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, 0.0f, (float) (-1L));
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6711");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests11);
        commonGramsTokenFilterFactoryTests11.tearDown();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) throttlingArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) '4', (float) 0L);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6713");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader4, (int) (short) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) (byte) 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6714");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6716");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum21, postingsEnum22, false);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("hi!", indexReader29, fields30, fields31, false);
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 0, (double) 3);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6718");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        commonGramsTokenFilterFactoryTests8.tearDown();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests8.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (byte) 0, (double) 0L, (double) 0);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 1, (double) 100L);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6721");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests1.getClass();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray76);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray76);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray76);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray88);
        float[][] floatArray91 = new float[][] {};
        java.util.Set<float[]> floatArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray91);
        java.util.Set<float[]> floatArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray88, (java.lang.Object[]) floatArray91);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest13.test6722");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        java.lang.String str18 = commonGramsTokenFilterFactoryTests11.getTestName();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("<unknown>", indexReader21, (int) (byte) 10, postingsEnum23, postingsEnum24);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests11);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests11.assertDocsSkippingEquals("tests.weekly", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("random", indexReader40, fields41, fields42, false);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests38.ruleChain;
        commonGramsTokenFilterFactoryTests38.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests38.getTestName();
        commonGramsTokenFilterFactoryTests38.tearDown();
        commonGramsTokenFilterFactoryTests38.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder51 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        commonGramsTokenFilterFactoryTests53.assertFieldsEquals("random", indexReader55, fields56, fields57, false);
        java.lang.String str60 = commonGramsTokenFilterFactoryTests53.getTestName();
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        java.lang.String str62 = commonGramsTokenFilterFactoryTests53.getTestName();
        commonGramsTokenFilterFactoryTests53.tearDown();
        commonGramsTokenFilterFactoryTests53.tearDown();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests38.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum67, postingsEnum68);
    }
}

